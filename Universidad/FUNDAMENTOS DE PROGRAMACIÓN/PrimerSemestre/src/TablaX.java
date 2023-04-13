import java.util.Scanner;

public class TablaX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuantos multiplos desea saber");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(num*i);
        }
    }
}
