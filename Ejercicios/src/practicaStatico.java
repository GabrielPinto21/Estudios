/*Enunciado:
Crea una clase llamada "Contador" que tenga los siguientes elementos:

Atributos estáticos:
Un atributo entero llamado "contador" que se utilizará para llevar la cuenta del número de instancias de la clase "Contador" creadas.

Métodos estáticos:
Un método llamado "getContador" que devuelva el valor actual del atributo "contador".
Un método llamado "incrementarContador" que incremente en uno el valor del atributo "contador".
Un método llamado "resetearContador" que reinicie el valor del atributo "contador" a cero.

Métodos de instancia:
Un constructor sin parámetros que incremente en uno el valor del atributo "contador" al crear una nueva instancia de la clase "Contador".
Un método llamado "getNumeroInstancias" que devuelva el número de instancias de la clase "Contador" creadas hasta el momento de llamar al método.
Escribe un programa de prueba que utilice la clase "Contador" para crear varias instancias de la misma y muestre por pantalla el número de instancias creadas, utilizando los métodos estáticos y de instancia definidos en la clase.*/
public class practicaStatico {
    public static void main(String[] args) {

        System.out.println(contador.getContador());
        contador contador1 = new contador();
        System.out.println(contador1.getNumeroInstancias() );
        contador contador2 = new contador();
        contador contador3= new contador();
        contador contador4= new contador();
        contador contador5= new contador();
        System.out.println(contador.getContador());

    }
}

class contador{

    private static int contador;

    public contador() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void incrementarContador (){
        contador++;
    }

    public static void resetearContador (){
        contador=0;
    }

    public int getNumeroInstancias(){
        return contador;
    }
}
