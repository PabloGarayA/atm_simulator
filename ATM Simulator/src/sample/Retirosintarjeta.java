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

public class Retirosintarjeta implements Initializable {

    @FXML
    private AnchorPane pantallaRetiroSinTarjeta;

    @Override
    public void initialize(URL location, ResourceBundle Resources){

    }
    @FXML
    private void salirRetiroSinTarjeta(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pantallaRetiroSinTarjeta.getChildren().setAll(pane);
    }

}

