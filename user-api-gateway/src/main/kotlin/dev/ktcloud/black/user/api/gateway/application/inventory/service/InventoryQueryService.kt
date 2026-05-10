package dev.ktcloud.black.user.api.gateway.application.inventory.service

import dev.ktcloud.black.inventory.service.adapter.presentation.web.inbound.grpc.FetchInventoryRequest
import dev.ktcloud.black.inventory.service.adapter.presentation.web.inbound.grpc.InventoryServiceGrpcKt
import dev.ktcloud.black.inventory.service.adapter.presentation.web.inbound.grpc.Empty
import dev.ktcloud.black.user.api.gateway.application.inventory.port.inbound.FetchInventoriesQuery
import dev.ktcloud.black.user.api.gateway.application.inventory.port.inbound.FetchInventoryQuery
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry
import io.github.resilience4j.kotlin.circuitbreaker.executeSuspendFunction
import net.devh.boot.grpc.client.inject.GrpcClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InventoryQueryService(
    @GrpcClient("inventory-service")
    private val inventoryServiceStub: InventoryServiceGrpcKt.InventoryServiceCoroutineStub,
    circuitBreakerRegistry: CircuitBreakerRegistry,
): FetchInventoryQuery, FetchInventoriesQuery {
    private val log = LoggerFactory.getLogger(javaClass)
    private val circuitBreaker = circuitBreakerRegistry.circuitBreaker("inventoryService")

    override suspend fun fetchInventory(query: FetchInventoryQuery.In): FetchInventoryQuery.Out {
        return runCatching {
            circuitBreaker.executeSuspendFunction {
                val dto = inventoryServiceStub.fetchInventory(
                    FetchInventoryRequest.newBuilder().setId(query.id).build()
                )
                FetchInventoryQuery.Out(
                    id = dto.id,
                    productId = dto.productId,
                    skuCode = dto.skuCode,
                    quantity = dto.quantity,
                )
            }
        }.getOrElse { e ->
            log.warn("[CB-fallback] inventoryService.fetchInventory failed (${e::class.simpleName}: ${e.message}) — returning empty")
            FetchInventoryQuery.Out(id = query.id, productId = "unknown", skuCode = "(unavailable)", quantity = 0)
        }
    }

    override suspend fun fetchAll(): List<FetchInventoriesQuery.Out> {
        return runCatching {
            circuitBreaker.executeSuspendFunction {
                val dtos = inventoryServiceStub.fetchInventories(Empty.getDefaultInstance())
                dtos.inventoriesList.map {
                    FetchInventoriesQuery.Out(
                        id = it.id,
                        productId = it.productId,
                        skuCode = it.skuCode,
                        quantity = it.quantity,
                    )
                }
            }
        }.getOrElse { e ->
            log.warn("[CB-fallback] inventoryService.fetchAll failed (${e::class.simpleName}: ${e.message}) — returning empty list")
            emptyList()
        }
    }
}