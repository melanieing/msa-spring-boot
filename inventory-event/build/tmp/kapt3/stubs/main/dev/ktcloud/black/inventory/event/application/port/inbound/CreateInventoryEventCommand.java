package dev.ktcloud.black.inventory.event.application.port.inbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/CreateInventoryEventCommand;", "", "create", "", "command", "Ldev/ktcloud/black/inventory/event/application/port/inbound/CreateInventoryEventCommand$In;", "In", "inventory-event"})
public abstract interface CreateInventoryEventCommand {
    
    public abstract void create(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.inbound.CreateInventoryEventCommand.In command);
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/CreateInventoryEventCommand$In;", "", "inventoryId", "", "amount", "", "eventType", "Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventType;", "<init>", "(JILdev/ktcloud/black/inventory/event/domain/vo/InventoryEventType;)V", "getInventoryId", "()J", "getAmount", "()I", "getEventType", "()Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "inventory-event"})
    public static final class In {
        private final long inventoryId = 0L;
        private final int amount = 0;
        @org.jetbrains.annotations.NotNull()
        private final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType eventType = null;
        
        public In(long inventoryId, int amount, @org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType eventType) {
            super();
        }
        
        public final long getInventoryId() {
            return 0L;
        }
        
        public final int getAmount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType getEventType() {
            return null;
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.application.port.inbound.CreateInventoryEventCommand.In copy(long inventoryId, int amount, @org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType eventType) {
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
}