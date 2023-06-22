import java.util.Scanner;

public class ParqueDelCafePrevio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int acrofobiaAtracciones, restriccion=0, ticket=0;

        System.out.println("Ingrese el número de atracciones mecánicas disponibles");
        int atracciones = scanner.nextInt();
        System.out.println("Ingrese la cantidad de visitantes que se espera atender en el día");
        int personas = scanner.nextInt();
        scanner.nextLine();

        int[] documento = new int[personas];
        int[] altura = new int[personas];
        int[] edad = new int[personas];

        for (int i =0 ; i<atracciones ; i++){
            System.out.println("--------------------------------------------------------------");
            System.out.println("atracción número " + (i+1));
            System.out.println("--------------------------------------------------------------");
            System.out.println("Nombre de la atracción mecánica");
            String nombreAtracciones = scanner.nextLine();
            do{
                System.out.println("Ingrese nivel de acrofobia :\n1. Bajo\n2. Medio\n3. Alto");
                acrofobiaAtracciones = scanner.nextInt();
            }while(acrofobiaAtracciones < 1 || acrofobiaAtracciones > 3 );
            System.out.println("Ingrese la altura miníma permitida");
            int alturaMinAtraccion = scanner.nextInt();

            for (int j=0 ; j < personas ; j++){
                if (i==0){
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Persona " + " #" + (j+1));
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Ingrese su número de documento");
                    documento[j] = scanner.nextInt();
                    System.out.println("Ingrese su altura en cm");
                    altura[j] = scanner.nextInt();
                    System.out.println("Ingrese su edad");
                    edad[j] = scanner.nextInt();
                    scanner.nextLine();
                }

                boolean permitido= ((acrofobiaAtracciones != 3) || (edad[j] >= 18)) && (edad[j] <= 40);
                if (altura[j] < alturaMinAtraccion){
                    permitido = false;
                }

                if(permitido){

                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("Identificación  " + documento[j]);
                    System.out.println("Bienvenido al parque del café, atracción: " + nombreAtracciones);
                    System.out.println("Ticket #" + (j+1));
                    System.out.println("--------------------------------------------------------------------");
                    ticket++;
                }else {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Estimado Cliente, usted no es cumple con los requisitos para esta atracción");
                    System.out.println("--------------------------------------------------------------------------------");

                    restriccion++;
                }
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("FIN DE LA JORNADA");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Numero de Tickets entregados: " + ticket);
        System.out.println("El numero de personas restinguidas es: " + restriccion);
        System.out.println("--------------------------------------------------------------");
    }
}
