package Actividad2;

import java.util.Scanner;

public class EscuelaDeDeportesCliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EscuelaDeDeportes escuela = new EscuelaDeDeportes();

        while (true) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Menú:");
            System.out.println("1. Agregar deportista");
            System.out.println("2. Encontrar futbolista con más goles");
            System.out.println("3. Encontrar basquetbolista con más cestas");
            System.out.println("4. Encontrar atleta con mejor rendimiento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            String mensaje = "";

            switch (opcion) {
                case 1:
                    agregarDeportista(escuela, scanner);
                    break;
                case 2:
                    mensaje = escuela.mostrarFutbolistaConMasGoles();
                    System.out.println(mensaje);
                    break;
                case 3:
                    mensaje = escuela.mostrarBasquetbolistaConMasCestas();
                    System.out.println(mensaje);
                    break;
                case 4:
                    mensaje = escuela.mostrarAtletaConMejorRendimiento();
                    System.out.println(mensaje);
                    break;
                case 5:
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void agregarDeportista(EscuelaDeDeportes escuela, Scanner scanner){

        System.out.println("-------------------------------------------------------------------");
        System.out.print("Ingrese la identificacion del deportista: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("-------------------------------------------------------------------");
        System.out.print("Ingrese el nombre del deportista: ");
        String nombre = scanner.nextLine();

        System.out.println("-------------------------------------------------------------------");
        System.out.print("Ingrese los apellidos del deportista: ");
        String apellidos = scanner.nextLine();

        String genero;
        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Ingrese su género (Masculino(M)/Femenino(F)): ");
            genero = scanner.nextLine().trim().toLowerCase();

            if (!genero.equals("masculino") && !genero.equals("m") && !genero.equals("femenino") && !genero.equals("f")) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Género no válido. Por favor, ingrese 'Masculino (M) ' o 'Femenino (F)'.");

            }
        } while (!genero.equals("masculino") && !genero.equals("m") && !genero.equals("femenino") && !genero.equals("f"));

        int edad;
        do{
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Ingrese la edad del deportista: ");
            edad = scanner.nextInt();

            if (edad <= 5 || edad >= 17){
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Edad no permitida");

            }
        }while(edad <= 5 || edad >= 17);

        scanner.nextLine();

        String tipoDeportista;
        do {
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Ingrese el tipo de deportista (Futbolista/Basquetbolista/Atleta): ");
             tipoDeportista = scanner.nextLine().trim().toLowerCase();
             if(!tipoDeportista.equals("futbolista") && !tipoDeportista.equals("basquetbolista") && !tipoDeportista.equals("atleta")){
                 System.out.println("-------------------------------------------------------------------");
                 System.out.println("El tipo de deportista no es válido. ingrese Futbolista/Basquetbolista/Atleta");
             }
        }while(!tipoDeportista.equals("futbolista") && !tipoDeportista.equals("basquetbolista") && !tipoDeportista.equals("atleta"));

        int goles = 0, cestas = 0;
        float kilometrosRecorridos = 0;

        switch (tipoDeportista) {
            case "futbolista":
                System.out.println("-------------------------------------------------------------------");
                System.out.print("Ingrese la cantidad de goles del futbolista en entrenamientos: ");
                goles = scanner.nextInt();
                break;
            case "basquetbolista":
                System.out.println("-------------------------------------------------------------------");
                System.out.print("Ingrese la cantidad de cestas del basquetbolista en entrenamientos: ");
                cestas = scanner.nextInt();
                break;
            case "atleta":
                System.out.println("-------------------------------------------------------------------");
                System.out.print("Ingrese la cantidad de kilómetros recorridos por el atleta en entrenamientos: ");
                kilometrosRecorridos = scanner.nextFloat();
                break;
            default:
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Tipo de deportista no válido. Debe ser 'Futbolista', 'Basquetbolista' o 'Atleta'.");
        }

        escuela.agregarDeportista( id, nombre, apellidos, genero, edad, goles, cestas, kilometrosRecorridos, tipoDeportista);

    }

}
