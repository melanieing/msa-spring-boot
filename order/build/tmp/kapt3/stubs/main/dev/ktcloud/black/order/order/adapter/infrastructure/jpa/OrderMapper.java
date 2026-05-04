package dev.ktcloud.black.order.order.adapter.infrastructure.jpa;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/OrderMapper;", "Ldev/ktcloud/black/common/adapter/infrastructure/jpa/EntityMapper;", "Ldev/ktcloud/black/order/order/adapter/infrastructure/jpa/entity/Order;", "Ldev/ktcloud/black/order/order/domain/entity/OrderDomainEntity;", "<init>", "()V", "toOrmEntity", "domainEntity", "toDomainEntity", "entity", "order"})
public class OrderMapper implements dev.ktcloud.black.common.adapter.infrastructure.jpa.EntityMapper<dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order, dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity> {
    
    public OrderMapper() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order toOrmEntity(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity domainEntity) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity toDomainEntity(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order entity) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity> toDomainEntity(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order> entities) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity> toDomainEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order> entities) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity.Order> toOrmEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.ktcloud.black.order.order.domain.entity.OrderDomainEntity> domainEntities) {
        return null;
    }
}