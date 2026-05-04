package dev.ktcloud.black.order.common.adapter.infrastructure.kafka;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/ktcloud/black/order/common/adapter/infrastructure/kafka/OrderInventoryEventKafkaPublisher;", "Ldev/ktcloud/black/order/common/application/port/event/OrderInventoryEventPublishPort;", "kafkaTemplate", "Lorg/springframework/kafka/core/KafkaTemplate;", "", "Ldev/ktcloud/black/order/common/adapter/infrastructure/kafka/model/InventoryReserveRequestMessage;", "mapper", "Ldev/ktcloud/black/order/common/adapter/infrastructure/kafka/mapper/OrderInventoryPublishEventMapper;", "topicName", "<init>", "(Lorg/springframework/kafka/core/KafkaTemplate;Ldev/ktcloud/black/order/common/adapter/infrastructure/kafka/mapper/OrderInventoryPublishEventMapper;Ljava/lang/String;)V", "publish", "", "event", "Ldev/ktcloud/black/order/order/application/dto/event/outbound/InventoryReserveRequestEvent;", "onSuccess", "Lkotlin/Function0;", "onError", "order"})
public class OrderInventoryEventKafkaPublisher implements dev.ktcloud.black.order.common.application.port.event.OrderInventoryEventPublishPort {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.kafka.core.KafkaTemplate<java.lang.String, dev.ktcloud.black.order.common.adapter.infrastructure.kafka.model.InventoryReserveRequestMessage> kafkaTemplate = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.order.common.adapter.infrastructure.kafka.mapper.OrderInventoryPublishEventMapper mapper = null;
    @org.springframework.beans.factory.annotation.Value(value = "${spring.kafka.topic.inventory-reserve-request}")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topicName = null;
    
    public OrderInventoryEventKafkaPublisher(@org.jetbrains.annotations.NotNull()
    org.springframework.kafka.core.KafkaTemplate<java.lang.String, dev.ktcloud.black.order.common.adapter.infrastructure.kafka.model.InventoryReserveRequestMessage> kafkaTemplate, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.common.adapter.infrastructure.kafka.mapper.OrderInventoryPublishEventMapper mapper, @org.springframework.beans.factory.annotation.Value(value = "${spring.kafka.topic.inventory-reserve-request}")
    @org.jetbrains.annotations.NotNull()
    java.lang.String topicName) {
        super();
    }
    
    @java.lang.Override()
    public void publish(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.application.dto.event.outbound.InventoryReserveRequestEvent event, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
}