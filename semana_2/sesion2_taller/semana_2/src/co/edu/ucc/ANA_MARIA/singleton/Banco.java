package co.edu.ucc.ANA_MARIA.singleton;

public class Banco {
    private final String nombreBanco;

    // Constructor privado para evitar instancias directas
    private Banco() {
        nombreBanco = "Banco Central";
    }

    // Clase estática interna para implementar Singleton de manera segura
    private static class SingletonHolder {
        private static final Banco INSTANCE = new Banco();
    }

    // Método para obtener la única instancia de Banco
    public static Banco getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // Método para mostrar el nombre del banco
    public void mostrarNombre() {
        System.out.println("Bienvenido al " + nombreBanco);
    }
}
