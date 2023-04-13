import java.util.Scanner;
public class NumeroImpar {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = scanner.nextInt();

        if (num % 2 == 1){
            System.out.println("El número " + num + " es impar ");
        }else {
            System.out.println("El número " + num + " no es impar ");
        }
    }
}

