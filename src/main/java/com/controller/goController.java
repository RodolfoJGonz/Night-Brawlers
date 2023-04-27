package com.controller;

import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class goController {

    

    @FXML
    private Button charSelectButton;

    @FXML
    private AnchorPane gameOver;

    @FXML
    private VBox gameOverButtons;

    @FXML
    private Label gameOverLabel;

    @FXML
    private Button mainMenuButton;

    @FXML
    private Button playAgainButton;

    @FXML
    private Label resultLabel;

    @FXML
    void updateResults()
    {
        resultLabel.setText(bvController.resulting);
    }
    
    @FXML
    void goCharSelect(ActionEvent event) throws IOException {

        Parent charSelectViewParent = FXMLLoader.load(getClass().getResource("/com/view/characterSelectView.fxml"));
        Scene charSelectScene = new Scene(charSelectViewParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(charSelectScene);
        window.show();
    }

    @FXML
    void goMainMenu(ActionEvent event) throws IOException {

        
        Parent mmViewParent = FXMLLoader.load(getClass().getResource("/com/view/nightBrawlerView.fxml"));
        Scene mmScene = new Scene(mmViewParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(mmScene);
        window.show();
    }

    @FXML
    void playAgain(ActionEvent event) throws IOException {

        Parent bvParent = FXMLLoader.load(getClass().getResource("/com/view/battleView.fxml"));
        Scene bvScene = new Scene(bvParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(bvScene);
        window.show();
    }

}


