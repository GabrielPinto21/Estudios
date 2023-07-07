import java.util.Scanner;
public class Tarea19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la 'h': ");
        int n = sc.nextInt();

        int [][] a = new int[n][n];

        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a[i].length; j++){
                if(j == 0 || i == a.length / 2 || (j==a[i].length-1 && i>=a.length/2)){
                    a[i][j] = 1;
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
