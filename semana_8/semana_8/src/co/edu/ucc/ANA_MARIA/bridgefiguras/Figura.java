package co.edu.ucc.ANA_MARIA.bridgefiguras;

public abstract class Figura {
    protected Renderizador renderizador;

    public Figura(Renderizador renderizador) {
        this.renderizador = renderizador;
    }

    public abstract void dibujar();
}
