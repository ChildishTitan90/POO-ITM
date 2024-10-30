public class Main {
    public static void main(String[] args) {
        SeguroAuto seguroAuto = new SeguroAuto("VICTOR", 200000, 26);
        seguroAuto.calcularPrima();

        SeguroHogar seguroHogar = new SeguroHogar("Antonio", 1000000, "ZONA DE RIESGO");
        seguroHogar.calcularPrima();

        SeguroVida seguroVida = new SeguroVida("ALICIA", 500000, 51);
        seguroVida.calcularPrima();
    }
}