package dev.ktcloud.black.common.domain.entity;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/common/domain/entity/BaseEntity;", "", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "setCreatedAt", "(Ljava/time/LocalDateTime;)V", "updatedAt", "getUpdatedAt", "setUpdatedAt", "deletedAt", "getDeletedAt", "setDeletedAt", "common"})
public abstract interface BaseEntity {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.time.LocalDateTime getCreatedAt();
    
    public abstract void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.time.LocalDateTime getUpdatedAt();
    
    public abstract void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalDateTime getDeletedAt();
    
    public abstract void setDeletedAt(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0);
}