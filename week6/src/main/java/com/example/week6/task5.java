package com.example.week6;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class task5 extends Application {
    private int aa = 1;
    public void start(Stage primaryStage) {
        Ellipse ee = new Ellipse(); ee.setStroke(Color.AQUA); ee.setFill(Color.WHITESMOKE);
        ee.setCenterX(150); ee.setCenterY(125); ee.setRadiusX(100); ee.setRadiusY(40);

        Rectangle rr = new Rectangle(); rr.setStroke(Color.BLUE); rr.setFill(Color.LIGHTCORAL);
        rr.setHeight(25); rr.setWidth(50); rr.setX(100); rr.setY(50);

        Pane p = new Pane();
        p.getChildren().add(ee); p.getChildren().add(rr);
        ee.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();
//            System.out.println(code);
            switch (code) {
                case DOWN:
                    ee.setCenterY(ee.getCenterY() + 10);
                    break;
                case UP:
                    ee.setCenterY(ee.getCenterY() - 10);
                    break;
                case LEFT:
                    ee.setCenterX(ee.getCenterX() - 10);
                    break;
                case RIGHT:
                    ee.setCenterX(ee.getCenterX() + 10);
                    break;
            }
        });
        // Create a PathTransition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(5000));
        pt.setPath(ee); // The ellipse is the path
        pt.setNode(rr); // The rectangle is the node that moves
        pt.setCycleCount(Timeline.INDEFINITE); // set count cycle
        pt.setAutoReverse(true); // auto reverse
        pt.play(); // Start animation


        // Event handler for pause / play
        p.setOnMouseClicked(e -> {
            if (aa == 1) {pt.pause(); aa = 0;}
            else {pt.play(); aa = 1;}
        });
        Scene sce = new Scene(p,350,400);
        primaryStage.setScene(sce);
        primaryStage.show();
        ee.requestFocus();
    }
}
