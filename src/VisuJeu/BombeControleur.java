package VisuJeu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BombeControleur implements Initializable {

    @FXML
    Button modfils;
    @FXML
    Button modclavier;
    @FXML
    Button modmemory;
    @FXML
    Button modbtn;
    @FXML
    Button modlaby;
    @FXML
    Label TIMER;


    public void AffModFils(ActionEvent event) throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("../Fils/Fils.fxml"));
        Scene scene2 = new Scene(view2);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    public void AffModBtn(ActionEvent event) throws IOException{
        Parent view2 = FXMLLoader.load(getClass().getResource("../Bouton/Bouton.fxml"));
        Scene scene2 = new Scene(view2);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    public void AffModClavier(ActionEvent event) throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("../Clavier/Clavier.fxml"));
        Scene scene2 = new Scene(view2);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    public void AffModMemory(ActionEvent event) throws IOException{
        Parent view2 = FXMLLoader.load(getClass().getResource("../Memory/Memory.fxml"));
        Scene scene2 = new Scene(view2);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    public void AffModLaby(ActionEvent event) throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("../Labyrinthe/Labyrinthe.fxml"));
        Scene scene2 = new Scene(view2);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Visubtnbtn();
        VisubtnFils();
        Visubtnclavier();
        Visubtnmemory();
        Visubtnlaby();
        VisuTimer();

    }

    public void Visubtnbtn(){
        modbtn.setStyle("-fx-background-image: url('Images/ModuleBG.png');-fx-background-size:370px;");
    }
    public void VisubtnFils(){
        modfils.setStyle("-fx-background-image: url('Images/ModuleHG.png');-fx-background-size:370px;");
    }
    public void Visubtnclavier(){
        modclavier.setStyle("-fx-background-image: url('Images/ModuleHM.png');-fx-background-size:370px;");
    }
    public void Visubtnmemory(){
        modmemory.setStyle("-fx-background-image: url('Images/ModuleHD.png');-fx-background-size:370px;");
    }
    public void Visubtnlaby(){
        modlaby.setStyle("-fx-background-image: url('Images/ModuleBD.png');-fx-background-size:370px;");
    }
    public void VisuTimer(){
        TIMER.setStyle("-fx-background-image: url('Images/TIMER.png');-fx-background-size:370px;");
    }
}
