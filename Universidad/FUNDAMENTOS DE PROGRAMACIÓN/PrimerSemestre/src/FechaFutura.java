import java.util.Scanner;

public class FechaFutura {
    public static void main(String[] args) {
        int i=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato YYYYMMDD");
        int fecha = scanner.nextInt();
        String sfecha = Integer.toString(fecha);
        System.out.println("¿Cuántos días quiere aumentar la fecha?");
        int diasFuturos = scanner.nextInt();


        String sano = sfecha.substring(0, 4);
        int ano = Integer.parseInt(sano);
        String smes = sfecha.substring(4, 6);
        int mes = Integer.parseInt(smes);
        String sdia = sfecha.substring(6,8);
        int dia = Integer.parseInt(sdia);

        while ( i<= diasFuturos){
          if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
              if (dia==31){
                  dia = 0;
                  mes +=1;
              }
              if (mes==13){
                  dia = 0;
                  ano +=1;
                  mes=1;
              }
          }
            if (mes==4 || mes==6 || mes==9 || mes==11){
                if (dia==30){
                    dia = 0;
                    mes +=1;
                }

            }
            if (mes==2){
                if (verificarBisiesto(ano)){
                    if (dia==29){
                        dia = 0;
                        mes +=1;
                    }

                }else {
                    if (dia==28){
                        dia = 0;
                        mes +=1;
                    }
                }
            }
            dia++;
            i++;
        }

        System.out.println("la fecha futura a los " + diasFuturos + "seria: " + dia + "/" + mes + "/" + ano);

    }

    public static boolean verificarBisiesto(int year){
        if(year % 4 == 0){
            return (year % 100 != 0) || year % 400 == 0;
        } else{
            return false;
        }
}
}
