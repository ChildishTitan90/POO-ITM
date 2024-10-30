public abstract class Seguro {
    private String nombreTitular;
    public double valorAsegurado;

    public Seguro(String nombreTitular, double valorAsegurado) {
        this.nombreTitular = nombreTitular;
        this.valorAsegurado = valorAsegurado;
    }

    public abstract void calcularPrima();

    public String detallesDelSeguro() {
       String detalles = String.format("TITULAR: %s, VALOR ASEGURDO: %.2f", nombreTitular, valorAsegurado);
       return detalles;
    }
}
