import javax.swing.*;
public class SupermercadoJM{
    public static void main(String[] args) {
        String [][] productos = new String[100][3];
        boolean continuar = true;
        int productosIngresados=0, opcion, cantidadProductos;
        double valorTotalVentas;
        final int  NOMBRE=0, VALOR_UNITARIO=1, CANTIDAD=2;

        while(continuar && productosIngresados<=100){
            do{
                 opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que opción desea realizar?\n1. Registrar\n2. consultar\n3. Totalizar\n4. Salir"));
            }while(opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1 -> {// Registra un producto
                    productos[productosIngresados][NOMBRE] = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                    productos[productosIngresados][VALOR_UNITARIO] = JOptionPane.showInputDialog("Ingrese el valor del producto");
                    productos[productosIngresados][CANTIDAD] = JOptionPane.showInputDialog("Ingrese la cantidad del producto");
                    productosIngresados++;
                }
                case 2 -> {// Consultar un producto
                    String consulta = JOptionPane.showInputDialog("Ingrese el nombre del producto a consultar");
                    cantidadProductos = 0;
                    valorTotalVentas = 0;
                    for (int i = 0; i < productosIngresados; i++) {
                        if (consulta.equalsIgnoreCase(productos[i][NOMBRE])) {
                            int cantidadVentas = Integer.parseInt(productos[i][CANTIDAD]);
                            int precioVentas = Integer.parseInt(productos[i][VALOR_UNITARIO]);

                            cantidadProductos += cantidadVentas;
                            valorTotalVentas += cantidadProductos * precioVentas;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La cantidad de productos " + consulta + " a consultar es " + cantidadProductos + " y la venta es de " + valorTotalVentas + " pesos");
                }
                case 3 -> {// Totalizar un producto
                    cantidadProductos = 0;
                    valorTotalVentas = 0;
                    int valorProducto;
                    for (int i = 0; i < productosIngresados; i++) {
                        int cantidadVentas = Integer.parseInt(productos[i][CANTIDAD]);
                        int precioVentas = Integer.parseInt(productos[i][VALOR_UNITARIO]);

                        valorProducto = cantidadVentas * precioVentas;
                        cantidadProductos += cantidadVentas;
                        valorTotalVentas += valorProducto;

                    }
                    JOptionPane.showMessageDialog(null, "El total de recaudo en el SuperMercado JM es de " + valorTotalVentas + "\nLa cantidad de ventas en el SuperMercado JM es de " + cantidadProductos);
                }
                case 4 ->// Salir
                        continuar = false;
                default -> JOptionPane.showMessageDialog(null, "Opción no valida!");
            }
        }
    }
}
