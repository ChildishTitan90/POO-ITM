package menu;

import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();
    private static final String USUARIO_PACIENTE = "juan1234"; // el final es una constante y no se puede cambiar
    private final String CONTRASENIA_PACIENTE = "12345*";
    private final String USUARIO_MEDICO = "ale123";
    private final String CONTRASENIA_MEDICO = "54321*";

    public void login(){
        int intentosMaximos = 5, intentosUsuario = 0;

        while(intentosUsuario < intentosMaximos){
            System.out.println("BIENVENIDO");
            System.out.println("INICIA SESIÓN PARA CONTINUAR");

            System.out.println("INGGRESA TU USUARIO: ");
            String usuario = sc.nextLine();

            System.out.println("INGRESA TU CONTRASEÑA: ");
            String contrasenia = sc.nextLine();

            if (usuario.equals(this.USUARIO_PACIENTE)){
                if (contrasenia.equals(this.CONTRASENIA_PACIENTE)){
                    this.mostrarMenuPaciente();
                    intentosUsuario = 0;
                }else{
                    this.mostrarErrorInicioSesion(intentosUsuario);
                }
            } else if (usuario.equals(this.USUARIO_MEDICO)) {
                if (contrasenia.equals(this.CONTRASENIA_MEDICO)){
                    this.mostrarMenuMedico();
                }else{
                    this.mostrarMenuMedico();
                    intentosUsuario = 0;
                }
            }else{
                this.mostrarErrorInicioSesion(intentosUsuario);
            }
        }
        System.out.println("INTENTOS MÁXIMOS ALCANZADOS");
    }

    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("USUARIO O CONTRASEÑA INVALIDOS, INTENTA DE NUEVO");
        return intentosUsuario + 1;
    }

    private void mostrarMenuPaciente(){
        int opcion = 0;

        while(opcion != 2){
            System.out.println("HOSPITAL");
            System.out.println("MENU DE PACIENTE");
            System.out.println("1. VER MIS CONSULTAS");
            System.out.println("2.SALIR");

            System.out.println("SELECCIONA UNA OPCION: ");
            opcion = sc.nextInt();
        }
    }

    private void mostrarMenuMedico(){
        int opcion = 0;

        while(opcion != 4){
            System.out.println("HOSPITAL");
            System.out.println("MENU DE MEDICO");
            System.out.println("1. VER MIS CONSULTAS");
            System.out.println("2.VER MIS PACIENTES");
            System.out.println("3.CONSULTAR PACIENTE");
            System.out.println("4.SALIR");

            System.out.println("SELECCIONA UNA OPCION: ");
            opcion = sc.nextInt();
        }
    }

    private void mostrarMenu() {
        int opcion = 0;

        System.out.println("**HOSPITAL**");

        while (opcion != 12) {
            System.out.println("\n**BIENVENIDO**");
            System.out.println("1. REGISTRAR PACIENTE. ");
            System.out.println("2. REGISTRAR MEDICO.");
            System.out.println("3. REGISTRAR CONSULTORIO.");
            System.out.println("4. REGISTRAR CONSULTA.");
            System.out.println("5. MOSTRAR PACIENTES.");
            System.out.println("6. MOSTRAR MEDICOS.");
            System.out.println("7. MOSTRAR CONSULTORIOS.");
            System.out.println("8. MOSTRAR CONSULTAS.");
            System.out.println("9. MOSTRAR PACIENTE POR ID");
            System.out.println("10. MOSTRAR MEDICO POR ID");
            System.out.println("11. MOSTRAR CONSULTORIO POR ID");
            System.out.println("12. SALIR");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("************REGISTRAR PACIENTE************\n");
                    String id = hospital.generarIdPaciente();
                    sc.nextLine();

                    System.out.println("INGRESA EL NOMBRE DEL PACIENTE: ");
                    String nombre = sc.nextLine();

                    System.out.println("INGRESA LOS APELLIDOS: ");
                    String apellidos = sc.nextLine();

                    System.out.println("INGRESA EL AÑO DE NACIMIENTO DEL PACIENTE");
                    int anio = sc.nextInt();

                    System.out.println("INGRESA EL MES DE NACIMIENTO DEL PACIENTE");
                    int mes = sc.nextInt();

                    System.out.println("INGRESA EL DIA DE NACIMIENTO DEL PACIENTE");
                    int dia = sc.nextInt();

                    LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

                    sc.nextLine();
                    System.out.println("INGRESA EL TIPO DE SANGRE: ");
                    String tipoSangre = sc.nextLine();

                    System.out.println("INGRESA EL SEXO DEL PACIENTE: H/M");
                    Character sexo = sc.next().charAt(0);

                    sc.nextLine();
                    System.out.println("INGRESA EL TELEFONO DEL PACIENTE: ");
                    String telefono = sc.nextLine();

                    if (!hospital.listaPacientes.isEmpty()) {
                        while (hospital.validarTelefoPacienteYaExiste(telefono)) {
                            System.out.println("YA EXISTE UN PACIENE CON ESE NUMERO DE TELEFONO.\n");
                            System.out.println("INGRESA EL TELEFONO DEL PACIENTE: ");
                            telefono = sc.nextLine();
                        }
                    }

                    Paciente paciente = new Paciente(id, nombre, apellidos, fechaNacimiento, tipoSangre, sexo, telefono);
                    hospital.registrarPaciente(paciente);
                    break;
                case 2:
                    System.out.println("************REGISTRAR MEDICO************\n");

                    sc.nextLine();
                    System.out.println("INGRESA EL NOMBRE DEL MEDICO: ");
                    String nombreMedico = sc.nextLine();

                    System.out.println("INGRESA LOS APELLIDOS: ");
                    String apellidosMedico = sc.nextLine();

                    System.out.println("INGRESA EL AÑO DE NACIMIENTO DEL MEDICO");
                    int anioMedico = sc.nextInt();

                    System.out.println("INGRESA EL MES DE NACIMIENTO DEL MEDICO");
                    int mesMedico = sc.nextInt();

                    System.out.println("INGRESA EL DIA DE NACIMIENTO DEL MEDICO");
                    int diaMedico = sc.nextInt();

                    LocalDate fechaNacimientoMedico = LocalDate.of(anioMedico, mesMedico, diaMedico);

                    String idMedico = hospital.generarIdMedico(apellidosMedico, fechaNacimientoMedico);

                    sc.nextLine();
                    System.out.println("INGRESA EL TELEFONO DEL MEDICO: ");
                    String telefonoMedico = sc.nextLine();

                    if (!hospital.listaMedicos.isEmpty()) {
                        while (hospital.validarTelefoMedicoYaExiste(telefonoMedico)) {
                            System.out.println("YA EXISTE UN MEDICO CON ESE NUMERO DE TELEFONO.\n");
                            System.out.println("INGRESA EL TELEFONO DEL MEDICO: ");
                            telefonoMedico = sc.nextLine();
                        }
                    }

                    System.out.println("INGRESA EL RFC DEL MEDICO: ");
                    String rfc = sc.nextLine();

                    if (!hospital.listaMedicos.isEmpty()) {
                        while (hospital.validarRfcMedicoYaExiste(rfc)) {
                            System.out.println("YA EXISTE UN MEDICO CON ESE RFC.\n");
                            System.out.println("INGRESA EL RFC DEL MEDICO: ");
                            rfc = sc.nextLine();
                        }
                    }

                    Medico medico = new Medico(idMedico,nombreMedico, apellidosMedico, fechaNacimientoMedico, telefonoMedico, rfc);
                    hospital.registrarMedico(medico);
                    break;
                case 3:
                    System.out.println("************REGISTRAR CONSULTORIO************\n");
                    String idConsultorio = hospital.generarIdConsultorio();
                    sc.nextLine();
                    System.out.println("INGRESA EL PISO DONDE SE ENCUENTRA: ");
                    int piso = sc.nextInt();
                    System.out.println("INGRESA EL NÚMERO DE CONSULTORIO: ");
                    int numeroConsultorio = sc.nextInt();

                    Consultorio consultorio = new Consultorio(idConsultorio, piso, numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                    System.out.println("************REGISTRAR CONSULTA************\n");

                    System.out.println("INGRESA EL DIA DE LA CONSULTA DESEADA: ");
                    int diaConsulta = sc.nextInt();

                    System.out.println("INGRESA EL MES DE LA CONSULTA DESEADA: ");
                    int mesConsulta = sc.nextInt();

                    System.out.println("INGRESA EL AÑO DE LA CONSULTA: ");
                    int anioConsulta = sc.nextInt();

                    System.out.println("INGRESA LA HORA DE LA CONSULTA: ");
                    int horaConsulta = sc.nextInt();

                    System.out.println("INGRESA LOS MINUTOS DE LA CONSULTA: ");
                    int minutosConsulta = sc.nextInt();

                    LocalDateTime fechaConsulta = LocalDateTime.of(anioConsulta, mesConsulta, diaConsulta, horaConsulta, minutosConsulta);

                    while (!hospital.validarFechaConsulta(fechaConsulta)){

                        if (!hospital.validarFechaConsulta(fechaConsulta)) {
                            System.out.println("LA FECHA NO PUEDE ESTAR EN EL PASADAO.");
                        }

                        System.out.println("INGRESA EL DIA DE LA CONSULTA DESEADA: ");
                        diaConsulta = sc.nextInt();

                        System.out.println("INGRESA EL MES DE LA CONSULTA DESEADA: ");
                        mesConsulta = sc.nextInt();

                        System.out.println("INGRESA EL AÑO DE LA CONSULTA: ");
                        anioConsulta = sc.nextInt();

                        System.out.println("INGRESA LA HORA DE LA CONSULTA: ");
                        horaConsulta = sc.nextInt();

                        System.out.println("INGRESA LOS MINUTOS DE LA CONSULTA: ");
                        minutosConsulta = sc.nextInt();

                        fechaConsulta = LocalDateTime.of(anioConsulta, mesConsulta, diaConsulta, horaConsulta, minutosConsulta);
                    }

                    sc.nextLine();
                    Paciente pacienteConsulta = null;

                    while (pacienteConsulta == null) {
                        System.out.println("INGRESA EL ID DEL PACIENTE: ");
                        String pacienteId = sc.nextLine();

                        pacienteConsulta = hospital.obtenerPacientePorId(pacienteId);

                        if (pacienteConsulta == null) {
                            System.out.println("PACIENTE NO ENCONTRADO, INTENTA DE NUEVO.\n ");
                        }
                    }

                    Medico medicoConsulta = null;

                    while (medicoConsulta == null) {
                        System.out.println("INGRESA EL ID DEL MEDICO: ");
                        String medicoId = sc.nextLine();

                        medicoConsulta = hospital.obtenerMedicoPorId(medicoId);

                        if (medicoConsulta == null) {
                            System.out.println("MEDICO NO ENCONTRADO, INTENTA DE NUEVO.\n ");
                        }
                    }

                    Consultorio consultorioConsulta = null;

                    while (consultorioConsulta == null) {
                        System.out.println("INGRESA EL ID DEL CONSULTIRIO DESEADO: ");
                        String idConsultorioDeseado = sc.nextLine();

                        consultorioConsulta = hospital.obtenerConsultorioPorId(idConsultorioDeseado);

                        if (consultorioConsulta == null) {
                            System.out.println("CONSULTORIO NO ENCONTRADO, INTENTA DE NUEVO.\n ");
                        }
                    }

                    String id_consulta = hospital.generarIdConsulta();

                    Consulta consulta = new Consulta(id_consulta, fechaConsulta, pacienteConsulta, medicoConsulta, consultorioConsulta);
                    hospital.registrarConsulta(consulta);

                    break;
                case 5:
                    System.out.println("************MOSTRAR PACIENTES************\n");
                    hospital.mostrarPaciente();
                    break;
                case 6:
                    System.out.println("************MOSTRAR MEDICOS************\n");
                    hospital.mostrarMedico();
                    break;
                case 7:
                    System.out.println("************MOSTRAR CONSULTORIOS************\n");
                    hospital.mostrarConsultorio();
                    break;
                case 8:
                    System.out.println("************MOSTRAR CONSULTAS************\n");
                    hospital.mostrarConsulta();
                    break;
                case 9:
                    System.out.println("************MOSTRAR PACIENTE POR ID************\n");
                    sc.nextLine();
                    System.out.println("Ingresa el id del paciente a buscar");
                    String idPaciente = sc.nextLine();
                    hospital.mostrarPacientePorId(idPaciente);
                    break;
                case 10:
                    System.out.println("************MOSTRAR MEDICO POR ID************\n");
                    sc.nextLine();
                    System.out.println("Ingresa el id del medico a buscar");
                    String idM = sc.nextLine();
                    hospital.mostrarMedicoPorId(idM);
                    break;
                case 11:
                    System.out.println("************MOSTRAR CONSULTORIO POR ID************\n");
                    sc.nextLine();
                    System.out.println("Ingresa el id del consultorio a buscar");
                    String id_Consultorio = sc.nextLine();
                    hospital.mostrarConsultorioPorId(id_Consultorio);
                    break;
                case 12:
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