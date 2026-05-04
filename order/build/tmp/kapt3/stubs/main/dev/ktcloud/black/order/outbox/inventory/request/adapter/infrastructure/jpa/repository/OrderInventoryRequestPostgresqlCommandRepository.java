package dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.repository;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/repository/OrderInventoryRequestPostgresqlCommandRepository;", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestCommandOutboundPort;", "mapper", "Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/OrderInventoryRequestOutboxMapper;", "repository", "Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/repository/OrderInventoryRequestPostgresqlRepository;", "<init>", "(Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/OrderInventoryRequestOutboxMapper;Ldev/ktcloud/black/order/outbox/inventory/request/adapter/infrastructure/jpa/repository/OrderInventoryRequestPostgresqlRepository;)V", "save", "", "orderInventoryRequest", "Ldev/ktcloud/black/order/outbox/inventory/request/domain/entity/OrderInventoryRequestOutboxDomainEntity;", "saveAll", "orderInventoryRequests", "", "order"})
public class OrderInventoryRequestPostgresqlCommandRepository implements dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestCommandOutboundPort {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.OrderInventoryRequestOutboxMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.repository.OrderInventoryRequestPostgresqlRepository repository = null;
    
    public OrderInventoryRequestPostgresqlCommandRepository(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.OrderInventoryRequestOutboxMapper mapper, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.repository.OrderInventoryRequestPostgresqlRepository repository) {
        super();
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity orderInventoryRequest) {
    }
    
    @java.lang.Override()
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity> orderInventoryRequests) {
    }
}