import java.sql.SQLOutput;
import java.util.Scanner;

public class Multiplos8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuantos multiplos desea saber");
        int num = scanner.nextInt();

        for ( int i=1 ; i<=num ; i++){
            System.out.println(8*i);
        }
    }
}
