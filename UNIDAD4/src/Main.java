import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PagoPaypal pagoPaypal = new PagoPaypal(100, "fdsfasasf", "asdf@asdgsda");
        pagoPaypal.procesarPago();
        System.out.println("\n**********\n");

        PagoTarjeta pagoTarjeta = new PagoTarjeta(1200, LocalDate.of(2023, 10, 10), "asdfsadfasd");
        pagoTarjeta.procesarPago();

    }
}