import javax.swing.*;
import java.text.NumberFormat;

public class TiendaTotto {
    public static void main(String[] args){
        NumberFormat dinero = NumberFormat.getCurrencyInstance();
        int numUsuarios;
        int valorProducto,valorTotal1=0, valorTotal2=0, valorTotal3=0, valorNeto1=0, valorNeto2=0, valorNeto3=0, tipoCliente=1;
        int contadorClienteEmpresarial=0, contadorClienteVIP=0, contadorClienteNuevo = 0, contadorDescuentos1 = 0, contadorDescuentos2 = 0, contadorDescuentos3 = 0;
        byte i;
        do{
            String Usuario = JOptionPane.showInputDialog("Ingrese un número par que sea mayor a 5 y menor o igual a 18");
            if(Usuario.matches("\\d{1,2}")) {
                numUsuarios = Integer.parseInt(Usuario);
                if (numUsuarios <= 5 || numUsuarios > 18 || numUsuarios % 2 != 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            }else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    numUsuarios = 3;
                }
        } while(numUsuarios <= 5 || numUsuarios > 18 || numUsuarios % 2 != 0);

        for(i = 1; i <= numUsuarios; i++){
            do{
                if(tipoCliente < 1 || tipoCliente > 3){
                    JOptionPane.showMessageDialog(null, "Tipo de cliente o valor de producto incorrecto");
                }
                String Producto = JOptionPane.showInputDialog("Ingrese el valor del producto");
                valorProducto = Integer.parseInt(Producto);
                String cliente = JOptionPane.showInputDialog("Ingrese el tipo de cliente:\n 1 para cliente empresarial\n 2 para cliente VIP\n 3 para cliente nuevo");
                tipoCliente = Integer.parseInt(cliente);
            } while(tipoCliente < 1 || tipoCliente > 3);


            switch (tipoCliente) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null,"Estimado cliente el valor de su compra fue de " + dinero.format(0.6 * valorProducto) + ", se aplicó un descuento correspondiente al 40%, osea " + dinero.format(0.4 * valorProducto) + " por ser cliente Empresarial");
                    contadorClienteEmpresarial++;
                    contadorDescuentos1 += 0.4 * valorProducto;
                    valorTotal1 += valorProducto;
                    valorNeto1 += 0.6 * valorProducto;
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null,"Estimado cliente el valor de su compra fue de " + dinero.format(0.75 * valorProducto) + ", se aplicó un descuento correspondiente al 25%, osea " + dinero.format(0.25 * valorProducto) + " por ser cliente VIP");
                    contadorClienteVIP++;
                    contadorDescuentos2 += 0.25 * valorProducto;
                    valorTotal2 += valorProducto;
                    valorNeto2 += 0.75 * valorProducto;
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null,"Estimado cliente el valor de su compra fue de " + dinero.format(0.85 * valorProducto) + ", se aplicó un descuento correspondiente al 15%, osea " + dinero.format(0.15 * valorProducto) + " por ser cliente nuevo");
                    contadorClienteNuevo++;
                    contadorDescuentos3 += 0.15 * valorProducto;
                    valorTotal3 += valorProducto;
                    valorNeto3 += 0.85 * valorProducto;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Los clientes que entraron por cada tipo fueron:\n Empresarial: " + contadorClienteEmpresarial + "\n VIP: " + contadorClienteVIP + "\n Nuevo: " + contadorClienteNuevo);
        JOptionPane.showMessageDialog(null,"El valor recaudado total fue de: " + dinero.format((valorTotal1 + valorTotal2 + valorTotal3)) + "\nEl valor recaudado neto fue de: " + dinero.format((valorNeto1 + valorNeto2 + valorNeto3)) + "\nEl valor de descuentos fue de: " + dinero.format((contadorDescuentos1 + contadorDescuentos2 + contadorDescuentos3)));
    }
}

