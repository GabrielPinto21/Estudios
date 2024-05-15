/**
 * Sample Skeleton for 'CerrarCuenta.fxml' Controller Class
 */

package poo2.banco.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CerrarCuentaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtNumeroCuenta"
    private TextField txtNumeroCuenta; // Value injected by FXMLLoader

    @FXML
    void atras(ActionEvent event) {

    }

    @FXML
    void cerrar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtNumeroCuenta != null : "fx:id=\"txtNumeroCuenta\" was not injected: check your FXML file 'CerrarCuenta.fxml'.";

    }

}
