public abstract class Envio {
    public double costoBase, peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }

    public abstract void calcularTiempoYCostoEntrega();


    public void validarPeso(){
        if (peso < 0){
            System.out.println("PESO INVALIDO");
        }else{
            System.out.println("PESO VALIDADO: " + peso + "Kg");
        }
    }
}
