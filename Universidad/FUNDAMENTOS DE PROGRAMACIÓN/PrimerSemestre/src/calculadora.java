import javax.swing.*;
import java.util.Enumeration;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
       int may, men;
        Scanner scanner= new Scanner(System.in);

        String num = JOptionPane.showInputDialog("Ingrese la opción que desea realizar: \n1. Suma \n2. Resta \n3. Multiplicación \n4. División");
        int num3 = Integer.parseInt(num);
        String numa= JOptionPane.showInputDialog("Ingrese un número");
        int num1= Integer.parseInt(numa);
        String numb= JOptionPane.showInputDialog("Ingrese un número");
        int num2= Integer.parseInt(numb);

        if (num1 >= num2){
            may=num1;
            men=num2;
        }else {
            may=num2;
            men=num1;
        }


        switch (num3){
            case 1:
                JOptionPane.showMessageDialog(null, "La suma de " + num1 + "+" + num2 + " es de: " + (num1+num2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"La resta de " + may + "+" + men + " es de: " + (may-men));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La multiplicación de " + num1 + "x" + num2 + "es de: " + (num1*num2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"la división de " + may + "/" + men + "es de: " + (may/men));
                break;
        }
    }
}
