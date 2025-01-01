package com.r4ppz.ui;

import java.util.Collections;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

public class ChapterPanel extends VBox {

    public ChapterPanel() {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.setFillWidth(true);
        this.setAlignment(Pos.TOP_CENTER);
        this.getStyleClass().add("panel-vbox");
    
        Label titleLabel = createLabel("Java Reference", "second-header");
        TreeView<String> treeView = createTreeView();

        this.getChildren().addAll(titleLabel, treeView);
    }

    private Label createLabel(String title, String css) {
        Label label = new Label(title);
        label.getStyleClass().add(css);
        return label;
    }

    private TreeView<String> createTreeView() {
        TreeItem<String> chapters = new TreeItem<>("Chapters");
        chapters.setExpanded(true);

        TreeItem<String> chapterOne = new TreeItem<>("Chapter 1: Introduction to Java");
        TreeItem<String> chapterTwo = new TreeItem<>("Chapter 2: Basics of Java");
        TreeItem<String> chapterThree = new TreeItem<>("Chapter 3: Control Statements");
        TreeItem<String> chapterFour = new TreeItem<>("Chapter 4: Object Oriented Programming");
        TreeItem<String> chapterFive = new TreeItem<>("Chapter 5: Arrays and Strings");
        TreeItem<String> chapterSix = new TreeItem<>("Chapter 6: Exeption Handling");
        TreeItem<String> chapterSeven = new TreeItem<>("Chapter 7: Java Collections Framework");
        TreeItem<String> chapterEight = new TreeItem<>("Chapter 8: Multithreading and Concurrency");
        TreeItem<String> chapterNine = new TreeItem<>("Chapter 9: Java I/O");
        TreeItem<String> chapterTen = new TreeItem<>("Chapter 10: Advance Java Topics");
        TreeItem<String> chapterEleven = new TreeItem<>("Chapter 11: GUI with JavaFX");

        TreeItem<String> chapter11 = new TreeItem<>("What is Java");
        chapterOne.getChildren().add(chapter11);

        TreeItem<String> chapter111 = new TreeItem<>("Overview of Java as a programming language");
        TreeItem<String> chapter112 = new TreeItem<>("Java's popularity and uses");
        Collections.addAll(chapter11.getChildren(), chapter111, chapter112);

        
        Collections.addAll(chapters.getChildren(), chapterOne, chapterTwo, chapterThree, chapterFour, chapterFive, chapterSix, chapterSeven, chapterEight, chapterNine, chapterTen, chapterEleven);

        TreeView<String> treeView = new TreeView<>(chapters);
        return treeView;
    }


}
