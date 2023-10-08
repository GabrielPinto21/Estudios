package actividad1;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        // Declarar arreglo de tipo Serie
        Serie [] serie = new Serie[5];

        // Recorrer el arreglo

        for (int i= 0; i<serie.length; i++) {
            Serie se = new Serie();
            String ti = JOptionPane.showInputDialog("Ingrese titulo de la serie " + (i+1) + ": ");
            String au = JOptionPane.showInputDialog("Ingrese autor de la serie " + (i+1) + ": ");
            se.setTitulo(ti);
            se.setAutor(au);
            serie[i] = se;
        }

        String imprimir = JOptionPane.showInputDialog("¿De que autor desea imprimir los titulos?");

        for (int i= 0; i<serie.length; i++){
            Serie j = serie[i];
            if (j.getAutor().equalsIgnoreCase(imprimir)){
                System.out.println("El nombre de la serie  del autor " + imprimir + " es: " + j.getTitulo());
            }
        }


    }
}
