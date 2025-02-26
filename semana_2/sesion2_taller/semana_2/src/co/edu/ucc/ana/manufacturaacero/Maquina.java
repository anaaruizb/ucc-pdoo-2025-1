package co.edu.ucc.ana.manufacturaacero;

public class Maquina {
    private final String nombre;
    private double aceroProducido;

    public Maquina(String nombre) {
        this.nombre = nombre;
        this.aceroProducido = 0;
    }

    public void producirAcero(double cantidad) {
        this.aceroProducido += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAceroProducido() {
        return aceroProducido;
    }
}
