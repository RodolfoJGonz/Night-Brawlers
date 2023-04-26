package com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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
        void newData(ActionEvent event) {
    
        }
    
    
    

}


