package poo1.mascotas.modelo;


public class ConcursoMascota {

	private boolean sePudoRegistrar, sePudoCalificar;
	
	private Mascota[] mascotas;
	
    private static ConcursoMascota instance;
    
    private ConcursoMascota() {
        mascotas = new Mascota[10];
    }
    
    public static ConcursoMascota getInstance() {
        if(instance==null)
            instance = new ConcursoMascota();
        return instance;
    }
	
	public String registrarMascota(String nombre, int edad, String raza) {
		// Validar que no hayan otras mascotas con el mismo nombre

		
		for (Mascota mascota : this.mascotas) {
			if(mascota!=null) {
			if (nombre.equalsIgnoreCase(mascota.getNombre()) ){
				this.sePudoRegistrar = false;
				return "La mascota ya se encuentra registrada";
				}
			}
		}
		
	
		// Buscar posicion vacia
		for (int i = 0; i < mascotas.length; i++) {
			if(mascotas[i]==null) { // Esta vacia?
				// Crea el objeto mascota
				Mascota masc = new Mascota(nombre, edad, raza);
				// Lo guarda en la posicion
				mascotas[i] = masc;
				this.sePudoRegistrar = true;
				return "La mascota se ha registrado correctamente";
			}			
		}
		return "";
	}
	
	public boolean sePudoRegistrarMascota() {
		return this.sePudoRegistrar;
	}
	
	public boolean sePudoCalificar() {
		return this.sePudoCalificar;
	}
	
	
	public int obtenerTotalMascotasRegistradas() {
		int total = 0;
		for (int i = 0; i < mascotas.length; i++) {
			if(mascotas[i]!=null) { 
				total++;
			}
		}
		return total;
	}
	
	public String calificarMascota (String nombre, int puntajeInt) {
		
		for (Mascota mascota : mascotas) {
			if(mascota!=null) {
				if (nombre.equalsIgnoreCase(mascota.getNombre()) && mascota.getPuntaje()!=0) {
					this.sePudoCalificar = false;
					return "La mascota ya fue calificada";
				}
				
			if (nombre.equalsIgnoreCase(mascota.getNombre()) ){
				mascota.setPuntaje(puntajeInt);
				this.sePudoCalificar = true;
				return "La mascota fue calificada correctamente";
				}
			}
	
		}
			
		return "La mascota no está registrada";

	}
	
	public String ganadores () {

		 String m = "";
		 if(mascotas!=null) {
		 for (Mascota mascota : puntajeMasAlto()) {
			 if(mascota != null) m += mascota.getNombre() + " - " + mascota.getEdad() + " años: " + mascota.getPuntaje() + "\n";
		 	}
		 }
		 return m;
	 }
	
	public String listar() {

		 String m = "";
		 if(mascotas!=null) {
		 for (Mascota mascota : mascotas) {
			 if(mascota != null)m += mascota.getNombre() + " - " + mascota.getEdad() + " años: " + mascota.getPuntaje() + "\n";
		 	}
		 }
		 return m;
	 }
	 
	public Mascota[] puntajeMasAlto() {

		 
		 int masAlto=0;
	        Mascota[] mascotasGanadoras = new Mascota[10];
	        for ( Mascota mascota : this.mascotas){
	        	if(mascota != null) {
		            if (masAlto < mascota.getPuntaje()){
		                masAlto = mascota.getPuntaje();
		            }
	        	}
	        }
	        for ( Mascota mascota : this.mascotas){
	            int i=0;
	        	
	        	if (mascota != null && masAlto == mascota.getPuntaje()){
	              mascotasGanadoras[i++] = mascota;
	            }
	        }
		 
		 return mascotasGanadoras;
		 
	 }

	
}
