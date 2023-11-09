package parqueadero.controlador;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ParqueaderoControlador {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cboTipo"
    private ComboBox cboTipo; // Value injected by FXMLLoader

    @FXML // fx:id="lblGanancias"
    private Label lblGanancias; // Value injected by FXMLLoader

    @FXML // fx:id="txtCantidadCarros"
    private TextField txtCantidadCarros; // Value injected by FXMLLoader

    @FXML // fx:id="txtCantidadMotos"
    private TextField txtCantidadMotos; // Value injected by FXMLLoader

    @FXML // fx:id="txtDia"
    private TextField txtDia; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlaca"
    private TextField txtPlaca; // Value injected by FXMLLoader

    @FXML
    void agregar(ActionEvent event) {

    }

    @FXML
    void limpiar(ActionEvent event) {

    }

    @FXML
    void reiniciar(ActionEvent event) {

    }

    @FXML
    void tipo(ActionEvent event) {
    	
    	String s = cboTipo.getSelectionModel().getSelectedItem().toString();

    }

    @FXML
    void totalizar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	ObservableList<String> list = FXCollections.observableArrayList("Moto", "Carro");
    	cboTipo.setItems(list);
        assert cboTipo != null : "fx:id=\"cboTipo\" was not injected: check your FXML file 'Untitled'.";
        assert lblGanancias != null : "fx:id=\"lblGanancias\" was not injected: check your FXML file 'Untitled'.";
        assert txtCantidadCarros != null : "fx:id=\"txtCantidadCarros\" was not injected: check your FXML file 'Untitled'.";
        assert txtCantidadMotos != null : "fx:id=\"txtCantidadMotos\" was not injected: check your FXML file 'Untitled'.";
        assert txtDia != null : "fx:id=\"txtDia\" was not injected: check your FXML file 'Untitled'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'Untitled'.";
        assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'Untitled'.";

    }

}
