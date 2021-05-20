package com.guilib.buttons;

import com.guilib.events.ClickEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;

public class CloseButton extends Button {

    /**
     * A Button that closes the Inventory when you click on it
     */
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