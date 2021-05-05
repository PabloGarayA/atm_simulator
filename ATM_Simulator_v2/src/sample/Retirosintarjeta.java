package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Retirosintarjeta implements Initializable {
    @FXML
    private AnchorPane pantallaRetiroSinTarjeta;

    @FXML
    public TextField displayUno, displayDos, displayTres;
    public PasswordField displayNip;

    @FXML
    private Label mensajeInicio, claveIncorrecta;

    @FXML
    private Button numero_cero, numero_uno, numero_dos, numero_tres, numero_cuatro, numero_cinco, numero_seis, numero_siete, numero_ocho, numero_nueve;

    @FXML
    private Button boton_borrar, boton_borrar1;

    @FXML
    private void tecladoNumerico(ActionEvent event) {

        int Longitud1 =displayUno.getText().length();
        int Longitud2 =displayDos.getText().length();
        int Longitud3 =displayTres.getText().length();
        int Longitud4 =displayNip.getText().length();

        if(event.getSource() == numero_cero){

            String numero = "0";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );


            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){


                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){


                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_uno){

            String numero = "1";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){


                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){


                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){


                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_dos){

            String numero = "2";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){


                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){


                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_tres){

            String numero = "3";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){

                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_cuatro){

            String numero = "4";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){

                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_cinco){

            String numero = "5";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){

                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_seis){

            String numero = "6";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){

                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_siete){

            String numero = "7";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){

                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_ocho){

            String numero = "8";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){

                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }

                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == numero_nueve){

            String numero = "9";

            if ( Longitud1 == 0 ){

                displayUno.setText(displayUno.getText() + numero );

            }
            else if ( Longitud1 == 4 ){

                displayDos.setText(displayDos.getText());

                if ( Longitud2 == 0 ){

                    displayDos.setText(displayDos.getText() + numero );

                }
                else if ( Longitud2 == 4 ){


                    displayTres.setText(displayTres.getText());

                    if ( Longitud3 == 0 ){

                        displayTres.setText(displayTres.getText() + numero );

                    }
                    else if ( Longitud3 == 4 ){

                        displayNip.setText(displayNip.getText());

                        if ( Longitud4 == 0 ){

                            displayNip.setText(displayNip.getText() + numero );

                        }
                        else if ( Longitud4 >= 4 ){

                            displayNip.setText(displayNip.getText());

                        }
                        else {displayNip.setText(displayNip.getText() + numero );}
                    }
                    else {displayTres.setText(displayTres.getText() + numero );}
                }
                else {displayDos.setText(displayDos.getText() + numero );}
            }
            else {displayUno.setText(displayUno.getText() + numero );}
        }
        if(event.getSource() == boton_borrar1) {

            if (displayUno.getText().length() <= 4 && displayDos.getText().length() == 0) {
                displayUno.requestFocus();
                displayUno.setText(displayUno.getText().substring(0, displayUno.getText().length()-1));
            }else if (displayDos.getText().length() <= 4 && displayTres.getText().length() == 0) {
                displayDos.requestFocus();
                displayDos.setText(displayDos.getText().substring(0, displayDos.getText().length()-1));
            }else if (displayTres.getText().length() <= 4 && displayNip.getText().length() == 0) {
                displayTres.requestFocus();
                displayTres.setText(displayTres.getText().substring(0, displayTres.getText().length()-1));
            }else if (displayNip.getText().length() <= 4) {
                displayNip.requestFocus();
                displayNip.setText(displayNip.getText().substring(0, displayNip.getText().length()-1));
            }

        }
        if(event.getSource() == boton_borrar){

            displayUno.setText("");
            displayDos.setText("");
            displayTres.setText("");
            displayNip.setText("");
            displayUno.requestFocus();

        }
    }
    ////////////////////////////////////////////////////////////////////////////////
    @Override  // Indica que este metodo sobrescribe el metodo de una superclase
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void  botonContinuarAFinal(ActionEvent event) {

        if (!displayUno.getText().isEmpty() && !displayDos.getText().isEmpty() && !displayTres.getText().isEmpty() && !displayNip.getText().isEmpty()) {
            validaInicio();
        } else {
            claveIncorrecta.setText("");
            mensajeInicio.setText("Por favor completa todos los campos!");
        }

    }

    public void validaInicio() {

        ConexionDatabase conexion1 = new ConexionDatabase();
        Connection conectarDB = conexion1.getConnection();

        String verificar = "SELECT count(1), idusuario FROM datauser WHERE displayuno = '" + displayUno.getText()+"' AND displaydos = '" + displayDos.getText()+"' AND displayTres = '" + displayTres.getText()+"' AND displaynip = '" + displayNip.getText()+"'";
        try {

            Statement statement = conectarDB.createStatement();
            ResultSet queryResul = statement.executeQuery(verificar);


            while (queryResul.next()) {


                String idtodelete = queryResul.getString(2);

                if (queryResul.getInt(1) == 1) {

                    String querydelete = "DELETE FROM datauser WHERE idusuario =" + idtodelete;


                    Statement stmt;
                    stmt = (Statement) conectarDB.createStatement();
                    stmt.executeUpdate(querydelete);
                    AnchorPane pane = FXMLLoader.load(getClass().getResource("realizandoTransaccion.fxml"));
                    pantallaRetiroSinTarjeta.getChildren().setAll(pane);

                } else {
                    mensajeInicio.setText("");
                    claveIncorrecta.setText("Clave de seguridad y/o numero de seguridad incorrectos!");

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    @FXML
    private void  salirRetiroSinTarjeta(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pantallaRetiroSinTarjeta.getChildren().setAll(pane);
    }

}