package dev.ktcloud.black.inventory.event.application.port.inbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery;", "", "fetchUnprocessed", "", "Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery$Out;", "query", "Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery$In;", "In", "Out", "inventory-event"})
public abstract interface FetchUnprocessedInventoryEventsQuery {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery.Out> fetchUnprocessed(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery.In query);
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\r\u001a\u00020\u000eH\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery$In;", "", "inventoryId", "", "<init>", "(J)V", "getInventoryId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "inventory-event"})
    public static final class In {
        private final long inventoryId = 0L;
        
        public In(long inventoryId) {
            super();
        }
        
        public final long getInventoryId() {
            return 0L;
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery.In copy(long inventoryId) {
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
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010 \u001a\u00020!H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery$Out;", "", "id", "", "inventoryId", "amount", "", "eventType", "Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventType;", "processStatus", "Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventProcessStatus;", "<init>", "(JJILdev/ktcloud/black/inventory/event/domain/vo/InventoryEventType;Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventProcessStatus;)V", "getId", "()J", "getInventoryId", "getAmount", "()I", "getEventType", "()Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventType;", "getProcessStatus", "()Ldev/ktcloud/black/inventory/event/domain/vo/InventoryEventProcessStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "inventory-event"})
    public static final class Out {
        private final long id = 0L;
        private final long inventoryId = 0L;
        private final int amount = 0;
        @org.jetbrains.annotations.NotNull()
        private final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType eventType = null;
        @org.jetbrains.annotations.NotNull()
        private final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus processStatus = null;
        
        public Out(long id, long inventoryId, int amount, @org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType eventType, @org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus processStatus) {
            super();
        }
        
        public final long getId() {
            return 0L;
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
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus getProcessStatus() {
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
        public final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery.Out copy(long id, long inventoryId, int amount, @org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType eventType, @org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus processStatus) {
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