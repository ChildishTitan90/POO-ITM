import java.util.ArrayList;
import java.util.Random;

public class Categoria {
    public int id;
    public String nombre;
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public Random random = new Random();

    public Categoria(String nombre) {
        this.id = this.random.nextInt(1,10001);
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void registrarProductoEnCategoria(Producto producto) {
        listaProductos.add(producto);
    }

    public String mostrarDatos() {
        return String.format("CATEGORIA: %s, ID Categoria: %d", this.nombre, this.id);
    }
}