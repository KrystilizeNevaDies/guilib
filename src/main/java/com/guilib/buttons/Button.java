package com.guilib.buttons;

import net.kyori.adventure.text.event.ClickEvent;
import net.minestom.server.item.ItemStack;

public abstract class Button {

    public Button() {
    }

    public abstract ItemStack getItem();
    public abstract ClickEvent getEvent();
}
