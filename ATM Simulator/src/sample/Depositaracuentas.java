package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Depositaracuentas implements Initializable {

    @FXML
    private AnchorPane pantallaDepositarACuentas;
    ////////////////////////////////////////////////////////////////////////////////
    @FXML
    public TextField display;

    @FXML
    private Button numero_cero, numero_uno, numero_dos, numero_tres, numero_cuatro, numero_cinco, numero_seis, numero_siete, numero_ocho, numero_nueve;

    @FXML
    private Button boton_borrar;

    @FXML
    private void tecladoNumerico(ActionEvent event) {

        if(event.getSource() == numero_cero){
            display.setText(display.getText() + "0");
        }
        else if(event.getSource() == numero_uno){
            display.setText(display.getText() + "1");
        }
        else if(event.getSource() == numero_dos){
            display.setText(display.getText() + "2");
        }
        else if(event.getSource() == numero_tres){
            display.setText(display.getText() + "3");
        }
        else if(event.getSource() == numero_cuatro){
            display.setText(display.getText() + "4");
        }
        else if(event.getSource() == numero_cinco){
            display.setText(display.getText() + "5");
        }
        else if(event.getSource() == numero_seis){
            display.setText(display.getText() + "6");
        }
        else if(event.getSource() == numero_siete){
            display.setText(display.getText() + "7");
        }
        else if(event.getSource() == numero_ocho){
            display.setText(display.getText() + "8");
        }
        else if(event.getSource() == numero_nueve){
            display.setText(display.getText() + "9");
        }
        else if(event.getSource() == boton_borrar){
            display.setText("");
        }

    }
    ////////////////////////////////////////////////////////////////////////////////
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void  salirDepositarACuentas(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pantallaDepositarACuentas.getChildren().setAll(pane);
    }

    @FXML
    private void  salirAMenuPrincipal(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menuprincipal.fxml"));
        pantallaDepositarACuentas.getChildren().setAll(pane);
    }

    @FXML
    private void depositoEnEfectivo(ActionEvent event) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("depositoenefectivo.fxml"));
            AnchorPane pane = loader.load();

            Depositoenefectivo depositoEnefectivo = loader.getController();
            depositoEnefectivo.recogerNumeroDeCuenta(display.getText());
            pantallaDepositarACuentas.getChildren().setAll(pane);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
