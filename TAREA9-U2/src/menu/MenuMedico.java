package menu;

import consultas.Consulta;
import hospital.Hospital;
import medicos.Medico;

import java.util.Scanner;

public class MenuMedico {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        int opcion = 0;

        System.out.println("HOSPITAL");
        System.out.println("MENU DE MEDICO");
        System.out.println("1.VER MIS CONSULTAS ACTUALES");
        System.out.println("2.VER MIS PACIENTES");
        System.out.println("3.CONSULTAR PACIENTE");
        System.out.println("4.-CONSULTAR HISTORIAL DE PACIENTE");
        System.out.println("5.-COMPLETAR CONSULTA");
        System.out.println("6-VER MIS DATOS");
        System.out.println("7.SALIR");

        System.out.println("SELECCIONA UNA OPCION: ");
        opcion = sc.nextInt();
        return opcion;
    }

    public void procesarDatosMenu(int opcion, Medico medico, Hospital hospital) {
        switch (opcion){
            case 1:
                System.out.println("---VER MIS CONSULTAS ACTUALES---");
                hospital.verConsultasMedico(medico.getId());
                break;
            case 2:
                System.out.println("---VER MIS PACIENTES---");
                for (Consulta consulta : hospital.listaConsultas){
                    if(medico.equals(consulta.getMedico().getNombre())){
                        System.out.println(consulta.paciente.mostrarDatos());
                    }
                }
                break;
            case 3:
                System.out.println("---CONSULTAR PACIENTE---");

                break;
            case 4:
                System.out.println("---CONSULTAR HISTORIAL DE PACIENTE--");
                break;

            case 5:
                System.out.println("---COMPLETAR CONSULTA---");
                break;
            case 6:
                System.out.println("---MIS DATOS---");
                System.out.println(medico.mostrarDatos());
                break;
            case 7:
                System.out.println("HASTA LUEGO");
                sc.nextLine();
                break;
            default:
                System.out.println("OPCION NO VALILIDA");
                sc.nextLine();
                break;
        }
    }

    public void procesarDatosMenu(int opcion, usuarios.medicos.Medico medicoEnSesion, Hospital hospital) {
    }
}
