package co.edu.ucc.ANA_MARIA.bridgefiguras;

public class Circulo extends Figura {
    public Circulo(Renderizador renderizador) {
        super(renderizador);
    }

    public void dibujar() {
        renderizador.renderizar("Círculo");
    }
}

