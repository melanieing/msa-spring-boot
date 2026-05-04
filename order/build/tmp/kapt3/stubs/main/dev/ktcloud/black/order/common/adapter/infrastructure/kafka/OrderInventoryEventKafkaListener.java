package dev.ktcloud.black.order.common.adapter.infrastructure.kafka;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/ktcloud/black/order/common/adapter/infrastructure/kafka/OrderInventoryEventKafkaListener;", "Ldev/ktcloud/black/order/common/application/port/event/OrderInventoryEventListenerPort;", "orderCommandService", "Ldev/ktcloud/black/order/order/application/service/OrderCommandService;", "<init>", "(Ldev/ktcloud/black/order/order/application/service/OrderCommandService;)V", "onResultPublished", "", "event", "Ldev/ktcloud/black/order/order/application/dto/event/inbound/InventoryReservedResultEvent;", "order"})
public class OrderInventoryEventKafkaListener implements dev.ktcloud.black.order.common.application.port.event.OrderInventoryEventListenerPort {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.order.application.service.OrderCommandService orderCommandService = null;
    
    public OrderInventoryEventKafkaListener(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.service.OrderCommandService orderCommandService) {
        super();
    }
    
    @org.springframework.kafka.annotation.KafkaListener(topics = {"${spring.kafka.topic.inventory-reserved-result}"}, groupId = "inventory-service-group", containerFactory = "inventoryReservedResponseContainerFactory")
    @java.lang.Override()
    public void onResultPublished(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.dto.event.inbound.InventoryReservedResultEvent event) {
    }
}