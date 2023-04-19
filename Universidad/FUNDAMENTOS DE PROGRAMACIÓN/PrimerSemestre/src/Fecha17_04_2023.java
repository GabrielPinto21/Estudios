import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha17_04_2023 {
    public static void main(String[] args) {

        int fecha1,diaNaci, mesNaci, anoNaci, anoEdad = 0, mesEdad = 0, diaEdad = 0, anoActual, mesActual, diaActual;
        boolean repetir;
        String sfecha1;

        Scanner scanner = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();

        do {
            anoActual = fecha.get(Calendar.YEAR);
            mesActual = fecha.get(Calendar.MONTH);
            diaActual = fecha.get(Calendar.DAY_OF_MONTH);

            System.out.println("Ingrese su fecha de nacimiento en formato DDMMAAAA: ");
            sfecha1 = scanner.nextLine();
            if(sfecha1.matches("\\d{7,8}")){
                fecha1 = Integer.parseInt(sfecha1);
            } else{
                System.out.println("Fecha inválida");
                fecha1 = 203;
            }

            mesNaci = ((fecha1 / 10000) % 100);
            diaNaci = (fecha1 / 1000000);
            anoNaci = (fecha1 % 10000);

            mesActual++;

            if (anoNaci >= anoActual) {
                if (mesNaci < mesActual) {
                    repetir = false;
                } else if (mesNaci == mesActual) {
                    repetir = diaNaci > diaActual;
                } else {
                    repetir = true;
                }
            } else {
                repetir = false;
            }
        } while (!(sfecha1.length() == 8) || (fecha1 <= 101000) || (fecha1 > 99999999) || (diaNaci > 31) || (mesNaci > 12) || (anoNaci > anoActual) || repetir);

        if (anoActual > anoNaci){
            if(mesActual > mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = mesActual - mesNaci;
                    diaEdad = diaActual - diaNaci;
                } else if(diaActual < diaNaci){
                    anoEdad = anoActual - anoNaci;
                    mesEdad = (mesActual - mesNaci) - 1;
                    diaEdad = (31-diaNaci)+diaActual;
                } else {
                    anoEdad = anoActual - anoNaci;
                    mesEdad = mesActual - mesNaci;
                }
            } else if(mesActual < mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = (anoActual-anoNaci)-1;
                    mesEdad = (mesActual - mesNaci) + 12;
                    diaEdad = diaActual - diaNaci;
                } else if(diaActual < diaNaci){
                    anoEdad = (anoActual - anoNaci)-1;
                    mesEdad = (mesActual - mesNaci) + 12;
                    diaEdad = diaNaci - diaActual;
                } else {
                    anoEdad = (anoActual - anoNaci) - 1;
                    mesEdad = (mesActual - mesNaci) + 12;
                }
            } else {
                if(diaActual > diaNaci){
                    anoEdad = anoActual - anoNaci;
                    diaEdad= diaActual - diaNaci;
                } else if(diaActual < diaNaci){
                    anoEdad = (anoActual - anoNaci) - 1;
                    mesEdad = 11;
                    diaEdad= (diaActual - diaNaci) + 31;
                } else {
                    anoEdad = anoActual - anoNaci;
                }
            }
        }
        if (anoActual == anoNaci) {
            if (mesActual > mesNaci) {
                if (diaActual > diaNaci) {
                    mesEdad = mesActual - mesNaci;
                    diaEdad = diaActual - diaNaci;
                } else if (diaActual < diaNaci) {
                    mesEdad = (mesActual - mesNaci)-1;
                    diaEdad = (31-diaNaci) + diaActual;
                } else {
                    mesEdad = mesActual - mesNaci;
                }
            } else {
                if (diaActual > diaNaci) {
                    diaEdad = diaActual - diaNaci;
                }
            }
        }

        if (mesEdad==1 || mesEdad==3 || mesEdad==5 || mesEdad==7 || mesEdad==8 || mesEdad==10 || mesEdad==12){
            if (diaEdad==31){
                diaEdad = 0;
                mesEdad +=1;
            }
            if (mesEdad==13){
                anoEdad +=1;
                mesEdad=1;
            }
        }
        if (mesEdad==4 || mesEdad==6 || mesEdad==9 || mesEdad==11){
            if (diaEdad==30){
                diaEdad = 0;
                mesEdad +=1;
            }

        }
        if (mesEdad==2){
            if (FechaFutura.verificarBisiesto(anoEdad)){
                if (diaEdad==29){
                    diaEdad = 0;
                    mesEdad +=1;
                }

            }else {
                if (diaEdad==28){
                    diaEdad = 0;
                    mesEdad +=1;
                }
            }
        }
        if(mesEdad > 11){
            anoEdad++;
            mesEdad = 0;
        }

        System.out.println("Su edad es de " + anoEdad + " años " + mesEdad + " meses y " + diaEdad + " dias");
    }
}
