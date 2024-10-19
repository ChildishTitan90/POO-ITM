package menu;

import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();
    private MenuAdministrador menuAdministrador = new MenuAdministrador();
    private MenuMedico menuMedico = new MenuMedico();
    private MenuPaciente menuPaciente = new MenuPaciente();

    public void login(){
        hospital.Hospital();

        int intentosMaximos = 5, intentosUsuario = 0;

        while(intentosUsuario < intentosMaximos){
            System.out.println("BIENVENIDO");
            System.out.println("INICIA SESIÓN PARA CONTINUAR");

            System.out.println("INGGRESA TU ID DE USUARIO: ");
            String usuario = sc.nextLine();

            System.out.println("INGRESA TU CONTRASEÑA: ");
            String contrasenia = sc.nextLine();

            Usuario usuarioeEnSesion = hospital.validarInicioSesion(usuario, contrasenia);

            if (usuarioeEnSesion instanceof Usuario){
                if (usuarioeEnSesion.getRol() == Rol.PACIENTE ){
                    Paciente pacienteEnSesion = (Paciente) usuarioeEnSesion;
                    MenuPaciente menuPaciente = new MenuPaciente();
                    int opcion = 0;

                    while (opcion !=4){
                        opcion = menuPaciente.mostrarMenu();
                        menuPaciente.procesarDatosMenu(opcion, hospital, pacienteEnSesion);
                    }

                    //this.mostrarMenuPaciente(pacienteEnSesion);
                    intentosUsuario = 0;
                } else if (usuarioeEnSesion.getRol() == Rol.MEDICO) {
                    Medico medicoEnSesion = (Medico) usuarioeEnSesion;
                    MenuMedico menuMedico = new MenuMedico();

                    int opcion = 0;
                    while (opcion !=7){
                        opcion = menuMedico.mostrarMenu();
                        menuMedico.procesarDatosMenu(opcion,medicoEnSesion, hospital);
                    }
                    intentosUsuario = 0;
                }else{
                    Administrador administradorEnSesion = (Administrador) usuarioeEnSesion;
                    MenuAdministrador menuAdministrador = new MenuAdministrador();
                    int opcion = 0;

                    while (opcion !=13){
                        opcion = menuAdministrador.mostrarMenu();
                        menuAdministrador.procesarDatosMenu(opcion, administradorEnSesion, hospital);
                    }
                    //menuAdministrador.mostrarMenu();
                    intentosUsuario = 0;
                }
            } else{
                intentosUsuario = this.mostrarErrorInicioSesion(intentosUsuario);
            }
        }
        System.out.println("INTENTOS MÁXIMOS ALCANZADOS");
    }

    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("USUARIO O CONTRASEÑA INVALIDOS, INTENTA DE NUEVO");
        return intentosUsuario + 1;
    }

}