import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**HOSPITA**");


        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n**BIENVENIDO**");
            System.out.println("1. REGISTRAR PACIENTE. ");
            System.out.println("2. REGISTRAR MEDICO.");
            System.out.println("3. REGISTRAR CONSULTORIO.");
            System.out.println("4. REGISTRAR CONSULTA.");
            System.out.println("5. SALIR");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("REGISTRAR PACIENTE");
                    break;
                case 2:
                    System.out.println("REGISTRAR MEDICO");
                    break;
                case 3:
                    System.out.println("REGISTRAR CONSULTORIO");
                    break;
                case 4:
                    System.out.println("REGISTRAR CONSULTA");
                    break;
                case 5:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}