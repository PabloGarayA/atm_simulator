package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Depositoenefectivo implements Initializable {

    @FXML
    private AnchorPane pantallaDepositoEnEfectivo;

    @FXML
    private TextField display;
    ////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private TextField displayImporte;

    @FXML
    private Button numero_cero;
    @FXML
    private Button numero_uno;
    @FXML
    private Button numero_dos;
    @FXML
    private Button numero_tres;
    @FXML
    private Button numero_cuatro;
    @FXML
    private Button numero_cinco;
    @FXML
    private Button numero_seis;
    @FXML
    private Button numero_siete;
    @FXML
    private Button numero_ocho;
    @FXML
    private Button numero_nueve;
    @FXML
    private Button boton_borrar;

    @FXML
    private void tecladoNumerico(ActionEvent event) {

        if(event.getSource() == numero_cero){
            displayImporte.setText(displayImporte.getText() + "0");
        }
        else if(event.getSource() == numero_uno){
            displayImporte.setText(displayImporte.getText() + "1");
        }
        else if(event.getSource() == numero_dos){
            displayImporte.setText(displayImporte.getText() + "2");
        }
        else if(event.getSource() == numero_tres){
            displayImporte.setText(displayImporte.getText() + "3");
        }
        else if(event.getSource() == numero_cuatro){
            displayImporte.setText(displayImporte.getText() + "4");
        }
        else if(event.getSource() == numero_cinco){
            displayImporte.setText(displayImporte.getText() + "5");
        }
        else if(event.getSource() == numero_seis){
            displayImporte.setText(displayImporte.getText() + "6");
        }
        else if(event.getSource() == numero_siete){
            displayImporte.setText(displayImporte.getText() + "7");
        }
        else if(event.getSource() == numero_ocho){
            displayImporte.setText(displayImporte.getText() + "8");
        }
        else if(event.getSource() == numero_nueve){
            displayImporte.setText(displayImporte.getText() + "9");
        }
        else if(event.getSource() == boton_borrar){
            displayImporte.setText("");
        }

    }
    /////////////////////////////////////////////////////////////////

    @Override
    public void initialize(URL location, ResourceBundle Resources){

    }

    @FXML
    private void continuarACapturarDatos(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("capturardatos.fxml"));
        pantallaDepositoEnEfectivo.getChildren().setAll(pane);
    }

    @FXML
    private void  salirDepositoEnEfectivo(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pantallaDepositoEnEfectivo.getChildren().setAll(pane);
    }

    @FXML
    private void  salirAMenuPrincipal(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menuprincipal.fxml"));
        pantallaDepositoEnEfectivo.getChildren().setAll(pane);
    }

}
