import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {

        int num=0, sum=0, mult=1;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número impar del 1 al 19");
            num= scanner.nextInt();
        }while (num>=20 || num%2==0);

        for (int i=1 ; i<=num ; i++){
            if (i%2==1){
                sum = sum + i;
                mult = mult*i;
            }
        }


        System.out.println(sum);
        System.out.println(mult);
    }
}
