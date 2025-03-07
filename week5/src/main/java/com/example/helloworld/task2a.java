package com.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class task2a extends Application {
    public void start(Stage primaryStage) {
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        circle1.setFill(Color.GREEN);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setRadius(20);
        circle2.setFill(Color.YELLOW);
        circle2.setStroke(Color.BLACK);


        Circle circle3 = new Circle();
        circle3.setRadius(30);
        circle3.setFill(Color.RED);
        circle3.setStroke(Color.BLACK);

        Ellipse ellipse1 = new Ellipse();
        ellipse1.setRadiusX(10);
        ellipse1.setRadiusY(20);
        ellipse1.setStroke(Color.BLACK);
        ellipse1.setFill(Color.GREEN);

        Ellipse ellipse2 = new Ellipse();
        ellipse2.setRadiusX(20);
        ellipse2.setRadiusY(30);
        ellipse2.setStroke(Color.BLACK);
        ellipse2.setFill(Color.YELLOW);

        Ellipse ellipse3 = new Ellipse();
        ellipse3.setRadiusX(30);
        ellipse3.setRadiusY(40);
        ellipse3.setStroke(Color.BLACK);
        ellipse3.setFill(Color.RED);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(10);
        rectangle1.setWidth(20);
        rectangle1.setFill(Color.GREEN);
        rectangle1.setStroke(Color.BLACK);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(20);
        rectangle2.setWidth(30);
        rectangle2.setFill(Color.YELLOW);
        rectangle2.setStroke(Color.BLACK);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setHeight(30);
        rectangle3.setWidth(40);
        rectangle3.setFill(Color.RED);
        rectangle3.setStroke(Color.BLACK);

        GridPane gp2 = new GridPane();
        gp2.setPadding(new Insets(10));
        gp2.setHgap(10);
        gp2.setVgap(10);

        gp2.add(circle1, 0, 0);
        gp2.add(circle2, 1, 0);
        gp2.add(circle3, 2, 0);

        gp2.add(ellipse1, 0, 1);
        gp2.add(ellipse2, 1, 1);
        gp2.add(ellipse3, 2, 1);

        gp2.add(rectangle1, 0, 2);
        gp2.add(rectangle2, 1, 2);
        gp2.add(rectangle3, 2, 2);

        primaryStage.setTitle("Task 2a");
        Scene scene = new Scene(gp2, 300, 210);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
