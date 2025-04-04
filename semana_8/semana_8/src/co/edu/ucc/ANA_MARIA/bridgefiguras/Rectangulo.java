package co.edu.ucc.ANA_MARIA.bridgefiguras;

public class Rectangulo extends Figura {
    public Rectangulo(Renderizador renderizador) {
        super(renderizador);
    }

    public void dibujar() {
        renderizador.renderizar("Rectángulo");
    }
}
