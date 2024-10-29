public class Main {
    public static void main(String[] args) {
        EnvioNacional envioNacional = new EnvioNacional(300, 6.0, 600);
        envioNacional.calcularTiempoYCostoEntrega();

        System.out.println("\n*****\n");

        EnvioInternacional envioInternacional = new EnvioInternacional(500,12.0, "España");
        envioInternacional.calcularTiempoYCostoEntrega();
    }
}