import java.util.Scanner;

public class ExamenFinal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double previo3, notaMayor = 0, notaMenor = 5;
        int opcion;
        boolean continuar = true;
        double[][] calificaciones = new double[5][7];
        double[] definitivas = new double[5];

        while (continuar) {
            do {
                System.out.println("Qué nota desea ingresar:\n1. Ingresar Notas\n2. Definitivas\n3. Buscar Nota\n4. Salir");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < calificaciones.length; i++) {
                        for (int j = 0; j < calificaciones[0].length; j++) {
                            do {
                                System.out.println("Ingrese la calificación para la materia " + (i + 1) + " en la columna " + (j + 1) + ": ");
                                double calificacion = sc.nextDouble();

                                if (calificacion < 1.0 || calificacion > 5.0) {
                                    System.err.println("La nota ingresada es incorrecta, debe de estar en el rando de 1.0 a 5.0");
                                }
                                calificaciones[i][j] = calificacion;

                            } while (calificaciones[i][j] < 1 || calificaciones[i][j] > 5);
                        }
                    }
                }
                case 2 -> {
                    for (int i = 0; i < calificaciones.length; i++) {
                        double quiz1 = calificaciones[i][2];
                        double quiz2 = calificaciones[i][3];
                        double tallerIndividual = calificaciones[i][4];
                        double tallerGrupal = calificaciones[i][5];
                        double examenFinal = calificaciones[i][6];
                            previo3 = (quiz1 + quiz2 + tallerIndividual + tallerGrupal ) / 4;
                            definitivas[i] = ((calificaciones[i][0]+calificaciones[i][1]+previo3)/3*0.7)+(examenFinal*0.3);

                        if (definitivas[i] < notaMenor  ) {
                            notaMenor = definitivas[i];
                        }
                            if (definitivas[i] > notaMayor ) {
                                notaMayor = definitivas[i];
                            }
                    }
                    System.out.println("Las notas definitivas son: ");
                    for (int i=0 ; i< definitivas.length; i ++){
                        System.out.printf("Nota de la materia " + (i+1) + ": %.2f" ,  definitivas[i]);
                        System.out.println();
                    }
                    System.out.printf("La nota mas alta es: %.2f", notaMayor);
                    System.out.println();
                    System.out.printf("La nota mas baja es: %.2f",  notaMenor);
                    System.out.println();
                }
                case 3 -> {
                    boolean valoresValidos = false;
                    do {
                        System.out.println("Ingrese la posición de la fila que desea saber");
                        int fila = sc.nextInt();

                        System.out.println("Ingrese la posición de la columna que desea saber");
                        int columna = sc.nextInt();

                        if (fila < 1 || fila > calificaciones.length || columna < 1 || columna > calificaciones[0].length) {
                            System.err.println("Error: La fila y columna ingresadas no son válidas.");
                        } else {
                            double nota = calificaciones[fila - 1][columna - 1];
                            System.out.println("La nota es: " + nota);
                            valoresValidos = true;
                        }
                    } while (!valoresValidos);
                }
                case 4 -> continuar = false;
            }
        }
    }
}