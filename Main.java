public class Main {
    public static void main(String[] args) {
        System.out.println("COCHE 1");
        Coche coche1 = new Coche("Ford", "Mustang", 2020);
        coche1.mostrarInformacion();
        coche1.calcularAno();

        System.out.println("COCHE 2");
        Coche coche2 = new Coche("Toyota ", "Supra", 1994);
        coche1.mostrarInformacion();
        coche2.calcularAno();

        System.out.println("COCHE 3");
        Coche coche3 = new Coche("Porsche", "911 Turbo", 2020);
        coche1.mostrarInformacion();
        coche3.calcularAno();
    }
}
