package com.r4ppz.controller;

import com.r4ppz.helper.TogglePanel;
import com.r4ppz.ui.ChapterPanel;

import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class MainController {
    private ChapterPanel chapterPanel;

    @FXML
    private TextFlow contentTextFlow;

    @FXML
    private SplitPane mainSplitPane;

    @FXML
    private void initialize() {
        chapterPanel = new ChapterPanel();
        loadTextToTextFlow();
    }

    @FXML
    private void toggleChapterButton() {
        TogglePanel.togglePanel(mainSplitPane, chapterPanel, 0);
    }
    
    private void loadTextToTextFlow() {
        Text whatIsJavaHeader = new Text("What is Java?\n");
        whatIsJavaHeader.getStyleClass().add("header-one");

        String javaDescriptionText = "Java is a popular programming language that was first introduced by Sun Microsystems in 1995. "
                + "It is widely used across the world for creating all kinds of applications, from mobile apps to web "
                + "applications, desktop programs, and even large-scale enterprise systems. Java is loved for its "
                + "versatility, reliability, and platform independence. Let's break down what makes Java special:\n\n";
        Text javaDescription = new Text(javaDescriptionText);
        javaDescription.getStyleClass().add("body-paragraph");

        Text keyFeaturesOfJava = new Text("Key Features of Java\n");
        keyFeaturesOfJava.getStyleClass().add("header-two");

        contentTextFlow.getChildren().addAll(whatIsJavaHeader, javaDescription, keyFeaturesOfJava);
    }
}
