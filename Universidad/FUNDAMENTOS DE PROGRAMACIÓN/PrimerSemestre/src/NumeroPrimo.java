import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        int num=0, cont=0, i=1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        num = scanner.nextInt();

        while (i<=num){
            if (num % i == 0){
                cont= cont+1;
            }
            i++;
        }
        if (cont==2){
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }

    }
}
