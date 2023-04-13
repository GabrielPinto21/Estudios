import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1= scanner.nextInt();

        System.out.println("Ingrese un número");
        int num2= scanner.nextInt();

        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + (num1*num2) );

    }
}
