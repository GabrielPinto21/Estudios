package poo1.mascotas.controlador;

import java.io.IOException;

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

public class RegistroControlador {
	
	private ConcursoMascota concurso;
	
	@FXML private TextField txtNombre;
	@FXML private TextField txtEdad;
	@FXML private TextField txtRaza;
	@FXML private Label lblMensaje;

	public RegistroControlador() {
		concurso = ConcursoMascota.getInstance();
	}
	
	@FXML public void registrar(ActionEvent e) {
		String nombre = txtNombre.getText();
		String edad = txtEdad.getText();
		String raza = txtRaza.getText();
		
		if (txtNombre.getText().isEmpty() || txtEdad.getText().isEmpty() || txtRaza.getText().isEmpty()) {
            lblMensaje.setText("¡Por favor ingrese todos los datos!");
        }else {
		
		// El metodo 'ConcursoMascota.registrar' recibe la edad como entero
		// Se debe convertir.
		int edadInt = 0;
		
		if(!edad.isEmpty())
			edadInt = Integer.parseInt(edad);
		
		
		
		// Los datos se le pasan a 'ConcursoMascota.registrar' sin validar contenido
		// ya que eso es decision de la logica de negocio.
		
		String msg = concurso.registrarMascota(nombre, edadInt, raza);
		if(concurso.sePudoRegistrarMascota()) limpiarCampos();
		lblMensaje.setText(msg);
		
       }
	}
	
	@FXML public void limpiar(ActionEvent e) {
		limpiarCampos();
	}
	
	@FXML public void volver(ActionEvent e) {
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
	
	//---------------------------
	// METODO PRIVADOS
	//---------------------------
	
	private void limpiarCampos() {
		txtNombre.clear();
		txtEdad.clear();
		txtRaza.clear();
	}
	
}
