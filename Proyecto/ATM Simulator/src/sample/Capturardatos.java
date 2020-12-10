package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Capturardatos implements Initializable {

    @FXML
    private AnchorPane pantallaCapturarDatos;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void  salirCapturarDatos(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pantallaCapturarDatos.getChildren().setAll(pane);
    }
    @FXML
    private void  salirAMenuPrincipal(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menuprincipal.fxml"));
        pantallaCapturarDatos.getChildren().setAll(pane);
    }
    @FXML
    private void  regresarADepositoEnEfectivo(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("depositoenefectivo.fxml"));
        pantallaCapturarDatos.getChildren().setAll(pane);
    }

}
