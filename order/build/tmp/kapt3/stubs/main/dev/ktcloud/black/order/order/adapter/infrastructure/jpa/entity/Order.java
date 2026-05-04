package dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity;

@org.hibernate.annotations.SQLDelete(sql = "UPDATE orders SET deleted_at = NOW() WHERE id = ?")
@jakarta.persistence.Entity()
@jakarta.persistence.Table(name = "orders")
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/entity/Order;", "Ldev/ktcloud/black/common/domain/entity/BaseOrmEntity;", "id", "", "status", "Ldev/ktcloud/black/order/order/domain/vo/OrderStatus;", "orderLineItems", "", "Ldev/ktcloud/black/order/order/domain/vo/OrderLineItem;", "<init>", "(JLdev/ktcloud/black/order/order/domain/vo/OrderStatus;Ljava/util/List;)V", "getId", "()J", "getStatus", "()Ldev/ktcloud/black/order/order/domain/vo/OrderStatus;", "getOrderLineItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "order"})
public final class Order extends dev.ktcloud.black.common.domain.entity.BaseOrmEntity {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @jakarta.persistence.Column()
    @jakarta.persistence.Enumerated(value = jakarta.persistence.EnumType.STRING)
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.domain.vo.OrderStatus status = null;
    @jakarta.persistence.Column(columnDefinition = "jsonb")
    @org.hibernate.annotations.JdbcTypeCode(value = org.hibernate.type.SqlTypes.JSON)
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> orderLineItems = null;
    
    public Order(long id, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderStatus status, @org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> orderLineItems) {
        super(null, null, null);
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
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.OrderStatus component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order copy(long id, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderStatus status, @org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.order.domain.vo.OrderLineItem> orderLineItems) {
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