package com.r4ppz.controller;

import com.r4ppz.helper.TogglePanel;
import com.r4ppz.ui.ChapterPanel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainController {

    private ChapterPanel chapterPanel;

    @FXML
    private VBox leftPanelVbox;

    @FXML
    private VBox rightPanelVbox;

    private boolean isLeftPanelExpanded = false;

    @FXML
    private void initialize() {
        chapterPanel = new ChapterPanel(isLeftPanelExpanded);
        leftPanelVbox.getChildren().addAll(chapterPanel);

    }

    @FXML
    private void toggleExpandLeftPannelButton(ActionEvent actionEvent) {
        if (isLeftPanelExpanded) {
            leftPanelVbox.setMinWidth(40);
        } else {
            leftPanelVbox.setMinWidth(300);
        }
        isLeftPanelExpanded = !isLeftPanelExpanded;
        chapterPanel.setVisible(isLeftPanelExpanded);
        chapterPanel.setManaged(isLeftPanelExpanded);
    }

    @FXML
    private void toggleExpandRightPannelButton() {
        TogglePanel.toggleRightPanel(rightPanelVbox);
    }
}
