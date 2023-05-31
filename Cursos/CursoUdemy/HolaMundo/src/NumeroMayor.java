import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un número");
        int num2 = sc.nextInt();

        String mayor = num1 > num2 ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.println("Ordenados seria " + mayor);

    }
}
