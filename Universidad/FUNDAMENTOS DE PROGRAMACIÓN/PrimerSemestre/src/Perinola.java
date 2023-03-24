import javax.swing.*;
import java.util.Scanner;

public class Perinola {
    public static void main(String[] args) {
        int i, num=1;
        String xnum;
        for (i=1 ; i<=23 ; i++ ){
           do {
               if (num>0 && num<=6){
                   xnum = JOptionPane.showInputDialog("Ingrese un número del 1 al 6, estudiante " + i);
               }
               else {
                   xnum = JOptionPane.showInputDialog("Número no valido, repite por favor");
               }

               if (xnum.matches("\\d{1,2}")){
                   num = Integer.parseInt(xnum);
               }
               else {
                   num=7;
               }

           }while (num<1 || num>6);

           switch (num){
                case 1:
                    JOptionPane.showMessageDialog(null,"Pon 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Pon 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Toma 1");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Toma 2");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Pone todo");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Toma todo");
                    break;
            }
        }

    }
}
