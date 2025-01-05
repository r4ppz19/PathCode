package com.r4ppz.controller;

import com.r4ppz.helper.TogglePanel;
import com.r4ppz.ui.CustomButton;
import com.r4ppz.ui.CustomVBox;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainController {

    private CustomButton toggleCollapseLeftButton;
    private CustomVBox fileExplorerPanelVbox;
    private CustomVBox chapterPanelVbox;
    private CustomVBox booksPanelVbox;

    @FXML
    private VBox leftPanelVbox;

    @FXML
    private VBox rightPanelVbox;

    @FXML
    private void initialize() {
        fileExplorerPanelVbox = new CustomVBox("Home", false);
        chapterPanelVbox = new CustomVBox("Chapters", false);
        booksPanelVbox = new CustomVBox("Favorite", false);

        leftPanelVbox.getChildren().addAll(fileExplorerPanelVbox, chapterPanelVbox, booksPanelVbox);

        toggleCollapseLeftButton = new CustomButton("collapse btn", false);
    }

    @FXML
    private void toggleFileExplorerButton() {
        TogglePanel.toggleLeftPanel(leftPanelVbox, fileExplorerPanelVbox);
        panelVisibility(chapterPanelVbox);
        panelVisibility(booksPanelVbox);
    }

    
    @FXML
    private void toggleChapterButton() {
        TogglePanel.toggleLeftPanel(leftPanelVbox, chapterPanelVbox);
        
        panelVisibility(fileExplorerPanelVbox);
        panelVisibility(booksPanelVbox);
    }
    
    @FXML
    private void toggleBooksButton() {
        TogglePanel.toggleLeftPanel(leftPanelVbox, booksPanelVbox);
        panelVisibility(chapterPanelVbox);
        panelVisibility(fileExplorerPanelVbox);
    }

    private void panelVisibility(VBox otherVBox) {
        otherVBox.setVisible(false);
        otherVBox.setManaged(false);
    }
}
