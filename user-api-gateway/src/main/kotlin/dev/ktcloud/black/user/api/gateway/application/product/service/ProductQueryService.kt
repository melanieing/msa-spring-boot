package dev.ktcloud.black.user.api.gateway.application.product.service

import dev.ktcloud.black.product.service.adapter.presentation.web.inbound.grpc.Empty
import dev.ktcloud.black.product.service.adapter.presentation.web.inbound.grpc.FetchProductRequest
import dev.ktcloud.black.product.service.adapter.presentation.web.inbound.grpc.ProductServiceGrpcKt
import dev.ktcloud.black.user.api.gateway.application.product.port.inbound.FetchProductQuery
import dev.ktcloud.black.user.api.gateway.application.product.port.inbound.FetchProductsQuery
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry
import io.github.resilience4j.kotlin.circuitbreaker.executeSuspendFunction
import net.devh.boot.grpc.client.inject.GrpcClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

/**
 * C3 (W fix, 2026-05-12) — gRPC product-service 호출에 Resilience4j Circuit Breaker 적용.
 *
 * @CircuitBreaker annotation 의 Spring AOP 가 Kotlin suspend method 의 Continuation
 * 파라미터 인식 못 함을 검증으로 발견 — fallback 미동작.
 * → manual `executeSuspendFunction` wrap 으로 교체. resilience4j-kotlin 의 extension.
 *
 * CB 동작:
 *   - CLOSED: 정상 호출. 실패율 추적.
 *   - OPEN: failureRateThreshold(50%) 초과 → executeSuspendFunction 이 즉시 throw →
 *     try/catch 의 fallback 동작.
 *   - HALF_OPEN: waitDurationInOpenState(10s) 후 시도.
 */
@Service
class ProductQueryService(
    @GrpcClient("product-service")
    private val productServiceStub: ProductServiceGrpcKt.ProductServiceCoroutineStub,
    circuitBreakerRegistry: CircuitBreakerRegistry,
): FetchProductQuery, FetchProductsQuery {
    private val log = LoggerFactory.getLogger(javaClass)
    private val circuitBreaker = circuitBreakerRegistry.circuitBreaker("productService")

    override suspend fun fetchProduct(query: FetchProductQuery.In): FetchProductQuery.Out {
        return runCatching {
            circuitBreaker.executeSuspendFunction {
                val response = productServiceStub.fetchProduct(
                    FetchProductRequest.newBuilder().setId(query.id).build()
                )
                FetchProductQuery.Out(
                    id = response.id,
                    name = response.name,
                    description = response.description,
                    price = response.price,
                )
            }
        }.getOrElse { e ->
            // CB OPEN 시 CallNotPermittedException, 또는 backend exception 둘 다 fallback.
            log.warn("[CB-fallback] productService.fetchProduct failed (${e::class.simpleName}: ${e.message}) — returning empty")
            FetchProductQuery.Out(id = query.id, name = "(unavailable)", description = "", price = 0)
        }
    }

    override suspend fun fetchProducts(): List<FetchProductsQuery.Out> {
        return runCatching {
            circuitBreaker.executeSuspendFunction {
                val response = productServiceStub.fetchAll(Empty.getDefaultInstance())
                response.productsList.map {
                    FetchProductsQuery.Out(
                        id = it.id,
                        name = it.name,
                        description = it.description,
                        price = it.price,
                    )
                }
            }
        }.getOrElse { e ->
            log.warn("[CB-fallback] productService.fetchProducts failed (${e::class.simpleName}: ${e.message}) — returning empty list")
            emptyList()
        }
    }
}