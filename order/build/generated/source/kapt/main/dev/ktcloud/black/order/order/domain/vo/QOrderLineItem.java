package dev.ktcloud.black.order.order.domain.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderLineItem is a Querydsl query type for OrderLineItem
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QOrderLineItem extends BeanPath<OrderLineItem> {

    private static final long serialVersionUID = -1318143584L;

    public static final QOrderLineItem orderLineItem = new QOrderLineItem("orderLineItem");

    public final NumberPath<Long> inventoryId = createNumber("inventoryId", Long.class);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final StringPath productId = createString("productId");

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final StringPath skuCode = createString("skuCode");

    public final EnumPath<OrderLineItemStatus> status = createEnum("status", OrderLineItemStatus.class);

    public QOrderLineItem(String variable) {
        super(OrderLineItem.class, forVariable(variable));
    }

    public QOrderLineItem(Path<OrderLineItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderLineItem(PathMetadata metadata) {
        super(OrderLineItem.class, metadata);
    }

}

