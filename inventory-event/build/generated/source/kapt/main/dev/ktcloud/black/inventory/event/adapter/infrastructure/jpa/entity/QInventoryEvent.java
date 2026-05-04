package dev.ktcloud.black.inventory.event.adapter.infrastructure.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInventoryEvent is a Querydsl query type for InventoryEvent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInventoryEvent extends EntityPathBase<InventoryEvent> {

    private static final long serialVersionUID = 996127738L;

    public static final QInventoryEvent inventoryEvent = new QInventoryEvent("inventoryEvent");

    public final dev.ktcloud.black.common.domain.entity.QBaseOrmEntity _super = new dev.ktcloud.black.common.domain.entity.QBaseOrmEntity(this);

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final EnumPath<dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType> eventType = createEnum("eventType", dev.ktcloud.black.inventory.event.domain.vo.InventoryEventType.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> inventoryId = createNumber("inventoryId", Long.class);

    public final EnumPath<dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus> processStatus = createEnum("processStatus", dev.ktcloud.black.inventory.event.domain.vo.InventoryEventProcessStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QInventoryEvent(String variable) {
        super(InventoryEvent.class, forVariable(variable));
    }

    public QInventoryEvent(Path<InventoryEvent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInventoryEvent(PathMetadata metadata) {
        super(InventoryEvent.class, metadata);
    }

}

