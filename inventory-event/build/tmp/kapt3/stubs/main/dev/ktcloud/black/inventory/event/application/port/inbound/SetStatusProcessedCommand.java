package dev.ktcloud.black.inventory.event.application.port.inbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/SetStatusProcessedCommand;", "", "setStatusProcessed", "", "command", "Ldev/ktcloud/black/inventory/event/application/port/inbound/SetStatusProcessedCommand$In;", "In", "inventory-event"})
public abstract interface SetStatusProcessedCommand {
    
    public abstract void setStatusProcessed(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.inbound.SetStatusProcessedCommand.In command);
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/inbound/SetStatusProcessedCommand$In;", "", "ids", "", "", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "inventory-event"})
    public static final class In {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> ids = null;
        
        public In(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> ids) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.inventory.event.application.port.inbound.SetStatusProcessedCommand.In copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> ids) {
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