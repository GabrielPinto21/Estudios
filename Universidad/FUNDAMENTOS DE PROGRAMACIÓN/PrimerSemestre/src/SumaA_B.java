import java.util.Scanner;

public class SumaA_B {
    public static void main(String[] args) {
        long i, resultado=0, num_A, num_B;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        long numA = scanner.nextLong();
        System.out.println("Ingrese el segundo Número: ");
        long numB = scanner.nextLong();

        if (numA < numB){
            num_A = numA;
            num_B = numB;
        }else{
            num_A=numB;
            num_B=numA;
        }

        for (i=num_A; i<=num_B; i++){
            resultado = resultado+i;
        }
        System.out.println(resultado);
    }
}
