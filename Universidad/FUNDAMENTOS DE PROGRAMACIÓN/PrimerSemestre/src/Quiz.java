import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Ingrese 20 números");
        num = scanner.nextInt();

        for (int i=1; i<=19; i++){
            int ent = scanner.nextInt();
            if (ent < num){
                num = ent;
            }
            if (num%3== 0){
                System.out.println("El menor de los 20 números es " + num + " y es multiplo de 3");
            }else{
                System.out.println("El menor de los 20 números es " + num + " y no es multiplo de 3");
            }
        }
    }
}
