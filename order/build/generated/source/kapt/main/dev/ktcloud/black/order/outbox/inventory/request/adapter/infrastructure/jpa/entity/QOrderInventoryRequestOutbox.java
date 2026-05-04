package dev.ktcloud.black.order.outbox.inventory.request.adapter.infrastructure.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderInventoryRequestOutbox is a Querydsl query type for OrderInventoryRequestOutbox
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderInventoryRequestOutbox extends EntityPathBase<OrderInventoryRequestOutbox> {

    private static final long serialVersionUID = -1309454662L;

    public static final QOrderInventoryRequestOutbox orderInventoryRequestOutbox = new QOrderInventoryRequestOutbox("orderInventoryRequestOutbox");

    public final dev.ktcloud.black.common.domain.entity.QBaseOrmEntity _super = new dev.ktcloud.black.common.domain.entity.QBaseOrmEntity(this);

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> inventoryId = createNumber("inventoryId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> nextStartFrom = createDateTime("nextStartFrom", java.time.LocalDateTime.class);

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final NumberPath<Integer> retry = createNumber("retry", Integer.class);

    public final EnumPath<dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus> status = createEnum("status", dev.ktcloud.black.order.outbox.inventory.request.domain.vo.OrderInventoryRequestOutboxStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderInventoryRequestOutbox(String variable) {
        super(OrderInventoryRequestOutbox.class, forVariable(variable));
    }

    public QOrderInventoryRequestOutbox(Path<OrderInventoryRequestOutbox> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderInventoryRequestOutbox(PathMetadata metadata) {
        super(OrderInventoryRequestOutbox.class, metadata);
    }

}

