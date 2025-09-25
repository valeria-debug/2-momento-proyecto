public interface Trabajador {
    void trabajar();
    void descansar();

    default void mostrarCategoria() {
        System.out.println("Categoría general de trabajador");
    }
}
