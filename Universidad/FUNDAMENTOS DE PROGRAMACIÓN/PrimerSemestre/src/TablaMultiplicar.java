import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        int i=1;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = scanner.nextInt();

        while (i <= 10){
            System.out.println(num + "x" + i + "=" + (num*i));
            i++;
        }
    }
}
