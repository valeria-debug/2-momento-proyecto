public class DocenteTiempoCompleto extends Docente {
    private double bonificacion;

    public DocenteTiempoCompleto(String nombre, String cedula, double salarioBase, double bonificacion) {
        super(nombre, cedula, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    @Override
    public void mostrarCategoria() {
        System.out.println("Categoría: Docente de Tiempo Completo");
    }
}
