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
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class bvController {
    int playerHealth = 20;
    int cpuHealth = 20;
    int playerAttack, cpuAttack;
    public static String resulting;


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
    void attack1(ActionEvent event) throws IOException, InterruptedException{
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
         {
             combatTextArea.appendText("Game Over. You win!");
             resulting = "You win!";
         }
         else if(playerHealth <= 0)
         {
             combatTextArea.appendText("Game Over. You Lost!");
             resulting = "You lost!";
         }
             
         else
         {
             combatTextArea.appendText("Game Over. You Tied!");
             resulting = "You tied!";
         }



            //Thread.sleep(1000);
            Parent goViewParent = FXMLLoader.load(getClass().getResource("/com/view/ggView.fxml"));
            Scene goScene = new Scene(goViewParent);


            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

            window.setScene(goScene);
            window.show();
        }
     }

    @FXML
    void attack2(ActionEvent event) throws IOException, InterruptedException {
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
            {
                combatTextArea.appendText("Game Over. You win!");
                resulting = "You win!";
            }
            else if(playerHealth <= 0)
            {
                combatTextArea.appendText("Game Over. You Lost!");
                resulting = "You lost!";
            }
                
            else
            {
                combatTextArea.appendText("Game Over. You Tied!");
                resulting = "You tied!";
            }


                //Thread.sleep(2000);
                Parent goViewParent = FXMLLoader.load(getClass().getResource("/com/view/ggView.fxml"));
                Scene goScene = new Scene(goViewParent);
    
    
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    
                window.setScene(goScene);
                window.show();
        }
    }

    @FXML
    void attack3(ActionEvent event) throws IOException, InterruptedException{
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
            {
                combatTextArea.appendText("Game Over. You win!");
                resulting = "You win!";
            }
            else if(playerHealth <= 0)
            {
                combatTextArea.appendText("Game Over. You Lost!");
                resulting = "You lost!";
            }
                
            else
            {
                combatTextArea.appendText("Game Over. You Tied!");
                resulting = "You tied!";
            }
                

                
            //Thread.sleep(1000);
            Parent goViewParent = FXMLLoader.load(getClass().getResource("/com/view/ggView.fxml"));
            Scene goScene = new Scene(goViewParent);


            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

            window.setScene(goScene);
            window.show();
        }
    }

    @FXML
    void block(ActionEvent event) throws IOException, InterruptedException {

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
         {
             combatTextArea.appendText("Game Over. You win!");
             resulting = "You win!";
         }
         else if(playerHealth <= 0)
         {
             combatTextArea.appendText("Game Over. You Lost!");
             resulting = "You lost!";
         }
             
         else
         {
             combatTextArea.appendText("Game Over. You Tied!");
             resulting = "You tied!";
         }
                //Thread.sleep(2000);
                Parent goViewParent = FXMLLoader.load(getClass().getResource("/com/view/ggView.fxml"));
                Scene goScene = new Scene(goViewParent);
    
    
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    
                window.setScene(goScene);
                window.show();
        }
    }



}
