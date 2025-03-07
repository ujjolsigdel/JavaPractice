package com.example.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class task2c extends Application {
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Image image5 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\1.png");
        Image image6 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\2.png");
        Image image7 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\3.png");
        Image image8 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\4.png");

        Image[] images = {image5, image6, image7, image8};
        Random random = new Random();

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                ImageView imageView = new ImageView(images[random.nextInt(images.length)]);
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                gridPane.add(imageView, col, row);
            }

        }
        primaryStage.setTitle("Task 2c");
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
