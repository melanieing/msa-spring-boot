package dev.ktcloud.black.order.order.application.dto.event.inbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Ldev/ktcloud/black/order/order/application/dto/event/inbound/InventoryReservedResultEvent;", "", "orderId", "", "inventoryId", "amount", "", "resultState", "Ldev/ktcloud/black/order/order/domain/vo/InventoryReserveResultState;", "<init>", "(JJILdev/ktcloud/black/order/order/domain/vo/InventoryReserveResultState;)V", "getOrderId", "()J", "getInventoryId", "getAmount", "()I", "getResultState", "()Ldev/ktcloud/black/order/order/domain/vo/InventoryReserveResultState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "order"})
public final class InventoryReservedResultEvent {
    private final long orderId = 0L;
    private final long inventoryId = 0L;
    private final int amount = 0;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.domain.vo.InventoryReserveResultState resultState = null;
    
    public InventoryReservedResultEvent(long orderId, long inventoryId, int amount, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.InventoryReserveResultState resultState) {
        super();
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final long getInventoryId() {
        return 0L;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.InventoryReserveResultState getResultState() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.InventoryReserveResultState component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.application.dto.event.inbound.InventoryReservedResultEvent copy(long orderId, long inventoryId, int amount, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.InventoryReserveResultState resultState) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}