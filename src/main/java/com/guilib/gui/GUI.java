package com.guilib.gui;

import net.kyori.adventure.text.Component;
import net.minestom.server.entity.Player;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.inventory.InventoryType;
import net.minestom.server.item.ItemStack;

import java.awt.*;
import java.util.HashMap;

public class GUI {

    private Inventory inv;
    private HashMap<Integer, Button> buttons = new HashMap<>();
    private String id;

    public GUI(InventoryType type, String title) {
        new GUI(type, title, (String) null);
    }

    public GUI(InventoryType type, String title, String id) {
        inv = new Inventory(type, title);
        this.id = id;
    }

    public GUI(InventoryType type, String title, ItemStack emptyItem) {
        new GUI(type, title, emptyItem, null);
    }

    public GUI(InventoryType type, String title, ItemStack emptyItem, String id) {
        inv = new Inventory(type, title);
        this.id = id;

        for (int i = 0; i < inv.getSize(); i++) {
            buttons.put(i, new StaticButton(emptyItem));
            inv.setItemStack(i, emptyItem);
        }
    }

    public void addButton(int slot, Button button) {
        buttons.put(slot, button);
        inv.setItemStack(slot, button.getItem());
    }

    public Button getButton(int slot) {
        return buttons.get(slot);
    }

    public String getId() {
        return id;
    }

    public Component getTitle() {
        return inv.getTitle();
    }

    public Inventory getInventory() {
        return inv;
    }

    public void open(Player p) {
        p.openInventory(inv);
    }
}
