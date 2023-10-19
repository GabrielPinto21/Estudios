package Primer_Previo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcursoCanino {
    private int identificador;
    private String nombre;
    private String ciudad;
    private List<Mascota> mascotas = new ArrayList<>();
    public void marcarGanador(ConcursoCanino concursoCanino){
        for (Mascota mascota : mascotas){
            if (mascota.getPuntaje() == puntajeMasAlto()){
                mascota.setGanador(true);
            }
        }
    }
    public  void calificar (int identificador, int  calificacion, Scanner scanner, ConcursoCanino concursoCanino) {
    boolean b= false;
        for(Mascota mascota : getMascotas()){
            if (mascota.getIdentificador() == identificador){
             b = true;
            }
        }

        if (!b){
            System.out.println("Mascota no registrada");
            System.out.println("Ingrese nuevamente el identificador");
            identificador = scanner.nextInt();
        }else {
            if (calificacion < 1 || calificacion > 5) {
                do {
                    System.out.println("ingrese una calificación dentro del rango de 1 a 5");
                    calificacion = scanner.nextInt();
                } while (calificacion < 1 || calificacion > 5);
            }else{
                for (Mascota mascota : getMascotas()){
                    if(mascota.getPuntaje() == 0 && mascota.getIdentificador() == identificador){
                        mascota.setPuntaje(calificacion);
                    }else {
                        System.out.println("Mascota ya calificada");
                    }
                }
            }
        }
    }

    public int puntajeMasAlto (){

        int masAlto=0;
        for ( Mascota mascota : getMascotas()){
            masAlto = mascota.getPuntaje();
            if (masAlto < mascota.getPuntaje()){
                masAlto = mascota.getPuntaje();
            }
        }
        for ( Mascota mascota : getMascotas()){
            if (masAlto == mascota.getPuntaje()){
                mascotas.add(mascota);
            }
        }
        return masAlto;
    }
    public ConcursoCanino(int identificador, String nombre, String ciudad){
        this.identificador = identificador;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    public void agregarMascota (double valorInscripccion, int identificador, String nombre, int edad, Raza raza, String nombreDueno){

        Mascota mascota = new Mascota(identificador, nombre, edad, raza);
        Dueno dueno = new Dueno(nombreDueno, mascota);
        mascota.setDueno(dueno);


        if (raza.equals(Raza.LABRADOR)){
            valorInscripccion =(valorInscripccion * 0.85);
        }
        if (raza.equals(Raza.PITBULL) || raza.equals(Raza.PASTOR_ALEMAN)){
            valorInscripccion =(valorInscripccion * 0.80);
        }
        if(raza.equals(Raza.SCHNAUZER)){
            valorInscripccion = valorInscripccion;
        }
        mascota.setInscrpcion(valorInscripccion);
        mascotas.add(mascota);
    }
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}