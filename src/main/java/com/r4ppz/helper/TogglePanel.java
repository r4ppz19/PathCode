package com.r4ppz.helper;


import javafx.scene.layout.VBox;

public class TogglePanel {
    private static boolean isExpanded = false;
    
    public static void toggleLeftPanel(VBox leftPanelVbox, VBox currentPanel) {
        if (leftPanelVbox == null) {
            System.out.println("Panel VBox is null");
        }
        currentPanel.setVisible(!isExpanded);
        currentPanel.setManaged(!isExpanded);

        if (isExpanded) {
            leftPanelVbox.setMinWidth(40);
        } else {
            leftPanelVbox.setMinWidth(400);
        }
        isExpanded = !isExpanded;
    }

    public static void toggleRightPanel(VBox panelVbox) {
        if (panelVbox == null) {
            System.out.println("Panel VBox is null");
        }

        if (panelVbox.getMinWidth() != 400) {
            panelVbox.setMinWidth(400);
        } else {
            panelVbox.setMinWidth(40);
        }
    }

}
