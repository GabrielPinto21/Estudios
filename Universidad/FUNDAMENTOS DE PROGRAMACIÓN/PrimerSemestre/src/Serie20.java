import java.util.Scanner;

public class Serie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int impar;

        do {
            System.out.println("Ingrese un número impar");
            impar = scanner.nextInt();
        }while (impar%2==0);

        for (int i=1 ; i<=40 ; i++){

          if(i%2==1){
              System.out.println(i+impar);
          }
        }
    }
}
