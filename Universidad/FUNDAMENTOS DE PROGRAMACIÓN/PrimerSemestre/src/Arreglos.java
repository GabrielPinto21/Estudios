import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        IngresarNumero(numeros);
        ImprimirNumeros(numeros);
        Primos(numeros);
    }
    public static void IngresarNumero (int[] lista){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese el " + (i + 1) + " número");
            lista[i] = sc.nextInt();
        }
    }
    public static void ImprimirNumeros (int[] lista){
        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " " );
        }
        System.out.println();
        }
    public static void Primos (int[] lista){
        int cont, primos = 0;
        for (int i = 0; i < lista.length; i++) {
            cont = 0;
            for (int j = 1; j < lista.length; j++) {
                if (lista[i] % j == 0) {
                    cont += 1;
                }
            }
            if (cont == 2) {
                primos++;
            }
        }
        System.out.println("Hay " + primos + " numeros primos" );
    }
}

