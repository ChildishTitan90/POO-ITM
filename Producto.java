import java.util.Random;

public class Producto {

    public int id;
    public String nombre;
    public Double precio;
    public String descripcion;
    public int idCategoria;
    public int stock;
    public Random random = new Random();

    public Producto(String nombre, Double precio, String descripcion, int idCategoria, int stock) {
        this.id = random.nextInt(1, 10001);
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.idCategoria = idCategoria;
        this.stock = stock;
    }

    //GETTERS
    public int getId() {
        return this.id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public Double getPrecio() {
        return this.precio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public int getidCategoria() {
        return this.idCategoria;
    }
    public int getStock() {
        return this.stock;
    }

    public String mostrarProducto() {
        /*
        d- enteros s-string f- double
        * */
        return String.format("Id: %d, Nombre: %s, Precio: %.2f, Descripcion: %s, idCategoria: %d, Stock: %d", this.id, this.nombre, this.precio, this.descripcion, this.idCategoria, this.stock);

        //return "ID: "+ id + "Nombre: " + nombre + "Precio: "+ precio + "Descripcion: " + descripcion + "Categoria: " + categoria + "Stock: " + stock;
    }
}
