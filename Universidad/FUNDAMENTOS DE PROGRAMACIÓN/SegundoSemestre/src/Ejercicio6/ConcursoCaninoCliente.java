package Ejercicio6;

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
            System.out.println("3. Mostrar mascota con el puntaje mas alto");
            System.out.println("4. cantidad de mascotas por raza");
            System.out.println("5. Cantidad de mascotas por edad");
            System.out.println("6. Nombre de las mascotas que estén por encima de determinado puntaje");
            System.out.println("7. Promedio de calificación para una raza específica");
            System.out.println("8. Promedio de calificación de todas las mascotas");
            System.out.println("9. Promedio de edad de las mascotas");
            System.out.println("10. Salir");
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
                    mensaje = concursoCanino.mostrarPuntajeMasAlto(concursoCanino);
                    System.out.println(mensaje);
                    break;
                case 4:
                    mensaje = concursoCanino.mostrarCantidadDeMascotasPorRaza(concursoCanino);
                    System.out.println(mensaje);
                    break;
                case 5:
                    mensaje = concursoCanino.mostrarCantidadDeMascotasPorEdad(concursoCanino);
                    System.out.println(mensaje);
                    break;
                case 6:
                    System.out.println("puntaje que desea saber superiores al puntaje:");
                    int puntajeAConocer = scanner.nextInt();
                    mensaje = concursoCanino.mostrarMascotasSuperioresAlPuntaje(concursoCanino, puntajeAConocer);
                    System.out.println(mensaje);
                    break;
                case 7:
                    int opcionRaza;
                    do {
                        System.out.println("Ingrese la raza de la mascota: \n1. Labrador\n 2. Pitbull\n 3. Pastor Aleman\n 4. schnauzer");
                        opcionRaza = scanner.nextInt();
                    }while (opcionRaza < 1 || opcionRaza > 4);

                    Raza raza= null;
                    switch (opcionRaza){
                        case 1: raza = Raza.LABRADOR;
                        case 2: raza = Raza.PITBULL;
                        case 3: raza = Raza.PASTOR_ALEMAN;
                        case 4: raza = Raza.SCHNAUZER;
                    }
                    mensaje = "El promedio de calificación para la raza seleccionada es " + concursoCanino.calcularPromedioDeLaRaza(concursoCanino, raza);
                    System.out.println(mensaje);
                    break;
                case 8:
                    mensaje = "El promedio de calificación de las mascotas " + concursoCanino.calcularPromedioDeLasMascotas(concursoCanino);
                    System.out.println(mensaje);
                    break;
                case 9:
                    mensaje = "El promedio de la edad de las mascotas " + concursoCanino.calcularPromedioDeLasMascotasPorEdad(concursoCanino);
                    System.out.println(mensaje);
                    break;
                case 10:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    public static void agregarMascota (ConcursoCanino concursoCanino, Scanner scanner){
        if(concursoCanino.getMascotas().size() < 8) {
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

            Mascota mascota = new Mascota(identificador, nombre, edad, raza);

            System.out.println("Ingrese el nombre del dueño: ");
            String nombreDueno = scanner.nextLine();

            Dueno dueno = new Dueno(nombreDueno, mascota);

            mascota.setDueno(dueno);

            concursoCanino.agregarMascota(mascota);
        } else{
            System.out.println("El concurso ya tiene el máximo de mascotas registradas");
        }
    }
    public static void calificar(ConcursoCanino concursoCanino , Scanner scanner){
        for(Mascota mascota : concursoCanino.getMascotas()) {
            int calificacion = 0;
            do{
                System.out.println("Ingrese la calificacion de la mascota con identificador " +
                        mascota.getIdentificador() + " y de nombre " + mascota.getNombre());
                calificacion = scanner.nextInt();
        } while(calificacion < 1 || calificacion > 5);
            mascota.setPuntaje(calificacion);
        }
        scanner.nextLine();
    }
}