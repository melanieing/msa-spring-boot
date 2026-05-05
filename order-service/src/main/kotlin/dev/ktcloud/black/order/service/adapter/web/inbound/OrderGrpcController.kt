package dev.ktcloud.black.order.service.adapter.web.inbound

import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.CreateOrderRequest
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.CreateOrderResponse
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.Empty
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.FetchOrderRequest
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.FetchOrderResponse
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.FetchOrdersResponse
import dev.ktcloud.black.order.service.adapter.presentation.web.inbound.grpc.OrderServiceGrpcKt

abstract class OrderGrpcController: OrderServiceGrpcKt.OrderServiceCoroutineImplBase() {
    abstract override suspend fun createOrder(request: CreateOrderRequest): CreateOrderResponse

    abstract override suspend fun fetchOrder(request: FetchOrderRequest): FetchOrderResponse

    abstract override suspend fun fetchOrders(request: Empty): FetchOrdersResponse
}