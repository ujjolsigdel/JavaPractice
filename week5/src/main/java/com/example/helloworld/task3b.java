package com.example.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class task3b extends Application {
    public void start(Stage primaryStage) {
        Artwork artwork1 = new Artwork("Billy Joel", "Piano Man", "Folk");
        Artwork artwork2 = new Artwork("The 1975", "About You", "Pop Rock");

        GridPane gp1 = new GridPane();
        GridPane gp2 = new GridPane();

        gp1.add(new Label("Author"), 0, 0);
        gp1.add(new TextField(artwork1.getAuthor()), 1, 0);
        gp1.add(new Label("Name: "), 0, 1);
        gp1.add(new TextField(artwork1.getName()), 1, 1);
        gp1.add(new Label("Genre: "), 0, 2);
        gp1.add(new TextField(artwork1.getGenre()), 1, 2);

        gp2.add(new Label("Author"), 0, 0);
        gp2.add(new TextField(artwork2.getAuthor()), 1, 0);
        gp2.add(new Label("Name: "), 0, 1);
        gp2.add(new TextField(artwork2.getName()), 1, 1);
        gp2.add(new Label("Genre: "), 0, 2);
        gp2.add(new TextField(artwork2.getGenre()), 1, 2);

        HBox hb = new HBox(20);

        hb.getChildren().addAll(gp1, gp2);

        Scene scene = new Scene(hb, 400, 300);
        primaryStage.setTitle("Task 3b");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
