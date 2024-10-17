public class Coche {

    private String marca;
    private String modelo;
    private int ano;

    public Coche(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInformacion() {
        StringBuilder informacion = new StringBuilder();
        informacion.append(marca);
        informacion.append(" - ");
        informacion.append(modelo);
        informacion.append(" - ");
        informacion.append(ano);

        System.out.println(informacion.toString());
    }

    public void calcularAno(){
        int anoActual = 2024;

        System.out.println("El coche tiene " + (anoActual-ano) + " años en el mercado.\n");
    }
}


