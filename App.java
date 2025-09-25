public class App {
    public static void main(String[] args) {
        DocenteTiempoCompleto d1 = new DocenteTiempoCompleto("Ana Gómez", "123", 2000000, 500000);

        d1.mostrarInfo();
        d1.trabajar();
        d1.mostrarCategoria();
        System.out.println("Salario: " + d1.calcularSalario());

        d1.setBonificacion(600000);
        System.out.println("Nueva bonificación: " + d1.getBonificacion());
        System.out.println("Nuevo salario: " + d1.calcularSalario());
    }
}
