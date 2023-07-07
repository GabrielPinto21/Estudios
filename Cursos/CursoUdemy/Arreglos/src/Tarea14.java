import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[7];
        int max= 0;

        for (int i = 0 ; i < a.length ; i ++) {
            do {
                System.out.println("Ingrese 7 números en el rando de 11 a 99");
                a[i] = sc.nextInt();
            } while (a[i] < 11 || a[i] > 99);
        }

        for (int j : a) {
            max = Math.max(max, j);
        }
        System.out.println("El número más grande es: " + max );
    }
}
