package dev.ktcloud.black.common.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseOrmEntity is a Querydsl query type for BaseOrmEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseOrmEntity extends EntityPathBase<BaseOrmEntity> {

    private static final long serialVersionUID = 402561122L;

    public static final QBaseOrmEntity baseOrmEntity = new QBaseOrmEntity("baseOrmEntity");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QBaseOrmEntity(String variable) {
        super(BaseOrmEntity.class, forVariable(variable));
    }

    public QBaseOrmEntity(Path<? extends BaseOrmEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseOrmEntity(PathMetadata metadata) {
        super(BaseOrmEntity.class, metadata);
    }

}

