package com.r4ppz.controller.helper;

import java.util.Collections;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

public class CreatePanel {

    public static VBox createChapterPanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.setAlignment(Pos.TOP_CENTER);
        panel.getStyleClass().add("panel-vbox");

        Label label = createLabel("Chapters", "main-header");
        panel.getChildren().addAll(label);

        return panel;
    }

    public static VBox createBooksPanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.setAlignment(Pos.TOP_CENTER);
        panel.getStyleClass().add("panel-vbox");

        Label label = createLabel("Books", "main-header");
        panel.getChildren().addAll(label);

        return panel;
    }

    public static VBox createSettingsPanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.setAlignment(Pos.TOP_CENTER);
        panel.getStyleClass().add("panel-vbox");

        Label label = createLabel("Settings", "main-header");
        panel.getChildren().addAll(label);

        return panel;
    }

    public static VBox createProfilePanel() {
        VBox panel = new VBox();
        panel.setPadding(new Insets(10));
        panel.setAlignment(Pos.TOP_CENTER);
        panel.getStyleClass().add("panel-vbox");

        Label label = createLabel("Profile", "main-header");
        panel.getChildren().addAll(label);

        return panel;
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

        TreeView<String> chaptersTreeView = new TreeView<>(rootItem);
    }

    private static Label createLabel(String text, String css) {
        Label label = new Label(text);
        label.getStyleClass().add(css);
        return label;
    }
}
