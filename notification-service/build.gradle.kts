// ─────────────────────────────────────────────────────────────────────────
// notification-service 모듈 (C5)
// ─────────────────────────────────────────────────────────────────────────
// 5번째 마이크로서비스. PDF 8.5절의 알림 서비스 — 학습용 단순 스텁:
//   - Kafka 4 토픽 구독 (order.pending / inventory_reserved / confirmed / cancelled)
//   - 단일 채널 (logger.info) — 실제 SMS/이메일 발송은 descope (CLAUDE.md §3)
//
// 다른 service 와 차이:
//   - DB 의존성 없음 (notification 만의 PG cluster 미사용)
//   - gRPC 안 씀 (단방향 consumer 만)
//   - actuator probe 위해 spring-boot-starter-web (servlet) 만 띄움
// ─────────────────────────────────────────────────────────────────────────

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":common"))                            // BaseEntity, util 등 공유 유틸

    implementation("org.springframework.boot:spring-boot-starter-web")        // actuator probe 위해 servlet
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.kafka:spring-kafka")                  // KafkaListener

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
}

// 이 모듈은 application — root subprojects 의 default 비활성을 override 해서 bootJar 활성.
tasks.named("bootJar") { enabled = true }
