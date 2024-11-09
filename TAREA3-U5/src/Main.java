import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Habitacion> listaHabitaciones = new ArrayList();
        listaHabitaciones.add(new Habitacion(1, "Individual", 50.00, true));
        listaHabitaciones.add(new Habitacion(2, "Doble", 75.00, true));
        listaHabitaciones.add(new Habitacion(3, "Suite", 150.00, true));

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("--- Sistema de Reservas de Habitaciones ---\n");
            System.out.println("1. Mostrar detalles de las habitaciones");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Liberar una habitación");
            System.out.println("4. Salir");
            try {
                System.out.print("Seleccione una opción: ");
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("INGRESA UNA OPCIÓN NUMERICA VALIDA");
            }

            switch (opcion) {
                case 1:
                    for (int i = 0; i < listaHabitaciones.size(); i++) {
                        System.out.println(listaHabitaciones.get(i).mostrarDetalles());
                    }
                    break;
                case 2:
                    System.out.println("---RESERVAR HABITACIÓN---");
                    System.out.println("1.- INDIVIDUAL");
                    System.out.println("2.- DOBLE");
                    System.out.println("3.- SUITE");

                    try{
                        System.out.println("INGRESE EL NÚMERO DE HABITACIÓN: ");
                        int idHabitacion = Integer.parseInt(sc.nextLine());

                        System.out.println("INGRESE EL NÚMERO DE NOCHES A RESERVAR: ");
                        int noches = Integer.parseInt(sc.nextLine());

                        Habitacion habitacion = listaHabitaciones.stream() .filter(h -> h.getId() == idHabitacion).findFirst().orElseThrow(() -> new IllegalArgumentException("HABITACIÓN NO ENCONTRADA"));

                        System.out.println(habitacion.reservar(noches));

                    }catch(NonAvailableRoomException | InvalidNumberOfNigthsException | IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("---LIBERAR HABITACIÓN---");
                    System.out.println("1.- INDIVIDUAL");
                    System.out.println("2.- DOBLE");
                    System.out.println("3.- SUITE");
                    try{
                        System.out.println("INGRESE EL NÚMERO DE HABITACIÓN A LIBREAR: ");
                        int idHabitacion = Integer.parseInt(sc.nextLine());

                        Habitacion habitacion = listaHabitaciones.stream() .filter(h -> h.getId() == idHabitacion).findFirst().orElseThrow(() -> new IllegalArgumentException("HABITACIÓN NO ENCONTRADA"));
                        System.out.println(habitacion.liberar());

                    }catch(NonAvailableRoomException | IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("HASTA PRONTO!!");
                    break;
            }
        }
    }
}