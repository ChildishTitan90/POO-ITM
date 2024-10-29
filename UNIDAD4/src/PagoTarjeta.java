import java.time.LocalDate;

public class PagoTarjeta extends Pago{
    private LocalDate fechaVencimientoTarjeta;
    private String numeroTarjeta;

    public PagoTarjeta(int monto, LocalDate fechaVencimientoTarjeta, String numeroTarjeta) {
        super(monto);
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(){
        validarPago();
        if(fechaVencimientoTarjeta.isBefore(LocalDate.now())){
            System.out.println("NO SE PUDO PROCESAR EL PAGO");
            System.out.println("TARJETA VENCIDA");
        }else{
            System.out.println("PAGO COMPLETADO");
            System.out.println("MONTO: " + super.getMonto());
            System.out.println("MONTO CON DESCUENTO: " + (super.getMonto()-(super.getMonto()*obtenerDescuento(getMonto()))));
            System.out.println("NÚMERO DE TARJETA: " + numeroTarjeta);
        }
    }

    @Override
    public double obtenerDescuento(int monto){
        if(fechaVencimientoTarjeta.isAfter(LocalDate.of(2030,1,1))){
            if (numeroTarjeta.contains("888") && !numeroTarjeta.contains("A")) {
                return .12;
            }else{
                return .20;
            }
        } else if (fechaVencimientoTarjeta.isAfter(LocalDate.of(2028,1,1))) {
            if (numeroTarjeta.contains("999")) {
                return 0.8;
            }else{
                return .03;
            }
        }else{
            return 0.1;
        }
    }
}
