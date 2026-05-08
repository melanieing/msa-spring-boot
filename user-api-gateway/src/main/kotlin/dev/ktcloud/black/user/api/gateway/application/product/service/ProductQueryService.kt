package dev.ktcloud.black.user.api.gateway.application.product.service

import dev.ktcloud.black.product.service.adapter.presentation.web.inbound.grpc.Empty
import dev.ktcloud.black.product.service.adapter.presentation.web.inbound.grpc.FetchProductRequest
import dev.ktcloud.black.product.service.adapter.presentation.web.inbound.grpc.ProductServiceGrpcKt
import dev.ktcloud.black.user.api.gateway.application.product.port.inbound.FetchProductQuery
import dev.ktcloud.black.user.api.gateway.application.product.port.inbound.FetchProductsQuery
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import net.devh.boot.grpc.client.inject.GrpcClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

/**
 * C3 — gRPC product-service 호출에 Resilience4j Circuit Breaker 적용.
 * application.yaml 의 'resilience4j.circuitbreaker.instances.productService' 설정 사용.
 *
 * @CircuitBreaker 동작:
 *   - CLOSED: 정상 호출. 실패율 추적.
 *   - OPEN: failureRateThreshold(50%) 초과 → 즉시 fallback 호출 (backend 안 거침).
 *   - HALF_OPEN: waitDurationInOpenState(10s) 후 시도. 성공 시 CLOSED, 실패 시 OPEN.
 */
@Service
class ProductQueryService(
    @GrpcClient("product-service")
    private val productServiceStub: ProductServiceGrpcKt.ProductServiceCoroutineStub
): FetchProductQuery, FetchProductsQuery {
    private val log = LoggerFactory.getLogger(javaClass)

    @CircuitBreaker(name = "productService", fallbackMethod = "fetchProductFallback")
    override suspend fun fetchProduct(query: FetchProductQuery.In): FetchProductQuery.Out {
        val response = productServiceStub.fetchProduct(
            FetchProductRequest.newBuilder()
                .setId(query.id)
                .build()
        )

        return FetchProductQuery.Out(
            id = response.id,
            name = response.name,
            description = response.description,
            price = response.price,
        )
    }

    @CircuitBreaker(name = "productService", fallbackMethod = "fetchProductsFallback")
    override suspend fun fetchProducts(): List<FetchProductsQuery.Out> {
        val response = productServiceStub.fetchAll(Empty.getDefaultInstance())

        return response.productsList.map {
            FetchProductsQuery.Out(
                id = it.id,
                name = it.name,
                description = it.description,
                price = it.price,
            )
        }
    }

    // Resilience4j 의 fallback 시그니처 = 원본 메서드 + 마지막에 Throwable.
    // 학습용으로 빈 응답. 운영급에서는 503 throw 또는 cache 응답.
    @Suppress("UNUSED_PARAMETER")
    private suspend fun fetchProductFallback(query: FetchProductQuery.In, e: Throwable): FetchProductQuery.Out {
        log.warn("[CB-fallback] productService.fetchProduct failed (${e::class.simpleName}: ${e.message}) — returning empty")
        // FetchProductQuery.Out: id=String, name=String, description=String, price=Int
        return FetchProductQuery.Out(id = query.id, name = "(unavailable)", description = "", price = 0)
    }

    @Suppress("UNUSED_PARAMETER")
    private suspend fun fetchProductsFallback(e: Throwable): List<FetchProductsQuery.Out> {
        log.warn("[CB-fallback] productService.fetchProducts failed (${e::class.simpleName}: ${e.message}) — returning empty list")
        return emptyList()
    }
}