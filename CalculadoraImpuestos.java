public class CalculadoraImpuestos {
    public int ingresos;
    public double porcentajeImpuestos, dividendos, exencion;

    public CalculadoraImpuestos() {
        this.ingresos = 0;
        this.porcentajeImpuestos = 0;
        this.dividendos = 0;
        this.exencion = 0;
    }

    public void calcularImpuestos(double porcentajeImpuestos, double dividendos, double exencion) {
        Double calcularImpuestos = dividendos*(porcentajeImpuestos/100);

        if (calcularImpuestos > exencion) {
            System.out.println(calcularImpuestos-exencion);
        }else
            System.out.println(0);
    }

    public void calcularImpuestos(int ingresos, double porcentajeImpuestos) {
        System.out.println(ingresos*(porcentajeImpuestos/100));
    }

    public void calcularImpuestos(int ingresos) {
        System.out.println((ingresos+0.15));
    }
}
