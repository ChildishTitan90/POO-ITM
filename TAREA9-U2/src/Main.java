import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        System.out.println("**HOSPITA**");


        int opcion = 0;
        while (opcion != 9) {
            System.out.println("\n**BIENVENIDO**");
            System.out.println("1. REGISTRAR PACIENTE. ");
            System.out.println("2. REGISTRAR MEDICO.");
            System.out.println("3. REGISTRAR CONSULTORIO.");
            System.out.println("4. REGISTRAR CONSULTA.");
            System.out.println("5. MOSTRAR PACIENTE.");
            System.out.println("6. MOSTRAR MEDICO.");
            System.out.println("7. MOSTRAR CONSULTORIO.");
            System.out.println("8. MOSTRAR CONSULTA.");
            System.out.println("9. SALIR");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("************REGISTRAR PACIENTE************\n");

                    sc.nextLine();
                    System.out.println("INGRESA EL NOMBRE DEL PACIENTE: ");
                    String nombre = sc.nextLine();
                    System.out.println("INGRESA LOS APELLIDOS: ");
                    String apellidos = sc.nextLine();
                    System.out.println("INGRESA SU FECHA DE NACIMIENTO: ");
                    String fechaNacimiento = sc.nextLine();
                    System.out.println("INGRESA EL TIPO DE SANGRE: ");
                    String tipoSangre = sc.nextLine();
                    System.out.println("INGRESA EL SEXO DEL PASIENTE: H/M");
                    Character sexo = sc.next().charAt(0);
                    System.out.println("INGRESA EL TELEFONO DEL PACIENTE: ");
                    String telefono = sc.nextLine();

                    Paciente paciente = new Paciente(nombre, apellidos, fechaNacimiento, tipoSangre, sexo, telefono);
                    hospital.registrarPaciente(paciente);
                    break;
                case 2:
                    System.out.println("************REGISTRAR MEDICO************\n");

                    sc.nextLine();
                    System.out.println("INGRESA EL NOMBRE DEL MEDICO: ");
                    String nombreMedico = sc.nextLine();
                    System.out.println("INGRESA LOS APELLIDOS: ");
                    String apellidosMedico = sc.nextLine();
                    System.out.println("INGRESA SU FECHA DE NACIMIENTO: ");
                    String fechaNacimientoMedico = sc.nextLine();
                    System.out.println("INGRESA EL TELEFONO DEL MEDICO: ");
                    String telefonoMedico = sc.nextLine();
                    System.out.println("INGRESA EL RFC DEL PACIENTE: ");
                    String rfc = sc.nextLine();

                    Medico medico = new Medico(nombreMedico, apellidosMedico, fechaNacimientoMedico, telefonoMedico, rfc);
                    hospital.registrarMedico(medico);
                    break;
                case 3:
                    System.out.println("************REGISTRAR CONSULTORIO************\n");

                    sc.nextLine();
                    System.out.println("INGRESA EL PISO DONDE SE ENCUENTRA: ");
                    int piso = sc.nextInt();
                    System.out.println("INGRESA EL NÚMERO DE CONSULTORIO: ");
                    int numeroConsultorio = sc.nextInt();

                    Consultorio consultorio = new Consultorio(piso, numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                    System.out.println("************REGISTRAR CONSULTA************\n");

                    sc.nextLine();
                    System.out.println("INGRESA EL ID DE LA CONSULTA: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("INGRESA LA FECHA Y HORA DE LA CONSULTA: ");
                    String fechaHora = sc.nextLine();
                    System.out.println("INGRESA EL ID DEL PACIENTE: ");
                    int idPaciente = sc.nextInt();
                    System.out.println("INGRESA EL ID DEL MEDICO: ");
                    int idMedico = sc.nextInt();
                    System.out.println("INGRESA EL ID DEL CONSULTORIO: ");
                    int idConsultorio = sc.nextInt();

                    /*if (!hospital.listaPacientes.contains(idPaciente)) {
                        System.out.println("Error: El paciente no existe.");

                        return;
                    }

                     //Validación del médico
                    if (!hospital.listaMedicos.contains(idMedico)) {
                        System.out.println("Error: El medico no existe.");
                        return;
                    }*/

                    Consulta consulta = new Consulta(id, fechaHora, hospital.listaPacientes.get(idPaciente), hospital.listaMedicos.get(idMedico), hospital.listaConsultorios.get(idConsultorio));
                    hospital.registrarConsulta(consulta, idPaciente);
                    break;
                case 5:
                    System.out.println("************MOSTRAR PACIENTE************\n");
                        hospital.mostrarPaciente();
                    break;
                case 6:
                    System.out.println("************MOSTRAR MEDICO************\n");
                    hospital.mostrarMedico();
                    break;
                case 7:
                    System.out.println("************MOSTRAR CONSULTORIO************\n");
                    hospital.mostrarConsultorio();
                    break;
                case 8:
                    System.out.println("************MOSTRAR CONSULTA************\n");
                    hospital.mostrarConsulta();
                    break;
                case 9:
                    System.out.println("************SALIR************");
                    System.out.println("HASTA PRONTO!!!");
                    break;
                default:
                    System.out.println("************OPCIÓN NO VALIDA************\n");
                    break;
            }
        }
    }
}