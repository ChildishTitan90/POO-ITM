import java.util.ArrayList;

public class Inventario {

    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    //public ArrayList<Producto> listaProductos;
    public ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();

    public void registrarCategoria(Categoria categoria) {
        this.listaCategorias.add(categoria);
        System.out.println("Categoria registrada con exito");
    }

    public void registrarProducto(Producto producto, int idCategoria) {
        //this.listaProductos.add(producto);
        //System.out.printf("Se registro un nuevo producto.\n");
        boolean existe = false;
        for (Categoria categoria : listaCategorias) {
            if (categoria.getId() == idCategoria) {
                existe = true;
                break;
            }
        }

        if (existe) {
            this.listaProductos.add(producto);
            System.out.printf("Se registro un nuevo producto.\n");
        }else{
            System.out.println("No se registro el producto. Comprueva el ID de la Categoria.\n");
        }
    }

    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size();//3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar); //si elimina el tamaño sera 2

        if ( longitudOriginal != this.listaProductos.size()) {
            System.out.printf("Se elimino un producto con el ID: " + idProductoEliminar + ".\n");
        }else{
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n***PRODUCTOS EN EL SISTEMA***");

        if (this.listaProductos.size() == 0) {
            System.out.println("No hay productos registrados.\n");
            return;
        }

        int iterador = 1;
        for (Producto producto : this.listaProductos) {
            System.out.println("\n Este es el producto: " + iterador  + ".\n");
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }

    public boolean validarExistenciaCategorias(){
        return this.listaCategorias.size() > 0;
    }

    public void mostrarCategorias() {
        System.out.println("\n***CATEGORIAS EN EL SISTEMA***");

        if (this.listaCategorias.size() == 0) {
            System.out.println("No hay categorias registrados.\n");
            return;
        }

        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria.mostrarDatos());
        }
    }

    public void mostrarCategoriasConProductos(){
        System.out.println("\n***CATEGORIAS CON PRODUCTOS EN EL SISTEMA***");


        if (this.listaProductos.size() == 0 && this.listaCategorias.size() == 0) {
            System.out.println("No hay productos ni categorias registrados.\n");
            return;
        }

        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria.mostrarDatos());
            for (Producto producto : this.listaProductos) {
                if (producto.getidCategoria() == categoria.getId()) {
                    System.out.println(producto.mostrarProducto());
                }
            }
        }
    }

}