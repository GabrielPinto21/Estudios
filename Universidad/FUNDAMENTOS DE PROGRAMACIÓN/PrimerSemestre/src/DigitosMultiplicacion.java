import java.util.Scanner;

public class DigitosMultiplicacion {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer dígito");
        int num1= scanner.nextInt();

        System.out.println("Ingrese el segundo dígito");
        int num2= scanner.nextInt();

        int resultado= (num1*num2);

        String resu= Integer.toString(resultado);

        System.out.println("La multiplicación de " + num1 + "*" + num2 + "=" + resultado + ", y tiene " + resu.length() + " dígitos");
    }
}
