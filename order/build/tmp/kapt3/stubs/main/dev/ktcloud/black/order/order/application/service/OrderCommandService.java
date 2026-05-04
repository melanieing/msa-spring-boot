package dev.ktcloud.black.order.order.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldev/ktcloud/black/order/order/application/service/OrderCommandService;", "Ldev/ktcloud/black/order/order/application/port/inbound/CreateOrderCommand;", "orderCommandOutboundPort", "Ldev/ktcloud/black/order/order/application/port/outbound/OrderCommandOutboundPort;", "orderQueryOutboundPort", "Ldev/ktcloud/black/order/order/application/port/outbound/OrderQueryOutboundPort;", "createOrderInventoryRequestOutboxCommand", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/CreateOrderInventoryRequestOutboxCommand;", "<init>", "(Ldev/ktcloud/black/order/order/application/port/outbound/OrderCommandOutboundPort;Ldev/ktcloud/black/order/order/application/port/outbound/OrderQueryOutboundPort;Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/CreateOrderInventoryRequestOutboxCommand;)V", "create", "", "command", "Ldev/ktcloud/black/order/order/application/port/inbound/CreateOrderCommand$In;", "updateOrderLineItemStatus", "orderId", "", "inventoryId", "status", "Ldev/ktcloud/black/order/order/domain/vo/OrderLineItemStatus;", "order"})
public class OrderCommandService implements dev.ktcloud.black.order.order.application.port.inbound.CreateOrderCommand {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.application.port.outbound.OrderCommandOutboundPort orderCommandOutboundPort = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.application.port.outbound.OrderQueryOutboundPort orderQueryOutboundPort = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.CreateOrderInventoryRequestOutboxCommand createOrderInventoryRequestOutboxCommand = null;
    
    public OrderCommandService(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.port.outbound.OrderCommandOutboundPort orderCommandOutboundPort, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.port.outbound.OrderQueryOutboundPort orderQueryOutboundPort, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.CreateOrderInventoryRequestOutboxCommand createOrderInventoryRequestOutboxCommand) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.port.inbound.CreateOrderCommand.In command) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void updateOrderLineItemStatus(long orderId, long inventoryId, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus status) {
    }
}