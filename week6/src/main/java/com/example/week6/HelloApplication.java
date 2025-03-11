package com.example.week6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {


    //TAsk 1
    private boolean isColorToggled = false;

    public void start(Stage stage) throws IOException {


        Button b1 = new Button("Text");
        Button b2 = new Button("Copy");
        Button b3 = new Button("Change background");

        TextField tf1 = new TextField("");
        TextField tf2 = new TextField("");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setVgap(10);
        gp.setHgap(20);
        gp.setStyle("-fx-background-color: #000000;");

        gp.add(b1, 0, 0);
        gp.add(tf1, 1, 0);
        gp.add(b2, 0, 1);
        gp.add(tf2, 1, 1);
        gp.add(b3, 0, 2);

        b1.setOnAction(e -> {
            tf1.setText("WElcome to UEF");
        });
        b2.setOnAction(e -> {
            String text = tf1.getText();
            tf2.setText(text);
        });
        b3.setOnAction(e -> {
            toggleBackgroundColor(gp);
        });


        Scene scene = new Scene(gp);
        stage.setTitle("Task 1");
        stage.setScene(scene);
        stage.show();
    }

    private void toggleBackgroundColor (GridPane gp){
        if (isColorToggled) {
            gp.setStyle("-fx-background-color: lightgray; -fx-padding: 20px; -fx-alignment: center;");
        } else {
            gp.setStyle("-fx-background-color: lightblue; -fx-padding: 20px; -fx-alignment: center;");
        }
        isColorToggled = !isColorToggled; // Toggle flag
    }

    public static void main(String[] args) {
        launch();
    }
}