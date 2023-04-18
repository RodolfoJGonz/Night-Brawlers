package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class MainMenu extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException 
    {
        stage.setTitle("Night Brawlers");

        Button start = new Button("Start Game");
        Button quit = new Button("Exit");

        start.setOnAction(e ->
        {
            new CharacterSelect(stage);
        });

        quit.setOnAction(e ->
        {
            stage.close();
        });

        VBox buttonHolder = new VBox(start, quit);
        buttonHolder.setAlignment(Pos.CENTER);
        buttonHolder.setSpacing(10);


        scene = new Scene(buttonHolder, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}