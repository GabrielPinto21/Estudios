import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("El número " + num + " es par ");
        }else {
            System.out.println("El número " + num + " no es par ");
        }
    }
}
