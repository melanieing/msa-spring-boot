package dev.ktcloud.black.order.order.adapter.infrastructure.jpa.repository;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/repository/OrderPostgresqlQueryRepository;", "Ldev/ktcloud/black/order/order/application/port/outbound/OrderQueryOutboundPort;", "repository", "Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/repository/OrderPostgresqlRepository;", "orderMapper", "Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/OrderMapper;", "<init>", "(Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/repository/OrderPostgresqlRepository;Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/OrderMapper;)V", "fetchOrder", "Ldev/ktcloud/black/order/order/domain/entity/OrderDomainEntity;", "orderId", "", "order"})
public class OrderPostgresqlQueryRepository implements dev.ktcloud.black.order.order.application.port.outbound.OrderQueryOutboundPort {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.adapter.infrastructure.jpa.repository.OrderPostgresqlRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.adapter.infrastructure.jpa.OrderMapper orderMapper = null;
    
    public OrderPostgresqlQueryRepository(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.adapter.infrastructure.jpa.repository.OrderPostgresqlRepository repository, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.adapter.infrastructure.jpa.OrderMapper orderMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity fetchOrder(long orderId) {
        return null;
    }
}