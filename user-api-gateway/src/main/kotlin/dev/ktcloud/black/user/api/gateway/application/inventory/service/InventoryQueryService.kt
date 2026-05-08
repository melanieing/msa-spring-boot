package dev.ktcloud.black.user.api.gateway.application.inventory.service

import dev.ktcloud.black.inventory.service.adapter.presentation.web.inbound.grpc.FetchInventoryRequest
import dev.ktcloud.black.inventory.service.adapter.presentation.web.inbound.grpc.InventoryServiceGrpcKt
import dev.ktcloud.black.inventory.service.adapter.presentation.web.inbound.grpc.Empty
import dev.ktcloud.black.user.api.gateway.application.inventory.port.inbound.FetchInventoriesQuery
import dev.ktcloud.black.user.api.gateway.application.inventory.port.inbound.FetchInventoryQuery
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import net.devh.boot.grpc.client.inject.GrpcClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InventoryQueryService(
    @GrpcClient("inventory-service")
    private val inventoryServiceStub: InventoryServiceGrpcKt.InventoryServiceCoroutineStub
): FetchInventoryQuery, FetchInventoriesQuery {
    private val log = LoggerFactory.getLogger(javaClass)

    @CircuitBreaker(name = "inventoryService", fallbackMethod = "fetchInventoryFallback")
    override suspend fun fetchInventory(query: FetchInventoryQuery.In): FetchInventoryQuery.Out {
        val inventoryResponseDto = inventoryServiceStub.fetchInventory(
                FetchInventoryRequest.newBuilder()
                    .setId(query.id)
                    .build(),
            )

        return FetchInventoryQuery.Out(
            id = inventoryResponseDto.id,
            productId = inventoryResponseDto.productId,
            skuCode = inventoryResponseDto.skuCode,
            quantity = inventoryResponseDto.quantity,
        )
    }

    @CircuitBreaker(name = "inventoryService", fallbackMethod = "fetchAllFallback")
    override suspend fun fetchAll(): List<FetchInventoriesQuery.Out> {
        val inventoryResponseDtos = inventoryServiceStub.fetchInventories(Empty.getDefaultInstance())

        return inventoryResponseDtos.inventoriesList.map {
            FetchInventoriesQuery.Out(
                id = it.id,
                productId = it.productId,
                skuCode = it.skuCode,
                quantity = it.quantity,
            )
        }
    }

    @Suppress("UNUSED_PARAMETER")
    private suspend fun fetchInventoryFallback(query: FetchInventoryQuery.In, e: Throwable): FetchInventoryQuery.Out {
        log.warn("[CB-fallback] inventoryService.fetchInventory failed (${e::class.simpleName}: ${e.message}) — returning empty")
        // FetchInventoryQuery.Out: id=Long, productId=String, skuCode=String, quantity=Int
        return FetchInventoryQuery.Out(id = query.id, productId = "unknown", skuCode = "(unavailable)", quantity = 0)
    }

    @Suppress("UNUSED_PARAMETER")
    private suspend fun fetchAllFallback(e: Throwable): List<FetchInventoriesQuery.Out> {
        log.warn("[CB-fallback] inventoryService.fetchAll failed (${e::class.simpleName}: ${e.message}) — returning empty list")
        return emptyList()
    }
}