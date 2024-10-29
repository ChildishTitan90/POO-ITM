public class EnvioInternacional extends Envio {
    public String paisDestino;

    public EnvioInternacional(double costoBase, double peso, String paisDestino) {
        super(costoBase, peso);
        this.paisDestino = paisDestino;
    }

    @Override
    public void calcularTiempoYCostoEntrega() {
        validarPeso();
        int tiempoEntrega = 10;
        if (peso > 10){
            tiempoEntrega = tiempoEntrega + 3;
            if(!paisDestino.toUpperCase().equals("MÉXICO")){
                double costototal = costoBase + (costoBase * 0.2);
                System.out.println(String.format("ENVIO NACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costototal, tiempoEntrega));
            }else{
                System.out.println(String.format("ENVIO INTERNACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costoBase, tiempoEntrega));
            }
        }else{
            if(!paisDestino.toUpperCase().equals("MÉXICO")){
                double costototal = costoBase + (costoBase * 0.2);
                System.out.println(String.format("ENVIO NACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costototal, tiempoEntrega));
            }else{
                System.out.println(String.format("ENVIO INTERNACIONAL - COSTO TOTAL: $%.2f, TIEMPO DE ENTRGA %d DIAS", costoBase, tiempoEntrega));
            }
        }
    }
}
