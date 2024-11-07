public class Carro implements MedioTransporte{
    @Override
    public void acelerar(double velocidad) {
        if (velocidad > (VELOCIDAD_MAXIMA / 2)) {
            System.out.println("VELOCIDAD MÁXIMA ALCANZADA");
        }else{
            System.out.println("FUJO NORMAL");
        }
    }

    @Override
    public void arrancar(){

    }
}
