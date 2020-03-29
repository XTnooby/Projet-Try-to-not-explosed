package OrigineGameLauncher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

public class Difficulter extends Parent {

    public Difficulter() throws IOException{

        final URL fxmlURL = getClass().getResource("Difficulter.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
        final Node node = fxmlLoader.load();

        this.getChildren().addAll(node);
    }
}
