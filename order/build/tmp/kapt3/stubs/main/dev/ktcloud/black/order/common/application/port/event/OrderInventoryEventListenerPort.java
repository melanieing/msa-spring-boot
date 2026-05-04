package dev.ktcloud.black.order.common.application.port.event;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/order/common/application/port/event/OrderInventoryEventListenerPort;", "", "onResultPublished", "", "event", "Ldev/ktcloud/black/order/order/application/dto/event/inbound/InventoryReservedResultEvent;", "order"})
public abstract interface OrderInventoryEventListenerPort {
    
    public abstract void onResultPublished(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.dto.event.inbound.InventoryReservedResultEvent event);
}