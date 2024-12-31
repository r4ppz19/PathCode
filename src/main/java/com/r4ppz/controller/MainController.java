package com.r4ppz.controller;

import java.util.Collections;

import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class MainController {

    @FXML
    private TextFlow contentTextFlow;

    @FXML
    private TreeView<String> chaptersTreeView;

    @FXML
    private SplitPane mainSplitPane;

    @FXML
    private void initialize() {
        loadTextToTextFlow();
        loadChapterToTreeView();
        preventResize();
        
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

    public void loadChapterToTreeView() {
        TreeItem<String> rootItem = new TreeItem<>("Chapters");
        rootItem.setExpanded(true);

        TreeItem<String> chapter1 = new TreeItem<>("Chapter 1");
        TreeItem<String> chapter2 = new TreeItem<>("Chapter 2");
        TreeItem<String> chapter3 = new TreeItem<>("Chapter 3");
        TreeItem<String> chapter4 = new TreeItem<>("Chapter 4");

        TreeItem<String> topic1 = new TreeItem<>("What is Java");
        TreeItem<String> topic2 = new TreeItem<>("History of Java");
        TreeItem<String> topic3 = new TreeItem<>("Key Features of Java");

        // Add topics to Chapter 1
        Collections.addAll(chapter1.getChildren(), topic1, topic2, topic3);

        Collections.addAll(rootItem.getChildren(), chapter1, chapter2, chapter3, chapter4);

        chaptersTreeView.setRoot(rootItem);
    }

    private void preventResize() {
        mainSplitPane.getDividers().get(0).positionProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.doubleValue() < 0.3) {
                mainSplitPane.setDividerPosition(0, 0.3);
            }            
            if (newValue.doubleValue() > 0.4) {
                mainSplitPane.setDividerPosition(0, 0.4);
            }
        });
    }
    
}
