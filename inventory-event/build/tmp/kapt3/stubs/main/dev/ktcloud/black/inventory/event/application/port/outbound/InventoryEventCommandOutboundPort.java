package dev.ktcloud.black.inventory.event.application.port.outbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventCommandOutboundPort;", "", "save", "Ldev/ktcloud/black/inventory/event/domain/entity/InventoryEventDomainEntity;", "event", "saveAll", "", "events", "", "inventory-event"})
public abstract interface InventoryEventCommandOutboundPort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity save(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity event);
    
    public abstract void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity> events);
}