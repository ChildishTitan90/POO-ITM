public interface MedioTransporte { //a diferencia de las clases abstract, las clases hijas forzosamente deben tener los metodos de la unterfas
    int VELOCIDAD_MAXIMA = 500; // Cuando declaro atributos en una interfaz, son una constanstante (no puede cambiar nunca), por eso va en mayusculas
// es como si fueran public static final

    void acelerar(double velocidad);

    void arrancar();
}
