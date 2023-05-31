import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomb1 = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");
        String nomb2 = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");
        String nomb3 = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");

        String largo = (nomb1.split(" ")[0].length() < nomb2.split(" ")[0].length()) ? nomb2 : nomb1;
        largo = (nomb3.split(" ")[0].length() < largo.split(" ")[0].length()) ? largo: nomb3;


        System.out.println(nomb1.split(" ")[0].length());
        System.out.println(nomb2.split(" ")[0].length());
        System.out.println(nomb3.split(" ")[0].length());

        System.out.println("La persa con el nombre mas largo es ".concat(" ").concat(largo));

    }
}
