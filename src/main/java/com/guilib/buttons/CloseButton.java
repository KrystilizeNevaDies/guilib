package com.guilib.buttons;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;

public class CloseButton extends Button {

    public CloseButton() {
    }

    @Override
    public ItemStack getItem() {
        return ItemStack.builder(Material.BARRIER)
                .displayName(Component.text("Exit", NamedTextColor.RED))
                .lore(Component.text("Exit the GUI", NamedTextColor.GRAY))
                .build();
    }

    @Override
    public ClickEvent getEvent() {
        return e -> e.getPlayer().closeInventory();
    }
}