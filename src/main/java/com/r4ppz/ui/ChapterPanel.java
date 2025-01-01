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
    
        Label titleLabel = createLabel("Java Reference", "main-header");
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

        TreeItem<String> chapterOne = new TreeItem<>("Chapter One");
        TreeItem<String> chapterTwo = new TreeItem<>("Chapter Two");
        TreeItem<String> chapterThree = new TreeItem<>("Chapter Three");
        TreeItem<String> chapterFour = new TreeItem<>("Chapter Four");
        TreeItem<String> chapterFive = new TreeItem<>("Chapter Five");
        TreeItem<String> chapterSix = new TreeItem<>("Chapter Six");
        TreeItem<String> chapterSeven = new TreeItem<>("Chapter Seven");
        TreeItem<String> chapterEight = new TreeItem<>("Chapter Eight");
        TreeItem<String> chapterNine = new TreeItem<>("Chapter Nine");
        TreeItem<String> chapterTen = new TreeItem<>("Chapter Ten");
        TreeItem<String> chapterEleven = new TreeItem<>("Chapter Eleven");

        
        Collections.addAll(chapters.getChildren(), chapterOne, chapterTwo, chapterThree, chapterFour, chapterFive, chapterSix, chapterSeven, chapterEight, chapterNine, chapterTen, chapterEleven);

        TreeView<String> treeView = new TreeView<>(chapters);
        return treeView;
    }


}
