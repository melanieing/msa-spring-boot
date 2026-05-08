package dev.ktcloud.black.user.api.gateway.application.order.service

import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.CreateOrderRequest
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.CreateOrderRequestItem
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.OrderListItemResponseDto
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.OrderServiceGrpcKt
import dev.ktcloud.black.user.api.gateway.application.order.dto.OrderLineItemDto
import dev.ktcloud.black.user.api.gateway.application.order.port.inbound.CreateOrderCommand
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import net.devh.boot.grpc.client.inject.GrpcClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class OrderCommandService(
    @GrpcClient("order-service")
    private val orderServiceStub: OrderServiceGrpcKt.OrderServiceCoroutineStub
): CreateOrderCommand {
    private val log = LoggerFactory.getLogger(javaClass)
    private fun mapOrderLineItem(orderLineItem: OrderListItemResponseDto): OrderLineItemDto {
        return OrderLineItemDto(
            inventoryId = orderLineItem.inventoryId,
            productId = orderLineItem.productId,
            skuCode = orderLineItem.skuCode,
            price = orderLineItem.price,
            quantity = orderLineItem.quantity,
            status = orderLineItem.status,
        )
    }

    @CircuitBreaker(name = "orderService", fallbackMethod = "createOrderFallback")
    override suspend fun createOrder(command: List<CreateOrderCommand.In>): CreateOrderCommand.Out {
        val createOrderRequestItems = command.map {
            CreateOrderRequestItem.newBuilder()
                .setInventoryId(it.inventoryId)
                .setProductId(it.productId)
                .setSkuCode(it.skuCode)
                .setPrice(it.price)
                .setQuantity(it.quantity)
                .build()
        }

        val createdResponse = orderServiceStub.createOrder(
            CreateOrderRequest.newBuilder()
                .addAllItems(createOrderRequestItems)
                .build()
        )

        return CreateOrderCommand.Out(
            id = createdResponse.id,
            status = createdResponse.status,
            orderLineItems = createdResponse.orderLineItemsList.map(::mapOrderLineItem)
        )
    }

    // 주문 생성 fallback — 학습용. 운영급에서는 reservation queue 또는 503 throw.
    @Suppress("UNUSED_PARAMETER")
    private suspend fun createOrderFallback(command: List<CreateOrderCommand.In>, e: Throwable): CreateOrderCommand.Out {
        log.warn("[CB-fallback] orderService.createOrder failed (${e::class.simpleName}: ${e.message}) — returning UNAVAILABLE order")
        return CreateOrderCommand.Out(id = -1L, status = "UNAVAILABLE", orderLineItems = emptyList())
    }
}