package com.example.helloworld;
import javafx.geometry.Pos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class task5 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        Label title = new Label("Guess the POKEMON");
        BorderPane.setAlignment(title, Pos.CENTER);
        borderPane.setTop(title);


        Button sideBar = new Button("Charmender");
        borderPane.setLeft(sideBar);

        Button rightBar = new Button("Pikachu");
        borderPane.setRight(rightBar);


        Image image1 = new Image("D:\\prog2\\HelloWorld\\src\\main\\java\\com\\example\\helloworld\\1.png");
        ImageView iv1 = new ImageView(image1);
        borderPane.setCenter(iv1);
        iv1.setFitWidth(200);
        iv1.setFitHeight(200);
        iv1.setPreserveRatio(true);

        Label label = new Label("Who is that Pokemon?");
        borderPane.setBottom(label);
        BorderPane.setAlignment(label, Pos.CENTER);


        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Task 5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
