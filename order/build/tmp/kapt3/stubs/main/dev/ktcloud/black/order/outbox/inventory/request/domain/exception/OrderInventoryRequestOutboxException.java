package dev.ktcloud.black.order.outbox.inventory.request.domain.exception;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0006"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/domain/exception/OrderInventoryRequestOutboxException;", "", "<init>", "()V", "IllegalStatusTransitive", "OutboxFailedOverMaximum", "order"})
public abstract class OrderInventoryRequestOutboxException {
    
    private OrderInventoryRequestOutboxException() {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/domain/exception/OrderInventoryRequestOutboxException$IllegalStatusTransitive;", "Ldev/ktcloud/black/common/exception/CustomException;", "message", "", "e", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "order"})
    public static final class IllegalStatusTransitive extends dev.ktcloud.black.common.exception.CustomException {
        
        public IllegalStatusTransitive(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable e) {
            super(null, null, 0, null);
        }
        
        public IllegalStatusTransitive() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/domain/exception/OrderInventoryRequestOutboxException$OutboxFailedOverMaximum;", "Ldev/ktcloud/black/common/exception/CustomException;", "message", "", "e", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "order"})
    public static final class OutboxFailedOverMaximum extends dev.ktcloud.black.common.exception.CustomException {
        
        public OutboxFailedOverMaximum(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable e) {
            super(null, null, 0, null);
        }
        
        public OutboxFailedOverMaximum() {
            super(null, null, 0, null);
        }
    }
}