package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RealizandoTransaccion implements Initializable {

    @FXML
    private AnchorPane prosesando;
    @FXML
    private ImageView imageViewMensajes, efectivoanimacion, negociosanimacion;

    private void slideshowfondos(){

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event -> {

            imageViewMensajes.setImage(new Image("/sabiasque1.png"));
            negociosanimacion.setImage(new Image("/negociostransparente.png"));
            efectivoanimacion.setImage(new Image("/retirodeefectivo.gif"));

        }));

        timeline.play();
    }

    private void cambiodeescena() {

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(18), event -> {
            try {
                Parent pane = FXMLLoader.load(getClass().getResource("retiroexitoso.fxml"));
                prosesando.getChildren().setAll(pane);

                FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("comprobante.fxml"));
                Parent pane1 = (Parent) fxmlloader.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setResizable(false);
                stage.setScene(new Scene(pane1, 360, 720));
                stage.show();

            } catch (IOException ignored) {

            }
        }));
        timeline.play();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cambiodeescena(); slideshowfondos();
    }
}
