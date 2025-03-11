package com.example.week6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class task3 extends Application {
    public void start(Stage stage) {

    Image image1 = new Image("D:\\prog2\\week6\\src\\question.png");
    Image image2 = new Image("D:\\prog2\\week6\\src\\1.png");
    Image image3 = new Image("D:\\prog2\\week6\\src\\2.png");
    Image image4 = new Image("D:\\prog2\\week6\\src\\3.png");
    Image image5 = new Image("D:\\prog2\\week6\\src\\4.png");

    ImageView iv1 = new ImageView(image1);
    ImageView iv2 = new ImageView(image1);
    ImageView iv3 = new ImageView(image1);
    ImageView iv4 = new ImageView(image1);



    iv1.setOnMouseEntered(e ->{
        iv1.setImage(image2);
    });
    iv1.setOnMouseExited(e ->{
            iv1.setImage(image1);
        });
    iv2.setOnMouseEntered(e ->{
            iv2.setImage(image3);
    });
    iv2.setOnMouseExited(e ->{
            iv2.setImage(image1);
        });
    iv3.setOnMouseEntered(e ->{
            iv3.setImage(image4);
    });
    iv3.setOnMouseExited(e ->{
            iv3.setImage(image1);
        });
    iv4.setOnMouseEntered(e ->{
            iv4.setImage(image5);
    });
    iv4.setOnMouseExited(e ->{
            iv4.setImage(image1);
        });

    HBox hb = new HBox(10, iv1,iv2,iv3,iv4);
    hb.setPadding(new Insets(20));

    Scene scene = new Scene(hb,320,240, Color.BLACK);
    stage.setScene(scene);
    stage.setTitle("Task 3");
    stage.show();
    }

}
