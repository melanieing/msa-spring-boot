package dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\b\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestQueryOutboundPort;", "", "findAll", "", "Ldev/ktcloud/black/order/outbox/inventory/request/domain/entity/OrderInventoryRequestOutboxDomainEntity;", "by", "", "fetchUnprocessed", "order"})
public abstract interface OrderInventoryRequestQueryOutboundPort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity> findAll(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> by);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity> fetchUnprocessed();
}