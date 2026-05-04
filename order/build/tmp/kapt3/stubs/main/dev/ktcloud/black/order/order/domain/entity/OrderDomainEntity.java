package dev.ktcloud.black.order.order.domain.entity;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c2\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c2\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\"H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Ldev/ktcloud/black/order/order/domain/entity/OrderDomainEntity;", "", "id", "", "_status", "Ldev/ktcloud/black/order/order/domain/vo/OrderStatus;", "_orderLineItems", "", "Ldev/ktcloud/black/order/order/domain/vo/OrderLineItem;", "<init>", "(JLdev/ktcloud/black/order/order/domain/vo/OrderStatus;Ljava/util/List;)V", "getId", "()J", "status", "getStatus", "()Ldev/ktcloud/black/order/order/domain/vo/OrderStatus;", "orderLineItems", "getOrderLineItems", "()Ljava/util/List;", "updateOrderLineItem", "", "inventoryId", "newStatus", "Ldev/ktcloud/black/order/order/domain/vo/OrderLineItemStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order"})
public final class OrderDomainEntity {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private dev.ktcloud.black.order.order.domain.vo.OrderStatus _status;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> _orderLineItems;
    
    public OrderDomainEntity(long id, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderStatus _status, @org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> _orderLineItems) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.OrderStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> getOrderLineItems() {
        return null;
    }
    
    public final void updateOrderLineItem(long inventoryId, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus newStatus) {
    }
    
    public final long component1() {
        return 0L;
    }
    
    private final dev.ktcloud.black.order.order.domain.vo.OrderStatus component2() {
        return null;
    }
    
    private final java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity copy(long id, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderStatus _status, @org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> _orderLineItems) {
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