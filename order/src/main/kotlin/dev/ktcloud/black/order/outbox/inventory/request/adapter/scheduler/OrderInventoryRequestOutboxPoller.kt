package dev.ktcloud.black.order.outbox.inventory.request.adapter.scheduler

import dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound.ProcessOrderInventoryRequestOutboxStateCommand
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
 * Transactional Outbox 패턴의 Poller (PDF 6.5절).
 *
 * 동작:
 *   - 5초마다 ProcessOrderInventoryRequestOutboxStateCommand.processAll() 호출.
 *   - application service 가 fetchAllUnprocessed → KafkaPublisher → state 변경(PROCESSED) /
 *     실패 시 increaseRetry 후 nextStartFrom backoff 까지 다 처리.
 *
 * 왜 별도 Poller 클래스로 두나:
 *   - OrderCommandService 는 트랜잭션 (Order + Outbox INSERT) 에만 책임 있음.
 *   - Kafka 발송은 별도 트랜잭션 + 비동기 → Outbox 패턴의 핵심 (DB commit 보장 후 발송).
 *   - @Scheduled 는 thread pool 안에서 실행되므로 web 요청과 분리됨.
 */
@Component
class OrderInventoryRequestOutboxPoller(
    private val processCommand: ProcessOrderInventoryRequestOutboxStateCommand,
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @Scheduled(fixedRate = POLL_INTERVAL_MS)
    fun poll() {
        runCatching {
            processCommand.processAll()
        }.onFailure { e ->
            // poller 실패가 다음 trigger 를 막지 않게 catch (Spring 의 @Scheduled 는 exception 전파 시 stop)
            log.error("[outbox-poller] processAll failed", e)
        }
    }

    companion object {
        // 학습용 5초. 운영급에서는 2~10초 사이 + jitter (poller 동시 실행 시 thundering herd 방지).
        private const val POLL_INTERVAL_MS = 5000L
    }
}
