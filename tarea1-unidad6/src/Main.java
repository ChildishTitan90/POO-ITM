import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("MENÚ:");
            System.out.println("1. ESCRIBIR TAREA");
            System.out.println("2. LEER TAREAS");
            System.out.println("3. TERMINAR");
            System.out.print("ELIJA UNA OPCIÓN: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("ESCRIBIR TAREA");
                    try (FileWriter writer = new FileWriter("ListaDeTareas.txt", true); BufferedWriter bw = new BufferedWriter(writer)){
                        System.out.print("INGRESE LA TAREA: ");
                        String tarea = sc.nextLine();
                        bw.write(tarea + "\n");
                    }catch (IOException e){
                        System.out.println("ERROR AL SOBREESCRIBIR EL ARCHIVO" + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("--------LISTA DE TAREAS--------");
                    try (BufferedReader read = new BufferedReader(new FileReader("ListaDeTareas.txt"))) {
                        String lectura;
                        while ((lectura = read.readLine()) != null) {
                            System.out.println(lectura);
                        }
                    } catch (IOException e){
                        System.out.println("ERROR AL LEER EL ARCHIVO" + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("PROGRAMA TERMINADO");
                    break;
                default:
                    System.out.println("INGRESA UNA OPCIÓN VALIDA.");
            }
        }
    }
}