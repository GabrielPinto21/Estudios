import javax.swing.*;
public class NombreMasLargo {
    public static void main(String[] args) {

        String nomb1 = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");
        String nomb2 = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");
        String nomb3 = JOptionPane.showInputDialog("Ingrese sus nombres y apellidos");

        String largo = (nomb1.split(" ")[0].length() < nomb2.split(" ")[0].length()) ? nomb2 : nomb1;
        largo = (nomb3.split(" ")[0].length() < largo.split(" ")[0].length()) ? largo: nomb3;

        int largo1 = nomb1.trim().length(), largo2 = nomb2.trim().length(), largo3 = nomb3.trim().length();
        int mayor1y2=0;
        String sMayor1y2 = "";

        //mas grande entre 1 y 2
        if(largo1 < largo2){
            mayor1y2 = largo2;
            sMayor1y2 = nomb2;
        } else if(largo1 > largo2){
            mayor1y2 = largo1;
            sMayor1y2 = nomb1;
        }

        if(largo1 != largo2) {
            if (mayor1y2 < largo3) {
                //el mayor es el largo3
                System.out.println("El nombre más largo es " + nomb3);
            } else if (mayor1y2 > largo3) {
                //mayor 1 o 2
                System.out.println("El nombre más largo es " + sMayor1y2);
            } else {
                //mayor 1y2 o 3
                System.out.println("Los nombres " + sMayor1y2 + " y " + nomb3 + " Son iguales y son los nombres mas largos");
            }
        } else{
            if(largo1 == largo3){
                //todos son iguales
                System.out.println("Todos los nombres son iguales de largos");
            } else{
                if(largo1 < largo3){
                    //mayor es el largo3
                    System.out.println("El nombre más largo es " + nomb3);
                } else{
                    //mayores son 1 y 2
                    System.out.println("Los nombres " + nomb1 + " y " + nomb2 + " Son iguales y son los nombres mas largos");
                }
            }
        }

    }
}
