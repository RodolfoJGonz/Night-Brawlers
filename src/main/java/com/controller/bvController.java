package com.controller;


import com.characterProperties.Character;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class bvController {
    int playerHealth = 20;
    int cpuHealth = 20;
    int playerAttack, cpuAttack;


    @FXML
    private Button attack1;

    @FXML
    private Button attack2;

    @FXML
    private Button attack3;

    @FXML
    private Button block;

    @FXML
    private VBox combatButtonCont1;

    @FXML
    private VBox combatButtonCont2;

    @FXML
    private HBox combatButtons;

    @FXML
    private AnchorPane combatScreen;

    @FXML
    private TextArea combatTextArea;

    @FXML
    private Label cpuHP;

    @FXML
    private HBox cpuHPcontH;

    @FXML
    private VBox cpuHPcontV;

    @FXML
    private Label cpuHPnum;

    @FXML
    private Label playerHP;

    @FXML
    private HBox playerHPcontH;

    @FXML
    private VBox playerHPcontV;

    @FXML
    private Label playerHPnum;

    

    @FXML
    void attack1(ActionEvent event) {
    //     player.health = 10;
    //     player.health = player.health - 1;
    //     playerHPnum.setText(Integer.toString(player.health));
        playerHPnum.setText(Integer.toString(playerHealth));
        cpuHPnum.setText(Integer.toString(cpuHealth));
        cpuAttack = 0;
        playerAttack = 2;
        int cpuRoll = 1+(int) (Math.random()*((4-1)+1));


        switch(cpuRoll)
        {
            case 1:
            cpuAttack = 2;
            break;
            case 2:
            cpuAttack = 3;
            break;
            case 3:
            cpuAttack = 5;
            break;
            case 4:
            playerAttack = playerAttack/2;
            break;
        }

        if(cpuHealth - playerAttack < 0 || playerHealth-cpuAttack <0 )
        {
            if(cpuHealth - playerAttack < 0 )
            cpuHealth = 0;
            else if (playerHealth-cpuAttack <0)
            playerHealth =0;
        }
        else
        {
            cpuHealth = cpuHealth - playerAttack;
            playerHealth = playerHealth - cpuAttack;
        }
        
        cpuHPnum.setText(Integer.toString(cpuHealth));
        playerHPnum.setText(Integer.toString(playerHealth));

        
        combatTextArea.appendText("You dealt " + playerAttack + " damage. \n");
        combatTextArea.appendText("You took " + cpuAttack + " damage. \n");


        if( playerHealth <= 0 || cpuHealth <= 0)
        {
         // go to game over scene
         if(cpuHealth <= 0)
                combatTextArea.appendText("Game Over. You win!");
            else if(playerHealth <= 0)
                combatTextArea.appendText("Game Over. You Lost!");
            else
                combatTextArea.appendText("Game Over. You Tied!");   
        }
     }

    @FXML
    void attack2(ActionEvent event) {
        playerHPnum.setText(Integer.toString(playerHealth));
        cpuHPnum.setText(Integer.toString(cpuHealth));
        cpuAttack = 0;
        playerAttack = 3;
        int cpuRoll = 1+(int) (Math.random()*((4-1)+1));


        switch(cpuRoll)
        {
            case 1:
            cpuAttack = 2;
            break;
            case 2:
            cpuAttack = 3;
            break;
            case 3:
            cpuAttack = 5;
            break;
            case 4:
            playerAttack = playerAttack/2;
            break;
        }


        if(cpuHealth - playerAttack < 0 || playerHealth-cpuAttack <0 )
        {
            if(cpuHealth - playerAttack < 0 )
            cpuHealth = 0;
            else if (playerHealth-cpuAttack <0)
            playerHealth =0;
        }
        else
        {
            cpuHealth = cpuHealth - playerAttack;
            playerHealth = playerHealth - cpuAttack;
        }
        cpuHPnum.setText(Integer.toString(cpuHealth));
        playerHPnum.setText(Integer.toString(playerHealth));

        combatTextArea.appendText("You dealt " + playerAttack + " damage. \n");
        combatTextArea.appendText("You took " + cpuAttack + " damage. \n");

        if( playerHealth <= 0 || cpuHealth <= 0)
        {
            if(cpuHealth <= 0)
                combatTextArea.appendText("Game Over. You win!");
            else if(playerHealth <= 0)
                combatTextArea.appendText("Game Over. You Lost!");
            else
                combatTextArea.appendText("Game Over. You Tied!");
        }
    }

    @FXML
    void attack3(ActionEvent event) {
        playerHPnum.setText(Integer.toString(playerHealth));
        cpuHPnum.setText(Integer.toString(cpuHealth));
        cpuAttack = 0;
        playerAttack = 5;
        int cpuRoll = 1+(int) (Math.random()*((4-1)+1));


        switch(cpuRoll)
        {
            case 1:
            cpuAttack = 2;
            break;
            case 2:
            cpuAttack = 3;
            break;
            case 3:
            cpuAttack = 5;
            break;
            case 4:
            playerAttack = playerAttack/2;
            break;
        }


        if(cpuHealth - playerAttack < 0 || playerHealth-cpuAttack <0 )
        {
            if(cpuHealth - playerAttack < 0 )
            cpuHealth = 0;
            else if (playerHealth-cpuAttack <0)
            playerHealth =0;
        }
        else
        {
            cpuHealth = cpuHealth - playerAttack;
            playerHealth = playerHealth - cpuAttack;
        }
        cpuHPnum.setText(Integer.toString(cpuHealth));
        playerHPnum.setText(Integer.toString(playerHealth));

        combatTextArea.appendText("You dealt " + playerAttack + " damage. \n");
        combatTextArea.appendText("You took " + cpuAttack + " damage. \n");

        if( playerHealth <= 0 || cpuHealth <= 0)
        {
            if(cpuHealth <= 0)
                combatTextArea.appendText("Game Over. You win!");
            else if(playerHealth <= 0)
                combatTextArea.appendText("Game Over. You Lost!");
            else
                combatTextArea.appendText("Game Over. You Tied!");

        }
    }

    @FXML
    void block(ActionEvent event) {

        playerHPnum.setText(Integer.toString(playerHealth));
        cpuHPnum.setText(Integer.toString(cpuHealth));
        cpuAttack = 0;
        playerAttack = 0;
        int cpuRoll = 1+(int) (Math.random()*((4-1)+1));


        switch(cpuRoll)
        {
            case 1:
            cpuAttack = 2/2;
            break;
            case 2:
            cpuAttack = 4/2;
            break;
            case 3:
            cpuAttack = 6/2;
            break;
            case 4:
            break;
        }


        if(cpuHealth - playerAttack < 0 || playerHealth-cpuAttack <0 )
        {
            if(cpuHealth - playerAttack < 0 )
            cpuHealth = 0;
            else if (playerHealth-cpuAttack <0)
            playerHealth =0;
        }
        else
        {
            cpuHealth = cpuHealth - playerAttack;
            playerHealth = playerHealth - cpuAttack;
        }
        cpuHPnum.setText(Integer.toString(cpuHealth));
        playerHPnum.setText(Integer.toString(playerHealth));

        combatTextArea.appendText("You dealt " + playerAttack + " damage. \n");
        combatTextArea.appendText("You took " + cpuAttack + " damage. \n");

        if( playerHealth <= 0 || cpuHealth <= 0)
        {
         // go to game over scene   
            if(cpuHealth <= 0)
                combatTextArea.appendText("Game Over. You win!");
            else if(playerHealth <= 0)
                combatTextArea.appendText("Game Over. You Lost!");
            else
                combatTextArea.appendText("Game Over. You Tied!");
        }
    }



}
