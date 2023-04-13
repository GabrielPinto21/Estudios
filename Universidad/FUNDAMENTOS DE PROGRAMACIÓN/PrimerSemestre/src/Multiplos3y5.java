import java.util.Scanner;

public class Multiplos3y5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int mult3=0, mult5=0;

        for (int i=1 ; i<=10 ; i++) {
            System.out.println("Ingrese un Número");
            int num = scanner.nextInt();

            if (num % 3 == 0 && num != 0) {
                mult3++;
            }
            if (num % 5 == 0 && num != 0) {
                mult5++;
            }
        }
        System.out.println(mult3);
        System.out.println(mult5);
    }
}
