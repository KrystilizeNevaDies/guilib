package com.guilib.gui;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.ItemStackBuilder;
import net.minestom.server.item.Material;

import java.util.ArrayList;
import java.util.List;

public class GUIItem {

    public static final ItemStack EMPTY_WHITE = ItemStack.builder(Material.WHITE_STAINED_GLASS_PANE).displayName(Component.empty()).build();
    public static final ItemStack EMPTY_GRAY = ItemStack.builder(Material.GRAY_STAINED_GLASS_PANE).displayName(Component.empty()).build();
    public static final ItemStack EMPTY_BLACK = ItemStack.builder(Material.BLACK_STAINED_GLASS_PANE).displayName(Component.empty()).build();

    public static ItemStack item(Material material) {
        return ItemStack.builder(material).build();
    }

    public static ItemStack item(Material material, int amount) {
        return ItemStack.builder(material).amount(amount).build();
    }

    public static ItemStack item(Material material, Component name) {
        return itemWithName(material, 1, name);
    }

    public static ItemStack itemWithName(Material material, int amount, Component name) {
        return ItemStack.builder(material)
                .amount(amount)
                .displayName(
                        name.decoration(TextDecoration.ITALIC, false)
                ).build();
    }

    public static ItemStack itemWithLore(Material material, Component name, String... lore) {
        return itemWithLore(material, 1, name, lore);
    }

    public static ItemStack itemWithLore(Material material, int amount, Component name, String... lore) {
        ItemStackBuilder builder = ItemStack.builder(material)
                .amount(amount)
                .displayName(
                        name.decoration(TextDecoration.ITALIC, false)
                );
        List<Component> newLore = new ArrayList<>();
        for (String line : lore) {
            newLore.add(
                    Component.text(line, NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
            );
        }
        builder.lore(newLore);
        return builder.build();
    }

    public static ItemStack itemWithGrayLore(Material material, Component name, String... lore) {
        return itemWithGrayLore(material, 1, name, lore);
    }

    public static ItemStack itemWithGrayLore(Material material, int amount, Component name, String... lore) {
        ItemStackBuilder builder = ItemStack.builder(material)
                .amount(amount)
                .displayName(
                        name.decoration(TextDecoration.ITALIC, false)
                );
        List<Component> newLore = new ArrayList<>();
        for (String line : lore) {
            newLore.add(
                    Component.text(line, NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
            );
        }
        builder.lore(newLore);
        return builder.build();
    }
}
