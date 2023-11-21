/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

package impuesto.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import impuesto.modelo.Impuesto;
import impuesto.modelo.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ImpuestosControlador {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cbProntoPago"
    private CheckBox cbProntoPago; // Value injected by FXMLLoader

    @FXML // fx:id="cbServicioPublico"
    private CheckBox cbServicioPublico; // Value injected by FXMLLoader

    @FXML // fx:id="cbTrasladoCuenta"
    private CheckBox cbTrasladoCuenta; // Value injected by FXMLLoader

    @FXML // fx:id="lblMensaje"
    private Label lblMensaje; // Value injected by FXMLLoader

    @FXML // fx:id="txtLinea"
    private TextField txtLinea; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlaca"
    private TextField txtPlaca; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultado"
    private TextField txtResultado; // Value injected by FXMLLoader

    @FXML // fx:id="txtValor"
    private TextField txtValor; // Value injected by FXMLLoader
    
    Impuesto imp = new Impuesto();

    @FXML
    void anadir(ActionEvent event) {
    	
    	if(!txtPlaca.getText().isEmpty() && !txtResultado.getText().isEmpty() && !txtValor.getText().isEmpty() && !txtModelo.getText().isEmpty() && !txtLinea.getText().isEmpty() && !txtMarca.getText().isEmpty()) {
    		boolean cbPronto = cbProntoPago.isSelected();
        	boolean cbServicio = cbServicioPublico.isSelected();
        	boolean cbTraslado = cbTrasladoCuenta.isSelected();
        	String placa = txtPlaca.getText();
        	String valor = txtValor.getText();
        	String modelo = txtModelo.getText();
        	String linea = txtLinea.getText();
        	String marca = txtMarca.getText();
        	String resultado = txtResultado.getText();
        	
        	if (placa != null && valor != null && modelo != null && linea != null && marca != null) {
        		int modeloInt = 0;
        		double valorDouble = 0;
        		double resultadoDouble = 0;
        		modeloInt = Integer.parseInt(modelo);
        		valorDouble = Double.parseDouble(valor);
            	resultadoDouble = Double.parseDouble(resultado);
            	if(txtResultado.getText().isEmpty()) {
            		lblMensaje.setText("Calcule el valor del vechiculo para registrar.");
            		return;
            	}
            	String msg = imp.anadirVehiculo(placa, marca, linea, modeloInt, valorDouble, cbPronto, cbServicio, cbTraslado, resultadoDouble);
            	lblMensaje.setText(msg);
            	limpiarCampos();
            	return;
        	}
    	}
    	lblMensaje.setText("Ingrese todos los campos");

    }

    @FXML
    void buscar(ActionEvent event) {
    	
    	System.out.println("Cobtroller.buscar");
    	
    	String placa = txtPlaca.getText();
    	
    	if(!placa.isEmpty()) {
    		
    		Vehiculo msj = imp.buscarVehiculo(placa);
    		
    		if(msj != null) {
    			txtMarca.setText(msj.getMarca());
        		txtLinea.setText(msj.getLinea());
        		txtModelo.setText(msj.getModelo() + "");
        		txtValor.setText((msj.getValor()+ ""));
        		cbProntoPago.setSelected(msj.isCbPronto());
        		cbServicioPublico.setSelected(msj.isCbServicio());
        		cbTrasladoCuenta.setSelected(msj.isCbTraslado());
        		txtResultado.setText(String.valueOf(msj.getResultado()));
    		}
    		else {
    			lblMensaje.setText("Este vehiculo no se encuentra registrado");
    			return;
    		}
    	}
    	lblMensaje.setText("Por favor ingrese la placa.");

    }

    @FXML
    void calcularImpuestos(ActionEvent event) {
    	if(!txtValor.getText().isEmpty()) {
    	boolean cbPronto = cbProntoPago.isSelected();
    	boolean cbServicio = cbServicioPublico.isSelected();
    	boolean cbTraslado = cbTrasladoCuenta.isSelected();
    	String valor = txtValor.getText();
    	String msg = imp.calcularImpuestos(valor, cbPronto, cbServicio, cbTraslado);
    	txtResultado.setText(msg);
    	}
    	else lblMensaje.setText("Ingreso todos los campos.");
    }

    @FXML
    void eliminar(ActionEvent event) {
    	String placa = txtPlaca.getText();
    	
    	if(!placa.isEmpty()) {
    		String msj = imp.eliminarVehiculo(placa);
    		lblMensaje.setText(msj);
    	}
    	else lblMensaje.setText("Por favor ingrese la placa.");
    }
    

    @FXML
    void limpiar(ActionEvent event) {
    	limpiarCampos();
    }

    @FXML
    void siguiente(ActionEvent event) {
    	Vehiculo msj = imp.mostrarSiguiente(txtPlaca.getText());
    	if(msj != null) {
    		txtPlaca.setText(msj.getPlaca());
			txtMarca.setText(msj.getMarca());
    		txtLinea.setText(msj.getLinea());
    		txtModelo.setText(msj.getModelo() + "");
    		txtValor.setText((msj.getValor()+ ""));
    		cbProntoPago.setSelected(msj.isCbPronto());
    		cbServicioPublico.setSelected(msj.isCbServicio());
    		cbTrasladoCuenta.setSelected(msj.isCbTraslado());
    		txtResultado.setText(String.valueOf(msj.getResultado()));
		}
    }
    
    @FXML
    void anterior(ActionEvent event) {
    	Vehiculo msj = imp.mostrarAnterior(txtPlaca.getText());
    	if(msj != null) {
    		txtPlaca.setText(msj.getPlaca());
			txtMarca.setText(msj.getMarca());
    		txtLinea.setText(msj.getLinea());
    		txtModelo.setText(msj.getModelo() + "");
    		txtValor.setText((msj.getValor()+ ""));
    		cbProntoPago.setSelected(msj.isCbPronto());
    		cbServicioPublico.setSelected(msj.isCbServicio());
    		cbTrasladoCuenta.setSelected(msj.isCbTraslado());
    		txtResultado.setText(String.valueOf(msj.getResultado()));
		}
    }
    
    @FXML
    void irInicio(ActionEvent event) {
    	Vehiculo msj = imp.mostrarPrimero();
    	if(msj != null) {
    		txtPlaca.setText(msj.getPlaca());
			txtMarca.setText(msj.getMarca());
    		txtLinea.setText(msj.getLinea());
    		txtModelo.setText(msj.getModelo() + "");
    		txtValor.setText((msj.getValor()+ ""));
    		cbProntoPago.setSelected(msj.isCbPronto());
    		cbServicioPublico.setSelected(msj.isCbServicio());
    		cbTrasladoCuenta.setSelected(msj.isCbTraslado());
    		txtResultado.setText(String.valueOf(msj.getResultado()));
		}
    }
    
    @FXML
    void irFinal(ActionEvent event) {
    	Vehiculo msj = imp.mostrarUltimo();
    	if(msj != null) {
    		txtPlaca.setText(msj.getPlaca());
			txtMarca.setText(msj.getMarca());
    		txtLinea.setText(msj.getLinea());
    		txtModelo.setText(msj.getModelo() + "");
    		txtValor.setText((msj.getValor()+ ""));
    		cbProntoPago.setSelected(msj.isCbPronto());
    		cbServicioPublico.setSelected(msj.isCbServicio());
    		cbTrasladoCuenta.setSelected(msj.isCbTraslado());
    		txtResultado.setText(String.valueOf(msj.getResultado()));
    	}
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cbProntoPago != null : "fx:id=\"cbProntoPago\" was not injected: check your FXML file 'Untitled'.";
        assert cbServicioPublico != null : "fx:id=\"cbServicioPublico\" was not injected: check your FXML file 'Untitled'.";
        assert cbTrasladoCuenta != null : "fx:id=\"cbTrasladoCuenta\" was not injected: check your FXML file 'Untitled'.";
        assert lblMensaje != null : "fx:id=\"lblMensaje\" was not injected: check your FXML file 'Untitled'.";
        assert txtLinea != null : "fx:id=\"txtLinea\" was not injected: check your FXML file 'Untitled'.";
        assert txtMarca != null : "fx:id=\"txtMarca\" was not injected: check your FXML file 'Untitled'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'Untitled'.";
        assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'Untitled'.";
        assert txtResultado != null : "fx:id=\"txtResultado\" was not injected: check your FXML file 'Untitled'.";
        assert txtValor != null : "fx:id=\"txtValor\" was not injected: check your FXML file 'Untitled'.";

    }
    
    private void limpiarCampos() {
    	cbProntoPago.setSelected(false);
    	cbServicioPublico.setSelected(false);
    	cbTrasladoCuenta.setSelected(false);
    	txtLinea.clear();
    	txtMarca.clear();
    	txtModelo.clear();
    	txtValor.clear();
    	txtResultado.clear();
    	txtPlaca.clear();
    	lblMensaje.setText("");
    }

}
