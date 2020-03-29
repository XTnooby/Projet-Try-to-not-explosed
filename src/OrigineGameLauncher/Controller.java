package OrigineGameLauncher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btFacile;

    @FXML
    private Button btNormal;

    @FXML
    private Button btDifficile;


    public void PressFacile(MouseEvent mouseEvent) throws IOException {
        btFacile.setTranslateY(+2);
        btFacile.setStyle("-fx-background-color : #585858; -fx-background-radius:10; ");

    }

    public void LacheFacile(MouseEvent mouseEvent) {
        btFacile.setTranslateY(-2);
        btFacile.setStyle("-fx-background-color :  #6E6E6E; -fx-background-radius:10; ");
    }

    public void PressNormal(MouseEvent mouseEvent) {
        btNormal.setTranslateY(+2);
        btNormal.setStyle("-fx-background-color : #585858; -fx-background-radius:10; ");
    }

    public void LacheNormal(MouseEvent mouseEvent) {
        btNormal.setTranslateY(-2);
        btNormal.setStyle("-fx-background-color :  #6E6E6E; -fx-background-radius:10; ");
    }


    public void PressDifficile(MouseEvent mouseEvent) {
        btDifficile.setTranslateY(+2);
        btDifficile.setStyle("-fx-background-color : #585858; -fx-background-radius:10; ");
    }

    public void LacheDifficile(MouseEvent mouseEvent) {
        btDifficile.setTranslateY(-2);
        btDifficile.setStyle("-fx-background-color :  #6E6E6E; -fx-background-radius:10; ");
    }

    public void DisplayJeu(ActionEvent event) throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("../VisuJeu/Bombe.fxml"));
        Scene scene2 = new Scene(view2);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

}
