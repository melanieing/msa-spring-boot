package dev.ktcloud.black.user.api.gateway.adapter.presentation.web.filter

import org.redisson.api.RateIntervalUnit
import org.redisson.api.RateType
import org.redisson.api.RedissonClient
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.Ordered
import org.springframework.core.io.buffer.DataBufferUtils
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilter
import org.springframework.web.server.WebFilterChain
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

/**
 * C2 — Token Bucket 기반 Rate Limit (PDF 5.4절).
 *
 * 디자인:
 *   - Redisson 의 RRateLimiter (cluster-wide token bucket).
 *   - Key 분기: JWT 'sub' claim 이 있으면 user 별, 없으면 IP 별 limit.
 *   - 학습용 rate=10/sec. burst 는 RRateLimiter 가 단순 모드라 미지원 → 향후 Bucket4j 격상 가능.
 *
 * Order: SecurityConfig 에서 SecurityWebFiltersOrder.HTTP_BASIC 위치에 등록 →
 *        JWT 인증 필터보다 먼저 실행 (DDoS 방어 우선).
 *
 * Reactive 패턴:
 *   - RRateLimiter 의 sync API 를 Mono.fromCallable + boundedElastic scheduler 로 wrap.
 *     (Redisson 의 reactive API 는 Spring Data Redis 와 충돌 가능 — 단순 sync wrap 이 안전.)
 */
@Component
class RateLimitWebFilter(
    private val redissonClient: RedissonClient,
    @Value("\${rate-limit.rate:10}") private val rate: Long,
    @Suppress("unused") @Value("\${rate-limit.capacity:20}") private val capacity: Long,  // 향후 burst 격상 시 사용
) : WebFilter, Ordered {

    private val log = LoggerFactory.getLogger(javaClass)

    override fun filter(exchange: ServerWebExchange, chain: WebFilterChain): Mono<Void> {
        // 인증 헤더에서 user 추출 시도 (학습용 단순). 없으면 IP fallback.
        val key = resolveKey(exchange)
        val limiterName = "rate-limit:$key"

        return Mono.fromCallable {
            val limiter = redissonClient.getRateLimiter(limiterName)
            // 한 번만 설정 — 중복 호출은 변경 없음 (Redisson 이 내부 idempotent).
            limiter.trySetRate(RateType.OVERALL, rate, 1, RateIntervalUnit.SECONDS)
            limiter.tryAcquire()
        }
            .subscribeOn(Schedulers.boundedElastic())
            .flatMap { acquired ->
                if (acquired) {
                    chain.filter(exchange)
                } else {
                    log.debug("[rate-limit] denied for key={}", key)
                    rejectWith429(exchange)
                }
            }
            .onErrorResume { e ->
                // Redis 다운 시 fail-open (가용성 우선). 운영급은 fail-close 로 격상 가능.
                log.warn("[rate-limit] redis call failed (${e::class.simpleName}: ${e.message}) — bypassing rate limit")
                chain.filter(exchange)
            }
    }

    private fun resolveKey(exchange: ServerWebExchange): String {
        // Bearer 토큰 안의 sub 추출은 JwtAuthenticationWebFilter 가 SecurityContext 채운 후에야 가능.
        // 이 필터는 그보다 먼저 실행 (DDoS 우선) → 학습용으로 IP 만 사용.
        // 운영급에서는 두 필터 순서 바꾸거나 별도 sub-extract logic 추가.
        val ip = exchange.request.headers.getFirst("X-Forwarded-For")
            ?: exchange.request.remoteAddress?.address?.hostAddress
            ?: "unknown"
        return ip
    }

    private fun rejectWith429(exchange: ServerWebExchange): Mono<Void> {
        val response = exchange.response
        response.statusCode = HttpStatus.TOO_MANY_REQUESTS
        response.headers.add(HttpHeaders.RETRY_AFTER, "1")
        val message = """{"error":"rate_limit_exceeded","message":"too many requests"}""".toByteArray()
        val buffer = response.bufferFactory().wrap(message)
        return response.writeWith(Mono.just(buffer)).then(Mono.fromRunnable {
            DataBufferUtils.release(buffer)
        })
    }

    // SecurityWebFiltersOrder 의 HTTP_BASIC 보다 먼저 실행되도록 음수 order.
    // SecurityConfig 의 addFilterAt 으로 명시 등록할 거지만 안전망.
    override fun getOrder(): Int = -100
}
