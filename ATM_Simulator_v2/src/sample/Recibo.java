package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Recibo implements Initializable {

    @FXML
    private AnchorPane pantallarecibo;
    @FXML
    private Label displayImporte, displayNumeroDeCuenta, displayMotivo;
    @FXML
    public void recogerNumeroDeC(String text) {
        displayNumeroDeCuenta.setText(text);
    }
    @FXML
    public void recogerImpo(String text) {
        displayImporte.setText(text);
    }
    @FXML
    public void recoger(String text) {
        displayMotivo.setText(text);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void  continuar(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("retiroexitoso.fxml"));
        pantallarecibo.getChildren().setAll(pane);
    }
}
