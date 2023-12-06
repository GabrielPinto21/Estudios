package directorio.modelo;

import java.util.HashMap;

public class Directorio {
	
	HashMap<String, String> dir = new HashMap<String, String>();
	
	public String agregar (String nombre, String telefono) {
	
		if (!(nombre.isEmpty() || telefono.isEmpty())) {
			
			if (dir.get(telefono)== null){
				dir.put(telefono, nombre);
				return "Guardado exitosamente";
			}
			
			
			return "Esta persona ya se encuentra registrada";
			
		}
		
		return "Ingrese todos los campos";
		
	}
	
	public String mostrar (String telefonoB) {
		
		
		if ( !(dir.get(telefonoB) == null)) {
		
			String nombreObtenido = dir.get(telefonoB);
	
			return nombreObtenido;
		}
		
		return "a";
	}	
}
