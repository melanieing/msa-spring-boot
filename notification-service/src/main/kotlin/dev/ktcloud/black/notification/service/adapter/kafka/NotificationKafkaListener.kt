package dev.ktcloud.black.notification.service.adapter.kafka

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

/**
 * 4개 order 라이프사이클 토픽 구독 (PDF 부록 A).
 * 학습용 — logger.info 만. 실제 알림 발송은 descope (CLAUDE.md §3).
 *
 * 토픽 이름 = Kafka 안 실제 토픽명 (KafkaTopic CR 의 spec.topicName 기준):
 *   - order.pending               (주문 생성)
 *   - order.inventory_reserved    (재고 예약 완료)
 *   - order.confirmed             (주문 확정)
 *   - order.cancelled             (주문 취소)
 *
 * Note: KafkaTopic CR 의 metadata.name 은 'order.inventory-reserved' (hyphen, RFC 1123)
 *       이지만 spec.topicName 은 'order.inventory_reserved' (underscore, PDF 명세).
 *       KafkaListener 는 실제 Kafka 토픽명을 사용하므로 underscore.
 */
@Component
class NotificationKafkaListener {
    private val log = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["order.pending"], groupId = "notification-service-group")
    fun onOrderPending(message: Map<String, Any>) {
        log.info("[notification] 📨 order.pending received: $message")
    }

    @KafkaListener(topics = ["order.inventory_reserved"], groupId = "notification-service-group")
    fun onInventoryReserved(message: Map<String, Any>) {
        log.info("[notification] 📨 order.inventory_reserved received: $message")
    }

    @KafkaListener(topics = ["order.confirmed"], groupId = "notification-service-group")
    fun onOrderConfirmed(message: Map<String, Any>) {
        log.info("[notification] 📨 order.confirmed received: $message")
    }

    @KafkaListener(topics = ["order.cancelled"], groupId = "notification-service-group")
    fun onOrderCancelled(message: Map<String, Any>) {
        log.info("[notification] 📨 order.cancelled received: $message")
    }
}
