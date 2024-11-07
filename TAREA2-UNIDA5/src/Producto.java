public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        double valorTotal = precio*cantidad;
        return valorTotal;
    }

    public String mostrarDetalles() {
        return String.format("PRODUCTO: %s - PRECIO: $%.2f - CANTIDAD: %d, VALOR TOTAL: $%.2f" , nombre, precio, cantidad, calcularValorTotal());
    }
}
