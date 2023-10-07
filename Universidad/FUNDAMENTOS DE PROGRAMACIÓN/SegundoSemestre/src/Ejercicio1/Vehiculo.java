package Ejercicio1;
public class Vehiculo {

    private String marca;
    private String modelo;
    private boolean disponibilidad;
    protected double distanciaRecorrida;
    private int anioFabricacion;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(String marca, String modelo, boolean disponibilidad, double distanciaRecorrida ){
        this.marca = marca;
        this.modelo = modelo;
        this.disponibilidad = disponibilidad;
        this.distanciaRecorrida = 0.0;
    }

    public int calcularAniosEnMercado (int anioActual) {

        return anioActual-anioFabricacion;
    }
}
