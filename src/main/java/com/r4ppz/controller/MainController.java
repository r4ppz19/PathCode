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

        loadTextToTextFlow();
    }

    @FXML
    private void toggleChapterButton() {
        TogglePanel.togglePanel(mainSplitPane, chapterPanel, 1);
    }

    @FXML
    private void toggleBooksButton() {
        System.out.println("Books toggled");
    }

    @FXML
    private void toggleSettingsButton() {
        System.out.println("Settings toggled");
    }

    @FXML
    private void toggleProfileButton() {
        System.out.println("Profile toggled");
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
