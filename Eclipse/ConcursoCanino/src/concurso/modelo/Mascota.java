package concurso.modelo;

public class Mascota {
	
	private String nombre;
	private int edad;
	private int puntaje;
	
	
	public Mascota (String nombre, int edad, int puntaje) {
		this.nombre = nombre;
		this.edad = edad;
		this.puntaje = puntaje;
	}
	
	public Mascota() {}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	

}
