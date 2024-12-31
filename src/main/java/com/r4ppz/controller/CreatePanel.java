package com.r4ppz.controller;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class CreatePanel {

    public static VBox createPanel(String title) {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.setStyle("-fx-border-color: lightgray; -fx-border-width: 1; -fx-background-color: #f0f0f0;");
        panel.getChildren().add(new Button(title)); // Placeholder content
        return panel;
    }
}
