package com.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Task4a extends Application {
    public GridPane makeGridOfObjects(Artwork artwork) {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10));
        gp.setVgap(10);
        gp.setHgap(5);

        gp.add(new Label("Author"), 0, 0);
        gp.add(new TextField(artwork.getAuthor()), 1, 0);
        gp.add(new Label("Name"), 0, 1);
        gp.add(new TextField(artwork.getName()), 1, 1);
        gp.add(new Label("Genre"), 0, 2);
        gp.add(new TextField(artwork.getGenre()), 1, 2);

        if (artwork instanceof Book) {
            Book book = (Book) artwork;
            gp.add(new Label("No of Pages"), 0, 3);
            gp.add(new TextField(String.valueOf(book.getPages())), 1, 3);
        }
        return gp;
    }

    public void start(Stage primaryStage) {
        Artwork artwork = new Artwork("The 1975", "Robbers", "Pop");
        Book book = new Book("LP Devkota", "Muna Madan", "Poetry", 120);

        HBox hb = new HBox(20);

        hb.getChildren().addAll(makeGridOfObjects(artwork), makeGridOfObjects(book));

        Scene scene = new Scene(hb);
        primaryStage.setTitle("Task 4a");
        primaryStage.setScene(scene);
        primaryStage.show();

        }

    }

