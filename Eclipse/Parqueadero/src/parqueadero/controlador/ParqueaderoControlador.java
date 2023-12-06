package parqueadero.controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import parqueadero.modelo.Parqueadero;
import parqueadero.modelo.Vehiculo;

public class ParqueaderoControlador {

    @FXML 
    private ResourceBundle resources;

    @FXML 
    private URL location;

    @FXML 
    private ComboBox cboTipo; 
    
    @FXML 
    private ComboBox cboDia;
    
    @FXML 
    private ListView<Vehiculo> lvListar; 

    @FXML 
    private Label lblGanancias; 
    
    @FXML 
    private Label lblMensaje; 

    @FXML 
    private TextField txtCantidadCarros; 

    @FXML // fx:id="txtCantidadMotos"
    private TextField txtCantidadMotos; 

    @FXML // fx:id="txtModelo"
    private TextField txtModelo;

    @FXML // fx:id="txtPlaca"
    private TextField txtPlaca; 
    
    Parqueadero par = new Parqueadero();
   
    @FXML
    void agregar(ActionEvent event) {
    	
    	if(!(txtPlaca.getText().isEmpty() || txtModelo.getText().isEmpty() || cboTipo.getSelectionModel().isEmpty()) || cboTipo.getSelectionModel().isEmpty()) {
    		
    	String tipo = cboTipo.getSelectionModel().getSelectedItem().toString();
    	String dia = cboDia.getSelectionModel().getSelectedItem().toString();
    	String placa = txtPlaca.getText();
    	String modelo = txtModelo.getText();
    	
    	String msj = par.anadir(placa, modelo, tipo,dia);
    	lblMensaje.setText(msj);
    	mostrarTotal();
    	
    	}
    		else lblMensaje.setText("Ingrese todos los datos");
    }

    @FXML
    void limpiar(ActionEvent event) {
    	limpiarCampos();
    }

    @FXML
    void reiniciar(ActionEvent event) {

    	par.reiniciar();
    	mostrarTotal();
    }
    

    @FXML
    void totalizar(ActionEvent event) {

    	String msj = par.totalizar();
    	lblGanancias.setText(msj);
    }
    
    
    @FXML
    void eliminar(ActionEvent event) {
    
    	
    	Vehiculo vhSeleccionado = (Vehiculo) lvListar.getSelectionModel().getSelectedItem();
    	par.eliminar(vhSeleccionado);
    	
    	lvListar.getItems().clear();
    	lvListar.getItems().addAll(par.getVehiculo());
    	txtCantidadCarros.setText(par.getContCarros() + "");
    	txtCantidadMotos.setText(par.getContMotos() + "");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	
    	ObservableList<String> list = FXCollections.observableArrayList("Moto", "Carro"); 
    	cboTipo.setItems(list);
    	ObservableList<String> dia = FXCollections.observableArrayList(par.getDia()); 
    	cboDia.setItems(dia);
    	assert cboTipo != null : "fx:id=\"cboTipo\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert lblGanancias != null : "fx:id=\"lblGanancias\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert lblMensaje != null : "fx:id=\"lblMensaje\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert lvListar != null : "fx:id=\"lvListar\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert txtCantidadCarros != null : "fx:id=\"txtCantidadCarros\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert txtCantidadMotos != null : "fx:id=\"txtCantidadMotos\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
        assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'ParqueaderoVista.fxml'.";
   }
    
   private void limpiarCampos() {
	   txtPlaca.clear();
	   txtModelo.clear();
	   cboTipo.getSelectionModel().clearSelection();
	   lblMensaje.setText("");
   }

   private void mostrarTotal() {
	   txtCantidadMotos.setText(par.getContMotos() + "");
	   txtCantidadCarros.setText(par.getContCarros() + "");
	   lvListar.getItems().clear();
	   lvListar.getItems().addAll(par.getVehiculo());
   }
}
