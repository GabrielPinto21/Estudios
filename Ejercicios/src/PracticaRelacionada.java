import jdk.jfr.Category;

/*Enunciado:
        Supongamos que estamos desarrollando un programa para administrar una tienda de libros. Necesitamos modelar las clases necesarias para representar los libros y las categorías a las que
         pertenecen. Cada libro tendrá un título, un autor, un precio y pertenecerá a una categoría específica. Las categorías disponibles son "Ficción", "No ficción" y "Infantil".

        Define la clase Libro con los siguientes atributos privados:

        titulo (String): para almacenar el título del libro.
        autor (String): para almacenar el nombre del autor del libro.
        precio (double): para almacenar el precio del libro.
        categoria (Categoria): para almacenar la categoría del libro (usando el Enum Categoria).
        Define el Enum Categoria que contenga los siguientes valores: "FICCION", "NO_FICCION" e "INFANTIL".

        Crea el constructor de la clase Libro que permita inicializar los atributos titulo, autor, precio y categoria.

        Implementa los métodos getter y setter para todos los atributos de la clase Libro.

        Sobreescribe el método toString() en la clase Libro para que devuelva una representación del libro en forma de cadena de texto.

        Crea una clase principal (por ejemplo, Main) donde instancies al menos tres objetos de la clase Libro con diferentes características y muestres su información utilizando el método toString().

        Recuerda que puedes utilizar los modificadores de acceso (public, private, protected) según sea necesario para proteger los atributos y métodos de la clase.*/
public class PracticaRelacionada {
    public static void main(String[] args) {
        Libros libro1 = new Libros("Titulo1", "Autor1", 10, Categoria.FICCION);
        Libros libro2 = new Libros("Titulo2", "Autor2", 200, Categoria.NO_FICCION);
        Libros libro3 = new Libros("Titulo3", "Autor3", 100, Categoria.INFANTIL);

        System.out.println("======================================================================");
        System.out.println(libro1);
        System.out.println("======================================================================");
        System.out.println(libro2);
        System.out.println("======================================================================");
        System.out.println(libro3);
        System.out.println("======================================================================");

        System.out.println();
        System.out.println("Ahora con toString");

        System.out.println("======================================================================");
        System.out.println(libro1.toString());
        System.out.println("======================================================================");
        System.out.println(libro2.toString());
        System.out.println("======================================================================");
        System.out.println(libro3.toString());
        System.out.println("======================================================================");

    }
}

class Libros{
    private String titulo;
    private String autor;
    private double precio;
    private Categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    Libros(String titulo, String autor, double precio, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "El libro fue escrito por: " + this.autor + "\nEl libro se llama " + this.titulo + "\nTiene un precio de $" + this.precio + "\nPertenece a la categoría " + this.categoria;
    }

}
enum Categoria{
    FICCION("Ficción"),
    NO_FICCION("No ficción"),
    INFANTIL("Infantil");

    private final String categoria;

    Categoria (String categoria){this.categoria = categoria;}

    @Override
    public String toString() {
        return this.categoria;
    }
}
