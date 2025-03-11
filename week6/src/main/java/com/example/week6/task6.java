package com.example.week6;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class task6 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private CheckBox cb0;
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;

    private GridPane getMealPane()
    {
        Text tex1 = new Text("Meal Menu of the Day");
        tex1.setFont(Font.font ("Verdana", 20));
        tex1.setFill(Color.RED);
        cb0 = new CheckBox("Dal Bhat (5€)");
        cb0.setTextFill(Color.TEAL);
        cb1 = new CheckBox("Soup (3€)");
        cb1.setTextFill(Color.BLUEVIOLET);
        cb2 = new CheckBox("Falafel (6€)");
        cb2.setTextFill(Color.DARKBLUE);
        cb3 = new CheckBox("Karelia Pie (2€)");
        cb3.setTextFill(Color.DEEPPINK);
        cb4 = new CheckBox("Surprise Meal (1€)");
        cb4.setTextFill(Color.FUCHSIA);
        cb5 = new CheckBox("Sauce (1€)");
        cb5.setTextFill(Color.TURQUOISE);

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(30, 30, 30, 30)); // set insets
        gp.setStyle("-fx-background-color: #E6F9E9");
        gp.setAlignment(Pos.CENTER); gp.setVgap(5);
        gp.add(tex1, 0, 0);
        gp.add(cb0, 0, 1);
        gp.add(cb1, 0, 2);
        gp.add(cb2, 0, 3);
        gp.add(cb3, 0, 4); // 2nd row
        gp.add(cb4, 0, 5);
        gp.add(cb5, 0, 6); // 3rd row

        return gp;
    }
    private int appleCount = 0;
    private int orangeCount = 0;
    private int mangoCount = 0;
    private int avocadoCount = 0;
    private GridPane getDessertPane() {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(30, 30, 30, 30)); // set insets
        gp.setStyle("-fx-background-color: #FFFFFF");

        ImageView oraImg = new ImageView("D:\\prog2\\week6\\src\\main\\orange.png"); oraImg.setFitHeight(40); oraImg.setFitWidth(40);
        ImageView appImg = new ImageView("D:\\prog2\\week6\\src\\main\\apple.png"); appImg.setFitHeight(45); appImg.setFitWidth(60);
        ImageView manImg = new ImageView("D:\\prog2\\week6\\src\\main\\mango.png"); manImg.setFitHeight(55); manImg.setFitWidth(75);
        ImageView resetImg = new ImageView("D:\\prog2\\week6\\src\\main\\reset.png"); resetImg.setFitHeight(55); resetImg.setFitWidth(65);
        ImageView avoImg = new ImageView("D:\\prog2\\week6\\src\\avocado.png"); avoImg.setFitHeight(55); avoImg.setFitWidth(75);



        gp.add(oraImg, 0, 0);
        gp.add(appImg, 1, 0);
        gp.add(manImg, 2, 0);
        gp.add(avoImg, 3, 0);
        gp.add(resetImg, 4, 0);

        Text oraText = new Text("     0");
        Text appText = new Text("           0");
        Text manText = new Text("            0");
        Text avoText = new Text("           0");



        gp.add(oraText,0,1);
        gp.add(appText,1,1);
        gp.add(manText,2,1);
        gp.add(avoText,3,1);

        oraImg.setOnMouseClicked(e -> {
            orangeCount++; oraText.setText("     "+orangeCount);
        });
        appImg.setOnMouseClicked(e -> {
            appleCount++; appText.setText("           "+appleCount);
        });
        manImg.setOnMouseClicked(e -> {
            mangoCount++; manText.setText("            "+mangoCount);
        });
        avoImg.setOnMouseClicked(e -> {
            avocadoCount++; avoText.setText("            "+avocadoCount);
        });
        resetImg.setOnMouseClicked(e -> {
            mangoCount=orangeCount=appleCount=avocadoCount=0;
            oraText.setText("     "+orangeCount);
            appText.setText("           "+appleCount);
            manText.setText("            "+mangoCount);
            avoText.setText("             "+avocadoCount);
        });
        return gp;
    }
    private RadioButton rb;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private GridPane getRadioPane()
    {
        ToggleGroup tg = new ToggleGroup();
        rb = new RadioButton("Table 1");
        rb.setSelected(true);
        rb2 = new RadioButton("Table 2");
        rb3 = new RadioButton("Table 3");
        rb4 = new RadioButton("Table 4");
        rb.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        rb3.setToggleGroup(tg);
        rb4.setToggleGroup(tg);

        GridPane gp = new GridPane();
        gp.setHgap(15);
        gp.setPadding(new Insets(30, 30, 30, 30)); // set insets
        gp.setStyle("-fx-background-color: #D3DAFB");

        gp.add(rb, 0, 0);
        gp.add(rb2, 1, 0);
        gp.add(rb3, 2, 0);
        gp.add(rb4,3,0);
        return gp;
    }

    private TextArea summaryText;
    public void start(Stage primaryStage) {
        GridPane mealPane = getMealPane();
        GridPane dessertPane = getDessertPane();
        GridPane radioPane = getRadioPane();

        summaryText = new TextArea("");
        summaryText.setEditable(false);
        summaryText.setPrefRowCount(10);
        summaryText.setPrefColumnCount(5);

        Text desserttext = new Text("DESSERTs");
        desserttext.setFont(Font.font ("Verdana", 20));
        desserttext.setFill(Color.DEEPSKYBLUE);

        Button orderButton = new Button("PLACE ORDER!");
        orderButton.setStyle("-fx-background-color: #D3DAFB");

        VBox vb = new VBox();
        vb.setSpacing(20);
        vb.setAlignment(Pos.CENTER);

        vb.getChildren().addAll(mealPane,desserttext,dessertPane,radioPane,orderButton,summaryText);
        vb.setPadding(new Insets(30,30,30,30)); // set insets

        orderButton.setOnAction(e->{
            this.placeOrder();
        });

        Scene scene = new Scene(vb, 400, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Street Restaurant");
        primaryStage.show();
    }
    private void placeOrder(){
        double sum = 0;
        String mealText = "";
        if (rb.isSelected()) {mealText += "ORDER SUMMARY (TABLE 1)\n\n";}
        if (rb2.isSelected()) {mealText += "ORDER SUMMARY (TABLE 2)\n\n";}
        if (rb3.isSelected()) {mealText += "ORDER SUMMARY (TABLE 3)\n\n";}
        if (rb3.isSelected()) {mealText += "ORDER SUMMARY (TABLE 4)\n\n";}
        mealText += "MAIN COURSE:\n";
        if (cb0.isSelected()) {mealText += " - Dal Bhat(5€)\n";sum+=5;}
        if (cb1.isSelected()) {mealText += " - One cup of soup (3€)\n";sum+=3;}
        if (cb2.isSelected()) {mealText += " - Falafel (6€)\n";sum+=6;}
        if (cb3.isSelected()) {mealText += " - Karelia Pie (2€)\n";sum+=2;}
        if (cb4.isSelected()) {mealText += " - Surprice Meal (1€)\n";sum+=1;}
        if (cb5.isSelected()) {mealText += " - Sauce (1€)\n";sum+=1;}
        mealText += "DESSERTS:\n";
        if (orangeCount > 0) {mealText += " - Oranges ("+orangeCount+" pcs [0.5€ each]), ("+(orangeCount*0.5)+"€)\n"; sum+=(orangeCount*0.5);}
        if (appleCount > 0) {mealText += " - Apples ("+appleCount+" pcs [0.4€ each]), ("+(appleCount*0.4)+"€)\n"; sum+=(appleCount*0.4);}
        if (mangoCount > 0) {mealText += " - Mangos ("+mangoCount+" pcs [0.7€ each]), ("+(mangoCount*0.7)+"€)\n"; sum+=(mangoCount*0.7);}
        if (avocadoCount > 0) {mealText += " - Avocados ("+avocadoCount+" pcs [0.9€ each]), ("+(avocadoCount*0.9)+"€)\n"; sum+=(avocadoCount*0.9);}
        mealText += String.format("\nSUM TOTAL: %.2f€", sum);
        summaryText.setText(mealText);
    }
}
