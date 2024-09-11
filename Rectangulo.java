public class Rectangulo {

    public Double altura, base;

    public Rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area(Double altura, Double base) {
        return (base*altura);
    }
    public double area(int altura, int base) {
        return (base*altura);
    }

    public Double perimetro(Double altura, Double base) {
        return (base*2)+(altura*2);

    }

    public int perimetro(int altura, int base) {
         return (base*2)+(altura*2);

    }
}
