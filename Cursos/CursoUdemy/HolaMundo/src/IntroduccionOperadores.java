import java.util.Scanner;
public class IntroduccionOperadores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println(++a);
        System.out.println(a);

        a = 6>3? 0:1;
        System.out.println(a);

        if(6>3){ //a = 6>3 ? 1 : 2
            a = 0;
        } else {
            a = 1;
        }
        System.out.println(a);

        System.out.println("Ingrese 1 para seguir 2 para no seguir");
        int opc = scanner.nextInt();

        String vali= opc==1 ? "daniel":"jorge";

        System.out.println(vali);


        System.out.println("Verdad ambas");
        int eda,edad;


        do {
            System.out.println("Usted es mayor de edad: \n1. Si\n2. No");
            eda = scanner.nextInt();
            System.out.println("Ingrese su edad: ");
            edad = scanner.nextInt();
        }while (eda == 1 ^ edad >18); //eda == 1 && edad < 18

        boolean s = vali instanceof String;
        System.out.println("s = " + s);
    }
}

