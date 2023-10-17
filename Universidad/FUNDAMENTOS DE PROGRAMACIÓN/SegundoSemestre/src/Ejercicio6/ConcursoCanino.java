package Ejercicio6;

import java.util.ArrayList;
import java.util.List;
public class ConcursoCanino {
    private int identificador;
    private String nombre;
    private String ciudad;
    private List<Mascota> mascotas = new ArrayList<>();
    public int calcularPromedioDeLasMascotasPorEdad(ConcursoCanino concursoCanino){
        int suma = 0;
        for(Mascota mascota : concursoCanino.getMascotas()) {

            suma += mascota.getEdad();
        }
        if(suma == 0) return 0;
        return suma/concursoCanino.getMascotas().size();
    }
    public int calcularPromedioDeLasMascotas(ConcursoCanino concursoCanino){
        int suma = 0;
        for(Mascota mascota : concursoCanino.getMascotas()) {

            suma += mascota.getPuntaje();
        }
        if(suma == 0) return 0;
        return suma/concursoCanino.getMascotas().size();
    }
    public int calcularPromedioDeLaRaza(ConcursoCanino concursoCanino, Raza raza){
       int suma = 0, cantidadRaza = 0;
        for(Mascota mascota : concursoCanino.getMascotas()){
            if(mascota.getRaza().equals(raza)){
                suma += mascota.getPuntaje();
                cantidadRaza++;
            }
        }
        if(cantidadRaza == 0) return 0;
        return suma/cantidadRaza;
    }
    public String mostrarMascotasSuperioresAlPuntaje(ConcursoCanino concursoCanino, int puntajeAConocer){
        String mensaje = "";
        int cantidadMascotasSuperioresAlPuntaje = mascotasSuperioresAlPuntaje(concursoCanino, puntajeAConocer).size();
        for(int i = 0 ; i < cantidadMascotasSuperioresAlPuntaje ; i++){

            mensaje += "-------------------------------------------------------------------\n";
            mensaje += "La mascota con puntaje superior al indicado son:\n";
            mensaje += "Nombre: " + mascotasSuperioresAlPuntaje(concursoCanino, puntajeAConocer).get(i).getNombre() + "\n";
            mensaje += "-------------------------------------------------------------------\n";
        }
        if(cantidadMascotasSuperioresAlPuntaje == 0) {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "No hay mascotas con un puntaje superior al indicado.\n";
            mensaje+= "-------------------------------------------------------------------\n";
        }
        return mensaje;
    }
    public List<Mascota> mascotasSuperioresAlPuntaje(ConcursoCanino concursoCanino, int puntajeAConocer) {
        List<Mascota> mascotas = new ArrayList<>();
        for (Mascota mascota : concursoCanino.getMascotas()) {
            if (puntajeAConocer == mascota.getPuntaje()) {
                mascotas.add(mascota);
            }
        }
        return mascotas;
    }
    public String mostrarCantidadDeMascotasPorEdad(ConcursoCanino concursoCanino){
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        for(Mascota mascota : concursoCanino.getMascotas()){
            switch (mascota.getEdad()){
                case 1 -> cont1++;
                case 2 -> cont2++;
                case 3 -> cont3++;
                case 4 -> cont4++;
                case 5 -> cont5++;
            }
        }
        String mensaje = "";
        mensaje += "La cantidad de Mascotas con 1 años: " + cont1;
        mensaje += "\nLa cantidad de Mascotas con 2 años: " + cont2;
        mensaje += "\nLa cantidad de Mascotas con 3 años: " + cont3;
        mensaje += "\nLa cantidad de Mascotas con 4 años: " + cont4;
        mensaje += "\nLa cantidad de Mascotas con 5 años: " + cont5;

        return mensaje;
    }
    public String mostrarCantidadDeMascotasPorRaza(ConcursoCanino concursoCanino){
        int contL=0, contP=0, contPa=0, contS=0;
        for(Mascota mascota : concursoCanino.getMascotas()){
            switch (mascota.getRaza()){
                case LABRADOR -> contL++;
                case PITBULL -> contP++;
                case PASTOR_ALEMAN -> contPa++;
                case SCHNAUZER -> contS++;
            }
        }
        String mensaje = "";
        mensaje += "La cantidad de Labradores: " + contL;
        mensaje += "\nLa cantidad de Pitbulls: " + contP;
        mensaje += "\nLa cantidad de Pastores Alemanes: " + contPa;
        mensaje += "\nLa cantidad de Schnauzer: " + contS;

        return mensaje;
    }
    public String mostrarPuntajeMasAlto(ConcursoCanino concursoCanino){
        String mensaje = "";
        int cantidadMascotasConElPuntajeMasAlto = puntajeMasAlto(concursoCanino).size();
        for(int i = 0 ; i < cantidadMascotasConElPuntajeMasAlto ; i++){

            mensaje += "-------------------------------------------------------------------\n";
            mensaje += "La mascota con puntaje mas alto es:\n";
            mensaje += "Nombre: " + puntajeMasAlto(concursoCanino).get(i).getNombre() + "\n";
            mensaje += "Identificador: " + puntajeMasAlto(concursoCanino).get(i).getIdentificador() + "\n";
            mensaje += "Puntaje: " + puntajeMasAlto(concursoCanino).get(i).getPuntaje()+ "\n";
            mensaje += "Dueño: " + puntajeMasAlto(concursoCanino).get(i).getDueno().getNombre()+ "\n";
            mensaje += "-------------------------------------------------------------------\n";
        }
        if(cantidadMascotasConElPuntajeMasAlto == 0) {
            mensaje+= "-------------------------------------------------------------------\n";
            mensaje += "No hay mascotas registradas.\n";
            mensaje+= "-------------------------------------------------------------------\n";
        }
        return mensaje;
        }
    public List<Mascota> puntajeMasAlto (ConcursoCanino concursoCanino){
        int masAlto=0;
        List<Mascota> mascotas = new ArrayList<>();
        int mascotasConElPuntajeMasAlto = 0;
        for ( Mascota mascota : concursoCanino.getMascotas()){
            masAlto = mascota.getPuntaje();
            if (masAlto < mascota.getPuntaje()){
                masAlto = mascota.getPuntaje();
            }
        }
        for ( Mascota mascota : concursoCanino.getMascotas()){
            if (masAlto == mascota.getPuntaje()){
                mascotas.add(mascota);
            }
        }
        return mascotas;
    }
    public ConcursoCanino(int identificador, String nombre, String ciudad){
        this.identificador = identificador;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    public void agregarMascota (Mascota mascota){
        mascotas.add(mascota);
    }
    public List<Mascota> getMascotas() {
        return mascotas;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}