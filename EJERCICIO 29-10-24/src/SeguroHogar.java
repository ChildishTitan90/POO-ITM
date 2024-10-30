public class SeguroHogar extends Seguro{
    public String ubicacionVivienda;

    public SeguroHogar(String nombreTitular, double valorAsegurado, String ubicacionVivienda) {
        super(nombreTitular, valorAsegurado);
        this.ubicacionVivienda = ubicacionVivienda;
    }


    @Override
    public void calcularPrima() {
        System.out.println("SEGURO DEL HOGAR - " +detallesDelSeguro() + ", UBICACION: " + ubicacionVivienda);
        double prima = 500.0 + (valorAsegurado * 0.02);
        if (ubicacionVivienda.toUpperCase().equals("ZONA DE RIESGO")){
            prima = prima + (prima * 0.20);
            System.out.println("PRIMA TOTAL: " + prima);
        }else{
            System.out.println("PRIMA TOTAL: " + prima);
        }
    }
}
