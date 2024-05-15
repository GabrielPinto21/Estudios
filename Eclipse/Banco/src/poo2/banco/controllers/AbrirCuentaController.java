/**
 * Sample Skeleton for 'AbrirCuenta.fxml' Controller Class
 */

package poo2.banco.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class AbrirCuentaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="ahorroButton"
    private CheckBox ahorroButton; // Value injected by FXMLLoader

    @FXML // fx:id="corrienteButton"
    private CheckBox corrienteButton; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroCuenta"
    private TextField txtNumeroCuenta; // Value injected by FXMLLoader

    @FXML
    void atras(ActionEvent event) {

    }

    @FXML
    void guardar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ahorroButton != null : "fx:id=\"ahorroButton\" was not injected: check your FXML file 'AbrirCuenta.fxml'.";
        assert corrienteButton != null : "fx:id=\"corrienteButton\" was not injected: check your FXML file 'AbrirCuenta.fxml'.";
        assert txtNumeroCuenta != null : "fx:id=\"txtNumeroCuenta\" was not injected: check your FXML file 'AbrirCuenta.fxml'.";

    }

}
