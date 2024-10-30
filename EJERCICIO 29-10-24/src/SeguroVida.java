public class SeguroVida extends Seguro{
    public int edadTitular;

    public SeguroVida(String nombreTitular, double valorAsegurado, int edadTitular) {
        super(nombreTitular, valorAsegurado);
        this.edadTitular = edadTitular;
    }

    @Override
    public void calcularPrima() {
        System.out.println("SEGURO DE VIDA - " +detallesDelSeguro() + ", EDAD DEL TITULAR: " + edadTitular);
        double prima = 400.0 + (valorAsegurado*0.015);
        if (edadTitular > 60) {
            prima = prima + (prima * 0.25);
            System.out.println("PRIMA TOTAL: " + prima);
        }else{
            System.out.println("PRIMA TOTAL: " + prima);
        }
    }
}
