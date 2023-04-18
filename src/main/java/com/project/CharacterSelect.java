package com.project;

import java.util.stream.IntStream;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class CharacterSelect 
{

    public int health = 10;
    Label healthDisplay = new Label("HP: " + String.valueOf(health));


    public CharacterSelect(Stage mainStage)
    {
        Stage charStage = new Stage();
        mainStage.close();

        charStage.setTitle("Night Brawlers");

        charStage.initOwner(mainStage);

        Button back = new Button("Back");

        back.setOnAction(e ->
        {
            mainStage.show();
            charStage.close();
        });

        Button attack = new Button("Attack");

        
        attack.setOnAction(e ->
        {
            health -= 1;
            healthDisplay.setText("HP: " + String.valueOf(health));

        });

        VBox attackButton = new VBox(attack);
        attackButton.setAlignment(Pos.CENTER);

        VBox backButton = new VBox(back);
        backButton.setAlignment(Pos.BOTTOM_LEFT);

        VBox layoutBox = new VBox(healthDisplay, attackButton, backButton);
        
        Scene currentScene = new Scene(layoutBox, 640, 480);

        charStage.setScene(currentScene);
        charStage.show();

    }

}
