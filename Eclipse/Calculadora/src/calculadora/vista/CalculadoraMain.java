package calculadora.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CalculadoraMain extends Application {
	public static void main(String[] args) {
        Application.launch(CalculadoraMain.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculadoraVista.fxml"));
    	
        stage.setTitle("BIENVENIDO");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
