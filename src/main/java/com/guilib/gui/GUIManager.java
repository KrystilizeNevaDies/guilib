package com.guilib.gui;

import java.util.ArrayList;
import java.util.List;

import com.guilib.gui.GUI;

public class GUIManager {

    private static List<GUI> guis = new ArrayList<>();

    /**
     * Register a GUI.
     * You can get it later by doing {@link #getGuiById(String)} and refering to the GUIs ID
     *
     * @param gui the gui
     */
    public static void registerGUI(GUI gui) {
        guis.add(gui);
    }

    /**
     * Get all registered GUIs
     *
     * @return all registered GUIs
     */
    public static List<GUI> getGuis() {
        return guis;
    }

    /**
     * Get a GUI by the inventory title
     * returns null if no GUI was found.
     *
     * @param title the title of the inventory
     * @return the gui found
     */
    public static GUI getGuiByTitle(String title) {
        for (GUI gui : guis) {
            if (gui.getTitle().equals(title)) {
                return gui;
            }
        }
        return null;
    }

    /**
     * Get a GUI by the GUI id
     * returns null if no GUI was found.
     *
     * @param id the id of the gui
     * @return the gui found
     */
    public static GUI getGuiById(String id) {
        for (GUI gui : guis) {
            if (gui.getId().equals(id)) {
                return gui;
            }
        }
        return null;
    }
}
