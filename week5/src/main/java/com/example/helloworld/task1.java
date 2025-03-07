package com.example.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class task1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Hello");

        Stage stage0 = new Stage();
        Scene scene0 = new Scene(button, 200, 200);
        stage0.setScene(scene0);
        stage0.setTitle("Hello World");
        stage0.show();


        Button b1 = new Button("AAA");
        TextField t1 = new TextField();
        Button b2 = new Button("BBB");
        TextField t2 = new TextField();
        Button b3 = new Button("CCC");
        TextField t3 = new TextField();

        HBox hb = new HBox(10);
        hb.getChildren().addAll(b1, t1, b2, t2, b3, t3);

        Scene scene = new Scene(hb, 700, 150);
        primaryStage.setTitle("Task 1b");
        primaryStage.setScene(scene);
        primaryStage.show();

        Text name = new Text("Name");
        Text address = new Text("Address");
        Text postalCode = new Text("Postal Code");
        Text city = new Text("City");
        Text country = new Text("Country");

        TextField t4 = new TextField();
        TextField t5 = new TextField();
        TextField t6 = new TextField();
        TextField t7 = new TextField();
        TextField t8 = new TextField();

        Button b4 = new Button("Submit");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setVgap(5);

        gp.add(name,0,1);
        gp.add(address,0,2);
        gp.add(postalCode,0,3);
        gp.add(city,0,4);
        gp.add(country,0,5);

        gp.add(t4,1,1);
        gp.add(t5,1,2);
        gp.add(t6,1,3);
        gp.add(t7,1,4);
        gp.add(t8,1,5);

        gp.add(b4,0,6);

        Stage stage1 = new Stage();
        stage1.setTitle("Task 1c");
        Scene scene2 = new Scene(gp, 300, 210);
        stage1.setScene(scene2);
        stage1.show();
    }
}
