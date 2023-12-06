/**
 * Sample Skeleton for 'DirectorioVista.fxml' Controller Class
 */

package directorio.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import directorio.modelo.Directorio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DirectorioControlador {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblGuardar"
    private Label lblGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="lblMensaje"
    private Label lblMensaje; // Value injected by FXMLLoader

    @FXML // fx:id="nombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="nombreB"
    private TextField txtNombreB; // Value injected by FXMLLoader

    @FXML // fx:id="telefono"
    private TextField txtTelefono; // Value injected by FXMLLoader

    @FXML // fx:id="telefonoB"
    private TextField txtTelefonoB; // Value injected by FXMLLoader
    
    Directorio di = new Directorio();

    @FXML
    void Guardar(ActionEvent event) {
    	
    	String nombre = txtNombre.getText();
    	String telefono = txtTelefono.getText();
    	
    	String msg = di.agregar(nombre, telefono);
    	
    	lblGuardar.setText(msg);	
    }

    @FXML
    void Mostrar(ActionEvent event) {
    	
    	String telefonoB = txtTelefonoB.getText();
    	
    	String msg = di.mostrar(telefonoB);
    
    	if (msg.equals("a")) {
    		lblMensaje.setText("El telefono no se encuentra registrado");
    		return;
    	}
    	
    	txtNombreB.setText(msg);

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblGuardar != null : "fx:id=\"lblGuardar\" was not injected: check your FXML file 'DirectorioVista.fxml'.";
        assert lblMensaje != null : "fx:id=\"lblMensaje\" was not injected: check your FXML file 'DirectorioVista.fxml'.";
        assert txtNombre != null : "fx:id=\"nombre\" was not injected: check your FXML file 'DirectorioVista.fxml'.";
        assert txtNombreB != null : "fx:id=\"nombreB\" was not injected: check your FXML file 'DirectorioVista.fxml'.";
        assert txtTelefono != null : "fx:id=\"telefono\" was not injected: check your FXML file 'DirectorioVista.fxml'.";
        assert txtTelefonoB != null : "fx:id=\"telefonoB\" was not injected: check your FXML file 'DirectorioVista.fxml'.";

    }

}
