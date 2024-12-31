package com.r4ppz.controller.helper;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class CreatePanel {

    public static VBox createChapterPanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.getStyleClass().add("chapter-panel-vbox");
        return panel;
    }
}
