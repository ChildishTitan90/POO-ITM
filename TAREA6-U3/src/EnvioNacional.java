public class EnvioNacional extends Envio {
    private double distanciaKm;

    public EnvioNacional(double costoBase, double peso, double distanciaKm) {
        super(costoBase, peso);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public void calcularTiempoYCostoEntrega() {
        validarPeso();
        int tiempoEntrega = 1;

        if (distanciaKm > 200) {
            tiempoEntrega = tiempoEntrega + (int)(distanciaKm / 200.0);
            if (peso > 5){
                double costoFinal = costoBase + (costoBase * 0.05);
                System.out.println(String.format("ENVIO NACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costoFinal, tiempoEntrega));
            }else {
                System.out.println(String.format("ENVIO NACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costoBase, tiempoEntrega));
            }
        } else{
            if (peso > 5){
                double costoFinal = costoBase + (costoBase * 0.05);
                System.out.println(String.format("ENVIO NACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costoFinal, tiempoEntrega));
            }else {
                System.out.println(String.format("ENVIO NACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costoBase, tiempoEntrega));
            }
        }
    }
}
