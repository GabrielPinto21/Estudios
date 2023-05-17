import java.util.Scanner;

public class Capicua5Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        String num1;
        do{
            System.out.println("Ingrese un Número de 5 cifras");
            int num= scanner.nextInt();
            num1= Long.toString(num);
        }while (num1.length() != 5);

            StringBuilder num2 = new StringBuilder(num1);
            StringBuilder reversa = num2.reverse();
            String reversa1 = reversa.toString();

        System.out.println("El inverso del número ingresado es " + reversa1);*/
        int numero;
        do{
            System.out.println("Ingrese un número de 5 dígitos");
            numero = scanner.nextInt();
        } while(numero < 10000 || numero > 99999);

        int reverso=0;
        for(int i = 1; i <= 5; i++){
            reverso *= 10;
            reverso += numero % 10; 
            numero /= 10;
        }

        System.out.println("El reverso del número ingresado es " + reverso);

    }
}
