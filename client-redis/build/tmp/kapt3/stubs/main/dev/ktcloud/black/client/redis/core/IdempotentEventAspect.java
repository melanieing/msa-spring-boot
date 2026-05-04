package dev.ktcloud.black.client.redis.core;

@org.aspectj.lang.annotation.Aspect()
@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/ktcloud/black/client/redis/core/IdempotentEventAspect;", "", "distributedLock", "Ldev/ktcloud/black/client/redis/api/DistributedLock;", "redissonClient", "Lorg/redisson/api/RedissonClient;", "<init>", "(Ldev/ktcloud/black/client/redis/api/DistributedLock;Lorg/redisson/api/RedissonClient;)V", "Companion", "client-redis"})
public class IdempotentEventAspect {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.client.redis.api.DistributedLock distributedLock = null;
    @org.jetbrains.annotations.NotNull()
    private final org.redisson.api.RedissonClient redissonClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String IDEMPOTENT_PROCESS_KEY_PREFIX = "idempotent-processed";
    @org.jetbrains.annotations.NotNull()
    public static final dev.ktcloud.black.client.redis.core.IdempotentEventAspect.Companion Companion = null;
    
    public IdempotentEventAspect(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.client.redis.api.DistributedLock distributedLock, @org.jetbrains.annotations.NotNull()
    org.redisson.api.RedissonClient redissonClient) {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldev/ktcloud/black/client/redis/core/IdempotentEventAspect$Companion;", "", "<init>", "()V", "IDEMPOTENT_PROCESS_KEY_PREFIX", "", "client-redis"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}