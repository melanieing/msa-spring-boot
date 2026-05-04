package dev.ktcloud.black.order.common.application.port.event;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/order/common/application/port/event/OrderInventoryEventPublishPort;", "", "publish", "", "event", "Ldev/ktcloud/black/order/order/application/dto/event/outbound/InventoryReserveRequestEvent;", "onSuccess", "Lkotlin/Function0;", "onError", "order"})
public abstract interface OrderInventoryEventPublishPort {
    
    public abstract void publish(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.dto.event.outbound.InventoryReserveRequestEvent event, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError);
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}