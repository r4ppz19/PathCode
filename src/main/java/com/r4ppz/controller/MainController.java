package com.r4ppz.controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class MainController {
    @FXML
    private TextFlow contentTextFlow;

    @FXML
    private void initialize() {
        loadTextToTextFlow();
    }

    private void loadTextToTextFlow() {
        Text header = new Text("What is Java?\n");
        header.getStyleClass().add("header-one");

        Text description = new Text(
            "Java is a popular programming language that was first introduced by Sun Microsystems in 1995. It" +
            "is widely used across the world for creating all kinds of applications, from mobile apps to web" +
            "applications, desktop programs, and even large-scale enterprise systems. Java is loved for its" +
            "versatility, reliability, and platform independence. Let\'s break down what makes Java special:"
        );
        description.getStyleClass().add("body-paragraph");


        contentTextFlow.getChildren().addAll(header, description);
    }
}
