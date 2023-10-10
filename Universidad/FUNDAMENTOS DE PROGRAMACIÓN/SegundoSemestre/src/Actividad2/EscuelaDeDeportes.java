package Actividad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class EscuelaDeDeportes {

    private List<Deportista> deportistas;

    public EscuelaDeDeportes() {
        deportistas = new ArrayList<>();
    }



    public void agregarDeportista(int id, String nombre, String apellidos, String genero,
                                  int edad, int goles, int cestas, float kilometrosRecorridos,
                                  String tipoDeportista) {


        switch (tipoDeportista) {
            case "futbolista":
                deportistas.add(new Futbolista(id, nombre, apellidos, genero, edad, goles));
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Se registró el Futbolista");
                break;
            case "basquetbolista":
                deportistas.add(new Basquetbolista(id, nombre, apellidos, genero, edad, cestas));
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Se registró el Basquetbolista");
                break;
            case "atleta":
                deportistas.add(new Atleta(id, nombre, apellidos, genero, edad, kilometrosRecorridos));
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Se registró el Atleta");
                break;
        }
    }

    public String mostrarFutbolistaConMasGoles() {
        String mensaje = "";
        Futbolista futbolista = encontrarFutbolistaConMasGoles();
        if (futbolista != null) {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "Futbolista con más goles:\n";
            mensaje += "Nombre: " + futbolista.getNombre() + "\n";
            mensaje += "Goles: " + futbolista.getGoles()+ "\n";
            mensaje += "Categoria: " + futbolista.getCategoria()+ "\n";
            mensaje+= "-------------------------------------------------------------------\n";
        } else {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "No hay futbolistas registrados.\n";
            mensaje+= "-------------------------------------------------------------------\n";
        }
        return mensaje;
    }
    public String mostrarBasquetbolistaConMasCestas() {
        String mensaje = "";
        Basquetbolista basquetbolista = encontrarBasquetbolistaConMasCestas();
        if (basquetbolista != null) {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "Basquetbolista con más cestas:\n";
            mensaje += "Nombre: " + basquetbolista.getNombre() + "\n";
            mensaje += "Cestas: " + basquetbolista.getCestas() + "\n";
            mensaje += "Categoria: " + basquetbolista.getCategoria() + "\n";
            mensaje+= "-------------------------------------------------------------------\n";
        } else {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "No hay basquetbolistas registrados.\n";
            mensaje+= "-------------------------------------------------------------------\n";
        }
        return mensaje;
    }
    public String mostrarAtletaConMejorRendimiento() {
        String mensaje = "";
        Atleta atleta = encontrarAtletaConMejorRendimiento();
        if (atleta != null) {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "Atleta con mejor rendimiento:\n";
            mensaje += "Nombre: " + atleta.getNombre() + "\n";
            mensaje += "Kilómetros recorridos: " + atleta.getKilometrosRecorridos() + "\n";
            mensaje += "Categoria: " + atleta.getCategoria() + "\n";
            mensaje+= "-------------------------------------------------------------------\n";
        } else {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "No hay atletas registrados.\n";
            mensaje+= "-------------------------------------------------------------------\n";
        }
        return mensaje;
    }
    public Futbolista encontrarFutbolistaConMasGoles() {
        Futbolista futbolistaConMasGoles = null;
        int maxGoles = -1;

        for (Deportista deportista : deportistas) {
            if (deportista instanceof Futbolista) {
                Futbolista futbolista = (Futbolista) deportista;
                if (futbolista.getGoles() > maxGoles) {
                    maxGoles = futbolista.getGoles();
                    futbolistaConMasGoles = futbolista;
                }
            }
        }

        return futbolistaConMasGoles;
    }
    public Basquetbolista encontrarBasquetbolistaConMasCestas() {
        Basquetbolista basquetbolistaConMasCestas = null;
        int maxCestas = -1;

        for (Deportista deportista : deportistas) {
            if (deportista instanceof Basquetbolista) {
                Basquetbolista basquetbolista = (Basquetbolista) deportista;
                if (basquetbolista.getCestas() > maxCestas) {
                    maxCestas = basquetbolista.getCestas();
                    basquetbolistaConMasCestas = basquetbolista;
                }
            }
        }

        return basquetbolistaConMasCestas;
    }
    public Atleta encontrarAtletaConMejorRendimiento() {
        Atleta atletaConMejorRendimiento = null;
        double maxKilometros = -1;

        for (Deportista deportista : deportistas) {
            if (deportista instanceof Atleta) {
                Atleta atleta = (Atleta) deportista;
                if (atleta.getKilometrosRecorridos() > maxKilometros) {
                    maxKilometros = atleta.getKilometrosRecorridos();
                    atletaConMejorRendimiento = atleta;
                }
            }
        }

        return atletaConMejorRendimiento;
    }
}
