package dev.ktcloud.black.order.common.adapter.configuration.kafka;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0017J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u0010\u0010\u0002\u001a\u00020\u00038\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/ktcloud/black/order/common/adapter/configuration/kafka/KafkaConfig;", "", "bootstrapServers", "", "<init>", "(Ljava/lang/String;)V", "inventoryReservedResultConsumerFactory", "Lorg/springframework/kafka/core/ConsumerFactory;", "Ldev/ktcloud/black/order/common/adapter/infrastructure/kafka/model/InventoryReservedResultMessage;", "inventoryReservedResultContainerFactory", "Lorg/springframework/kafka/config/ConcurrentKafkaListenerContainerFactory;", "configurer", "Lorg/springframework/boot/autoconfigure/kafka/ConcurrentKafkaListenerContainerFactoryConfigurer;", "order"})
public class KafkaConfig {
    @org.springframework.beans.factory.annotation.Value(value = "${spring.kafka.bootstrap-servers}")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bootstrapServers = null;
    
    public KafkaConfig(@org.springframework.beans.factory.annotation.Value(value = "${spring.kafka.bootstrap-servers}")
    @org.jetbrains.annotations.NotNull()
    java.lang.String bootstrapServers) {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.kafka.core.ConsumerFactory<java.lang.String, dev.ktcloud.black.order.common.adapter.infrastructure.kafka.model.InventoryReservedResultMessage> inventoryReservedResultConsumerFactory() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory<java.lang.String, dev.ktcloud.black.order.common.adapter.infrastructure.kafka.model.InventoryReservedResultMessage> inventoryReservedResultContainerFactory(@org.jetbrains.annotations.NotNull()
    org.springframework.boot.autoconfigure.kafka.ConcurrentKafkaListenerContainerFactoryConfigurer configurer) {
        return null;
    }
}