import java.util.Scanner;

public class NumeroLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;
        String numero;

            System.out.println("Ingrese un número no mayor a 9.223.372.036.854.775.807");
            num = scanner.nextLong();
            numero = Long.toString(num);

        System.out.println(numero.length());
        }
    }

