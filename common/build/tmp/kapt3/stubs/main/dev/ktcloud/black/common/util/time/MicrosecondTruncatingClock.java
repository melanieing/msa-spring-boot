package dev.ktcloud.black.common.util.time;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ldev/ktcloud/black/common/util/time/MicrosecondTruncatingClock;", "Ljava/time/Clock;", "delegate", "<init>", "(Ljava/time/Clock;)V", "getZone", "Ljava/time/ZoneId;", "withZone", "zone", "instant", "Ljava/time/Instant;", "Companion", "common"})
public final class MicrosecondTruncatingClock extends java.time.Clock {
    @org.jetbrains.annotations.NotNull()
    private final java.time.Clock delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final dev.ktcloud.black.common.util.time.MicrosecondTruncatingClock Instance = null;
    @org.jetbrains.annotations.NotNull()
    public static final dev.ktcloud.black.common.util.time.MicrosecondTruncatingClock.Companion Companion = null;
    
    private MicrosecondTruncatingClock(java.time.Clock delegate) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.time.ZoneId getZone() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.time.Clock withZone(@org.jetbrains.annotations.NotNull()
    java.time.ZoneId zone) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.time.Instant instant() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldev/ktcloud/black/common/util/time/MicrosecondTruncatingClock$Companion;", "", "<init>", "()V", "Instance", "Ldev/ktcloud/black/common/util/time/MicrosecondTruncatingClock;", "getInstance", "()Ldev/ktcloud/black/common/util/time/MicrosecondTruncatingClock;", "common"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.ktcloud.black.common.util.time.MicrosecondTruncatingClock getInstance() {
            return null;
        }
    }
}