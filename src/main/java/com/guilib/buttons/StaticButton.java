package com.guilib.buttons;

import net.kyori.adventure.text.event.ClickEvent;
import net.minestom.server.item.ItemStack;

public class StaticButton extends Button {

    private ItemStack item;

    public StaticButton(ItemStack item) {
        this.item = item;
    }

    @Override
    public ItemStack getItem() {
        return item;
    }

    @Override
    public ClickEvent getEvent() {
        return null;
    }
}