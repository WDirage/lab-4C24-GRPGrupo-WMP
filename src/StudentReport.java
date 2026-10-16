public class StudentReport {

    public static void mostrarEncabezado() {
        System.out.println("==================================");
        System.out.println("      REPORTE DE ESTUDIANTES");
        System.out.println("      Elaborado por: Paulo");
        System.out.println("==================================");
    }

    public static void mostrarReporte() {
        mostrarEncabezado();

        System.out.println("Nombre: Ana Torres");
        System.out.println("Curso: Construccion y Pruebas de Software");
        System.out.println("Nota: 18");
        System.out.println("----------------------------------");
        System.out.println("Fin del reporte.");
    }

    public static void main(String[] args) {
        mostrarReporte();
    }
}