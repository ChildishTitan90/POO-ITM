import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();

        String nombre = "";
        float precio = 0.0F;
        int stock = 0;

        int opcion = 0;

        while(opcion != 5){

            System.out.println("OPCIONES:");
            System.out.println("1.-AGREGAR PRODUCTO.");
            System.out.println("2.- AGREGAR STOCK.");
            System.out.println("3.- REDUCIR STOCK.");
            System.out.println("4.- MOSTRAR PRODUCTO.");
            System.out.println("5.- SALIR.");
            System.out.print("¿QUÉ HAREMOS HOY?");
            opcion = sc.nextInt();

            sc.nextLine();
            switch(opcion){
                case 1:
                    Producto producto = new Producto(nombre, precio, stock);//para que la lista guarde un nuevo producto cada vez que el usuario quiera agregar uno nuevo//
                    do {
                        System.out.println("Ingrese el nombre del producto:");
                        nombre = sc.nextLine();
                    }while(nombre.isEmpty());

                    producto.setNombre(nombre);
                    System.out.println("Ingrese el precio del producto:");
                    precio = sc.nextFloat();
                    producto.setPrecio(precio);
                    System.out.println("Ingrese su stock:");
                    stock = sc.nextInt();
                    producto.setStock(stock);
                    listaProductos.add(producto);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto:");
                    String nombreProducto = sc.nextLine();
                    for (int i = 0; i < listaProductos.size(); i++) {
                        if (listaProductos.get(i).getNombre().equals(nombreProducto)) {//para comprovar que haya un producto con el nombre escrito por el usuario(a falta del id) y asi saber a que producto agregar el stock
                            System.out.println("Ingrese las nuevas cantidad del producto: ");
                            int cantidad = sc.nextInt();
                            listaProductos.get(i).aumentarStock(nombreProducto, cantidad);
                        }else{
                            System.out.println("El nombre del producto: " + nombreProducto + " no lo vendes");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto:");
                    nombreProducto = sc.nextLine();
                    for (int i = 0; i < listaProductos.size(); i++) { //para comprovar en toda la lista
                        if (listaProductos.get(i).getNombre().equals(nombreProducto)) { //para comprovar que haya un producto con el nombre escrito por el usuario(a falta del id) y asi saber a que producto restar el stock
                            System.out.println("Ingrese la cantidad de productos vendidos: ");
                            int cantidadVendidos = sc.nextInt();
                            listaProductos.get(i).reducirStock(nombreProducto, cantidadVendidos);
                        }else{
                            System.out.println("El nombre del producto: " + nombreProducto + " no lo vendes");
                        }
                    }
                    break;
                case 4:
                    System.out.println("***PRODUCTOS EN EL SISTEMA***");

                    if (listaProductos.size() == 0) {
                        System.out.println("No hay productos registrados.\n");
                        return;
                    }

                    for (int i = 0; i < listaProductos.size(); i++) {
                        producto = listaProductos.get(i);
                        System.out.println("Producto: " + i); //no c pq no use el string.format pero ya no lo cambio por flojera ;)
                        System.out.println("Nombre: " + producto.getNombre());
                        System.out.println("Precio: $" + producto.getPrecio());
                        System.out.println("Stock: " + producto.getStock() + "\n");
                    }
                    break;
                case 5:
                    System.out.println("SALIR.");
                    return;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }

        /*Producto producto1 = new Producto("mango", 15, 50);
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());
        producto1.aumentarStock(20);
        producto1.reducirStock(10);
        System.out.println("Nuevo stock: " + producto1.getStock());*/

    }
}
