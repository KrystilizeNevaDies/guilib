package com.guilib.events;

import net.minestom.server.entity.Player;
import net.minestom.server.event.inventory.InventoryPreClickEvent;
import net.minestom.server.inventory.Inventory;

public class ButtonClickEvent {

    private InventoryPreClickEvent event;

    public ButtonClickEvent(InventoryPreClickEvent event) {
        this.event = event;
    }

    public Player getPlayer() {
        return event.getPlayer();
    }

    public void setCancelled(boolean cancelled) {
        event.setCancelled(cancelled);
    }

    public Inventory getInventory() {
        return event.getInventory();
    }

    public InventoryPreClickEvent getEvent() {
        return event;
    }
}