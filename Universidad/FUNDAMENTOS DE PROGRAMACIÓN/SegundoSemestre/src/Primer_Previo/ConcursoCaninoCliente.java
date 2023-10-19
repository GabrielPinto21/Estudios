package Primer_Previo;

import java.util.Scanner;

public class ConcursoCaninoCliente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el identificador del concurso: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el Nombre del concurso: ");
        String nombreC = scanner.nextLine();

        System.out.println("Ingrese la Ciudad del concurso: ");
        String ciudad = scanner.nextLine();

        ConcursoCanino concursoCanino = new ConcursoCanino(identificador, nombreC, ciudad);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar Mascota");
            System.out.println("2. Dar calificación a la mascota");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            String mensaje = "";

            switch (opcion) {

                case 1:
                    agregarMascota(concursoCanino, scanner);
                    break;
                case 2:
                    calificar(concursoCanino, scanner);
                    System.out.println(mensaje);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void agregarMascota(ConcursoCanino concursoCanino, Scanner scanner) {
        if (concursoCanino.getMascotas().size() < 8) {
            double valorInscripccion = 70.000;
            int identificador;
            boolean identificadorCorrecto = true;
            do {
                System.out.println("Ingrese la identificacion de la mascota: ");
                identificador = scanner.nextInt();
                scanner.nextLine();
                for (Mascota mascota : concursoCanino.getMascotas()) {
                    if (mascota.getIdentificador() == identificador) {
                        System.out.println("El identificador de la mascota ya fue registrado");
                        identificadorCorrecto = false;
                    }
                }
            } while (!identificadorCorrecto);

            System.out.println("Ingrese el nombre de la mascota: ");
            String nombre = scanner.nextLine();

            int edad;
            do {
                System.out.print("Ingrese la edad de la mascota: ");
                edad = scanner.nextInt();
                if (edad <= 0 || edad >= 6) {
                    System.out.println("Edad no permitida");
                }
            } while (edad <= 0 || edad >= 6);

            int opcion;
            do {
                System.out.println("Ingrese la raza de la mascota: \n1. Labrador\n2. Pitbull\n3. Pastor Aleman\n4. schnauzer");
                opcion = scanner.nextInt();
                scanner.nextLine();
            } while (opcion < 1 || opcion > 4);

            Raza raza = null;
            switch (opcion) {
                case 1:
                    raza = Raza.LABRADOR;
                case 2:
                    raza = Raza.PITBULL;
                case 3:
                    raza = Raza.PASTOR_ALEMAN;
                case 4:
                    raza = Raza.SCHNAUZER;
            }

            System.out.println("Ingrese el nombre del dueño: ");
            String nombreDueno = scanner.nextLine();

            concursoCanino.agregarMascota(valorInscripccion, identificador, nombre, edad, raza, nombreDueno);
        } else {
            System.out.println("El concurso ya tiene el máximo de mascotas registradas");
        }
    }

    public static void calificar(ConcursoCanino concursoCanino, Scanner scanner) {

        System.out.println("Ingrese la identificacion de la mascota: ");
        int identificador = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la calificacion de la mascota: ");
        int calificacion = scanner.nextInt();

        concursoCanino.calificar(identificador, calificacion, scanner, concursoCanino);
        scanner.nextLine();
    }
}
