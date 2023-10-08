package Actividad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class EscuelaDeDeportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EscuelaDeDeportes escuela = new EscuelaDeDeportes();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar deportista");
            System.out.println("2. Encontrar futbolista con más goles");
            System.out.println("3. Encontrar basquetbolista con más cestas");
            System.out.println("4. Encontrar atleta con mejor rendimiento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarDeportista(escuela, scanner);
                    break;
                case 2:
                    mostrarFutbolistaConMasGoles(escuela);
                    break;
                case 3:
                    mostrarBasquetbolistaConMasCestas(escuela);
                    break;
                case 4:
                    mostrarAtletaConMejorRendimiento(escuela);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }


    private static void agregarDeportista(EscuelaDeDeportes escuela, Scanner scanner) {

        System.out.print("Ingrese la identificacion del deportista: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del deportista: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese los apellidos del deportista: ");
        String apellidos = scanner.nextLine();

        String genero;
        do {
            System.out.print("Ingrese su género (Masculino(M)/Femenino(F)): ");
            genero = scanner.nextLine().trim().toLowerCase();

            if (!genero.equals("masculino") && !genero.equals("m") && !genero.equals("femenino") && !genero.equals("f")) {
                System.out.println("Género no válido. Por favor, ingrese 'Masculino (M) ' o 'Femenino (F)'.");
            }
        } while (!genero.equals("masculino") && !genero.equals("m") && !genero.equals("femenino") && !genero.equals("f"));

        int edad;
        do{
            System.out.print("Ingrese la edad del deportista: ");
             edad = scanner.nextInt();

            if (edad <= 5 || edad >= 17){
                System.out.println("Edad no permitida");

            }
        }while(edad <= 5 || edad >= 17);

        scanner.nextLine(); // Consumir el salto de línea


        System.out.print("Ingrese el tipo de deportista (Futbolista/Basquetbolista/Atleta): ");
        String tipoDeportista = scanner.nextLine();

        switch (tipoDeportista) {
            case "Futbolista":
                System.out.print("Ingrese la cantidad de goles del futbolista en entrenamientos: ");
                int goles = scanner.nextInt();
                escuela.agregarDeportista(new Futbolista(id, nombre, apellidos, genero, edad, goles));
                break;
            case "Basquetbolista":
                System.out.print("Ingrese la cantidad de cestas del basquetbolista en entrenamientos: ");
                int cestas = scanner.nextInt();
                escuela.agregarDeportista(new Basquetbolista(id, nombre, apellidos, genero, edad, cestas));
                break;
            case "Atleta":
                System.out.print("Ingrese la cantidad de kilómetros recorridos por el atleta en entrenamientos: ");
                float kilometrosRecorridos = scanner.nextFloat();
                escuela.agregarDeportista(new Atleta(id, nombre, apellidos, genero, edad, kilometrosRecorridos));
                break;
            default:
                System.out.println("Tipo de deportista no válido. Debe ser 'Futbolista', 'Basquetbolista' o 'Atleta'.");
        }
    }

    private static void mostrarFutbolistaConMasGoles(EscuelaDeDeportes escuela) {
        Futbolista futbolista = escuela.encontrarFutbolistaConMasGoles();
        if (futbolista != null) {
            System.out.println("Futbolista con más goles:");
            System.out.println("Nombre: " + futbolista.getNombre());
            System.out.println("Goles: " + futbolista.getGoles());
            System.out.println("Categoria: " + futbolista.getCategoria());
        } else {
            System.err.println("No hay futbolistas registrados.");
            System.out.println();
        }
    }

    private static void mostrarBasquetbolistaConMasCestas(EscuelaDeDeportes escuela) {
        Basquetbolista basquetbolista = escuela.encontrarBasquetbolistaConMasCestas();
        if (basquetbolista != null) {
            System.out.println("Basquetbolista con más cestas:");
            System.out.println("Nombre: " + basquetbolista.getNombre());
            System.out.println("Cestas: " + basquetbolista.getCestas());
            System.out.println("Categoria: " + basquetbolista.getCategoria());
        } else {
            System.err.println("No hay basquetbolistas registrados.");
            System.out.println();
        }
    }

    private static void mostrarAtletaConMejorRendimiento(EscuelaDeDeportes escuela) {
        Atleta atleta = escuela.encontrarAtletaConMejorRendimiento();
        if (atleta != null) {
            System.out.println("Atleta con mejor rendimiento:");
            System.out.println("Nombre: " + atleta.getNombre());
            System.out.println("Kilómetros recorridos: " + atleta.getKilometrosRecorridos());
            System.out.println("Categoria: " + atleta.getCategoria());
        } else {
            System.err.println("No hay atletas registrados.");
            System.out.println();
        }
    }

    private List<Deportista> deportistas;

    public EscuelaDeDeportes() {
        deportistas = new ArrayList<>();
    }

    public void agregarDeportista(Deportista deportista) {
        deportistas.add(deportista);
    }

    public Futbolista encontrarFutbolistaConMasGoles() {
        Futbolista futbolistaConMasGoles = null;
        int maxGoles = -1;

        for (Deportista deportista : deportistas) {
            if (deportista instanceof Futbolista) {
                Futbolista futbolista = (Futbolista) deportista;
                if (futbolista.getGoles() > maxGoles) {
                    maxGoles = futbolista.getGoles();
                    futbolistaConMasGoles = futbolista;
                }
            }
        }

        return futbolistaConMasGoles;
    }

    public Basquetbolista encontrarBasquetbolistaConMasCestas() {
        Basquetbolista basquetbolistaConMasCestas = null;
        int maxCestas = -1;

        for (Deportista deportista : deportistas) {
            if (deportista instanceof Basquetbolista) {
                Basquetbolista basquetbolista = (Basquetbolista) deportista;
                if (basquetbolista.getCestas() > maxCestas) {
                    maxCestas = basquetbolista.getCestas();
                    basquetbolistaConMasCestas = basquetbolista;
                }
            }
        }

        return basquetbolistaConMasCestas;
    }

    public Atleta encontrarAtletaConMejorRendimiento() {
        Atleta atletaConMejorRendimiento = null;
        double maxKilometros = -1;

        for (Deportista deportista : deportistas) {
            if (deportista instanceof Atleta) {
                Atleta atleta = (Atleta) deportista;
                if (atleta.getKilometrosRecorridos() > maxKilometros) {
                    maxKilometros = atleta.getKilometrosRecorridos();
                    atletaConMejorRendimiento = atleta;
                }
            }
        }

        return atletaConMejorRendimiento;
    }
}
