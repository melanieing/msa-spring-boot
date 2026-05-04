package dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.repository;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/repository/OrderInventoryRequestPostgresqlQueryRepository;", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestQueryOutboundPort;", "mapper", "Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/OrderInventoryRequestOutboxMapper;", "queryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "repository", "Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/repository/OrderInventoryRequestPostgresqlRepository;", "<init>", "(Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/OrderInventoryRequestOutboxMapper;Lcom/querydsl/jpa/impl/JPAQueryFactory;Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/repository/OrderInventoryRequestPostgresqlRepository;)V", "findAll", "", "Ldev/ktcloud/black/order/outbox/inventory/request/domain/entity/OrderInventoryRequestOutboxDomainEntity;", "by", "", "fetchUnprocessed", "order"})
public class OrderInventoryRequestPostgresqlQueryRepository implements dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestQueryOutboundPort {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.OrderInventoryRequestOutboxMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.querydsl.jpa.impl.JPAQueryFactory queryFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.repository.OrderInventoryRequestPostgresqlRepository repository = null;
    
    public OrderInventoryRequestPostgresqlQueryRepository(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.OrderInventoryRequestOutboxMapper mapper, @org.jetbrains.annotations.NotNull()
    com.querydsl.jpa.impl.JPAQueryFactory queryFactory, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.repository.OrderInventoryRequestPostgresqlRepository repository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity> findAll(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> by) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity> fetchUnprocessed() {
        return null;
    }
}