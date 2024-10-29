public class PagoPaypal extends Pago {
    private String numeroCuenta;
    private String email;

    public PagoPaypal(int monto, String numeroCuenta, String email) {
        super(monto);
        this.numeroCuenta = numeroCuenta;
        this.email = email;
    }

    @Override
    public void procesarPago(){
        validarPago();
        if (!email.contains("@")){
            System.out.println("CORREO INVÁLIDO");
        }else{
            System.out.println("PAGO COMPLETADO");
            System.out.println("MONTO: "+ super.getMonto());
            System.out.println("MONTO CON DESCUENTO: " + (super.getMonto()-(super.getMonto()*obtenerDescuento(getMonto()))));
            System.out.println("CORREO DEL USUARIO: " + email);
            System.out.println("NÚMERO DE CUENTA: " + numeroCuenta);
        }
    }

    @Override
    public double obtenerDescuento(int monto){
        if (monto > 100){
            if (numeroCuenta.contains("001")){
                return .10;
            }else {
                return .05;
            }
        }
        return .02;
    }
}
