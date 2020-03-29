package Labyrinthe;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class LabyrintheControleur implements Initializable {
    //Partie FXML on va invoquer tout

    @FXML
    Button btnhaut;
    @FXML
    Button btndroit;
    @FXML
    Button btnbas;
    @FXML
    Button btngauche;

    @FXML
    Label label00;
    @FXML
    Label label01;
    @FXML
    Label label02;
    @FXML
    Label label03;
    @FXML
    Label label04;
    @FXML
    Label label05;

    @FXML
    Label label10;
    @FXML
    Label label11;
    @FXML
    Label label12;
    @FXML
    Label label13;
    @FXML
    Label label14;
    @FXML
    Label label15;

    @FXML
    Label label20;
    @FXML
    Label label21;
    @FXML
    Label label22;
    @FXML
    Label label23;
    @FXML
    Label label24;
    @FXML
    Label label25;

    @FXML
    Label label30;
    @FXML
    Label label31;
    @FXML
    Label label32;
    @FXML
    Label label33;
    @FXML
    Label label34;
    @FXML
    Label label35;

    @FXML
    Label label40;
    @FXML
    Label label41;
    @FXML
    Label label42;
    @FXML
    Label label43;
    @FXML
    Label label44;
    @FXML
    Label label45;

    @FXML
    Label label50;
    @FXML
    Label label51;
    @FXML
    Label label52;
    @FXML
    Label label53;
    @FXML
    Label label54;
    @FXML
    Label label55;

    //Truc utile
    private ArrayList<Label> ListeLabel;
    JeuLaby jeuLaby;
    Boolean Game = true;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        jeuLaby = new JeuLaby(6);

        ListeLabel();
        PlacementJoueur();
        RemplirLabel();
        IDtab();
        Sortie();
        TransformCoord();
        patern();
        restriction();
    }

    private void ListeLabel(){
        ListeLabel = new ArrayList<>();
        ListeLabel.add(label00);
        ListeLabel.add(label01);
        ListeLabel.add(label02);
        ListeLabel.add(label03);
        ListeLabel.add(label04);
        ListeLabel.add(label05);

        ListeLabel.add(label10);
        ListeLabel.add(label11);
        ListeLabel.add(label12);
        ListeLabel.add(label13);
        ListeLabel.add(label14);
        ListeLabel.add(label15);

        ListeLabel.add(label20);
        ListeLabel.add(label21);
        ListeLabel.add(label22);
        ListeLabel.add(label23);
        ListeLabel.add(label24);
        ListeLabel.add(label25);

        ListeLabel.add(label30);
        ListeLabel.add(label31);
        ListeLabel.add(label32);
        ListeLabel.add(label33);
        ListeLabel.add(label34);
        ListeLabel.add(label35);

        ListeLabel.add(label40);
        ListeLabel.add(label41);
        ListeLabel.add(label42);
        ListeLabel.add(label43);
        ListeLabel.add(label44);
        ListeLabel.add(label45);

        ListeLabel.add(label50);
        ListeLabel.add(label51);
        ListeLabel.add(label52);
        ListeLabel.add(label53);
        ListeLabel.add(label54);
        ListeLabel.add(label55);
    }

    private void RemplirLabel(){
        for (Label unLabel : ListeLabel){
            unLabel.setText(".");
        }
    }

    private void IDtab(){
        System.out.println("Place des identifiants");
        System.out.println(jeuLaby.PositionIdentifiantX + ":" + jeuLaby.PositionIdentifiantY);
        System.out.println(jeuLaby.PositionIdentifiantX2 + ":" + jeuLaby.PositionIdentifiantY2);
    }

    private void PlacementJoueur(){
        System.out.println("Position du joueur : ");
        System.out.println(jeuLaby.PositionJoueurX + ":" + jeuLaby.PositionJoueurY);

    }

    private void Sortie(){

        System.out.println("Position de la sortie : ");
        System.out.println(jeuLaby.PositionSortieX + ":" + jeuLaby.PositionSortieY);

    }

    public void Deplacementhaut(MouseEvent mouseEvent) {
        jeuLaby.deplacementhaut();
        TransformCoord();
        patern();
        restriction();
        verifWin();
    }

    public void DeplacementGauche(MouseEvent mouseEvent) {
        jeuLaby.deplacementgauche();
        TransformCoord();
        patern();
        restriction();
        verifWin();
    }

    public void DeplacementDroite(MouseEvent mouseEvent) {
        jeuLaby.deplacementdroite();
        TransformCoord();
        patern();
        restriction();
        verifWin();
    }

    public void DeplacementBas(MouseEvent mouseEvent) {
        jeuLaby.deplacementbas();
        TransformCoord();
        patern();
        restriction();
        verifWin();

    }

    public void patern() {
        if (jeuLaby.ValeurPatern == 1) {
           patern1();
        } else if (jeuLaby.ValeurPatern == 2) {
            patern2();
        } else if (jeuLaby.ValeurPatern == 3) {
            patern3();
        } else if (jeuLaby.ValeurPatern == 4) {
            patern4();
        } else if (jeuLaby.ValeurPatern ==5){
            patern5();
        }else if (jeuLaby.ValeurPatern ==6){
            patern6();
        } else if(jeuLaby.ValeurPatern == 7){
            patern7();
        }
    }

    public void TransformCoord(){
        //Colonne 1
        if (jeuLaby.PositionJoueurX == 0 && jeuLaby.PositionJoueurY == 0){
            label00.setText("X");
        } else {
            label00.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 1 && jeuLaby.PositionJoueurY == 0){
            label10.setText("X");
        } else {
            label10.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 2 && jeuLaby.PositionJoueurY == 0){
            label20.setText("X");
        } else {
            label20.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 3 && jeuLaby.PositionJoueurY == 0){
            label30.setText("X");
        } else {
            label30.setText(".");
        }if (jeuLaby.PositionJoueurX == 4 && jeuLaby.PositionJoueurY == 0){
            label40.setText("X");
        } else {
            label40.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 5 && jeuLaby.PositionJoueurY == 0){
            label50.setText("X");
        } else {
            label50.setText(".");
        }

        //Colonne 2
        if (jeuLaby.PositionJoueurX == 0 && jeuLaby.PositionJoueurY == 1){
            label01.setText("X");
        } else {
            label01.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 1 && jeuLaby.PositionJoueurY == 1){
            label11.setText("X");
        } else {
            label11.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 2 && jeuLaby.PositionJoueurY == 1){
            label21.setText("X");
        } else {
            label21.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 3 && jeuLaby.PositionJoueurY == 1){
            label31.setText("X");
        } else {
            label31.setText(".");
        }if (jeuLaby.PositionJoueurX == 4 && jeuLaby.PositionJoueurY == 1){
            label41.setText("X");
        } else {
            label41.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 5 && jeuLaby.PositionJoueurY == 1){
            label51.setText("X");
        } else {
            label51.setText(".");
        }

        //Collone 3
        if (jeuLaby.PositionJoueurX == 0 && jeuLaby.PositionJoueurY == 2){
            label02.setText("X");
        } else {
            label02.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 1 && jeuLaby.PositionJoueurY == 2){
            label12.setText("X");
        } else {
            label12.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 2 && jeuLaby.PositionJoueurY == 2){
            label22.setText("X");
        } else {
            label22.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 3 && jeuLaby.PositionJoueurY == 2){
            label32.setText("X");
        } else {
            label32.setText(".");
        }if (jeuLaby.PositionJoueurX == 4 && jeuLaby.PositionJoueurY == 2){
            label42.setText("X");
        } else {
            label42.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 5 && jeuLaby.PositionJoueurY == 2){
            label52.setText("X");
        } else {
            label52.setText(".");
        }

        // Collone 4
        if (jeuLaby.PositionJoueurX == 0 && jeuLaby.PositionJoueurY == 3){
            label03.setText("X");
        } else {
            label03.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 1 && jeuLaby.PositionJoueurY == 3){
            label13.setText("X");
        } else {
            label13.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 2 && jeuLaby.PositionJoueurY == 3){
            label23.setText("X");
        } else {
            label23.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 3 && jeuLaby.PositionJoueurY == 3){
            label33.setText("X");
        } else {
            label33.setText(".");
        }if (jeuLaby.PositionJoueurX == 4 && jeuLaby.PositionJoueurY == 3){
            label43.setText("X");
        } else {
            label43.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 5 && jeuLaby.PositionJoueurY == 3){
            label53.setText("X");
        } else {
            label53.setText(".");
        }

        //Colonne 5
        if (jeuLaby.PositionJoueurX == 0 && jeuLaby.PositionJoueurY == 4){
            label04.setText("X");
        } else {
            label04.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 1 && jeuLaby.PositionJoueurY == 4){
            label14.setText("X");
        } else {
            label14.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 2 && jeuLaby.PositionJoueurY == 4){
            label24.setText("X");
        } else {
            label24.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 3 && jeuLaby.PositionJoueurY == 4){
            label34.setText("X");
        } else {
            label34.setText(".");
        }if (jeuLaby.PositionJoueurX == 4 && jeuLaby.PositionJoueurY == 4){
            label44.setText("X");
        } else {
            label44.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 5 && jeuLaby.PositionJoueurY == 4){
            label54.setText("X");
        } else {
            label54.setText(".");
        }

        //Collone 6
        if (jeuLaby.PositionJoueurX == 0 && jeuLaby.PositionJoueurY == 5){
            label05.setText("X");
        } else {
            label05.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 1 && jeuLaby.PositionJoueurY == 5){
            label15.setText("X");
        } else {
            label15.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 2 && jeuLaby.PositionJoueurY == 5){
            label25.setText("X");
        } else {
            label25.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 3 && jeuLaby.PositionJoueurY == 5){
            label35.setText("X");
        } else {
            label35.setText(".");
        }if (jeuLaby.PositionJoueurX == 4 && jeuLaby.PositionJoueurY == 5){
            label45.setText("X");
        } else {
            label45.setText(".");
        }
        if (jeuLaby.PositionJoueurX == 5 && jeuLaby.PositionJoueurY == 5){
            label55.setText("X");
        } else {
            label55.setText(".");
        }
    }

    public void verifWin(){
        if (!Game){
            btnbas.setDisable(true);
            btndroit.setDisable(true);
            btngauche.setDisable(true);
            btnhaut.setDisable(true);
        }
    }

    public void restriction(){
        if(jeuLaby.PositionJoueurX ==0){
            btnhaut.setDisable(true);
        }else {
            btnhaut.setDisable(false);
        }
        if(jeuLaby.PositionJoueurY ==0){
            btngauche.setDisable(true);
        } else {
            btngauche.setDisable(false);
        }
        if(jeuLaby.PositionJoueurY == 5){
            btndroit.setDisable(true);
        } else {
            btndroit.setDisable(false);
        }
        if(jeuLaby.PositionJoueurX == 5){
            btnbas.setDisable(true);
        } else {
            btnbas.setDisable(false);
        }
    }

    public void patern1(){
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantX && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantY) {
            label10.setText("X");
        } else {
            label10.setText("0");
        }

        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2 ) {
            label25.setText("X");
        } else {
            label25.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
            label54.setText("X");
            System.out.println("Gagner");
            Game = false;
        } else {
            label54.setText("\ud83d\udd3a");
        }
    }

    public void patern2() {
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantX && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantY) {
            label41.setText("X");
        } else {
            label41.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2 ) {
            label13.setText("X");
        } else {
            label13.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
            label34.setText("X");
            System.out.println("Gagner");
            Game = false;
        } else {
            label34.setText("\ud83d\udd3a");
        }
    }

    public void patern3() {
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantX && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantY) {
            label33.setText("X");
        } else {
            label33.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2 ) {
            label35.setText("X");
        } else {
            label35.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
            label13.setText("X");
            System.out.println("Gagner");
            Game = false;
        } else {
            label13.setText("\ud83d\udd3a");
        }
    }

    public void patern4() {
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantX && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantY) {
            label00.setText("X");
        } else {
            label00.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2 ) {
            label30.setText("X");
        } else {
            label30.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
            label02.setText("X");
            System.out.println("Gagner");
            Game = false;
        } else {
            label02.setText("\ud83d\udd3a");
        }
    }

    public void patern5() {
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantX && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantY) {
            label24.setText("X");
        } else {
            label24.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2) {
            label53.setText("X");
        } else {
            label53.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
            label05.setText("X");
            System.out.println("Gagner");
            Game = false;
        } else {
            label05.setText("\ud83d\udd3a");
        }
    }

    public void patern6() {
            if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX) {
                label04.setText("X");
            } else {
                label04.setText("0");
            }
            if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2) {
                label42.setText("X");
            } else {
                label42.setText("0");
            }
            if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
                label55.setText("X");
                System.out.println("Gagner");
                Game = false;
            } else {
                label55.setText("\ud83d\udd3a");
            }
    }

    public void patern7() {
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX) {
            label01.setText("X");
        } else {
            label01.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionIdentifiantY2 && jeuLaby.PositionJoueurY == jeuLaby.PositionIdentifiantX2) {
            label51.setText("X");
        } else {
            label51.setText("0");
        }
        if (jeuLaby.PositionJoueurX == jeuLaby.PositionSortieX && jeuLaby.PositionJoueurY == jeuLaby.PositionSortieY) {
            label41.setText("X");
            System.out.println("Gagner");
            Game = false;
        } else {
            label41.setText("\ud83d\udd3a");
        }
    }

}
