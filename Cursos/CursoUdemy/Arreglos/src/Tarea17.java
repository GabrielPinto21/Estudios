import java.util.Scanner;
public class Tarea17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[12];
        int [] b = new int[6];

        for (int i = 0; i < a.length; i++){
            do{
                System.out.println("Ingrese 12 números (rango de 1 al 6)");
                a[i] = sc.nextInt();
            }while (a[i] < 1 || a[i] > 6);
            b[a[i]-1]++;
        }

        for ( int i=0; i <b.length; i++){
            System.out.println((i+1) + ": " + "*".repeat(b[i]));
        }
    }
}