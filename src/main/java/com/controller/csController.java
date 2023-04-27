package com.controller;
import java.io.IOException;

import com.characterProperties.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class csController {
    

    @FXML
    private Button backButton;

    @FXML
    private AnchorPane charSelectView;

    @FXML
    private Label csTitle;

    @FXML
    private VBox csTitleBox;

    @FXML
    private Button selectEd;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent mmViewParent = FXMLLoader.load(getClass().getResource("/com/view/nightBrawlerView.fxml"));
        Scene mmScene = new Scene(mmViewParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(mmScene);
        window.show();
    }

    @FXML
    void selectEddy(ActionEvent event)throws InterruptedException, IOException {
        Eddy player = new Eddy();
        Thread.sleep(2000);

        Parent bvParent = FXMLLoader.load(getClass().getResource("/com/view/battleView.fxml"));
        Scene bvScene = new Scene(bvParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(bvScene);
        window.show();
    }

    @FXML
    void selectEdna(ActionEvent event)throws InterruptedException, IOException {
        Edna player = new Edna();
        Thread.sleep(2000);
        
        Parent bvParent = FXMLLoader.load(getClass().getResource("/com/view/battleView.fxml"));
        Scene bvScene = new Scene(bvParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(bvScene);
        window.show();

    }

    @FXML
    void selectEdward(ActionEvent event) throws InterruptedException, IOException {

        Edward player = new Edward();
        Thread.sleep(2000);


        Parent bvParent = FXMLLoader.load(getClass().getResource("/com/view/battleView.fxml"));
        Scene bvScene = new Scene(bvParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(bvScene);
        window.show();
        }

    

    @FXML
    void selectEd(ActionEvent event) throws InterruptedException, IOException {

        Ed player = new Ed();

        Thread.sleep(2000);

        Parent bvParent = FXMLLoader.load(getClass().getResource("/com/view/battleView.fxml"));
        Scene bvScene = new Scene(bvParent);


        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(bvScene);
        window.show();

    }

}
