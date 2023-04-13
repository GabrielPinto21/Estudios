import java.util.Scanner;

public class FechaLong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digito1, digito2, digito3, digito4, digito5, digito6, digito7, digito8;
        int i,num,numVerificar;
        int dia,mes,ano,num2;

        do{
            digito1=0;
            digito2=0;
            digito3=0;
            digito4=0;
            digito5=0;
            digito6=0;
            digito7=0;
            digito8=0;
            i=8;

            System.out.println("Ingrese el número DDMMYYYY");
            num = scanner.nextInt();
            numVerificar = num;
            num2 = num;

            for(int j=1; j<=8; j++){
                numVerificar = numVerificar/10;
            }

            while(num!=0){
                switch(i){
                    case 1:
                        digito1 = num%10;
                        break;
                    case 2:
                        digito2 = num%10;
                        break;
                    case 3:
                        digito3 = num%10;
                        break;
                    case 4:
                        digito4 = num%10;
                        break;
                    case 5:
                        digito5 = num%10;
                        break;
                    case 6:
                        digito6 = num%10;
                        break;
                    case 7:
                        digito7 = num%10;
                        break;
                    case 8:
                        digito8 = num%10;
                        break;
                }
                num = num/10;
                i--;
            }
            dia = (digito1*10)+digito2;
            mes = (digito3*10)+digito4;
            ano = (digito5*1000)+(digito6*100)+(digito7*10)+digito8;

        }while(numVerificar!=0 || num2<1010000 || dia>=32 || mes>=13);


        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
