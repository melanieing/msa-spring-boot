package dev.ktcloud.black.client.redis.api;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J5\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\t0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/ktcloud/black/client/redis/api/IdempotentEventProcessor;", "", "distributedLock", "Ldev/ktcloud/black/client/redis/api/DistributedLock;", "redissonClient", "Lorg/redisson/api/RedissonClient;", "<init>", "(Ldev/ktcloud/black/client/redis/api/DistributedLock;Lorg/redisson/api/RedissonClient;)V", "withIdempotencyProcess", "R", "key", "", "ttl", "Ljava/time/Duration;", "func", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/time/Duration;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "client-redis"})
public class IdempotentEventProcessor {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.client.redis.api.DistributedLock distributedLock = null;
    @org.jetbrains.annotations.NotNull()
    private final org.redisson.api.RedissonClient redissonClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String IDEMPOTENT_PROCESS_KEY_PREFIX = "idempotent-processed";
    @org.jetbrains.annotations.NotNull()
    public static final dev.ktcloud.black.client.redis.api.IdempotentEventProcessor.Companion Companion = null;
    
    public IdempotentEventProcessor(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.client.redis.api.DistributedLock distributedLock, @org.jetbrains.annotations.NotNull()
    org.redisson.api.RedissonClient redissonClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public <R extends java.lang.Object>R withIdempotencyProcess(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.time.Duration ttl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends R> func) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldev/ktcloud/black/client/redis/api/IdempotentEventProcessor$Companion;", "", "<init>", "()V", "IDEMPOTENT_PROCESS_KEY_PREFIX", "", "client-redis"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}