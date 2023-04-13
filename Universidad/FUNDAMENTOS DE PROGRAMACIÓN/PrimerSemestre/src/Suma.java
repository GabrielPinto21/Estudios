import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1= scanner.nextInt();

        System.out.println("Ingrese un número");
        int num2= scanner.nextInt();

        System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1+num2) );
    }
}
