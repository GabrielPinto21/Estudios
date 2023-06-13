import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) {

        String fechaNacimientoStr = JOptionPane.showInputDialog("Ingrese la fecha en formato yyyy-mm-dd");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaNacimiento = formatoFecha.parse(fechaNacimientoStr);
            Date fechaActual = new Date();
            long diferenciaTiempo = fechaActual.getTime() - fechaNacimiento.getTime();
            long edad = diferenciaTiempo / (1000L * 60 * 60 * 24 * 365);
         JOptionPane.showMessageDialog(null, "La edad es: " + edad + " años.");
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha.");
            e.printStackTrace();
        }
    }
}
