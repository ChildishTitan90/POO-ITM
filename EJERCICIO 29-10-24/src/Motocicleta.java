public class Motocicleta implements MedioTransporte{
    @Override
    public void acelerar(double velocidad) {
        if (velocidad > (VELOCIDAD_MAXIMA/5)) {
            System.out.println("ALERTA");
        }else{
            System.out.println("ACELERACIÓN");
        }
    }

    @Override
    public void arrancar(){

    }
}
