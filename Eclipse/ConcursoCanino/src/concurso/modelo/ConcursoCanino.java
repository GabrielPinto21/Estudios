package concurso.modelo;

import java.util.ArrayList;
import java.util.List;

public class ConcursoCanino {
	
	
	private List<Mascota> mascotas = new ArrayList<>();
	
	
	
	 public List<Mascota> getMascotas() {
		return mascotas;
	}


	 public String ganadores () {
		 String m = "";
		 for (Mascota mascota : puntajeMasAlto()) {
			 m += mascota.getNombre() + " - " + mascota.getEdad() + " años: " + mascota.getPuntaje() + "\n";
		 }
		 return m;
	 }
	 public String listar() {
		 String m = "";
		 for (Mascota mascota : mascotas) {
			 m += mascota.getNombre() + " - " + mascota.getEdad() + " años: " + mascota.getPuntaje() + "\n";
		 }
		 return m;
	 }

	public List<Mascota> puntajeMasAlto (){
	        double masAlto=0;
	        List<Mascota> mascotas = new ArrayList<>();
	        for ( Mascota mascota : this.mascotas){
	            masAlto = mascota.getPuntaje();
	            if (masAlto < mascota.getPuntaje()){
	                masAlto = mascota.getPuntaje();
	            }
	        }
	        for ( Mascota mascota : this.mascotas){
	            if (masAlto == mascota.getPuntaje()){
	                mascotas.add(mascota);
	            }
	        }
	        return mascotas;
	    }
}
