/*Sistema de Registro de Alumnos
El objetivo del ejercicio es crear un sistema simple de registro de alumnos utilizando conceptos de POO.
Debes implementar una clase llamada "Alumno" que tenga las siguientes características:

Atributos de la clase:

Nombre: Nombre completo del alumno.
Edad: Edad del alumno (valor numérico entero).
 Género: Género del alumno, representado mediante un enumerador con las opciones: "Masculino", "Femenino", "No binario", "Otro".

 Métodos de la clase:

Constructor: Un constructor que reciba el nombre, la edad y el género del alumno y los almacene en los atributos correspondientes.
Setters y Getters: Métodos setter y getter para cada uno de los atributos de la clase, que permitan establecer y obtener los valores de los mismos, respectivamente.
Una vez que hayas implementado la clase "Alumno", deberás crear un programa de prueba (main) que realice lo siguiente:

Crea tres objetos "Alumno" con datos ficticios.
Muestra por pantalla los detalles de cada alumno, incluyendo nombre, edad y género, utilizando los métodos getter.
Actualiza la edad de uno de los alumnos utilizando el método setter correspondiente.
Muestra nuevamente los detalles de todos los alumnos actualizados.
Recuerda utilizar enumeradores para representar el género y aplicar los conceptos de encapsulación utilizando los métodos setter y getter.*/

public class PracticaEnum {
    public static void main(String[] args) {

        Alumnos Gabriel = new Alumnos("Gabriel", 22, Genero.MASCULINO);
        Alumnos Jorge = new Alumnos("Jorge",17 , Genero.MASCULINO);
        Alumnos Daniel = new Alumnos("Daniel", 18 , Genero.OTRO);

        System.out.println("Nombre: " + Gabriel.getNombre() + ", edad: " + Gabriel.getEdad() + " y género: " + Gabriel.getGenero());
        System.out.println("Nombre: " + Jorge.getNombre() + ", edad: " + Jorge.getEdad() + " y género: " + Jorge.getGenero());
        System.out.println("Nombre: " + Daniel.getNombre() + ", edad: " + Daniel.getEdad() + " y género: " + Daniel.getGenero());

        System.out.println("==========================================================================================================");

        Jorge.setEdad(18);
        Gabriel.setNombre("Gabriel Pinto");
        Daniel.setGenero(Genero.MASCULINO);
        System.out.println("Nombre: " + Gabriel.getNombre() + ", edad: " + Gabriel.getEdad() + " y género: " + Gabriel.getGenero());
        System.out.println("Nombre: " + Jorge.getNombre() + ", edad: " + Jorge.getEdad() + " y género: " + Jorge.getGenero());
        System.out.println("Nombre: " + Daniel.getNombre() + ", edad: " + Daniel.getEdad() + " y género: " + Daniel.getGenero());
    }
}
class Alumnos{
    private String nombre;
    private int edad;
    private Genero genero;

    Alumnos(String nombre, int edad, Genero genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
