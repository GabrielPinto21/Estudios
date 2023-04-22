import java.util.Scanner;

public class PrimerPrevio {
    public static void main(String[] args) {
        int fecha1, mes, dia, ano, peso,costo = 0, pais1, fechaentrega=0;
        boolean pais2=true;
        String sfecha1,pais="", nomremi, nomdest;

        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("Ingrese fecha actual en formato DDMMAAAA: ");
            sfecha1 = scanner.nextLine();
            if(sfecha1.matches("\\d{7,8}")){
                fecha1 = Integer.parseInt(sfecha1);
            } else{
                System.out.println("Fecha inválida");
                fecha1 = 203;
            }

            mes = ((fecha1 / 10000) % 100);
            dia = (fecha1 / 1000000);
            ano = (fecha1 % 10000);

        } while (!(sfecha1.length() == 8)  || (dia > 30) || (mes > 12) || (ano>2023));

        System.out.println("Ingrese el nombre del remitente: ");
        nomremi = scanner.nextLine();

        System.out.println("Ingrese el nombre del destinatario: ");
        nomdest = scanner.nextLine();

        System.out.println("Ingrese el peso del paquete en Kg: ");
        peso = scanner.nextInt();

        System.out.println("Ingrese la zona de ubicación:\n1. Argentina\n2. Bolivia\n3. Costa Rica\n4. Chile\n5. Cuba ");
        pais1 = scanner.nextInt();

        if (peso>10){
            System.out.println("Por motivos de logística y seguridad se rechaza el envío del paquete");
        }else {
            switch (pais1) {
                case 1 -> {
                    pais = "Argentina";
                    fechaentrega = 4;
                    costo = 25;
                }
                case 2 -> {
                    pais = "Bolivia";
                    fechaentrega = 2;
                    costo = 5;
                }
                case 3 -> {
                    pais = "Costa Rica";
                    fechaentrega = 3;
                    costo = 19;
                }
                case 4 -> {
                    pais = "Chile";
                    fechaentrega = 5;
                    costo = 22;
                }
                case 5 -> {
                    pais = "Cuba";
                    fechaentrega = 7;
                    costo = 21;
                }
                default -> pais2 = false;
            }

            int i=1;
            while (i<=fechaentrega){
                if (dia>30){
                    mes++;
                    dia =1;
                }
                if (mes>12){
                    ano++;
                    mes=1;
                }
                dia++;
                i++;
            }

            if (pais2){
                System.out.println("El nombre del remitente es : " + nomremi);
                System.out.println("El nombre del destinatario es : " + nomdest);
                System.out.println("la fecha tentativa en la que se realizará la entrega del producto es : " + dia + "/" + mes + "/" + ano);
                System.out.println("La zona de Ubicación de la entrega es " + pais);
                System.out.println("El valor a pagar es " + (peso*costo) + " Euros ");
            }else {
                System.out.println("Pais incorrecto");
            }
        }

    }
}
