package dev.ktcloud.black.user.api.gateway.application.order.service

import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.OrderServiceGrpcKt
import dev.ktcloud.black.user.api.gateway.application.order.port.inbound.CreateOrderCommand
import org.springframework.stereotype.Service

@Service
class OrderCommandService(
    private val orderServiceStub: OrderServiceGrpcKt.OrderServiceCoroutineStub
): CreateOrderCommand {
    override suspend fun createOrder(command: List<CreateOrderCommand.In>): CreateOrderCommand.Out {
        TODO("Not yet implemented")
    }
}