package com.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class task2b extends Application {
    public void start(Stage primaryStage) {

        Image image1 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\1.png");
        ImageView iv1 = new ImageView(image1);
        Image image2 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\2.png");
        ImageView iv2 = new ImageView(image2);
        Image image3 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\3.png");
        ImageView iv3 = new ImageView(image3);
        Image image4 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\4.png");
        ImageView iv4 = new ImageView(image4);

        iv1.setFitWidth(200);
        iv1.setFitHeight(200);
        iv1.setPreserveRatio(true);

        iv2.setFitWidth(200);
        iv2.setFitHeight(200);
        iv2.setPreserveRatio(true);

        iv3.setFitWidth(200);
        iv3.setFitHeight(200);
        iv3.setPreserveRatio(true);

        iv4.setFitWidth(200);
        iv4.setFitHeight(200);
        iv4.setPreserveRatio(true);


        GridPane gp3 = new GridPane();
        gp3.setPadding(new Insets(10));

        gp3.add(iv1, 0, 0);
        gp3.add(iv2, 1, 0);
        gp3.add(iv3, 0, 1);
        gp3.add(iv4, 1, 1);

        primaryStage.setTitle("Task 2b");
        Scene scene = new Scene(gp3, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
