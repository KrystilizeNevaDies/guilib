package com.guilib.listener;

import com.guilib.buttons.ActionButton;
import com.guilib.buttons.Button;
import com.guilib.events.ButtonClickEvent;
import com.guilib.gui.GUI;
import com.guilib.gui.GUIItem;
import com.guilib.gui.GUIManager;
import kotlin.jvm.internal.MagicApiIntrinsics;
import net.minestom.server.MinecraftServer;
import net.minestom.server.event.EventCallback;
import net.minestom.server.event.inventory.InventoryPreClickEvent;
import net.minestom.server.inventory.Inventory;

public class GUIListener {

    /**
     * Get the Event callback that needs to be registered
     * in the main class
     *
     * @return the event callback
     */
    public static EventCallback<InventoryPreClickEvent> getEvent() {
        return e -> {
            try {
                Inventory inv = e.getInventory();
                if (inv == null) return;

                for (GUI gui : GUIManager.getGuis()) {
                    if (gui == null) continue;
                    if (gui.getTitle().equals(inv.getTitle())) {
                        int slot = e.getSlot();
                        Button btn = gui.getButton(slot);
                        e.setCancelled(true);
                        if (btn == null) return;
                        if (btn.getEvent() != null) {
                            btn.getEvent().clickEvent(new ButtonClickEvent(e));
                        }
                    }
                }
            } catch (NullPointerException ignored) {
            }
        };
    }
}
