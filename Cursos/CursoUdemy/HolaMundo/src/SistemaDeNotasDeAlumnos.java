import java.util.Scanner;
public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota5=0, notas4=0, notas1=0;
        double nota, promedioMay5=0, promedioInf4=0, promedioTotal=0;

        for(int i = 0 ; i <20 ; i++){
            do {
                System.out.println("Ingrese la nota final en escala de 1 a 7 , estudiante " + (i+1));
                nota = sc.nextDouble();
            }while (nota < 0 || nota > 7);
            if (nota ==0){
                System.out.println("Error, finalizando el programa");
                break;
            }
            promedioTotal += nota;
            if (nota >= 5){
                promedioMay5 += nota;
                nota5++;
            }
            if (nota < 2){
                notas1++;
            }else if (nota <= 4) {
                promedioInf4 += nota;
                notas4++;
            }
        }

        if (nota5 >= 1) {
            System.out.println("El promedio de las notas mayores a 5 es: " + promedioMay5 / nota5);
        } else if (notas4 >=1) {
            System.out.println("El promedio de las notas menores a 4 es: " + promedioInf4/notas4);
        }
        System.out.println("La cantidad de notas 1 es: " + notas1);
        System.out.println("El promedio total es: " + promedioTotal / 20);
    }
}
