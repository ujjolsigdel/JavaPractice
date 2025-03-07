package com.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class task4b extends Application {
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
        Artwork artwork1 = new Artwork("The 1975", "Robbers", "Pop");
        Artwork artwork2 = new Artwork("Zach Bryan", "Pink Skies", "Country");
        Artwork artwork3 = new Artwork("The Cure", "Pictures of You", "Rock");
        Book book1 = new Book("LP Devkota", "Muna Madan", "Poetry", 120);
        Book book2 = new Book("Charles Duhigg", "The Power of Habit", "Non-fiction", 321);


        VBox vb = new VBox(20);

        vb.getChildren().addAll(makeGridOfObjects(artwork1),makeGridOfObjects(artwork2),makeGridOfObjects(artwork3), makeGridOfObjects(book1),makeGridOfObjects(book2));

        Scene scene = new Scene(vb);
        primaryStage.setTitle("Task 4b");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}

