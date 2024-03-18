package modelo;

public class Dueno {
    private String nombre;
    private Mascota mascota;
    public Dueno(String nombre, Mascota mascota){
        this.nombre = nombre;
        this.mascota = mascota;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
