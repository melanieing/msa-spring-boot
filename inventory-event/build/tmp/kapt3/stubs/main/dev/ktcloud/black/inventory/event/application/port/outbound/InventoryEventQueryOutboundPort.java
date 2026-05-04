package dev.ktcloud.black.inventory.event.application.port.outbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventQueryOutboundPort;", "", "fetchUnprocessedEvents", "", "Ldev/ktcloud/black/inventory/event/domain/entity/InventoryEventDomainEntity;", "inventoryId", "", "fetchAll", "ids", "inventory-event"})
public abstract interface InventoryEventQueryOutboundPort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity> fetchUnprocessedEvents(long inventoryId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity> fetchAll(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids);
}