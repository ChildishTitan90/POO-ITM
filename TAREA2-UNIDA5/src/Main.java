import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        double precio = 0.0;
        int cantidad = 0;

        //while (nombre.isEmpty()){
            try {
                System.out.println("INGRESA EL NOMBRE DEL PRODUCTO: ");
                nombre = sc.nextLine();
            }catch (InvalidProducException e){
                System.out.println(e.getMessage());
            }
        //}
        // while (precio <= 0){
            try {
                System.out.println("INGRESA EL PRECIO DEL PRODUCTO: ");
                precio = Double.parseDouble(sc.nextLine());

            }catch (InvalidPriceException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        //}
        //while (cantidad <= 0){
            try {
                System.out.println("INGRESA EL CANTIDAD DEL PRODUCTO: ");
                cantidad = Integer.parseInt(sc.nextLine());
            }catch (InvalidQuantityException | NumberFormatException e){
                System.out.println(e.getMessage());
            }
        //}
        Producto producto = new Producto(nombre, precio, cantidad);
        System.out.println(producto.mostrarDetalles());
    }
}