package dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.repository;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/repository/InventoryEventPostgresqlCommandRepository;", "Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventCommandOutboundPort;", "repository", "Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/repository/InventoryEventPostgresqlRepository;", "mapper", "Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/InventoryEventMapper;", "<init>", "(Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/repository/InventoryEventPostgresqlRepository;Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/InventoryEventMapper;)V", "save", "Ldev/ktcloud/black/inventory/event/domain/entity/InventoryEventDomainEntity;", "event", "saveAll", "", "events", "", "inventory-event"})
public class InventoryEventPostgresqlCommandRepository implements dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventCommandOutboundPort {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.repository.InventoryEventPostgresqlRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.InventoryEventMapper mapper = null;
    
    public InventoryEventPostgresqlCommandRepository(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.repository.InventoryEventPostgresqlRepository repository, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.InventoryEventMapper mapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity save(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity event) {
        return null;
    }
    
    @java.lang.Override()
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity> events) {
    }
}