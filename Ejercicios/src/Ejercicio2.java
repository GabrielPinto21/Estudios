import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMayor;

        System.out.println("Ingrese el primer número");
        int num1= sc.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2= sc.nextInt();

        if (num1 > num2){
            numMayor = num1;
            System.out.println("El numero mayor es: " + numMayor);
        }else if(num2 > num1){
            numMayor = num2;
            System.out.println("El numero mayor es: " + numMayor);
        }else{
            System.out.println("Los dos números son iguales");
        }

    }
}
