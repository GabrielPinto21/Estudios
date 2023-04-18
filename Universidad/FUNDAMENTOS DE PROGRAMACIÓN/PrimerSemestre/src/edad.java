import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String fechaActual = dateTime.format(formatters);

        String sdiaActual = fechaActual.substring(0, 2);
        int diaActual = Integer.parseInt(sdiaActual);
        String smesActual = fechaActual.substring(3, 5);
        int mesActual = Integer.parseInt(smesActual);
        String sanoActual = fechaActual.substring(6, 10);
        int anoActual = Integer.parseInt(sanoActual);

        System.out.println("Hoy es " + diaActual + "/" + mesActual + "/" + anoActual);

        int dia,ano,mes,num,diaEdad=0,mesEdad=0,anoEdad=0;

        boolean repetir = true;

        do{
            repetir = true;
            System.out.println("Ingrese el número en formato DDMMYYYY");
            num = scanner.nextInt();

            ano = num%10000;
            dia = num/1000000;
            mes = (num/10000)%100;

            if(ano>=anoActual){
                if(mes<mesActual){
                    repetir = false;
                } else if(mes==mesActual){
                    if(dia <= diaActual){
                        repetir = false;
                    } else{
                        repetir = true;
                    }
                } else if(mes>mesActual){
                    repetir = true;
                }
            }

        }while(num<=101000 || num>99999999 || dia>31 || mes>=13 || ano>anoActual || repetir);

        if(mesActual > mes){
            anoEdad = anoActual - ano;
            mesEdad = mesActual - mes;
            diaEdad = diaActual - dia;
        } else if(mesActual == mes){
            if(diaActual >= dia){
                anoEdad = anoActual - ano;
                mesEdad = mesActual - mes;
                diaEdad = diaActual - dia;
            } else{
                anoEdad = (anoActual - ano) - 1;
                mesEdad = (12-mes)+(mesActual-1);
                diaEdad = (31 - dia) + (diaActual-1);
            }
        } else if(mesActual < mes){
            anoEdad = (anoActual - ano) - 1;
            mesEdad = (12-mes)+(mesActual-1);
            diaEdad = (31-dia)+(diaActual-1);
        }
        System.out.println("Su edad es " + anoEdad + " años, " + mesEdad + " meses, " + diaEdad + " días");
}
}

