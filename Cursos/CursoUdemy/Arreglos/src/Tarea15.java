import java.util.Scanner;
public class Tarea15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;
        double contpositivos=0,contnegativos=0;
        int[] a = new int[7];

        System.out.println("Ingrese 7 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0) {
                negativos += a[i];
                contnegativos++;
            } else if (a[i] > 0) {
                positivos += a[i];
                contpositivos++;
            } else {
                ceros++;
            }
        }
        System.out.println("El promedio de los números positivos es igual a: " + (positivos/contpositivos));
        System.out.println("El promedio de los números negativos es igual a: " + (negativos/contnegativos));
        System.out.println("La cantidad de 0 es igual a: " + ceros);
    }
}
