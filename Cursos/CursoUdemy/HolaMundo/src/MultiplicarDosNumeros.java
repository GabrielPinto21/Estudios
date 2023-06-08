import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primero numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        boolean positivo1 = num1 > -1;
        boolean positivo2 = num2 > -1;

        int producto=0;

        for (int i = 0 ; i < Math.abs(num1) ; i++){
            producto += Math.abs(num2);
        }

        if (positivo1 ^ positivo2) {
            System.out.println("La multipliacción de " + num1 + " y " + num2 + " es: " + -producto);
        } else {
            System.out.println("La multipliacción de " + num1 + " y " + num2 + " es: " + producto);
        }
    }
}
