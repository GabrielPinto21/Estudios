package parqueadero.vista;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ParqueaderoMain extends Application {
	
	public static void main(String[] args) {
        Application.launch(ParqueaderoMain.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ParqueaderoVista.fxml"));
    	
        stage.setTitle("Bienvenido");
        stage.setScene(new Scene(loader.load()));
        stage.setResizable(false);
        stage.show();
    }
}
