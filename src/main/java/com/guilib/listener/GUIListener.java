package com.guilib.listener;

import com.voidmc.gui.buttons.Button;
import com.voidmc.gui.events.ButtonClickEvent;
import com.voidmc.gui.gui.GUI;
import com.voidmc.gui.gui.GUIManager;
import net.minestom.server.event.EventCallback;
import net.minestom.server.event.inventory.InventoryPreClickEvent;
import net.minestom.server.inventory.Inventory;

public class GUIListener {

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
