package com.r4ppz;

import com.r4ppz.util.ImageLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
    ImageLoader imageLoader = ImageLoader.INSTANCE;

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image imageIcon = imageLoader.loadImage("/image/main-icon.jpg");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Main.fxml"));
        Scene scene = new Scene(loader.load());

        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(500);

        primaryStage.setTitle("Path Code");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(imageIcon);
        // primaryStage.setResizable(false);
        primaryStage.show();
    }
}