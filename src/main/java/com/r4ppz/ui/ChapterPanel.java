package com.r4ppz.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ChapterPanel extends VBox {

    public ChapterPanel() {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.setFillWidth(true);
        this.setAlignment(Pos.TOP_CENTER);
        this.getStyleClass().add("panel-vbox");
    
        Label titleLabel = createLabel("Java Reference", "header-two");
        this.getChildren().addAll(titleLabel);
    }

    private Label createLabel(String title, String css) {
        Label label = new Label(title);
        label.getStyleClass().add(css);
        return label;
    }
}
