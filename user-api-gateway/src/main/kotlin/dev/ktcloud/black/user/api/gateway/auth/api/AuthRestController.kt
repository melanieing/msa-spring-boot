package dev.ktcloud.black.user.api.gateway.auth.api

import dev.ktcloud.black.user.api.gateway.adapter.presentation.web.security.JwtTokenProvider
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

/**
 * C1 — /auth/login: 학습용 demo user 로 JWT 발급.
 *
 * 운영급에서는 user-service (별도 microservice) 통합:
 *   - PostgreSQL user 테이블 조회 + bcrypt 검증
 *   - refresh token 발급 + revocation list
 *   - rate limit 별도 (login flood 방어)
 *
 * 학습용 단순화 — application.yaml 의 auth.demo-user 와 매칭만 검증.
 * username/password 는 K8s 환경에서 chart env 로 override 가능 (DEMO_USERNAME / DEMO_PASSWORD).
 */
@RestController
@RequestMapping("/auth")
class AuthRestController(
    @Value("\${auth.demo-user.username}") private val demoUsername: String,
    @Value("\${auth.demo-user.password}") private val demoPassword: String,
    private val tokenProvider: JwtTokenProvider,
) {
    @Operation(summary = "JWT 발급 (학습용 demo user)")
    @ApiResponse(responseCode = "200", description = "발급 성공")
    @ApiResponse(responseCode = "401", description = "username/password 불일치")
    @PostMapping("/login")
    suspend fun login(@RequestBody body: LoginRequest): LoginResponse {
        if (body.username != demoUsername || body.password != demoPassword) {
            throw ResponseStatusException(HttpStatus.UNAUTHORIZED, "invalid credentials")
        }
        return LoginResponse(token = tokenProvider.issueToken(body.username))
    }

    data class LoginRequest(val username: String, val password: String)
    data class LoginResponse(val token: String)
}
