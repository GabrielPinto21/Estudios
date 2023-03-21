import java.util.Scanner;
public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de la factura o descripción");
        String nombre = scanner.nextLine();

        System.out.println("Precio del producto 1: ");
        Double precio1 = scanner.nextDouble();

        System.out.println("Precio del producto 2: ");
        Double precio2 = scanner.nextDouble();

        double totalBruto = precio1+precio2;
        double impuesto = totalBruto * 0.19;
        double totalFinal = totalBruto + impuesto;

        String detalle = "La factura " + nombre
                + " tiene un un total bruto " + totalBruto + " con un impuesto de " + impuesto + " y el monto total despues del impuesto es de " + totalFinal;

        System.out.println(detalle);
    }
}
