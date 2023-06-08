import javax.swing.*;

public class MenuOpcionesIterativo {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que operación desea hacer?\n1. Actualizar\n2. Eliminar\n3. Crear\n4. Listar\n5. Salir"));

            switch (opcion) {
                case 1 -> JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                case 2 -> JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                case 3 -> JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
                case 4 -> JOptionPane.showMessageDialog(null, "Usuario listado correctamente");
                case 5 -> JOptionPane.showMessageDialog(null, "Haz salido con exito!");
                default -> JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        }while(opcion != 5 );
    }
}
