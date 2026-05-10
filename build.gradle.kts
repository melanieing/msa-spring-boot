import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

object Versions {
	val KOTLIN = "2.3.20"
}

plugins {
	java
	kotlin("jvm") version "2.3.20"
	kotlin("kapt") version "2.3.20"
	kotlin("plugin.spring") version "2.3.20"
	kotlin("plugin.jpa") version "2.3.20"
	// 멀티모듈 root 자체는 boot 앱이 아니라 컨테이너이므로 'apply false'.
	// 각 subprojects 가 'apply(plugin = ...)' 로 적용해서 거기만 boot project 가 됨.
	id("org.springframework.boot") version "3.5.14" apply false
	id("io.spring.dependency-management") version "1.1.7"
}

allprojects {
	group = "dev.ktcloud.black"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}
}

kotlin {
	jvmToolchain(21)
}

subprojects {
	apply(plugin = "java")
	apply(plugin = "org.jetbrains.kotlin.jvm")
	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")

	java {
		toolchain {
			languageVersion.set(JavaLanguageVersion.of(21))
		}
	}

	configure<JavaPluginExtension> {
		toolchain {
			languageVersion.set(JavaLanguageVersion.of(21))
		}
	}

	configure<KotlinJvmProjectExtension> {
		compilerOptions {
			freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
		}
	}

	dependencies {
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		compileOnly("org.projectlombok:lombok")
		annotationProcessor("org.projectlombok:lombok")
	}

	tasks.getByName<Jar>("jar") {
		enabled = true
	}

	// 라이브러리 모듈은 bootJar 안 만듦 (mainClass 가 없어서 실패).
	// 아래 '실행 가능 application 모듈 화이트리스트' 에 들어있는 것만 bootJar 활성.
	val applicationModules = setOf(
		"order-service",
		"inventory-service",
		"product-service",
		"user-api-gateway",
		"notification-service",                  // C5 (2026-05-12 추가) — 5번째 microservice
	)
	afterEvaluate {
		if (project.name !in applicationModules) {
			tasks.findByName("bootJar")?.enabled = false
		}
	}
}