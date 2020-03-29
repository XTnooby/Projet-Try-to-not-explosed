package OrigineGameLauncher;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.awt.*;

public class Chargement extends Parent {


    public Chargement(){
        //Image de font
        Image image = new Image("Images/Space.jpg");
        ImageView mv = new ImageView(image);
        mv.setFitHeight(1500);
        mv.setFitWidth(1600);

        //Animation Image de font
        Timeline bg = new Timeline(
                new KeyFrame(Duration.seconds(0),new KeyValue(mv.translateXProperty(),0)),
                new KeyFrame(Duration.seconds(5),new KeyValue(mv.translateXProperty(),-200))
        );
        bg.setAutoReverse(true);
        bg.setCycleCount(99);
        bg.play();


        //Logo
        ImageView logo = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("Images/Logo.png")));
        logo.setFitHeight(200);
        logo.setPreserveRatio(true);
        logo.setTranslateX(200);

        //Animation Logo
        Timeline t = new Timeline(
                new KeyFrame(Duration.seconds(0), new KeyValue(logo.translateYProperty(), -200)),
                new KeyFrame(Duration.seconds(2), new KeyValue(logo.translateYProperty(), 300))
        );
        t.setAutoReverse(false);
        t.setCycleCount(1);
        t.play();

        //Game
        ImageView Game = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("Images/Game.png")));
        Game.setFitHeight(100);
        Game.setPreserveRatio(true);
        Game.setTranslateX(180);

        //Animation Game
        Timeline c = new Timeline(
                new KeyFrame(Duration.seconds(0), new KeyValue(Game.translateYProperty(), 1000)),
                new KeyFrame(Duration.seconds(2), new KeyValue(Game.translateYProperty(), 999)),
                new KeyFrame(Duration.seconds(5), new KeyValue(Game.translateYProperty(), 480))
        );
        c.setAutoReverse(false);
        c.setCycleCount(1);
        c.play();

        //Parametre
        this.getChildren().addAll(mv,logo,Game);
    }
}
//#4af7ff le bleu