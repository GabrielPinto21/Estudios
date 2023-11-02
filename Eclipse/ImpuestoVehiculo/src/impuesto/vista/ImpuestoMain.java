package impuesto.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ImpuestoMain extends Application {
	
	public static void main(String[] args) {
        Application.launch(ImpuestoMain.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ImpuestoVista.fxml"));
    	
        stage.setTitle("Bienvenido");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
