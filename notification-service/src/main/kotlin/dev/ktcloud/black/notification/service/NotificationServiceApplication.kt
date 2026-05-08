package dev.ktcloud.black.notification.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * notification-service (C5) — Market Service MSA 의 5번째 마이크로서비스.
 *
 * 학습용 단순 스텁:
 *   - 4 Kafka 토픽 구독 (order.pending / inventory_reserved / confirmed / cancelled)
 *   - 메시지 받으면 logger.info 로 출력 (실제 SMS/이메일 발송 X — CLAUDE.md §3 descope)
 *
 * 향후 확장 (descope 해제 시):
 *   - SES (이메일), SNS (SMS), 푸시 등 다채널 분기
 *   - 발송 성공/실패 로그를 별도 토픽으로 publish
 */
@SpringBootApplication(scanBasePackages = ["dev.ktcloud.black"])
class NotificationServiceApplication

fun main(args: Array<String>) {
    runApplication<NotificationServiceApplication>(*args)
}
