import java.util.Scanner;

public class ExamenFinal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double tercerPrevio,notaMayor=0, notaMenor=0;
        int opcion;
        boolean continuar= true;
        final int  previo1=0, previo2=1, quiz1=2, quiz2=3, tallerIndividual=4, tallerGrupal=5, examenFinal=6;

        double [][] calificaciones  = new double[5][7];
        double definitivas [] = new double [1];

       while(continuar) {
           do {
               System.out.println("Que nota desea ingresar:\n1. Previo 1\n2. Previo 2\n3. Quiz 1\n4. Quiz 2\n5. Taller individual\n6. Taller Grupal\n7. Examen Final\n8. Defnitiva\n9. Salir");
               opcion = sc.nextInt();
           } while (opcion < 1 || opcion > 9);

           switch (opcion) {
               case 1 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del previo 1, de la fila  " + (i + 1));
                           calificaciones[i][previo1] = sc.nextDouble();
                       } while (calificaciones[i][previo1] < 1.0 || calificaciones[i][previo1] > 5.0);
                   }
               }
               case 2 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del previo 2, de la fila  " + (i + 1));
                           calificaciones[i][previo2] = sc.nextDouble();
                       } while (calificaciones[i][previo2] < 1.0 || calificaciones[i][previo2] > 5.0);
                   }
               }
               case 3 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del quiz 1, de la fila  " + (i + 1));
                           calificaciones[i][quiz1] = sc.nextDouble();
                       } while (calificaciones[i][quiz1] < 1.0 || calificaciones[i][quiz1] > 5.0);
                   }
               }
               case 4 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del quiz 2, de la fila  " + (i + 1));
                           calificaciones[i][quiz2] = sc.nextDouble();
                       } while (calificaciones[i][quiz2] < 1.0 || calificaciones[i][quiz2] > 5.0);
                   }
               }
               case 5 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del taller Individual, de la fila  " + (i + 1));
                           calificaciones[i][tallerIndividual] = sc.nextDouble();
                       } while (calificaciones[i][tallerIndividual] < 1.0 || calificaciones[i][tallerIndividual] > 5.0);
                   }
               }
               case 6 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del taller Grupal, de la fila  " + (i + 1));
                           calificaciones[i][tallerGrupal] = sc.nextDouble();
                       } while (calificaciones[i][tallerGrupal] < 1.0 || calificaciones[i][tallerGrupal] > 5.0);
                   }
               }
               case 7 -> {
                   for (int i = 0; i < 5; i++) {
                       do {
                           System.out.println("Ingrese la nota del examen Final, de la fila  " + (i + 1));
                           calificaciones[i][examenFinal] = sc.nextDouble();
                       } while (calificaciones[i][examenFinal] < 1.0 || calificaciones[i][examenFinal] > 5.0);
                   }
               }
               case 8 -> {
                   for (int i=0; i < definitivas.length; i++) {
                       tercerPrevio = ((calificaciones[i][quiz1])+(calificaciones[i][quiz2])+(calificaciones[i][tallerIndividual])+(calificaciones[i][tallerGrupal]))/4;
                       definitivas[i] = ((calificaciones[i][previo1]+calificaciones[i][previo2]+tercerPrevio/3)*0.7)+((calificaciones[i][examenFinal])*0.3);
                   }

                   for (int i=0; i< definitivas.length; i++){
                       if(notaMayor <= definitivas[i]){
                           notaMayor = definitivas[i];
                       }
                       if(notaMenor >= definitivas[i]){
                           notaMenor = definitivas[i];
                       }
                   }
               }
               case 9 -> {
                   continuar = false;
               }

           }
       }
        System.out.println("La nota mayor es " + notaMayor + " y la nota menor es " + notaMenor);
    }
}

