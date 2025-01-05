package com.r4ppz.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CustomVBox extends VBox {
    public CustomVBox(String title, boolean isVisibleAndManages) {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.setFillWidth(true);
        this.setAlignment(Pos.TOP_CENTER);
        // this.getStyleClass().add("panel-vbox");
    
        Label titleLabel = createLabel(title, "header-two");
        Label description = createLabel("THIS IS A  LEFT PANEL", "paragraph");
        this.getChildren().addAll(titleLabel, description);

        this.setVisible(isVisibleAndManages);
        this.setManaged(isVisibleAndManages);
    }

    private Label createLabel(String title, String css) {
        Label label = new Label(title);
        label.getStyleClass().add(css);
        return label;
    }
}
