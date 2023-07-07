import java.util.Scanner;
public class Tarea18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la 'X': ");
        int n = sc.nextInt();

        char [][] a = new char[n][n];

        for (int i=0; i < a.length; i++){
            for (int j=0; j < a[i].length; j++){
                if (i==j || i == a.length-1-j){
                    a[i][j] = 'X';
                }else {
                    a[i][j]= '_';
                }
            }
        }
        for (int i=0; i < a.length; i++){
            for (int j=0; j < a[i].length; j++){
                System.out.print(a[i][j ] + "\t");
            }
            System.out.println();
        }
    }
}
