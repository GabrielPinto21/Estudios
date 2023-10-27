package poo1.mascotas.vista;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainMascotas extends Application {
	
	public static void main(String[] args) {
        Application.launch(MainMascotas.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("InicioVista.fxml"));
    	
        stage.setTitle("Bienvenido");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
