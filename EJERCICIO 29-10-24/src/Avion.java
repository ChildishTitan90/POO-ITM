public class Avion implements MedioTransporte {
    @Override
    public void acelerar(double velocidad) {
        if(velocidad > VELOCIDAD_MAXIMA) {
            System.out.println("ALERTA");
        } else if (velocidad > (VELOCIDAD_MAXIMA/3) && velocidad < (VELOCIDAD_MAXIMA)) {
            System.out.println("ENCENDER MOTOR EXTRA");
        }else{
            System.out.println("FLUJO NORMAL");
        }
    }

    @Override
    public void arrancar(){

    }
}
