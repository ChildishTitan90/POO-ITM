package menu;

import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministrador {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        int opcion = 0;

        System.out.println("**HOSPITAL**");

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
        System.out.println("12.- VER INFORMACION PERSONAL.");
        System.out.println("13. SALIR");

        System.out.print("\nSelecciona una opcion: ");
        opcion = sc.nextInt();
        return opcion;
    }

    public void procesarDatosMenu(int opcion, Administrador administrador, Hospital hospital){
        switch (opcion) {
            case 1:
                System.out.println("************REGISTRAR PACIENTE************\n");

                ArrayList<String> datosPaciente = this.obtnerDatosComun(Rol.PACIENTE, hospital);

                String nombrePaciente = datosPaciente.get(0);
                String apellidoPaciente = datosPaciente.get(1);
                LocalDate fechaNacimientoPaciente = LocalDate.parse(datosPaciente.get(2));
                String numeroTelefonoPaciente = datosPaciente.get(3);
                String emailPaciente = datosPaciente.get(4);
                String contraseniaPaciente = datosPaciente.get(5);

                String id = hospital.generarIdPaciente();

                System.out.println("INGRESA EL TIPO DE SANGRE: ");
                String tipoSangre = sc.nextLine();

                System.out.println("INGRESA EL SEXO DEL PACIENTE: H/M");
                Character sexo = sc.next().charAt(0);

                Paciente paciente = new Paciente(id, nombrePaciente, apellidoPaciente, fechaNacimientoPaciente, tipoSangre, sexo, numeroTelefonoPaciente,  emailPaciente, contraseniaPaciente);
                hospital.registrarPaciente(paciente);
                break;
            case 2:
                System.out.println("************REGISTRAR MEDICO************\n");

                //la tarea es de aqui
                ArrayList<String> datosMedico = this.obtnerDatosComun(Rol.MEDICO, hospital);
                String nombreMedico = datosMedico.get(0);
                String apellidoMedico = datosMedico.get(1);
                LocalDate fechaNacimientoMedico = LocalDate.parse(datosMedico.get(2));
                String numeroTelefonoMedico = datosMedico.get(3);
                String emailMedico = datosMedico.get(4);
                String contraseniaMedico = datosMedico.get(5);

                String idMedico = hospital.generarIdMedico(apellidoMedico, fechaNacimientoMedico);

                System.out.println("INGRESA EL RFC DEL MEDICO: ");
                String rfc = sc.nextLine();

                if (!hospital.listaMedicos.isEmpty()) {
                    while (hospital.validarRfcMedicoYaExiste(rfc)) {
                        System.out.println("YA EXISTE UN MEDICO CON ESE RFC.\n");
                        System.out.println("INGRESA EL RFC DEL MEDICO: ");
                        rfc = sc.nextLine();
                    }
                }

                Medico medico = new Medico(idMedico,nombreMedico, apellidoMedico, fechaNacimientoMedico, numeroTelefonoMedico, rfc, emailMedico, contraseniaMedico );
                hospital.registrarMedico(medico);
                //hata aqui :)
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
                System.out.println("************MOSTRAR INFORMACION PERSONAL************\n");
                String idAdmin = administrador.getId();
                hospital.mostrarAdminPorId(idAdmin);
                break;
            case 13:
                System.out.println("************SALIR************");
                System.out.println("HASTA PRONTO!!!");
                sc.nextLine();
                break;
            default:
                System.out.println("************OPCIÓN NO VALIDA************\n");
                break;
        }
    }

    private ArrayList<String> obtnerDatosComun(Rol rol, Hospital hospital){
        String tipoUsuario = rol == Rol.PACIENTE ? "PACIENTE" : rol == Rol.MEDICO ? "MEDICO" : "ADMINISTRADOR";
        ArrayList<String> datosEnComun = new ArrayList<>();

        sc.nextLine();
        System.out.println(String.format("INGRESA EL NOMBRE DEL %s:", tipoUsuario));
        String nombre = sc.nextLine();
        datosEnComun.add(nombre);//0

        System.out.println(String.format("INGRESA EL APELLIDO DEL %s:", tipoUsuario));
        String apellido = sc.nextLine();
        datosEnComun.add(apellido);//1

        datosEnComun.add(obtenerFechaNacimientoUsuario(tipoUsuario));//2

        boolean esTelefonoValido = false;
        String numeroTelefono = "";
        sc.nextLine();
        while (!esTelefonoValido){
            System.out.println(String.format("INGRESA EL NÚMERO DE TELEFONO DEL %s:", tipoUsuario));
            numeroTelefono = sc.nextLine();
            esTelefonoValido = hospital.validarTelefonoRepetido(rol == Rol.PACIENTE ? hospital.listaPacientes : hospital.listaMedicos, numeroTelefono);
        }

        datosEnComun.add(numeroTelefono);//3

        boolean esEmailValido = false;
        String email = "";
        while (!esEmailValido){
            System.out.println(String.format("INGRESA EL EMAIL DEL %s:", tipoUsuario));
            email = sc.nextLine();
            esEmailValido = hospital.validarEmailRepetido(rol == Rol.PACIENTE ? hospital.listaPacientes : hospital.listaMedicos, email);
        }

        datosEnComun.add(email);//4

        System.out.println(String.format("INGRESA LA CONTRASEÑA DEL %s:", tipoUsuario));
        String contrasenia = sc.nextLine();
        datosEnComun.add(contrasenia);//5

        return datosEnComun;
    }



    private String obtenerFechaNacimientoUsuario(String tipoUsuario){
        LocalDate fechaNacimiento = LocalDate.now();
        boolean esFechaValida = false;

        while (!esFechaValida){
            System.out.println(String.format("INGRESA EL AÑO DE NACIMINETO DEL %s:", tipoUsuario));
            int anio = sc.nextInt();

            System.out.println(String.format("INGRESA EL MES DE NACIMINETO DEL %s:", tipoUsuario));
            int mes = sc.nextInt();

            System.out.println(String.format("INGRESA EL DIA DE NACIMINETO DEL %s:", tipoUsuario));
            int dia = sc.nextInt();

            LocalDate fechaNacimieto = LocalDate.of(anio,mes,dia);

            if (fechaNacimieto.isAfter(LocalDate.now())){
                System.out.println("LA FECHA DE NACIMIENTO NO PUEDE SER POSTERIOR AL DIA DE HOY. INTENTA DE NUEVO\n");
            }else {
                esFechaValida = true;
                fechaNacimiento = fechaNacimieto;
            }
        }
        return fechaNacimiento.toString();
    }

}

// hacer lo mismo que hicimos ahorita, pero agregar a todas las clases un nuevo atributo, crear validarCorreoRepetido, en hospital y validarTelefonoRepetido ala clase hospital
