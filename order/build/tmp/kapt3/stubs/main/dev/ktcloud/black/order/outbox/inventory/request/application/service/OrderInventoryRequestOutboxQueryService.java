package dev.ktcloud.black.order.outbox.inventory.request.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/application/service/OrderInventoryRequestOutboxQueryService;", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/FetchUnprocessedOrderInventoryRequestOutboxesQuery;", "orderInventoryRequestQueryOutboundPort", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestQueryOutboundPort;", "<init>", "(Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestQueryOutboundPort;)V", "fetchAllUnprocessed", "", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/FetchUnprocessedOrderInventoryRequestOutboxesQuery$Out;", "order"})
public class OrderInventoryRequestOutboxQueryService implements dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.FetchUnprocessedOrderInventoryRequestOutboxesQuery {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestQueryOutboundPort orderInventoryRequestQueryOutboundPort = null;
    
    public OrderInventoryRequestOutboxQueryService(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestQueryOutboundPort orderInventoryRequestQueryOutboundPort) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.FetchUnprocessedOrderInventoryRequestOutboxesQuery.Out> fetchAllUnprocessed() {
        return null;
    }
}