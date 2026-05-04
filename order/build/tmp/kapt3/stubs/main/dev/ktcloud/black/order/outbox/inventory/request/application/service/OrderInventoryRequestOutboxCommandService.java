package dev.ktcloud.black.order.outbox.inventory.request.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0012J\b\u0010\u0012\u001a\u00020\fH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/application/service/OrderInventoryRequestOutboxCommandService;", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/CreateOrderInventoryRequestOutboxCommand;", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/ProcessOrderInventoryRequestOutboxStateCommand;", "orderInventoryRequestCommandOutboundPort", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestCommandOutboundPort;", "orderInventoryRequestQueryOutboundPort", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestQueryOutboundPort;", "orderInventoryEventPublishPort", "Ldev/ktcloud/black/order/common/application/port/event/OrderInventoryEventPublishPort;", "<init>", "(Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestCommandOutboundPort;Ldev/ktcloud/black/order/outbox/inventory/request/application/port/outbound/OrderInventoryRequestQueryOutboundPort;Ldev/ktcloud/black/order/common/application/port/event/OrderInventoryEventPublishPort;)V", "create", "", "command", "Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/CreateOrderInventoryRequestOutboxCommand$In;", "processOrderInventoryRequestOutbox", "Ldev/ktcloud/black/order/outbox/inventory/request/domain/entity/OrderInventoryRequestOutboxDomainEntity;", "domainEntity", "processAll", "order"})
public class OrderInventoryRequestOutboxCommandService implements dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.CreateOrderInventoryRequestOutboxCommand, dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.ProcessOrderInventoryRequestOutboxStateCommand {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestCommandOutboundPort orderInventoryRequestCommandOutboundPort = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestQueryOutboundPort orderInventoryRequestQueryOutboundPort = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.common.application.port.event.OrderInventoryEventPublishPort orderInventoryEventPublishPort = null;
    
    public OrderInventoryRequestOutboxCommandService(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestCommandOutboundPort orderInventoryRequestCommandOutboundPort, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.application.port.outbound.OrderInventoryRequestQueryOutboundPort orderInventoryRequestQueryOutboundPort, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.common.application.port.event.OrderInventoryEventPublishPort orderInventoryEventPublishPort) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.CreateOrderInventoryRequestOutboxCommand.In command) {
    }
    
    private dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity processOrderInventoryRequestOutbox(dev.ktcloud.black.order.outbox.inventory.request.domain.entity.OrderInventoryRequestOutboxDomainEntity domainEntity) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void processAll() {
    }
}