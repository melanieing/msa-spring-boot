# user-api-gateway Dockerfile — 멀티스테이지 + Spring Boot layered jar.
# 자세한 설명은 order-service/Dockerfile 헤더 참고.
# 빌드: docker build -f user-api-gateway/Dockerfile -t user-api-gateway:dev .

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
RUN ./gradlew :user-api-gateway:dependencies --no-daemon || true
COPY . .
RUN ./gradlew :user-api-gateway:bootJar --no-daemon -x test

FROM eclipse-temurin:21-jre AS extract
WORKDIR /extract
COPY --from=build /workspace/user-api-gateway/build/libs/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:21-jre
RUN useradd --system --user-group --create-home --shell /sbin/nologin spring
USER spring
WORKDIR /app
COPY --from=extract /extract/dependencies/         ./
COPY --from=extract /extract/spring-boot-loader/   ./
COPY --from=extract /extract/snapshot-dependencies/ ./
COPY --from=extract /extract/application/          ./

HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=3 \
  CMD wget --quiet --tries=1 --spider http://localhost:8100/actuator/health || exit 1

EXPOSE 8100
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]
