package com.r4ppz.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private VBox leftPanelVbox;

    @FXML
    private void toggleExpandLeftPannelButton(ActionEvent actionEvent) {
        toggleLeftPanel();
    }

    private void toggleLeftPanel() {
        if (leftPanelVbox.getMinWidth() != 300) {
            leftPanelVbox.setMinWidth(300);
        } else {
            leftPanelVbox.setMinWidth(40);
        }
    }
}
