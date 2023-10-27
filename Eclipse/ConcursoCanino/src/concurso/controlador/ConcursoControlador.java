/**
 * Sample Skeleton for 'ConcursoVista.fxml' Controller Class
 */

package concurso.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import concurso.modelo.ConcursoCanino;
import concurso.modelo.Mascota;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ConcursoControlador {

    @FXML private ResourceBundle resources;

    @FXML private URL location;

    @FXML private TextField txtEdadMascota;

    @FXML private TextField txtNombreMascota; 

    @FXML private TextField txtPuntajeMascota;
    
    @FXML private TextArea taRespuesta;
    
    private ConcursoCanino concurso;
   

  
   
    public void ganadores(ActionEvent e) {
    	taRespuesta.setText(concurso.ganadores());
    }

    
    public void guardar(ActionEvent event) {    	
    	
    	
    	String nombre = txtNombreMascota.getText();
    	int edad = Integer.parseInt(txtEdadMascota.getText());
    	int puntaje = Integer.parseInt(txtPuntajeMascota.getText());  
    	
    	concurso.getMascotas().add(new Mascota (nombre, edad, puntaje));
    	
    	txtNombreMascota.clear();
    	txtEdadMascota.clear();
    	txtPuntajeMascota.clear();
    }

    
    public void limpiar(ActionEvent e) {
    	txtNombreMascota.clear();
    	txtEdadMascota.clear();
    	txtPuntajeMascota.clear();
    	taRespuesta.clear();
    }

    
    public void listar(ActionEvent e) {
    	taRespuesta.setText(concurso.listar());
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	concurso = new ConcursoCanino();
    	assert taRespuesta != null : "fx:id=\"respuesta\" was not injected: check your FXML file 'ConcursoVista.fxml'.";
        assert txtEdadMascota != null : "fx:id=\"txtEdadMascota\" was not injected: check your FXML file 'ConcursoVista.fxml'.";
        assert txtNombreMascota != null : "fx:id=\"txtNombreMascota\" was not injected: check your FXML file 'ConcursoVista.fxml'.";
        assert txtPuntajeMascota != null : "fx:id=\"txtPuntajeMascota\" was not injected: check your FXML file 'ConcursoVista.fxml'.";

    }

}
