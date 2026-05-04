package dev.ktcloud.black.inventory.event.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/ktcloud/black/inventory/event/application/service/InventoryEventCommandService;", "Ldev/ktcloud/black/inventory/event/application/port/inbound/CreateInventoryEventCommand;", "Ldev/ktcloud/black/inventory/event/application/port/inbound/SetStatusProcessedCommand;", "inventoryEventQueryOutboundPort", "Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventQueryOutboundPort;", "inventoryEventCommandOutboundPort", "Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventCommandOutboundPort;", "<init>", "(Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventQueryOutboundPort;Ldev/ktcloud/black/inventory/event/application/port/outbound/InventoryEventCommandOutboundPort;)V", "create", "", "command", "Ldev/ktcloud/black/inventory/event/application/port/inbound/CreateInventoryEventCommand$In;", "setStatusProcessed", "Ldev/ktcloud/black/inventory/event/application/port/inbound/SetStatusProcessedCommand$In;", "inventory-event"})
public class InventoryEventCommandService implements dev.ktcloud.black.inventory.event.application.port.inbound.CreateInventoryEventCommand, dev.ktcloud.black.inventory.event.application.port.inbound.SetStatusProcessedCommand {
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventQueryOutboundPort inventoryEventQueryOutboundPort = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventCommandOutboundPort inventoryEventCommandOutboundPort = null;
    
    public InventoryEventCommandService(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventQueryOutboundPort inventoryEventQueryOutboundPort, @org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.outbound.InventoryEventCommandOutboundPort inventoryEventCommandOutboundPort) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.inbound.CreateInventoryEventCommand.In command) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @java.lang.Override()
    public void setStatusProcessed(@org.jetbrains.annotations.NotNull()
    dev.ktcloud.black.inventory.event.application.port.inbound.SetStatusProcessedCommand.In command) {
    }
}