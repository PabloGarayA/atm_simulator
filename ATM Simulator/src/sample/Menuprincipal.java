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

public class Menuprincipal implements Initializable {

    @FXML
    private AnchorPane pantallaMenuPrincipal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void  salirMenuPrincipal(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pantallaMenuPrincipal.getChildren().setAll(pane);
    }
    @FXML
    private void  depositarACuentas(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("depositaracuentas.fxml"));
        pantallaMenuPrincipal.getChildren().setAll(pane);
    }



}
