# inventory-service Dockerfile — 멀티스테이지 + Spring Boot layered jar.
# 자세한 설명은 order-service/Dockerfile 헤더 참고.
# 빌드: docker build -f inventory-service/Dockerfile -t inventory-service:dev .

FROM eclipse-temurin:21-jdk AS build
WORKDIR /workspace
COPY gradlew gradlew.bat ./
COPY gradle/ gradle/
COPY settings.gradle.kts build.gradle.kts ./
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
RUN ./gradlew :inventory-service:dependencies --no-daemon || true
COPY . .
RUN ./gradlew :inventory-service:bootJar --no-daemon -x test

FROM eclipse-temurin:21-jre AS extract
WORKDIR /extract
COPY --from=build /workspace/inventory-service/build/libs/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:21-jre
# D2 (2026-05-12) — OpenTelemetry Java agent
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v2.27.0/opentelemetry-javaagent.jar /opt/otel/otel-agent.jar
RUN useradd --system --user-group --create-home --shell /sbin/nologin spring
USER spring
WORKDIR /app
COPY --from=extract /extract/dependencies/         ./
COPY --from=extract /extract/spring-boot-loader/   ./
COPY --from=extract /extract/snapshot-dependencies/ ./
COPY --from=extract /extract/application/          ./

HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=3 \
  CMD wget --quiet --tries=1 --spider http://localhost:8003/actuator/health || exit 1

EXPOSE 8003
EXPOSE 9003
ENTRYPOINT ["java", "-javaagent:/opt/otel/otel-agent.jar", "org.springframework.boot.loader.launch.JarLauncher"]
