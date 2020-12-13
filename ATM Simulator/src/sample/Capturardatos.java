package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Capturardatos implements Initializable {

    @FXML
    private AnchorPane pantallaCapturarDatos;

    @FXML
    private Label displayImporte, displayNumeroDeCuenta;
    @FXML
    public void recogerNumeroDeCuenta(String text) {
        displayNumeroDeCuenta.setText(text);
    }
    @FXML
    public void recogerImporte(String text) {
        displayImporte.setText(text);
    }

    ////////////////////////////////////////////////////////////////////////////////
    @FXML
    public TextField displayMotivo;

    @FXML
    private Button numero_cero, numero_uno, numero_dos, numero_tres, numero_cuatro, numero_cinco, numero_seis, numero_siete, numero_ocho, numero_nueve;

    @FXML
    private Button letra_a, letra_b, letra_c, letra_d, letra_e, letra_f, letra_g, letra_h, letra_i, letra_j, letra_k, letra_l, letra_m, letra_n, letra_o;

    @FXML
    private Button letra_p, letra_q, letra_r, letra_s, letra_t, letra_u, letra_v, letra_w, letra_x, letra_y, letra_z;
    @FXML
    private Button boton_borrar, boton_borrar1, boton_espacio;

    @FXML
    private void tecladoAlfaNumerico(ActionEvent event) {

        if(event.getSource() == numero_cero){
            displayMotivo.setText(displayMotivo.getText() + "0");
        }
        else if(event.getSource() == numero_uno){
            displayMotivo.setText(displayMotivo.getText() + "1");
        }
        else if(event.getSource() == numero_dos){
            displayMotivo.setText(displayMotivo.getText() + "2");
        }
        else if(event.getSource() == numero_tres){
            displayMotivo.setText(displayMotivo.getText() + "3");
        }
        else if(event.getSource() == numero_cuatro){
            displayMotivo.setText(displayMotivo.getText() + "4");
        }
        else if(event.getSource() == numero_cinco){
            displayMotivo.setText(displayMotivo.getText() + "5");
        }
        else if(event.getSource() == numero_seis){
            displayMotivo.setText(displayMotivo.getText() + "6");
        }
        else if(event.getSource() == numero_siete){
            displayMotivo.setText(displayMotivo.getText() + "7");
        }
        else if(event.getSource() == numero_ocho){
            displayMotivo.setText(displayMotivo.getText() + "8");
        }
        else if(event.getSource() == numero_nueve){
            displayMotivo.setText(displayMotivo.getText() + "9");
        }
        else if(event.getSource() == letra_a){
            displayMotivo.setText(displayMotivo.getText() + "A");
        }
        else if(event.getSource() == letra_b){
            displayMotivo.setText(displayMotivo.getText() + "B");
        }
        else if(event.getSource() == letra_c){
            displayMotivo.setText(displayMotivo.getText() + "C");
        }
        else if(event.getSource() == letra_d){
            displayMotivo.setText(displayMotivo.getText() + "D");
        }
        else if(event.getSource() == letra_e){
            displayMotivo.setText(displayMotivo.getText() + "E");
        }
        else if(event.getSource() == letra_f){
            displayMotivo.setText(displayMotivo.getText() + "F");
        }
        else if(event.getSource() == letra_g){
            displayMotivo.setText(displayMotivo.getText() + "G");
        }
        else if(event.getSource() == letra_h){
            displayMotivo.setText(displayMotivo.getText() + "H");
        }
        else if(event.getSource() == letra_i){
            displayMotivo.setText(displayMotivo.getText() + "I");
        }
        else if(event.getSource() == letra_j){
            displayMotivo.setText(displayMotivo.getText() + "J");
        }
        else if(event.getSource() == letra_k){
            displayMotivo.setText(displayMotivo.getText() + "K");
        }
        else if(event.getSource() == letra_l){
            displayMotivo.setText(displayMotivo.getText() + "L");
        }
        else if(event.getSource() == letra_m){
            displayMotivo.setText(displayMotivo.getText() + "M");
        }
        else if(event.getSource() == letra_n){
            displayMotivo.setText(displayMotivo.getText() + "N");
        }
        else if(event.getSource() == letra_o){
            displayMotivo.setText(displayMotivo.getText() + "O");
        }
        else if(event.getSource() == letra_p){
            displayMotivo.setText(displayMotivo.getText() + "P");
        }
        else if(event.getSource() == letra_q){
            displayMotivo.setText(displayMotivo.getText() + "Q");
        }
        else if(event.getSource() == letra_r){
            displayMotivo.setText(displayMotivo.getText() + "R");
        }
        else if(event.getSource() == letra_s){
            displayMotivo.setText(displayMotivo.getText() + "S");
        }
        else if(event.getSource() == letra_t){
            displayMotivo.setText(displayMotivo.getText() + "T");
        }
        else if(event.getSource() == letra_u){
            displayMotivo.setText(displayMotivo.getText() + "U");
        }
        else if(event.getSource() == letra_v){
            displayMotivo.setText(displayMotivo.getText() + "V");
        }
        else if(event.getSource() == letra_w){
            displayMotivo.setText(displayMotivo.getText() + "W");
        }
        else if(event.getSource() == letra_x){
            displayMotivo.setText(displayMotivo.getText() + "X");
        }
        else if(event.getSource() == letra_y){
            displayMotivo.setText(displayMotivo.getText() + "Y");
        }
        else if(event.getSource() == letra_z){
            displayMotivo.setText(displayMotivo.getText() + "Z");
        }
        else if(event.getSource() == boton_espacio){
            displayMotivo.setText(displayMotivo.getText() + " ");
        }
        else if(event.getSource() == boton_borrar1){
                displayMotivo.setText(displayMotivo.getText().substring(0, displayMotivo.getText().length()-1));
        }
        else if(event.getSource() == boton_borrar){
            displayMotivo.setText(" ");
        }

    }


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
