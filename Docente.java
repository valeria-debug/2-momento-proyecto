public class Docente extends Persona implements Trabajador {
    protected double salarioBase;

    public Docente(String nombre, String cedula, double salarioBase) {
        super(nombre, cedula);
        this.salarioBase = salarioBase;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + " - Cédula: " + cedula);
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está enseñando en clase.");
    }

    @Override
    public void descansar() {
        System.out.println(nombre + " está descansando.");
    }
}
