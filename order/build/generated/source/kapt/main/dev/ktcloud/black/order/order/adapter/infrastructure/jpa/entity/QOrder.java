package dev.ktcloud.black.order.order.adapter.infrastructure.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 511250584L;

    public static final QOrder order = new QOrder("order1");

    public final dev.ktcloud.black.common.domain.entity.QBaseOrmEntity _super = new dev.ktcloud.black.common.domain.entity.QBaseOrmEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<dev.ktcloud.black.order.order.domain.vo.OrderLineItem, dev.ktcloud.black.order.order.domain.vo.QOrderLineItem> orderLineItems = this.<dev.ktcloud.black.order.order.domain.vo.OrderLineItem, dev.ktcloud.black.order.order.domain.vo.QOrderLineItem>createList("orderLineItems", dev.ktcloud.black.order.order.domain.vo.OrderLineItem.class, dev.ktcloud.black.order.order.domain.vo.QOrderLineItem.class, PathInits.DIRECT2);

    public final EnumPath<dev.ktcloud.black.order.order.domain.vo.OrderStatus> status = createEnum("status", dev.ktcloud.black.order.order.domain.vo.OrderStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrder(String variable) {
        super(Order.class, forVariable(variable));
    }

    public QOrder(Path<Order> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrder(PathMetadata metadata) {
        super(Order.class, metadata);
    }

}

