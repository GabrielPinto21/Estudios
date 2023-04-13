public class imprimirNumerosPrimos {
    public static void main(String[] args) {
        int i = 1, cont = 0;
        for (int num = 10; num <= 99; num++) {
            while (i <= num) {
                if (num % i == 0) {
                    cont = cont + 1;
                }
                i++;
            }
            i = 1;
            if (cont == 2) {
                System.out.println(num);
            }
            cont=0;

        }


    }
}
