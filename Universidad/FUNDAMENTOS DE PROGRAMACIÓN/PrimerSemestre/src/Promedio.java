import java.util.Scanner;

public class Promedio{
    public static void main(String[] args) {
        int i=1, sum=0, prom=0;
        Scanner scanner = new Scanner(System.in);

        while (i<=5){
            System.out.println("Ingres un número");
            int num = scanner.nextInt();
            sum = sum + num;
            prom = sum/i;
            i++;
        }
        System.out.println("El promedio es: " + prom);
    }
}
