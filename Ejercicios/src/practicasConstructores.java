import java.util.Scanner;
/*Crea una clase llamada "Persona" que tenga los siguientes atributos:
nombre (String)
edad (int)
altura (double)
La clase debe contar con los siguientes elementos:
Constructores:
Un constructor vacío que inicialice los atributos con valores predeterminados.
Un constructor que tome como parámetros el nombre, la edad y la altura, y los asigne a los atributos correspondientes.
Métodos "set":
Un método "setNombre" que permita establecer el nombre de la persona.
Un método "setEdad" que permita establecer la edad de la persona.
Un método "setAltura" que permita establecer la altura de la persona.
Métodos "get":
Un método "getNombre" que devuelva el nombre de la persona.
Un método "getEdad" que devuelva la edad de la persona.
Un método "getAltura" que devuelva la altura de la persona.
Método "toString":
Un método "toString" que devuelva una cadena de texto representando la información de la persona. La cadena debe tener el siguiente formato: "Nombre: [nombre], Edad: [edad], Altura: [altura]".
Método "equals":
Un método "equals" que tome como parámetro un objeto "Persona" y verifique si es igual al objeto actual. Dos personas se considerarán iguales si tienen el mismo nombre, la misma edad y la misma altura.
Implementa la clase "Persona" con los elementos mencionados y crea un programa principal que pruebe su funcionalidad.*/
public class practicasConstructores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingres el nombre de la Persona1: ");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese la edad de la Persona1: ");
        int edad1 = sc.nextInt();
        System.out.println("Ingrese la estatura de la Persona1: ");
        double estatura1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingres el nombre de la Persona2: ");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese la edad de la Persona2: ");
        int edad2 = sc.nextInt();
        System.out.println("Ingrese la estatura de la Persona2: ");
        double estatura2 = sc.nextDouble();

        Personas persona1 = new Personas(nombre1, edad1, estatura1);
        Personas personas2 = new Personas(nombre2 , edad2 , estatura2);

        System.out.println("Los nombres de las personas 1 y 2 son iguales? -----> " + persona1.getNombre().equals(personas2.getNombre()));
        System.out.println("La edad de las personas 1 y 2 son iguales? -----> " + (persona1.getEdad() == personas2.getEdad()));
        System.out.println("L altura de las personas 1 y 2 son iguales? -----> " + (persona1.getAltura() == personas2.getAltura()));
        System.out.println(persona1.equals(personas2));
        System.out.println(persona1.toString());

    }
}
class Personas {
    private String nombre;
    private int edad;
    private double  altura;

    public Personas(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public Personas(){

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre : " + this.nombre + " , Edad: " + this.edad + " , Altura: " + this.altura;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }
        if (!(obj instanceof  Personas)){
            return false;
        }
            Personas p = (Personas) obj;
        return (this.nombre != null
                && this.nombre.equals(p.getNombre())
                && this.edad == p.getEdad() && this.altura == p.getAltura() );
    }
}