package menu;

import hospital.Hospital;
import usuarios.pacientes.Paciente;

import java.util.Scanner;

public class MenuPaciente {
    private Scanner sc = new Scanner(System.in);


    public int mostrarMenu() {
        int opcion = 0;

        System.out.println("HOSPITAL");
        System.out.println("MENU DE PACIENTE");
        System.out.println("1. VER MIS CONSULTAS");
        System.out.println("2. VER MIS DATOS");
        System.out.println("3. VER MI EXPEDIENTE");
        System.out.println("4.SALIR");

        System.out.println("SELECCIONA UNA OPCION: ");
        opcion = sc.nextInt();
        return opcion;




    }

    public void procesarDatosMenu(int opcion, Hospital hospital, Paciente paciente) {
        switch (opcion){
            case 1:
                System.out.println("---VER MIS CONSULTAS---");
                hospital.verConsultasPaciente(paciente.getId());
                break;
            case 2:
                System.out.println("MIS DATOS");
                System.out.println(paciente.mostrarDatos());
                break;
            case 3:
                break;
            case 4 :
                System.out.println("HASTA LUEGO");
                sc.nextLine();
                break;
            default:
                System.out.println("OPCION NO VALIDA.");
                break;
        }
    }
}
