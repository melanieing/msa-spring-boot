package dev.ktcloud.black.user.api.gateway.order.api

import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.inbound.order.UserOrderApiGatewayRestController
import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.inbound.order.request.CreateOrderRequest
import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.inbound.order.response.CreateOrderResponse
import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.inbound.order.response.FetchOrderResponse
import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.inbound.order.response.FetchOrdersResponse
import dev.ktcloud.black.user.api.gateway.application.order.port.inbound.CreateOrderCommand
import dev.ktcloud.black.user.api.gateway.application.order.port.inbound.FetchOrderQuery
import dev.ktcloud.black.user.api.gateway.application.order.port.inbound.FetchOrdersQuery
import dev.ktcloud.black.user.domain.vo.UserRole
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/orders")
class UserOrderApiGatewayRestControllerAdapter(
    private val createOrderCommand: CreateOrderCommand,
    private val fetchOrderQuery: FetchOrderQuery,
    private val fetchOrdersQuery: FetchOrdersQuery
): UserOrderApiGatewayRestController {
    override suspend fun createOrder(request: CreateOrderRequest): CreateOrderResponse {
        TODO("Not yet implemented")
    }

    @Operation(summary = "주문 전체 조회")
    @ApiResponse(responseCode = "200", description = "주문 전체 조회 성공")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping
    override suspend fun fetchOrders(): FetchOrdersResponse {
        TODO("Not yet implemented")
    }

    override suspend fun fetchOrder(id: Long): FetchOrderResponse {
        TODO("Not yet implemented")
    }

}