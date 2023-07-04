import java.util.Scanner;
public class Tarea13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];

        System.out.println("Ingrese 10 números : ");
        for (int i= 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
        }


        System.out.println("El orden es: ");
        for ( int i= 0 ; i < a.length/2; i++){
            System.out.println(a[a.length-1-i]);
            System.out.println(a[i]);
        }
    }
}
