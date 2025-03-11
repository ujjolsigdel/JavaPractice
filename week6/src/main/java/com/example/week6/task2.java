package com.example.week6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class task2 extends Application {

    public void start(Stage stage) {
        Text t1 = new Text("Amount 1");
        Text t2 = new Text("Amount 2");
        Text t3 = new Text("Result");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        tf3.setEditable(false);

        Button b1 = new Button("+");
        Button b2 = new Button("-");
        Button b3 = new Button("*");
        Button b4 = new Button("/");

        HBox hb = new HBox(20, b1,b2,b3,b4);
        hb.setAlignment(Pos.CENTER);

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(30,30,30,30)); // set insets
        gp.setHgap(10); gp.setVgap(10);
        gp.setStyle("-fx-background-color: #5d83e3");

        gp.add(t1,0,0); gp.add(tf1,1,0); // 1st row
        gp.add(t2,0,1); gp.add(tf2,1,1); // 2nd row
        gp.add(t3,0,2); gp.add(tf3,1,2); // 3rd row
        gp.add(hb,0,3,2,1);

        // Handler for button b1
        b1.setOnAction(e->{
            // Code for processing event e:
            double value1 = Double.parseDouble(tf1.getText());
            double value2 = Double.parseDouble(tf2.getText());
            double sum = value1 + value2;
            tf3.setText(Double.toString(sum));
        } );
        b2.setOnAction(e->{
            double value1 = Double.parseDouble(tf1.getText());
            double value2 = Double.parseDouble(tf2.getText());
            double difference = value1 - value2;
            tf3.setText(Double.toString(difference));
        });
        b3.setOnAction(e->{
            double value1 = Double.parseDouble(tf1.getText());
            double value2 = Double.parseDouble(tf2.getText());
            double product = value1 * value2;
            tf3.setText(Double.toString(product));
        });
        b4.setOnAction(e->{
            double value1 = Double.parseDouble(tf1.getText());
            double value2 = Double.parseDouble(tf2.getText());
            double divide = value1 / value2;
            tf3.setText(Double.toString(divide));
        });
        // Scene and stage
        Scene scene = new Scene(gp);
        stage.setScene(scene);
        stage.setTitle("Task 2");
        stage.show(); }
    }


