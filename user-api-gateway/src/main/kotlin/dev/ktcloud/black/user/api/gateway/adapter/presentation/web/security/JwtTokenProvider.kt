package dev.ktcloud.black.user.api.gateway.adapter.presentation.web.security

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.nio.charset.StandardCharsets
import java.util.Date
import javax.crypto.SecretKey

/**
 * C1 — JWT 발급 + 검증.
 *
 * - secret: K8s Secret (C8) → Pod env JWT_SECRET → application.yaml 의 ${JWT_SECRET} 매칭.
 * - HMAC-SHA 키 길이 ≥ 32 bytes 필수 (jjwt 0.12.x 의 Keys.hmacShaKeyFor 검증).
 * - issueToken: 학습용 단순 — username 만 subject 에 넣음.
 *   운영급은 roles/permissions claim 추가 + refresh token + revocation list.
 * - validate: 서명 + 만료 검증 후 subject 반환. 실패 시 null (필터에서 401 처리).
 */
@Component
class JwtTokenProvider(
    @Value("\${jwt.secret}") secret: String,
    @Value("\${jwt.expiration-seconds}") private val expirationSeconds: Long,
) {
    private val log = LoggerFactory.getLogger(javaClass)

    private val key: SecretKey = Keys.hmacShaKeyFor(secret.toByteArray(StandardCharsets.UTF_8))

    fun issueToken(username: String): String {
        val now = Date()
        return Jwts.builder()
            .subject(username)
            .issuedAt(now)
            .expiration(Date(now.time + expirationSeconds * 1000))
            .signWith(key)
            .compact()
    }

    /** 토큰 검증. valid 면 subject (username), invalid 면 null. */
    fun validate(token: String): String? {
        return runCatching {
            Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .payload
                .subject
        }.onFailure { e ->
            log.debug("[JWT] validation failed: ${e::class.simpleName} ${e.message}")
        }.getOrNull()
    }
}
