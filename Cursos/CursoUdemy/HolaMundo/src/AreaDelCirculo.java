import java.util.Random;
import java.util.Scanner;
public class AreaDelCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        double r = sc.nextDouble();
        double area = Math.PI*Math.pow(r,2);
        System.out.printf("El area del circulo es: %.2f" , area);
        System.out.println();

        Random djas = new Random();
        /*
        double area2 = Math.PI*Math.pow((djas.nextDouble()*5),2);
        System.out.printf("area2 = %.2f" , area2);
        System.out.println();
        */
        double area2 = Math.PI*Math.pow((Math.random()*5),2);
        System.out.printf("area2 = %.2f" , area2);
        System.out.println();
    }
}
