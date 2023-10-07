package Actividad2;

public class Basquetbolista extends Deportista {
    private int cestas;

    public Basquetbolista(int id, String nombre, String apellidos, String genero, int edad, int cestas) {
        super(id, nombre, apellidos, genero, edad);
        this.cestas = cestas;
    }

    public int getCestas() {
        return cestas;
    }

    public void setCestas(int cestas) {
        this.cestas = cestas;
    }
}
