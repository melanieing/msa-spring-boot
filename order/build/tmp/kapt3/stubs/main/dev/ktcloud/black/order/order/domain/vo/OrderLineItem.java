package dev.ktcloud.black.order.order.domain.vo;

@jakarta.persistence.Embeddable()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\fH\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010%\u001a\u00020\nH\u00d6\u0081\u0004J\n\u0010&\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006'"}, d2 = {"Ldev/ktcloud/black/order/order/domain/vo/OrderLineItem;", "", "inventoryId", "", "productId", "", "skuCode", "price", "Ljava/math/BigDecimal;", "quantity", "", "status", "Ldev/ktcloud/black/order/order/domain/vo/OrderLineItemStatus;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILdev/ktcloud/black/order/order/domain/vo/OrderLineItemStatus;)V", "getInventoryId", "()J", "getProductId", "()Ljava/lang/String;", "getSkuCode", "getPrice", "()Ljava/math/BigDecimal;", "getQuantity", "()I", "getStatus", "()Ldev/ktcloud/black/order/order/domain/vo/OrderLineItemStatus;", "copy", "newStatus", "component1", "component2", "component3", "component4", "component5", "component6", "equals", "", "other", "hashCode", "toString", "order"})
public final class OrderLineItem {
    private final long inventoryId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String skuCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal price = null;
    private final int quantity = 0;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus status = null;
    
    public OrderLineItem(long inventoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String skuCode, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal price, int quantity, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus status) {
        super();
    }
    
    public final long getInventoryId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSkuCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getPrice() {
        return null;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.OrderLineItem copy(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus newStatus) {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.ktcloud.black.order.order.domain.vo.OrderLineItem copy(long inventoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String skuCode, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal price, int quantity, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.vo.OrderLineItemStatus status) {
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