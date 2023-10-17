package Ejercicio6;

public class Mascota {

    private int identificador;
    private String nombre;
    private int edad;
    private int puntaje;
    private Raza raza;
    private Dueno dueno;
    public Mascota(int identificador, String nombre, int edad, Raza raza){
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    public int getIdentificador() {
        return identificador;
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
    public Raza getRaza() {
        return raza;
    }
    public Dueno getDueno() {
        return dueno;
    }
    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}