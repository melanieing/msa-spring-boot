package dev.ktcloud.black.order.outbox.inventory.request.application.port.inbound;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004\u00c0\u0006\u0003"}, d2 = {"Ldev/ktcloud/black/order/outbox/inventory/request/application/port/inbound/ProcessOrderInventoryRequestOutboxStateCommand;", "", "processAll", "", "order"})
public abstract interface ProcessOrderInventoryRequestOutboxStateCommand {
    
    public abstract void processAll();
}