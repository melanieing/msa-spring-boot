package dev.ktcloud.black.common.adapter.infrastructure.jpa;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a8\u0006\u000f\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/common/adapter/infrastructure/jpa/EntityMapper;", "BasePersistenceEntity", "Ldev/ktcloud/black/common/domain/entity/BaseEntity;", "DomainEntity", "", "toOrmEntity", "domainEntity", "(Ljava/lang/Object;)Ldev/ktcloud/black/common/domain/entity/BaseEntity;", "", "domainEntities", "toDomainEntity", "entity", "(Ldev/ktcloud/black/common/domain/entity/BaseEntity;)Ljava/lang/Object;", "entities", "", "common"})
public abstract interface EntityMapper<BasePersistenceEntity extends dev.ktcloud.black.common.domain.entity.BaseEntity, DomainEntity extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract BasePersistenceEntity toOrmEntity(DomainEntity domainEntity);
    
    @org.jetbrains.annotations.NotNull()
    public default java.util.List<BasePersistenceEntity> toOrmEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends DomainEntity> domainEntities) {
        return null;
    }
    
    public abstract DomainEntity toDomainEntity(@org.jetbrains.annotations.NotNull()
    BasePersistenceEntity entity);
    
    @org.jetbrains.annotations.NotNull()
    public default java.util.List<DomainEntity> toDomainEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends BasePersistenceEntity> entities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public default java.util.List<DomainEntity> toDomainEntity(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends BasePersistenceEntity> entities) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static <BasePersistenceEntity extends dev.ktcloud.black.common.domain.entity.BaseEntity, DomainEntity extends java.lang.Object>java.util.List<BasePersistenceEntity> toOrmEntity(@org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.common.adapter.infrastructure.jpa.EntityMapper<BasePersistenceEntity, DomainEntity> $this, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends DomainEntity> domainEntities) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static <BasePersistenceEntity extends dev.ktcloud.black.common.domain.entity.BaseEntity, DomainEntity extends java.lang.Object>java.util.List<DomainEntity> toDomainEntity(@org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.common.adapter.infrastructure.jpa.EntityMapper<BasePersistenceEntity, DomainEntity> $this, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends BasePersistenceEntity> entities) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static <BasePersistenceEntity extends dev.ktcloud.black.common.domain.entity.BaseEntity, DomainEntity extends java.lang.Object>java.util.List<DomainEntity> toDomainEntity(@org.jetbrains.annotations.NotNull()
        dev.ktcloud.black.common.adapter.infrastructure.jpa.EntityMapper<BasePersistenceEntity, DomainEntity> $this, @org.jetbrains.annotations.NotNull()
        java.lang.Iterable<? extends BasePersistenceEntity> entities) {
            return null;
        }
    }
}