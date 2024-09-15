import java.util.ArrayList;

public class Producto {
    private String nombre;
    private float precio;
    private int stock;

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, float precio) {
        this.stock = 0;
    }
    public String getNombre() {
        if (this.nombre != null) {
            return this.nombre;
        }
        return getNombre();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio > 0){
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock > 0){
            this.stock = stock;
        }
    }

    public int aumentarStock(String producto, int cantidad){
        if (producto.equals(getNombre())){
            if (cantidad > 0){
                this.stock = stock + cantidad;
            }
        }else{
            System.out.println("No existe producto con ese nombre.");
        }
        return getStock();
    }

    public int reducirStock(String producto, int cantidad){

        if (producto.equals(getNombre())){
            if (cantidad > 0 && cantidad <= stock){
                this.stock = stock - cantidad;
            }
        }else{
            System.out.println("No existe producto con ese nombre.");
        }
        return getStock();
    }

}
