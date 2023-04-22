package com.project;

import java.util.stream.IntStream;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class FightStart 
{
    public int health = 10;
    Label healthDisplay = new Label("HP: " + String.valueOf(health));

    public FightStart (Stage charStage)
    {
        Stage fightStage = new Stage();
        charStage.close();

        fightStage.setTitle("Night Brawlers");
        fightStage.initOwner(charStage);

        Button attack = new Button("Attack");

        Button TryAgain = new Button("Try again?");
        TryAgain.setOnAction(e -> new FightStart(charStage));

        Button GoBack = new Button("Return to Character Select");
        GoBack.setOnAction(e -> {
            charStage.close();
            new CharacterSelect(charStage);
        });

        VBox layoutBox = new VBox();
        
        attack.setOnAction(e ->
        {
            if(health > 0)
            {
              health -= 1;
              healthDisplay.setText("HP: " + String.valueOf(health));        
            }
            if(health == 0)
            {
              healthDisplay.setText("Game Over!");

              VBox GameOverBox = new VBox(TryAgain, GoBack);
              GameOverBox.setAlignment(Pos.CENTER);

              layoutBox.getChildren().add(GameOverBox);
            }
        });



        VBox attackButton = new VBox(attack);
        attackButton.setAlignment(Pos.BOTTOM_CENTER);

        layoutBox.getChildren().addAll(healthDisplay, attackButton);

        Scene currentScene = new Scene(layoutBox, 640, 480);

        charStage.setScene(currentScene);
        charStage.show();

    }
}
