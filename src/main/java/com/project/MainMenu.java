package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class MainMenu extends Application {

    

    @Override
    public void start(Stage stage) throws IOException 
    {

        Parent root = FXMLLoader.load(getClass().getResource("/com/view/nightBrawlerView.fxml"));
        
        Scene scene = new Scene(root);
    
        
        stage.setScene(scene);
        stage.setTitle("Night Brawlers");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}