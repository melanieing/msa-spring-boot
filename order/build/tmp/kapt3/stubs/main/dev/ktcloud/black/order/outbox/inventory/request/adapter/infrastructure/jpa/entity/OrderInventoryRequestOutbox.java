package dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.entity;

@org.hibernate.annotations.SQLDelete(sql = "UPDATE order_inventory_request_outbox SET deleted_at = NOW() WHERE id = ?")
@jakarta.persistence.Entity()
@jakarta.persistence.Table(name = "order_inventory_request_outbox")
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020\u0007H\u00d6\u0081\u0004J\n\u0010'\u001a\u00020(H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014\u00a8\u0006)"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/entity/OrderInventoryRequestOutbox;", "Ldev/ktcloud/black/common/domain/entity/BaseOrmEntity;", "id", "", "status", "Ldev/ktcloud/black/order/outbox/inventory/request/domain/vo/OrderInventoryRequestOutboxStatus;", "retry", "", "nextStartFrom", "Ljava/time/LocalDateTime;", "orderId", "inventoryId", "amount", "<init>", "(JLdev/ktcloud/black/order/outbox/inventory/request/domain/vo/OrderInventoryRequestOutboxStatus;ILjava/time/LocalDateTime;JJI)V", "getId", "()J", "getStatus", "()Ldev/ktcloud/black/order/outbox/inventory/request/domain/vo/OrderInventoryRequestOutboxStatus;", "getRetry", "()I", "getNextStartFrom", "()Ljava/time/LocalDateTime;", "getOrderId", "getInventoryId", "getAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "", "order"})
public final class OrderInventoryRequestOutbox extends dev.ktcloud.black.common.domain.entity.BaseOrmEntity {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @jakarta.persistence.Column()
    @jakarta.persistence.Enumerated(value = jakarta.persistence.EnumType.STRING)
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus status = null;
    @jakarta.persistence.Column()
    private final int retry = 0;
    @jakarta.persistence.Column()
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime nextStartFrom = null;
    @jakarta.persistence.Column(name = "order_id")
    private final long orderId = 0L;
    @jakarta.persistence.Column(name = "inventory_id")
    private final long inventoryId = 0L;
    @jakarta.persistence.Column()
    private final int amount = 0;
    
    public OrderInventoryRequestOutbox(long id, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus status, int retry, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime nextStartFrom, long orderId, long inventoryId, int amount) {
        super(null, null, null);
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus getStatus() {
        return null;
    }
    
    public final int getRetry() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getNextStartFrom() {
        return null;
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
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.entity.OrderInventoryRequestOutbox copy(long id, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus status, int retry, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime nextStartFrom, long orderId, long inventoryId, int amount) {
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