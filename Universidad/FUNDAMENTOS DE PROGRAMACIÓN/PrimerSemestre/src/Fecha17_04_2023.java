import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha17_04_2023 {
    public static void main(String[] args) {

        int fecha1,diaNaci, mesNaci, anoNaci, anoEdad = 0, mesEdad = 0, diaEdad = 0, anoActual, mesActual, diaActual;
        boolean repetir = true;

        Scanner scanner = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();

        do {
            anoActual = fecha.get(Calendar.YEAR);
            mesActual = fecha.get(Calendar.MONTH);
            diaActual = fecha.get(Calendar.DAY_OF_MONTH);

            System.out.println("Ingrese su fecha de nacimiento en formato DDMMAAAA: ");
            fecha1 = scanner.nextInt();

            mesNaci = ((fecha1 / 10000) % 100);
            diaNaci = (fecha1 / 1000000);
            anoNaci = (fecha1 % 10000);

            mesActual++;

            if (anoNaci >= anoActual) {
                if (mesNaci < mesActual) {
                    repetir = false;
                } else if (mesNaci == mesActual) {
                    if (diaNaci <= diaActual) {
                        repetir = false;
                    } else {
                        repetir = true;
                    }
                } else if (mesNaci > mesActual) {
                    repetir = true;
                }
            } else {
                repetir = false;
            }
        } while ((fecha1 <= 101000) || (fecha1 > 99999999) || (diaNaci > 31) || (mesNaci > 12) || (anoNaci > anoActual) || repetir);

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
                } else if(diaActual == diaNaci){
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
                } else if(diaActual == diaNaci){
                    anoEdad = (anoActual - anoNaci) - 1;
                    mesEdad = (mesActual - mesNaci) + 12;
                }
            } else if(mesActual == mesNaci){
                if(diaActual > diaNaci){
                    anoEdad = anoActual - anoNaci;
                    diaEdad= diaActual - diaNaci;
                } else if(diaActual < diaNaci){
                    anoEdad = (anoActual - anoNaci) - 1;
                    mesEdad = 11;
                    diaEdad= (diaActual - diaNaci) + 31;
                } else if(diaActual == diaNaci){
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
                } else if (diaActual == diaNaci) {
                    mesEdad = mesActual - mesNaci;
                }
            } else if (mesActual == mesNaci) {
                if (diaActual > diaNaci) {
                    diaEdad = diaActual - diaNaci;
                }
            }
        }
        System.out.println("Su edad es de " + anoEdad + " años " + mesEdad + " meses y " + diaEdad + " dias");
    }
}
