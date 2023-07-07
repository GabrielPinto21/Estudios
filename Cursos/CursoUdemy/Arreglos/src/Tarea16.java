import java.util.Scanner;
public class Tarea16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        int num = 0, numOcurrencia=0, maxOcurrencias=0;

        for ( int i = 0; i <a.length; i++){
        do {
            System.out.println("Ingrese 10 números (Rando de 1 a 9): ");
                a[i] = sc.nextInt();
            }while(a[i]<1 || a[i]>9);
        }
        for (int k : a) {
            numOcurrencia = 0;
            for (int i : a) {
                if (k == i) {
                    numOcurrencia++;
                }
            }
            if (numOcurrencia > maxOcurrencias) {
                maxOcurrencias = numOcurrencia;
                num = k;
            }
        }
        System.out.println("La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es " + num);
    }
}
