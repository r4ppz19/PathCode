package com.r4ppz.helper;

import javafx.scene.layout.VBox;

public class TogglePanel {
    
    public static void toggleLeftPanel(VBox panelVbox) {
        if (panelVbox == null) {
            System.out.println("Panel VBox is null");
        }

        if (panelVbox.getMinWidth() != 300) {
            panelVbox.setMinWidth(300);
        } else {
            panelVbox.setMinWidth(40);
        }
    }

    public static void toggleRightPanel(VBox panelVbox) {
        if (panelVbox == null) {
            System.out.println("Panel VBox is null");
        }

        if (panelVbox.getMinWidth() != 450) {
            panelVbox.setMinWidth(450);
        } else {
            panelVbox.setMinWidth(40);
        }
    }

}
