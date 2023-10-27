package poo1.mascotas.modelo;

public class Mascota {

	private String nombre;
	private int edad;
	private String raza;
	private int puntaje;
	
	public Mascota(String nombre, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
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
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
	
	
}
