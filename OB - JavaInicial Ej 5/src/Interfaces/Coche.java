package Interfaces;

public class Coche {
    String fabricante;
    String modelo;
    int anio;


    public Coche(){}

    public Coche(String fabricante, String modelo, int anio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
