package Actividad2;

public class Deportista {

    private int id;
    private String nombre;
    private String apellidos;
    private String genero;
    private int edad;
    private String categoria;

    public Deportista(int id, String nombre, String apellidos, String genero, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;

        if (edad >= 6 && edad <= 10){
            this.categoria = "Infantil";
        }else if (edad > 10 && edad <= 16){
            this.categoria = "Juvenil";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() { return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
