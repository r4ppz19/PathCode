package com.r4ppz.controller;

import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;

public class TogglePanel {
    
    // Helper Method: Toggles the visibility of a panel in the SplitPane
    public static void togglePanel(SplitPane splitPane, VBox panel, int index) {
        if (splitPane.getItems().contains(panel)) {
            // Remove the panel if it's already visible
            splitPane.getItems().remove(panel);
        } else {
            // Add the panel at the appropriate position
            splitPane.getItems().add(index, panel);
        }
    }
}
