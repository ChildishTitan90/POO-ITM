import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n**BIENVENIDO**");
            System.out.println("1. REGISTRAR PRODUCTO");
            System.out.println("2. ELIMINAR PRODUCTO");
            System.out.println("3. MOSTRAR PRODUCTO");
            System.out.println("4. MOSTRAR CATEGORIAS EXISTENTES.");
            System.out.println("5. MOSTRAR PRODUCTOS SEGUN SU CATEGORIA.");
            System.out.println("6. REGISTRAR CATEGORIAS");
            System.out.println("7. SALIR");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextInt();

            sc.nextLine();
            switch (opcion) {
                case 1:
                    if(!inventario.validarExistenciaCategorias()){
                        System.out.println("\n No existen categorias en el Sistema");
                        break;
                    }

                    System.out.println("\nIngresa el nombre del producto: ");
                    String nombre = sc.next();

                    sc.nextLine();
                    System.out.println("Ingresa el precio del producto: ");
                    double precio = sc.nextDouble();

                    sc.nextLine();
                    System.out.println("Ingresa el descripcion del producto: ");
                    String descripcion = sc.next();

                    sc.nextLine();
                    System.out.println("Ingresa el stock del producto: ");
                    int stock = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Ingresa el id de la categoria en donde registraras el producto: ");
                    int idCategoria = sc.nextInt();

                    Producto producto = new Producto(nombre, precio, descripcion, idCategoria, stock);
                    inventario.registrarProducto(producto, idCategoria);
                    break;
                case 2:
                    System.out.println("\nSELECCIONASTE LA OPCION: ELIMINAR PRODUCTO.");
                    System.out.println("Ingresa el ID del producto: ");

                    int id = sc.nextInt();
                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    inventario.mostrarCategorias();
                    break;
                case 5:
                    inventario.mostrarCategoriasConProductos();
                    break;
                case 6:
                    System.out.println("\nSELECCIONASTE LA OPCION PARA AGREGAR CATEGORIAS.");

                    System.out.println("Ingresa el nombre de la categoria: ");
                    String nombreCategoria = sc.next();

                    Categoria categoria = new Categoria(nombreCategoria);
                    inventario.registrarCategoria(categoria);
                    break;
                case 7:
                    System.out.println("hasta luego.");
                    return;
            }

        }

    }
}
