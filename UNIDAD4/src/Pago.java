public abstract class Pago {
    private int monto;

    public Pago(int monto) {
        this.monto = monto;
    }
    public int getMonto() {
        return monto;
    }

    public abstract void procesarPago();

    public abstract double obtenerDescuento(int monto);

    public void validarPago(){
        if (monto < 0){
            System.out.println("MONTO DEL PAGO INVALIDO");
        }else{
            System.out.println("MONTO DEL PAGO CORRECTO");
        }
    }

}
