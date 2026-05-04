package dev.ktcloud.black.order.order.adapter.presentation.web.inbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/order/order/adapter/presentation/web/inbound/OrderRestController;", "", "placeOrder", "", "request", "Ldev/ktcloud/black/order/order/adapter/presentation/web/inbound/request/OrderRequest;", "order"})
public abstract interface OrderRestController {
    
    public abstract void placeOrder(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.order.order.adapter.presentation.web.inbound.request.OrderRequest request);
}