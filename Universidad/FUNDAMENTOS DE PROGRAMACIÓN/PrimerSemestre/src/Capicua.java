import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un Número");
        long num= scanner.nextLong();
        String num1= Long.toString(num);
        StringBuilder num2 = new StringBuilder(num1);
        StringBuilder reversa = num2.reverse();
        String reversa1 = reversa.toString();

        if(num1.equals(reversa1)){
            System.out.println("El número " + num1 + " Es número Capicúa");
        }else {
            System.out.println("El número " + num1 + " No es número Capicúa");
        }

    }
}
