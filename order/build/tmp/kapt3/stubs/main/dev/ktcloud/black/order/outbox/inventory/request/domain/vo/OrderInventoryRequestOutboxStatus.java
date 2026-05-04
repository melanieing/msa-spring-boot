package dev.ktcloud.black.order.outbox.inventory.request.domain.vo;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\f"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/domain/vo/OrderInventoryRequestOutboxStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", "PUBLISHED", "FAILED", "getTransitiveList", "", "checkTransitive", "", "orderStatus", "order"})
public enum OrderInventoryRequestOutboxStatus {
    /*public static final*/ INIT /* = new INIT() */,
    /*public static final*/ PUBLISHED /* = new PUBLISHED() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    OrderInventoryRequestOutboxStatus() {
    }
    
    private final java.util.List<dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus> getTransitiveList() {
        return null;
    }
    
    public final boolean checkTransitive(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus orderStatus) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus> getEntries() {
        return null;
    }
}