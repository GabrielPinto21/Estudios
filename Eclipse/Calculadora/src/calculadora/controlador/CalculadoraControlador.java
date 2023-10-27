/**
 * Sample Skeleton for 'CalculadoraVista.fxml' Controller Class
 */

package calculadora.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import calculadora.modelo.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraControlador {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtNumero1;

	@FXML
	private TextField txtNumero2;

	@FXML
	private TextField txtResultado;
	
	@FXML
	private Label lblMensaje;

	private Calculadora calculadora = new Calculadora();

	@FXML
	void restarMemoria(ActionEvent e) {

		calculadora.restarMemoria();

	}

	@FXML
	void sumarMemoria(ActionEvent e) {

		if (!txtResultado.getText().isEmpty()) {

			String nuevoResultado = txtResultado.getText().replace(',', '.');

			double n = Double.parseDouble(nuevoResultado);
			calculadora.sumarMemoria(n);
		}
	}

	@FXML
	void limpiar(ActionEvent e) {
		limpiarCampos();
	}

	@FXML
	void mostrarMemoria(ActionEvent e) {
		limpiarCampos();
		
		double x = calculadora.getValorMemoria();
		if(x!=0)
			txtNumero1.setText(Double.toString(calculadora.getValorMemoria()));
	}

	@FXML
	void dividir(ActionEvent e) {

		String num1 = txtNumero1.getText();
		String num2 = txtNumero2.getText();

		String msg = calculadora.div(num1, num2);
		txtResultado.setText(msg);
		
		if(msg.equals("##ERROR##"))
			lblMensaje.setText("Numero 2, debe ser diferente de 0");

	}

	@FXML
	void multiplicar(ActionEvent e) {
		String num1 = txtNumero1.getText();
		String num2 = txtNumero2.getText();

		String msg = calculadora.mult(num1, num2);
		txtResultado.setText(msg);

	}

	@FXML
	void restar(ActionEvent e) {
		String num1 = txtNumero1.getText();
		String num2 = txtNumero2.getText();

		String msg = calculadora.resta(num1, num2);
		txtResultado.setText(msg);

	}

	@FXML
	void sumar(ActionEvent e) {

		String num1 = txtNumero1.getText();
		String num2 = txtNumero2.getText();

		String msg = calculadora.suma(num1, num2);
		txtResultado.setText(msg);

	}

	@FXML
	void initialize() {
		assert txtNumero1 != null
				: "fx:id=\"txtNumero1\" was not injected: check your FXML file 'CalculadoraVista.fxml'.";
		assert txtNumero2 != null
				: "fx:id=\"txtNumero2\" was not injected: check your FXML file 'CalculadoraVista.fxml'.";
		assert txtResultado != null
				: "fx:id=\"txtResultado\" was not injected: check your FXML file 'CalculadoraVista.fxml'.";

	}

	private void limpiarCampos() {
		txtNumero1.clear();
		txtNumero2.clear();
		txtResultado.clear();
	}

}
