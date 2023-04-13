import java.util.Scanner;

public class PromedioSuma10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum=0, prom;

    for (int i=1 ; i<=10 ; i++){
        System.out.println("ingrese un número");
        int num = scanner.nextInt();
        sum = sum + num;
    }
        prom = sum/10;
        System.out.println(sum);
        System.out.println(prom);
    }
}
