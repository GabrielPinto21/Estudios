package Ejercicios;

public class Mascotas {
    private String nombre;
    private int edad;
    private String raza;

    public Mascotas(){

    }

    public Mascotas(String nombre){
        this.nombre = nombre;
    }

    public Mascotas(String nombre, int edad){
        this.nombre = nombre;
        this.edad   = edad;
    }

    public Mascotas(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad   = edad;
        this.raza   = raza;
    }
}
