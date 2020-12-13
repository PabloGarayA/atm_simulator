package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane pantallaPrincipal;

    @FXML
    ImageView imageViewMenuPrincipal;
    int count;

    public void slideshow(){

        ArrayList<Image> images = new ArrayList<Image>();
        images.add(new Image("/imagen1.png"));
        images.add(new Image( "/imagen2.png"));
        images.add(new Image( "/imagen3.png"));
        images.add(new Image("/imagen4.png"));

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event -> {
            imageViewMenuPrincipal.setImage(images.get(count));
            count++;
            if (count == 4)
                count =0;
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slideshow();
    }

    @FXML
    private void  retiroSinTarjeta(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("retirosintarjeta.fxml"));
        pantallaPrincipal.getChildren().setAll(pane);
    }

    @FXML
    private void  menuPrincipal(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menuprincipal.fxml"));
        pantallaPrincipal.getChildren().setAll(pane);
    }
}
