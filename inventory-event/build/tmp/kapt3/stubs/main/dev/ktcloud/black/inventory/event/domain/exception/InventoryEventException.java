package dev.ktcloud.black.inventory.event.domain.exception;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Ldev/ktcloud/black/inventory/event/domain/exception/InventoryEventException;", "", "<init>", "()V", "InventoryEventInvalid", "inventory-event"})
public final class InventoryEventException {
    
    public InventoryEventException() {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldev/ktcloud/black/inventory/event/domain/exception/InventoryEventException$InventoryEventInvalid;", "Ldev/ktcloud/black/common/exception/CustomException;", "message", "", "e", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "inventory-event"})
    public static final class InventoryEventInvalid extends dev.ktcloud.black.common.exception.CustomException {
        
        public InventoryEventInvalid(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable e) {
            super(null, null, 0, null);
        }
        
        public InventoryEventInvalid() {
            super(null, null, 0, null);
        }
    }
}