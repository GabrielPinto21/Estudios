//Crea una clase llamada "Libro" que represente un libro en una biblioteca. La clase debe tener los siguientes atributos privados: titulo (String), autor (String) y numeroPaginas (int).
// Implementa los métodos get y set correspondientes para cada uno de los atributos de la clase.
// Luego, en el método main, crea una instancia de la clase "Libro", establece valores para el título, autor y número de páginas utilizando los métodos set, y muestra por pantalla los valores utilizando los métodos get.

public class practicaGetYSet {
    public static void main(String[] args) {
        Libro libro = new Libro();

        String titulo = "ola";
        String autor = "yolo";
        int numeroDePaginas = 123;

        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNumeroDePagina(numeroDePaginas);

        System.out.println("El titulo es " + libro.getTitulo() + ", fue escrito por " + libro.getAutor() + " y tiene " + libro.getNumeroDePagina() + " paginas");
    }
}
class Libro {
    private String titulo;
    private String autor;
    private int numeroDePagina;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getNumeroDePagina(){
        return numeroDePagina;
    }
    public void setNumeroDePagina(int numeroDePagina){
        this.numeroDePagina = numeroDePagina;
    }
}
