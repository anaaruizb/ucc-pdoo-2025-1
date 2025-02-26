package co.edu.ucc.ana.manufacturaacero;

import java.util.ArrayList;
import java.util.List;

public class Turno {
    private final List<Maquina> maquinas = new ArrayList<>();

    public void agregarMaquina(Maquina maquina) {
        if (maquina != null) {
            maquinas.add(maquina);
        } else {
            System.out.println("Error: La máquina no puede ser null.");
        }
    }

    public void mostrarProduccion() {
        if (maquinas.isEmpty()) {
            System.out.println("No hay máquinas registradas en el turno.");
            return;
        }

        for (Maquina maquina : maquinas) {
            System.out.println("Máquina: " + maquina.getNombre() + 
                               ", Acero Producido: " + maquina.getAceroProducido() + " toneladas");
        }
    }
}
