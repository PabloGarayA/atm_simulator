package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class Comprobante implements Initializable {

    private int minute;
    private int hour;
    private int second;

    @FXML
    private Label labelFecha, labelHora;
    @FXML
    private Button botonTransaccion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        LocalDate fecha = LocalDate.now(ZoneId.systemDefault());
        labelFecha.setText(fecha.format(DateTimeFormatter.ISO_DATE));

        LocalTime currentTime = LocalTime.now(Clock.systemDefaultZone());
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        labelHora.setText(formatter.format(currentTime));
    }
    @FXML
    private void botonCerrarTicket(ActionEvent event) {

        Stage stage = (Stage) botonTransaccion.getScene().getWindow();
        stage.close();
    }
}