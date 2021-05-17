package com.guilib.buttons;

import net.kyori.adventure.text.event.ClickEvent;
import net.minestom.server.item.ItemStack;

public class ActionButton extends Button {

    private ItemStack item;
    private ClickEvent event;

    public ActionButton(ItemStack item, ClickEvent event) {
        this.item = item;
        this.event = event;
    }

    @Override
    public ItemStack getItem() {
        return item;
    }

    @Override
    public ClickEvent getEvent() {
        return event;
    }
}