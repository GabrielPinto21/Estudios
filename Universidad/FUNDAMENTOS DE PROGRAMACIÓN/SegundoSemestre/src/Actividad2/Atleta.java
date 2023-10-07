package Actividad2;

public class Atleta extends Deportista {

    private float kilometrosRecorridos;

    public Atleta(int id, String nombre, String apellidos, String genero, int edad, float kilometrosRecorridos) {
        super(id, nombre, apellidos, genero, edad);
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public float getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
}


