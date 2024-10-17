import hospital.Hospital;
import menu.Menu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int opcionInicial = 0;

        while(opcionInicial != 2) {
            System.out.println("BIENVENIDO");
            System.out.println("1.- INICIAR SESION");
            System.out.println("2.- SALIR");
            System.out.println("Ingresa la opcion deseada: ");
            opcionInicial = sc.nextInt();

            switch (opcionInicial) {
                case 1:
                    menu.login();
                    break;
                case 2:
                    System.out.println("HASTA PRONTO");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

}