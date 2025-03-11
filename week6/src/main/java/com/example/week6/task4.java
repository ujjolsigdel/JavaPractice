package com.example.week6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class task4 extends Application {
    public void start(Stage primaryStage) {
        // Create a Circle, add it to a Pane
        Circle circ = new Circle();
        circ.setCenterX(50);
        circ.setCenterY(75);
        circ.setRadius(30);
        circ.setStroke(Color.BLUEVIOLET);
        circ.setFill(Color.CHOCOLATE);

        Pane p = new Pane();
        p.getChildren().add(circ);

        // Handle a key event
        circ.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();
//            System.out.println(code);
            switch (code) {
                case DOWN:
                    circ.setCenterY(circ.getCenterY() + 10);
                    break;
                case UP:
                    circ.setCenterY(circ.getCenterY() - 10);
                    break;
                case LEFT:
                    circ.setCenterX(circ.getCenterX() - 10);
                    break;
                case RIGHT:
                    circ.setCenterX(circ.getCenterX() + 10);
                    break;
            }
        });
        Scene scene = new Scene(p, 150, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
        circ.requestFocus();
    }
}
