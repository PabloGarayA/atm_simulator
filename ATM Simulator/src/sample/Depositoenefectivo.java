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
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class Depositoenefectivo implements Initializable {

    @FXML
    private AnchorPane pantallaDepositoEnEfectivo;

    @FXML
    private TextField displayNumeroDeCuenta;

    @FXML
    TextField displayImporte;
    private Object DecimalFormat;

    public void setDisplayImporte(TextField displayImporte) {
        DecimalFormat = new DecimalFormat("$#,###.00");
        this.displayImporte = displayImporte;
    }


    @FXML
    public Button numero_cero, numero_uno, numero_dos, numero_tres, numero_cuatro, numero_cinco, numero_seis, numero_siete, numero_ocho, numero_nueve;

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

    @Override
    public void initialize(URL location, ResourceBundle Resources){

    }

    @FXML
    public void recogerNumeroDeCuenta(String text) {
        displayNumeroDeCuenta.setText(text);
    }

    @FXML
    private void continuarACapturarDatos(ActionEvent event) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("capturardatos.fxml"));
            AnchorPane pane = loader.load();

            Capturardatos capturarDatos = loader.getController();
            capturarDatos.recogerImporte(displayImporte.getText());
            capturarDatos.recogerNumeroDeCuenta(displayNumeroDeCuenta.getText());
            pantallaDepositoEnEfectivo.getChildren().setAll(pane);

        } catch (IOException e) {
            e.printStackTrace();
        }
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
