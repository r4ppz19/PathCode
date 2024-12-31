package com.r4ppz.controller;

import com.r4ppz.controller.helper.CreatePanel;
import com.r4ppz.controller.helper.TogglePanel;

import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class MainController {
    private VBox chapterPanel;
    private VBox booksPanel;
    private VBox settingsPanel;
    private VBox profilePanel;

    @FXML
    private TextFlow contentTextFlow;

    @FXML
    private SplitPane mainSplitPane;

    @FXML
    private void initialize() {
        chapterPanel = CreatePanel.createChapterPanel();
        booksPanel = CreatePanel.createBooksPanel();
        settingsPanel = CreatePanel.createSettingsPanel();
        profilePanel = CreatePanel.createProfilePanel();

        loadTextToTextFlow();
    }

    @FXML
    private void toggleChapterButton() {
        TogglePanel.togglePanel(mainSplitPane, booksPanel, 1);
    }

    @FXML
    private void toggleBooksButton() {
        TogglePanel.togglePanel(mainSplitPane, booksPanel, 1);
    }

    @FXML
    private void toggleSettingsButton() {
        TogglePanel.togglePanel(mainSplitPane, settingsPanel, 1);
    }

    @FXML
    private void toggleProfileButton() {
        TogglePanel.togglePanel(mainSplitPane, profilePanel, 1);
    }

    private void loadTextToTextFlow() {
        Text whatIsJavaDeader = new Text("What is Java?\n");
        whatIsJavaDeader.getStyleClass().add("header-one");

        Text javaDescription = new Text(
                "Java is a popular programming language that was first introduced by Sun Microsystems in 1995. It" +
                        " is widely used across the world for creating all kinds of applications, from mobile apps to web"
                        +
                        "applications, desktop programs, and even large-scale enterprise systems. Java is loved for its"
                        +
                        "versatility, reliability, and platform independence. Let\'s break down what makes Java special:\n\n");
        javaDescription.getStyleClass().add("body-paragraph");

        Text keyFeaturesOfJava = new Text("Key Features of Java\n");
        keyFeaturesOfJava.getStyleClass().add("header-two");

        contentTextFlow.getChildren().addAll(whatIsJavaDeader, javaDescription, keyFeaturesOfJava);
    }

}
