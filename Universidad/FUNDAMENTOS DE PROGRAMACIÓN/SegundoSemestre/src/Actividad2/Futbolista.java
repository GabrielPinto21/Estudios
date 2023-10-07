package Actividad2;

public class Futbolista extends Deportista {

    private int goles;

    public Futbolista(int id, String nombre, String apellidos, String genero, int edad, int goles) {
        super(id, nombre, apellidos, genero, edad);
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
