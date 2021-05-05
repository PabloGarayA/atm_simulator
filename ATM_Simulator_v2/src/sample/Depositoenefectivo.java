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
    public void recogerNumeroDeC(String text) {
        displayNumeroDeCuenta.setText(text);
    }

    @FXML
    private AnchorPane pantallaDepositoEnEfectivo;

    @FXML
    private TextField displayImporte, displayNumeroDeCuenta;

    @FXML
    public Button numero_cero, numero_uno, numero_dos, numero_tres, numero_cuatro, numero_cinco, numero_seis, numero_siete, numero_ocho, numero_nueve;

    @FXML
    private Button boton_borrar;

    @FXML
    private void tecladoNumerico(ActionEvent event) {

        int Longitud = displayImporte.getText().length();

        if( event.getSource() == numero_cero ) {

            String numero = "0";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }
        }
        else if( event.getSource() == numero_uno ) {

            String numero = "1";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_dos ) {

            String numero = "2";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_tres ) {

            String numero = "3";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_cuatro ) {

            String numero = "4";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_cinco ) {

            String numero = "5";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_seis ) {

            String numero = "6";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_siete ) {

            String numero = "7";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_ocho ) {

            String numero = "8";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == numero_nueve ) {

            String numero = "9";

            if ( Longitud == 0 ){

                displayImporte.setText( "$" + displayImporte.getText() + numero );

            }
            else if ( Longitud == 4 ){

                char char1 = displayImporte.getText().charAt(1);
                String str = displayImporte.getText();
                String str1 = str.replaceFirst( String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud == 7 ) {

                char char4 = displayImporte.getText().charAt(4);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char4, char4 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if  ( Longitud == 8 ) {

                char char5 = displayImporte.getText().charAt(5);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char5, char5 + ", " );
                displayImporte.setText( str1 + numero );

            }
            else if ( Longitud == 9 ) {

                char char1 = displayImporte.getText().charAt(1);
                char char6 = displayImporte.getText().charAt(6);
                String str = displayImporte.getText();
                String str1 = str.replace(", " + char6, char6 + ", " ).replaceFirst(String.valueOf(char1), char1 + ", " );
                displayImporte.setText( str1 + numero);

            }
            else if ( Longitud >= 12 ) {

                displayImporte.setText( displayImporte.getText() );
            }
            else{

                displayImporte.setText( displayImporte.getText() + numero );

            }

        }
        else if( event.getSource() == boton_borrar ) {
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
