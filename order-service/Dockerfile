# ─────────────────────────────────────────────────────────────────────────
# order-service Dockerfile (멀티스테이지 + Spring Boot layered jar)
# ─────────────────────────────────────────────────────────────────────────
# 빌드 방법 (반드시 레포 루트에서):
#   docker build -f order-service/Dockerfile -t order-service:dev .
#
# 왜 레포 루트에서?
#   멀티모듈 Gradle 프로젝트라 'order-service' 가 'common', 'order',
#   'inventory-event' 등 다른 모듈에 의존. Dockerfile context 가 루트여야 다 잡힘.
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
#    Gradle 이 의존성 그래프 구성에 모듈별 빌드 스크립트 필요.
COPY auth/build.gradle.kts auth/
COPY client-redis/build.gradle.kts client-redis/
COPY client-ses/build.gradle.kts client-ses/
COPY common/build.gradle.kts common/
COPY identification/build.gradle.kts identification/
COPY inventory-event/build.gradle.kts inventory-event/
COPY inventory/build.gradle.kts inventory/
COPY inventory-service/build.gradle.kts inventory-service/
COPY order/build.gradle.kts order/
COPY order-service/build.gradle.kts order-service/
COPY product/build.gradle.kts product/
COPY product-service/build.gradle.kts product-service/
COPY template/build.gradle.kts template/
COPY user/build.gradle.kts user/
COPY user-api-gateway/build.gradle.kts user-api-gateway/

# 3) 의존성만 미리 다운로드 (의존성 안 바뀌면 이 레이어 캐시 재사용)
RUN ./gradlew :order-service:dependencies --no-daemon || true

# 4) 실제 소스 코드 복사
COPY . .

# 5) bootJar 빌드 (테스트 스킵 — 컨테이너 빌드 단계에서 테스트는 CI 가 따로)
RUN ./gradlew :order-service:bootJar --no-daemon -x test


# ═════════════════════════════════════════════════════════════════════
# Stage 2: layered jar 추출 (Docker 레이어 캐싱 효율 ↑)
# ═════════════════════════════════════════════════════════════════════
# Spring Boot 3+ 의 'layertools' 모드로 jar 를 4개 레이어로 분리:
#   - dependencies          (가장 자주 변하지 않음 → 가장 아래 레이어)
#   - spring-boot-loader
#   - snapshot-dependencies
#   - application           (가장 자주 바뀌는 우리 코드 → 가장 위 레이어)
# 코드만 바뀌면 application 레이어만 재빌드 → 푸시 빨라짐.
FROM eclipse-temurin:21-jre AS extract
WORKDIR /extract
COPY --from=build /workspace/order-service/build/libs/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract


# ═════════════════════════════════════════════════════════════════════
# Stage 3: 런타임 (JRE only — 이미지 작게)
# ═════════════════════════════════════════════════════════════════════
FROM eclipse-temurin:21-jre

# D2 (2026-05-12) — OpenTelemetry Java agent 통합. Spring Boot 코드 변경 0,
# auto-instrumentation 으로 HTTP/gRPC/JDBC/Kafka 등 자동 trace.
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.27.0/opentelemetry-javaagent.jar /opt/otel/otel-agent.jar

# non-root 사용자 생성 + 사용 (보안 best practice)
RUN useradd --system --user-group --create-home --shell /sbin/nologin spring
USER spring
WORKDIR /app

# 추출된 layered jar 4개 디렉토리를 순서대로 COPY
# (덜 변하는 것 → 자주 변하는 것 순서: 캐시 활용 ↑)
COPY --from=extract /extract/dependencies/         ./
COPY --from=extract /extract/spring-boot-loader/   ./
COPY --from=extract /extract/snapshot-dependencies/ ./
COPY --from=extract /extract/application/          ./

# Spring Boot 의 표준 actuator health 엔드포인트로 헬스체크
HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=3 \
  CMD wget --quiet --tries=1 --spider http://localhost:8002/actuator/health || exit 1

EXPOSE 8002
EXPOSE 9002
# D2 — -javaagent 옵션으로 OTel agent 활성. chart env (OTEL_EXPORTER_OTLP_ENDPOINT)
# 가 collector 로 trace/metric 송신 endpoint 결정.
ENTRYPOINT ["java", "-javaagent:/opt/otel/otel-agent.jar", "org.springframework.boot.loader.launch.JarLauncher"]
