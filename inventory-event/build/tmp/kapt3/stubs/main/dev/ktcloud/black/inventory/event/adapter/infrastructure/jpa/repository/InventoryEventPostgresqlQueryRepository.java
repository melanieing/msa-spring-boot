package dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.repository;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/repository/InventoryEventPostgresqlQueryRepository;", "Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventQueryOutboundPort;", "repository", "Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/repository/InventoryEventPostgresqlRepository;", "mapper", "Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/InventoryEventMapper;", "queryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "<init>", "(Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/repository/InventoryEventPostgresqlRepository;Ldev/ktcloud/black/inventory/event/adapter/infrastructure/jpa/InventoryEventMapper;Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "fetchUnprocessedEvents", "", "Ldev/ktcloud/black/inventory/event/domain/entity/InventoryEventDomainEntity;", "inventoryId", "", "fetchAll", "ids", "inventory-event"})
public class InventoryEventPostgresqlQueryRepository implements dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventQueryOutboundPort {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.repository.InventoryEventPostgresqlRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.InventoryEventMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.querydsl.jpa.impl.JPAQueryFactory queryFactory = null;
    
    public InventoryEventPostgresqlQueryRepository(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.repository.InventoryEventPostgresqlRepository repository, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.InventoryEventMapper mapper, @org.jetbrains.annotations.NotNull()
    com.querydsl.jpa.impl.JPAQueryFactory queryFactory) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity> fetchUnprocessedEvents(long inventoryId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.inventory.event.domain.entity.InventoryEventDomainEntity> fetchAll(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids) {
        return null;
    }
}