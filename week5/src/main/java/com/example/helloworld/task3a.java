package com.example.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class task3a extends Application {
    public void start(Stage primaryStage){
        Artwork artwork = new Artwork("Albatross", "Bhool", "Rock");


        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setStyle("-fx-border-color: green; -fx-background-color: lightblue");

        gridPane.add(new Label("Author: "), 0, 0);
        gridPane.add(new TextField(artwork.getAuthor()), 1, 0);
        gridPane.add(new Label("Name: "), 0, 1);
        gridPane.add(new TextField(artwork.getName()), 1, 1);
        gridPane.add(new Label("Genre: "), 0, 2);
        gridPane.add(new TextField(artwork.getGenre()), 1, 2);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Task 3a");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
