import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sfecha1;
        int rojo=0, azul=0, verde=0, fecha1, dia, mes, ano, contCarros=0, contMotos=0, ingresoTotal=0, ingresoMotos=0, ingresoCarros=0, ingresoCucuta=0, tipoVehiculo ;
        boolean FinJornada = false;

        while (!FinJornada) {
            do {
                System.out.print("Ingrese fecha actual en formato DDMMAAAA: ");
                sfecha1 = scanner.nextLine();
                if (sfecha1.matches("\\d{7,8}")) {
                    fecha1 = Integer.parseInt(sfecha1);
                } else {
                    System.out.println("Fecha inválida");
                    fecha1 = 203;
                }

                mes = ((fecha1 / 10000) % 100);
                dia = (fecha1 / 1000000);
                ano = (fecha1 % 10000);

            } while (!(sfecha1.length() == 8) || (dia > 30) || (mes > 12) || (ano > 2023));

            System.out.println("Ingrese tipo de vehiculo:\n1. Carro \n2. Moto");
            tipoVehiculo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese Nombre:");
            scanner.nextLine();
            System.out.println("Número de Placa");
            scanner.nextLine();
            System.out.println("Tipo de color de vehiculo:\n1. Rojo\n2. Verde\n3. Azul\n4. Blanco\n5. Plata\n6. Negro\n7. Vinotinto");
            int colorCarro = scanner.nextInt();
            System.out.println("Lugar de matrícula del vehiculo:\n1. Cúcuta\n2. Villa del Rosario\n3. Pamplona\n4. Bogotá\n5. Bogotá\n6. Bucaramanga");
            int registro = scanner.nextInt();
            System.out.println("Tiempo de duración en el estacionamiento (Horas)");
            int tiempo = scanner.nextInt();

            if (tipoVehiculo==1){
                System.out.println("Tipo de vehiculo es: Carro");
                System.out.println("El valor a pagar es: " + (tiempo*3000));
                contCarros++;
                ingresoCarros+=tiempo*3000;
            } else if (tipoVehiculo==2) {
                System.out.println("Tipo de vehiculo es: Motocicleta");
                System.out.println("El valor a pagar es: " + (tiempo*2100));
                contMotos++;
                ingresoMotos+=tiempo*2100;
                switch (colorCarro){
                    case 1:
                        rojo++;
                        break;
                    case 2:
                        verde++;
                        break;
                    case 3:
                        azul++;
                        break;
                }
            } else {
                System.out.println("Color de vehiculo incorrecto");
            }
            if (registro==1){
                ingresoCucuta++;
            }
            System.out.println("");
            System.out.println("********************************************************************************************************************************************************************");
            System.out.println("");
            int opcion;
            do {
                System.out.println("Ingrese\n1. Registrar un vehículo \n2. Finalizar la jornada laboral.");
                opcion = scanner.nextInt();
                scanner.nextLine();
            }while (opcion<1 || opcion>2);
            if (opcion==2){
                FinJornada= true;
            }
            System.out.println("");
            System.out.println("********************************************************************************************************************************************************************");
            System.out.println("");
        }

        System.out.println("La cantidad de carros que ingresaros es: " + contCarros);
        System.out.println("La cantidad de motos que ingresaros es: " + contMotos);
        System.out.println("La cantidad de carros rojos que ingresaron son: " + rojo);
        System.out.println("La cantidad de carros azules que ingresaron son: " + azul);
        System.out.println("La cantidad de carros verdes que ingresaron son: " + verde);
        System.out.println("El ingreso total de efectivo de carros es: " + ingresoCarros);
        System.out.println("El ingreso total de efectivo de motos es: " + ingresoMotos);
        System.out.println("El ingreso total de efectivo es: " + (ingresoCarros+ingresoMotos));
        System.out.println("La cantidad de placas matriculadas en cucuta es: " + ingresoCucuta);

    }
}
