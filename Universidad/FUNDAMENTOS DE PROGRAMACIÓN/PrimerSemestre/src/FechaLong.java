import java.util.Scanner;

public class FechaLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia,ano,mes,num;

        do{

            System.out.println("Ingrese el número en formato DDMMYYYY");
            num = scanner.nextInt();

            ano = num%10000;
            dia = num/1000000;
            mes = (num/10000)%100;
        }while(num<=101000 || num>99999999 || dia>31 || mes>=13);


        System.out.println(dia + "/" + mes+ "/" +ano);

}
}
