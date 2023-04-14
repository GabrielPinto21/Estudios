import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato YYYYMMDD");
        long fecha = scanner.nextLong();
        String sfecha = String.valueOf(fecha);

        long digitos = sfecha.length();

        System.out.println("sfecha = " + digitos);
    }
}
