import java.util.Scanner;

public class NumeroMenorDeMultiplesValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresas la cantidad de números a comparar ");
        int numve = sc.nextInt();

        if (numve < 10 ){
            System.out.println("Debe comparar al menos 10 números");
        }else {
            int menor = Integer.MAX_VALUE;
            int numero;
            for (int i = 0 ; i < numve ; i++){
                System.out.println("ingrese el numero " + (i+1) + ":");
                numero = sc.nextInt();
                menor = ( numero < menor ) ? numero : menor;
            }
            System.out.println("El número menor es: " + menor);
            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
