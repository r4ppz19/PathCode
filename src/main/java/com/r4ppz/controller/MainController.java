package com.r4ppz.controller;

import com.r4ppz.helper.TogglePanel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private VBox leftPanelVbox;

    @FXML
    private VBox rightPanelVbox;

    @FXML
    private void toggleExpandLeftPannelButton(ActionEvent actionEvent) {
        TogglePanel.toggleLeftPanel(leftPanelVbox);
    }

    @FXML
    private void toggleExpandRightPannelButton() {
        TogglePanel.toggleRightPanel(rightPanelVbox);
    }
}
