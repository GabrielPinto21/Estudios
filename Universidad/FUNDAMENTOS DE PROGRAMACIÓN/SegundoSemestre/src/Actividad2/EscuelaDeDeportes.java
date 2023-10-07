package Actividad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscuelaDeDeportes {
    public static void main(String[] args) {
        EscuelaDeDeportes escuela = new EscuelaDeDeportes();


        escuela.agregarDeportista(new Futbolista(1, "Juan", "Perez", "Masculino", 8, 15));

        Futbolista futbolistaConMasGoles = escuela.encontrarFutbolistaConMasGoles();
        if (futbolistaConMasGoles != null) {
            System.out.println("Futbolista con más goles:");
            System.out.println("Nombre: " + futbolistaConMasGoles.getNombre());
            System.out.println("Goles: " + futbolistaConMasGoles.getGoles());
        } else {
            System.out.println("No hay futbolistas registrados.");
        }

        Basquetbolista basquetbolistaConMasCestas = escuela.encontrarBasquetbolistaConMasCestas();
        if (basquetbolistaConMasCestas != null) {
            System.out.println("\nBasquetbolista con más cestas:");
            System.out.println("Nombre: " + basquetbolistaConMasCestas.getNombre());
            System.out.println("Cestas: " + basquetbolistaConMasCestas.getCestas());
        } else {
            System.out.println("\nNo hay basquetbolistas registrados.");
        }

        Atleta atletaConMejorRendimiento = escuela.encontrarAtletaConMejorRendimiento();
        if (atletaConMejorRendimiento != null) {
            System.out.println("\nAtleta con mejor rendimiento:");
            System.out.println("Nombre: " + atletaConMejorRendimiento.getNombre());
            System.out.println("Kilómetros recorridos: " + atletaConMejorRendimiento.getKilometrosRecorridos());
        } else {
            System.out.println("\nNo hay atletas registrados.");
        }
    }
        private List<Deportista> deportistas;

        public EscuelaDeDeportes() {
            deportistas = new ArrayList<>();
        }

        public void agregarDeportista(Deportista deportista) {
            deportistas.add(deportista);
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
