package dev.ktcloud.black.user.api.gateway.adapter.presentation.web.configuration

import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.filter.JwtAuthenticationWebFilter
import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.filter.RateLimitWebFilter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.SecurityWebFiltersOrder
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

// C1 + C2 통합 보안 설정.
//
// Filter chain (순서 중요):
//   1. RateLimitWebFilter   (HTTP_BASIC 위치, 가장 앞 — DDoS 방어 우선)
//   2. JwtAuthenticationWebFilter (AUTHENTICATION 위치)
//   3. authorizeExchange (permitAll path 외 모두 인증 필요)
//
// permitAll path:
//   - /actuator/...        : K8s probe 와 monitoring
//   - /auth/login          : C1 — 토큰 발급 endpoint
//   - /swagger-ui/...      : Swagger UI + /v3/api-docs : API 문서
//   - /webjars/...         : Swagger UI 의 정적 리소스
//
// 그 외 모두 authenticated → JwtAuthenticationWebFilter 가 SecurityContext 채워야 통과.
@Configuration
@EnableWebFluxSecurity
class SecurityConfig(
    private val jwtAuthenticationWebFilter: JwtAuthenticationWebFilter,
    private val rateLimitWebFilter: RateLimitWebFilter,
) {

    @Bean
    fun filterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        return http
            .csrf { it.disable() }
            .httpBasic { it.disable() }
            .formLogin { it.disable() }
            .authorizeExchange { exchange ->
                exchange
                    .pathMatchers(
                        "/actuator/**",
                        "/auth/login",
                        "/swagger-ui.html",
                        "/swagger-ui/**",
                        "/v3/api-docs/**",
                        "/webjars/**",
                    ).permitAll()
                    .anyExchange().authenticated()
            }
            .addFilterAt(rateLimitWebFilter, SecurityWebFiltersOrder.HTTP_BASIC)
            .addFilterAt(jwtAuthenticationWebFilter, SecurityWebFiltersOrder.AUTHENTICATION)
            .build()
    }
}