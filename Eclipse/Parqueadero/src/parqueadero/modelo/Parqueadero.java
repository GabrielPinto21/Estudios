package parqueadero.modelo;

import java.util.ArrayList;

public class Parqueadero {

	private ArrayList<Vehiculo> vehiculo;
	
	private int contMotos = 0, contCarros = 0;
	
	public Parqueadero () {
		vehiculo = new ArrayList<Vehiculo>();
	}
	
	
	public String anadir (String placa, String modelo, String tipo) {
		
		for (Vehiculo vh1 : vehiculo) {
			if(placa.equalsIgnoreCase(vh1.getPlaca())) {
				return "Vehiculo ya se encuentra registrado";
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		return "";
	}

}
