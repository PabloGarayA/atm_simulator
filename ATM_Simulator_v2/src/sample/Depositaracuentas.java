package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

        int Longitud =display.getText().length();

        if (Longitud < 20) {

            if(event.getSource() == numero_cero){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"0"+" ");
                }
                else{
                    display.setText(display.getText()+ "0");
                }
            }
            else if(event.getSource() == numero_uno){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"1"+" ");
                }
                else{
                    display.setText(display.getText()+ "1");
                }
            }
            else if(event.getSource() == numero_dos){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"2"+" ");
                }
                else{
                    display.setText(display.getText()+ "2");
                }
            }
            else if(event.getSource() == numero_tres){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"3"+" ");
                }
                else{
                    display.setText(display.getText()+ "3");
                }
            }
            else if(event.getSource() == numero_cuatro){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"4"+" ");
                }
                else{
                    display.setText(display.getText()+ "4");
                }
            }
            else if(event.getSource() == numero_cinco){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"5"+" ");
                }
                else{
                    display.setText(display.getText()+ "5");
                }
            }
            else if(event.getSource() == numero_seis){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"6"+" ");
                }
                else{
                    display.setText(display.getText()+ "6");
                }
            }
            else if(event.getSource() == numero_siete){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"7"+" ");
                }
                else{
                    display.setText(display.getText()+ "7");
                }
            }
            else if(event.getSource() == numero_ocho){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"8"+" ");
                }
                else{
                    display.setText(display.getText()+ "8");
                }
            }
            else if(event.getSource() == numero_nueve){
                if(Longitud==3||Longitud==8||Longitud==13||Longitud==18||Longitud==23){
                    display.setText(display.getText()+"9"+" ");
                }
                else{
                    display.setText(display.getText()+ "9");
                }
            }
            else if(event.getSource() == boton_borrar){
                display.setText("");
            }
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

        int Longitud1 =display.getText().length();

        if (Longitud1 == 20) {

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

}
