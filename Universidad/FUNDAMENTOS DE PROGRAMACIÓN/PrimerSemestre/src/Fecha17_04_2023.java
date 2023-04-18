import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha17_04_2023 {
    public static void main(String[] args) {

        int fecha1, dia1, mes1, ano1, anoEdad = 0, mesEdad = 0, diaEdad = 0;


        Scanner scanner = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();

        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        do {
            System.out.println("Ingrese su fecha de nacimiento en formato DDMMAAAA: ");
            fecha1 = scanner.nextInt();

            dia1 = (fecha1 / 1000000);
            mes1 = ((fecha1 / 10000) % 100);
            ano1 = (fecha1 % 10000);

            mes++;

        } while ((fecha1 <= 101000) || (fecha1 > 99999999) || (dia1 > 31) || (mes1 > 12) || (ano1 > ano));

        if (mes > mes1) {
            anoEdad = ano - ano1;
            mesEdad = mes - mes1;
            diaEdad = dia - dia1;
        } else if (mes == mes1) {
            if (dia >= dia1) {
                anoEdad = ano - ano1;
                mesEdad = mes - mes1;
                diaEdad = dia - dia1;
            } else {
                anoEdad = (ano - ano1) - 1;
                mesEdad = (12 - mes1) + (mes - 1);
                diaEdad = (31 - dia1) + (dia - 1);
            }
        } else if (mes < mes1) {
            anoEdad = (ano - ano1) - 1;
            mesEdad = (12 - mes1) + (mes - 1);
            diaEdad = (31 - dia1) + (dia - 1);
        }
        System.out.println(mes+1 + " " + dia + " " +  ano );
        System.out.println(" La edad de la persona es " + anoEdad + " años, " + mesEdad + " meses" + " y " + diaEdad + " dias");

    }
}
