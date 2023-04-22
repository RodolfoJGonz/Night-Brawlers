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



    public CharacterSelect(Stage mainStage)
    {
        Stage charStage = new Stage();
        mainStage.close();

        charStage.setTitle("Night Brawlers");

        charStage.initOwner(mainStage);

        Button back = new Button("Back");
        Button next = new Button("Go Fight!");

        next.setOnAction(e ->
        {
            new FightStart(charStage);
        });

        back.setOnAction(e ->
        {
            mainStage.show();
            charStage.close();
        });


        HBox nextButton = new HBox(next);
        nextButton.setAlignment(Pos.BOTTOM_RIGHT);

        HBox backButton = new HBox(back);
        backButton.setAlignment(Pos.BOTTOM_LEFT);
        
        HBox buttonHolder = new HBox(backButton, nextButton);
        buttonHolder.setAlignment(Pos.BOTTOM_CENTER);
        buttonHolder.setSpacing(100);

        VBox layoutBox = new VBox(buttonHolder);
        layoutBox.setFillWidth(true);
        
        Scene currentScene = new Scene(layoutBox, 640, 480);

        charStage.setScene(currentScene);
        charStage.show();

    }

}
