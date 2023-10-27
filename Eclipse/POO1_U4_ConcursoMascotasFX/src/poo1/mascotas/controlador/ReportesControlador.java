/**
 * Sample Skeleton for 'ReportesVista.fxml' Controller Class
 */

package poo1.mascotas.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import poo1.mascotas.modelo.ConcursoMascota;
import poo1.mascotas.util.Utilidades;

public class ReportesControlador {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="taRespuesta"
    private TextArea taRespuesta; // Value injected by FXMLLoader
    
    private ConcursoMascota concurso;
    
    public ReportesControlador() {
    	concurso = ConcursoMascota.getInstance();	
	}

    @FXML
    void ganadores(ActionEvent e) {
    	taRespuesta.setText(concurso.ganadores());
    }

    @FXML
    void limpiar(ActionEvent e) {
    	limpiarCampos();
    }

    @FXML
    void listar(ActionEvent e) {
    	taRespuesta.setText(concurso.listar());
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
		taRespuesta.clear();
	}

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert taRespuesta != null : "fx:id=\"taRespuesta\" was not injected: check your FXML file 'ReportesVista.fxml'.";

    }

}
