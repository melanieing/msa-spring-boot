package dev.ktcloud.black.common.domain.entity;

@jakarta.persistence.MappedSuperclass()
@jakarta.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Ldev/ktcloud/black/common/domain/entity/BaseOrmEntity;", "Ldev/ktcloud/black/common/domain/entity/BaseEntity;", "createdAt", "Ljava/time/LocalDateTime;", "updatedAt", "deletedAt", "<init>", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCreatedAt", "()Ljava/time/LocalDateTime;", "setCreatedAt", "(Ljava/time/LocalDateTime;)V", "getUpdatedAt", "setUpdatedAt", "getDeletedAt", "setDeletedAt", "delete", "", "time", "common"})
public class BaseOrmEntity implements dev.ktcloud.black.common.domain.entity.BaseEntity {
    @org.springframework.data.annotation.CreatedDate()
    @jakarta.persistence.Column(nullable = false, updatable = false)
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDateTime createdAt;
    @org.springframework.data.annotation.LastModifiedDate()
    @jakarta.persistence.Column(nullable = false, updatable = true)
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDateTime updatedAt;
    @org.jetbrains.annotations.Nullable()
    private java.time.LocalDateTime deletedAt;
    
    public BaseOrmEntity(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime updatedAt, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime deletedAt) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @java.lang.Override()
    public void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
    
    @java.lang.Override()
    public void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.time.LocalDateTime getDeletedAt() {
        return null;
    }
    
    @java.lang.Override()
    public void setDeletedAt(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime time) {
    }
    
    public BaseOrmEntity() {
        super();
    }
}