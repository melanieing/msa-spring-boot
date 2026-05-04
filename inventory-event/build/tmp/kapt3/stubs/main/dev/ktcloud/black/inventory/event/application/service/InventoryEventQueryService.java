package dev.ktcloud.black.inventory.event.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/service/InventoryEventQueryService;", "Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery;", "inventoryEventQueryOutboundPort", "Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventQueryOutboundPort;", "<init>", "(Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventQueryOutboundPort;)V", "fetchUnprocessed", "", "Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery$Out;", "query", "Ldev/ktcloud/black/inventory/event/application/port/inbound/FetchUnprocessedInventoryEventsQuery$In;", "inventory-event"})
public class InventoryEventQueryService implements dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventQueryOutboundPort inventoryEventQueryOutboundPort = null;
    
    public InventoryEventQueryService(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventQueryOutboundPort inventoryEventQueryOutboundPort) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery.Out> fetchUnprocessed(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.inbound.FetchUnprocessedInventoryEventsQuery.In query) {
        return null;
    }
}