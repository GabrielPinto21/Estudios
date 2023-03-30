import java.util.Scanner;

public class NumeroLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Número");
        String numero = scanner.nextLine();

        System.out.println(Integer.toString(Integer.parseInt(numero)).length());


        }
    }

