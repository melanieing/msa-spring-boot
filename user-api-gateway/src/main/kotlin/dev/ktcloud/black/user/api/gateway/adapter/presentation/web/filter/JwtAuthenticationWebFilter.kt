package dev.ktcloud.black.user.api.gateway.adapter.presentation.web.filter

import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.security.JwtTokenProvider
import org.springframework.http.HttpHeaders
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.ReactiveSecurityContextHolder
import org.springframework.security.core.context.SecurityContextImpl
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilter
import org.springframework.web.server.WebFilterChain
import reactor.core.publisher.Mono

/**
 * C1 — Bearer 토큰 검증 후 SecurityContext 에 Authentication 주입.
 *
 * 동작:
 *   1. Authorization 헤더에서 'Bearer <token>' 추출
 *   2. JwtTokenProvider.validate 로 서명 + 만료 검증
 *   3. 통과 시 UsernamePasswordAuthenticationToken 을 SecurityContext 에 주입 →
 *      Spring Security 가 authorizeExchange().anyExchange().authenticated() 통과.
 *   4. 토큰 없거나 invalid 시 SecurityContext 비움 → Spring Security 가 401 응답.
 *
 * Order: SecurityConfig 에서 SecurityWebFiltersOrder.AUTHENTICATION 위치 등록.
 *        RateLimitWebFilter (HTTP_BASIC, 더 앞쪽) 후에 실행.
 */
@Component
class JwtAuthenticationWebFilter(
    private val tokenProvider: JwtTokenProvider,
) : WebFilter {

    override fun filter(exchange: ServerWebExchange, chain: WebFilterChain): Mono<Void> {
        val authHeader = exchange.request.headers.getFirst(HttpHeaders.AUTHORIZATION)

        if (authHeader == null || !authHeader.startsWith(BEARER_PREFIX)) {
            // 토큰 없음 — 다음 필터에 그대로 전달. permitAll 인 path 는 통과, 아니면 Spring Security 가 401.
            return chain.filter(exchange)
        }

        val token = authHeader.substring(BEARER_PREFIX.length)
        val subject = tokenProvider.validate(token)
            ?: return chain.filter(exchange)  // 검증 실패 → SecurityContext 비움 (Spring Security 401)

        val authentication = UsernamePasswordAuthenticationToken(
            subject,
            null,
            listOf(SimpleGrantedAuthority("ROLE_USER")),
        )
        val context = SecurityContextImpl(authentication)

        return chain.filter(exchange)
            .contextWrite(ReactiveSecurityContextHolder.withSecurityContext(Mono.just(context)))
    }

    companion object {
        private const val BEARER_PREFIX = "Bearer "
    }
}
