package OrigineGameLauncher;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Main extends Application {

    public int timer = 0 ;
    public Scene ChoixDifficulter;

    public static void main(String[] args) {

        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws IOException{

        primaryStage.setTitle("Try to not explosed");

        //Création de la scene de chargement
        Group root = new Group();
        Scene scene = new Scene(root, 1200,900, Color.rgb(34,60,98 ));

        //Ajout de la Scene page dans la fenetre
        Chargement charge = new Chargement();
        root.getChildren().add(charge);

        //Creation de la scene de choix de la difficulter
        Group diff = new Group();
        ChoixDifficulter = new Scene(diff, 1200,900, Color.rgb(34,60,98 ));

        //Ajout de la scene de choix de la difficulter dans la fenetre
        Difficulter difficulter = new Difficulter();
        diff.getChildren().add(difficulter);

        //Timer
        final var pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(actionEvent -> primaryStage.setScene(ChoixDifficulter));
        final var timer = new SequentialTransition(pause);
        timer.setCycleCount(1);
        timer.play();

        primaryStage.setOnCloseRequest(actionEvent -> timer.stop());
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
    /* Info utile

    code couleurs :

    Bleu foncé : #223C62 --> 34,60,98
    Bleu plus clair : #366177 --> 54,97,119
    Bleu encore plus clair : #89A29D --> 137,162,157

   Temps de switch entre les panes = 7 sec ou 7 millls


     */