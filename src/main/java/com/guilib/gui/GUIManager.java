package com.guilib.gui;

import java.util.ArrayList;
import java.util.List;

import com.guilib.gui.GUI;

public class GUIManager {

    private static List<GUI> guis = new ArrayList<>();

    public static void registerGUI(GUI gui) {
        guis.add(gui);
    }

    public static List<GUI> getGuis() {
        return guis;
    }

    public static GUI getByTitle(String title) {
        for (GUI gui : guis) {
            if (gui.getTitle().equals(title)) {
                return gui;
            }
        }
        return null;
    }

    public static GUI getById(String id) {
        for (GUI gui : guis) {
            if (gui.getId().equals(id)) {
                return gui;
            }
        }
        return null;
    }
}
