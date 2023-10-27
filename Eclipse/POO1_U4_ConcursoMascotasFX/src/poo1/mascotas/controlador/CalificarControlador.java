/**
 * Sample Skeleton for 'CalificarVista.fxml' Controller Class
 */

package poo1.mascotas.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import poo1.mascotas.modelo.ConcursoMascota;
import poo1.mascotas.util.Utilidades;

public class CalificarControlador {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblMensaje"
    private Label lblMensaje; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="txtPuntaje"
    private TextField txtPuntaje; // Value injected by FXMLLoader
    
    private ConcursoMascota mascotas;
  
    public CalificarControlador () {
    	mascotas = ConcursoMascota.getInstance();
    	}
    

    @FXML
    void calificar(ActionEvent e) {
    	
    	String nombre = txtNombre.getText();
		String puntaje = txtPuntaje.getText();
		
		if (txtNombre.getText().isEmpty() || txtPuntaje.getText().isEmpty()) {
            lblMensaje.setText("¡Por favor ingrese todos los datos!");
        }else {
		
		int puntajeInt = 0;
		if(!puntaje.isEmpty())
			puntajeInt = Integer.parseInt(puntaje);
		
		String msg = mascotas.calificarMascota(nombre, puntajeInt);
		if (mascotas.sePudoCalificar())limpiarCampos();
		lblMensaje.setText(msg);

        }
    }
    
    @FXML
    void limpiar(ActionEvent e) {
    	limpiarCampos();
    }

    @FXML
    void volver(ActionEvent e) {
    	Stage stage = Utilidades.obtenerStage(e);
		stage.close();
		
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/poo1/mascotas/vista/InicioVista.fxml"));
			Pane root = loader.load();			
			
			Scene scene = new Scene(root);
		    stage.setScene(scene);
		    
		    stage.show();		    		    

		} catch (IOException eio) {
			eio.printStackTrace();
		}

    }
    
    private void limpiarCampos() {
		txtNombre.clear();
		txtPuntaje.clear();
	}

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblMensaje != null : "fx:id=\"lblMensaje\" was not injected: check your FXML file 'CalificarVista.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'CalificarVista.fxml'.";
        assert txtPuntaje != null : "fx:id=\"txtPuntaje\" was not injected: check your FXML file 'CalificarVista.fxml'.";

    }

}
