package com.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class nbController {



  
    
        @FXML
        private Button continueButton;
    
        @FXML
        private Button exitButton;
    
        @FXML
        private VBox menuButtons;
    
        @FXML
        private Button newGameButton;
    
        @FXML
        private AnchorPane pane_mainMenu;
    
        @FXML
        private Label titleLabel;
    
        @FXML
        private VBox titleVBox;
    
        @FXML
        void exit(ActionEvent event) {
                System.exit(0);
        }
    
        @FXML
        void loadData(ActionEvent event) {
    
        }
    
        @FXML
        void newData(ActionEvent event) throws IOException{
                
                Parent charSelectViewParent = FXMLLoader.load(getClass().getResource("/com/view/characterSelectView.fxml"));
                Scene charSelectScene = new Scene(charSelectViewParent);


                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

                window.setScene(charSelectScene);
                window.show();
        }
    
    
    

}


