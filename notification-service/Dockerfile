# ─────────────────────────────────────────────────────────────────────────
# notification-service Dockerfile (C5, 멀티스테이지 + Spring Boot layered jar)
# ─────────────────────────────────────────────────────────────────────────
# 빌드 방법 (반드시 레포 루트에서):
#   docker build -f notification-service/Dockerfile -t notification-service:dev .
#
# 다른 4 service Dockerfile 과 동일 패턴 (order-service Dockerfile 베이스).
# ─────────────────────────────────────────────────────────────────────────


# ═════════════════════════════════════════════════════════════════════
# Stage 1: 빌드 (JDK 21 + Gradle wrapper 로 bootJar 만듦)
# ═════════════════════════════════════════════════════════════════════
FROM eclipse-temurin:21-jdk AS build
WORKDIR /workspace

# 1) Gradle wrapper + 빌드 스크립트만 먼저 복사 → 의존성 캐시 레이어 분리
COPY gradlew gradlew.bat ./
COPY gradle/ gradle/
COPY settings.gradle.kts build.gradle.kts ./

# 2) 모든 모듈의 build.gradle.kts 복사 (실 소스 X)
COPY auth/build.gradle.kts auth/
COPY client-redis/build.gradle.kts client-redis/
COPY client-ses/build.gradle.kts client-ses/
COPY common/build.gradle.kts common/
COPY identification/build.gradle.kts identification/
COPY inventory-event/build.gradle.kts inventory-event/
COPY inventory/build.gradle.kts inventory/
COPY inventory-service/build.gradle.kts inventory-service/
COPY notification-service/build.gradle.kts notification-service/
COPY order/build.gradle.kts order/
COPY order-service/build.gradle.kts order-service/
COPY product/build.gradle.kts product/
COPY product-service/build.gradle.kts product-service/
COPY template/build.gradle.kts template/
COPY user/build.gradle.kts user/
COPY user-api-gateway/build.gradle.kts user-api-gateway/

# 3) 의존성만 미리 다운로드 (의존성 안 바뀌면 이 레이어 캐시 재사용)
RUN ./gradlew :notification-service:dependencies --no-daemon || true

# 4) 실제 소스 코드 복사
COPY . .

# 5) bootJar 빌드 (테스트 스킵 — 컨테이너 빌드 단계에서 테스트는 CI 가 따로)
RUN ./gradlew :notification-service:bootJar --no-daemon -x test


# ═════════════════════════════════════════════════════════════════════
# Stage 2: layered jar 추출 (Docker 레이어 캐싱 효율 ↑)
# ═════════════════════════════════════════════════════════════════════
FROM eclipse-temurin:21-jre AS extract
WORKDIR /extract
COPY --from=build /workspace/notification-service/build/libs/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract


# ═════════════════════════════════════════════════════════════════════
# Stage 3: 런타임 (JRE only — 이미지 작게)
# ═════════════════════════════════════════════════════════════════════
FROM eclipse-temurin:21-jre

# D2 + X fix (2026-05-13) — RUN wget (ADD URL redirect 실패 fix)
RUN mkdir -p /opt/otel && \
    wget -q -O /opt/otel/otel-agent.jar \
    https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.27.0/opentelemetry-javaagent.jar && \
    test -s /opt/otel/otel-agent.jar

# non-root 사용자 생성 + 사용 (보안 best practice)
RUN useradd --system --user-group --create-home --shell /sbin/nologin spring
USER spring
WORKDIR /app

# 추출된 layered jar 4개 디렉토리를 순서대로 COPY
COPY --from=extract /extract/dependencies/         ./
COPY --from=extract /extract/spring-boot-loader/   ./
COPY --from=extract /extract/snapshot-dependencies/ ./
COPY --from=extract /extract/application/          ./

HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=3 \
  CMD wget --quiet --tries=1 --spider http://localhost:8004/actuator/health || exit 1

EXPOSE 8004
ENTRYPOINT ["java", "-javaagent:/opt/otel/otel-agent.jar", "org.springframework.boot.loader.launch.JarLauncher"]
