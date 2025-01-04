package com.r4ppz.ui;

import javafx.scene.control.Button;

public class CustomButton extends Button {
    
    public CustomButton(String text, boolean isVisibleAndManaged) {
        this.setText(text);
        this.setVisible(isVisibleAndManaged);
        this.setManaged(isVisibleAndManaged);
        this.getStyleClass().add("button");
    }
}
