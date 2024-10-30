public class SeguroAuto extends Seguro {
    public int edadTitular;

    public SeguroAuto(String nombreTitular, double valorAsegurado, int edadTitular) {
        super(nombreTitular, valorAsegurado);
        this.edadTitular = edadTitular;
    }

    @Override
    public void calcularPrima() {
        System.out.println("SEGURO DE AUTO - " + detallesDelSeguro() + ", EDAD DEL TITULAR: " + edadTitular);
        double prima = 300 + (valorAsegurado * 0.05);
        if (edadTitular < 25) {
            prima = prima + (prima * 0.15);
            System.out.println("PRIMA TOTAL: " + prima);
        }else{
            System.out.println("PRIMA TOTAL: " + prima);
        }
    }
}
