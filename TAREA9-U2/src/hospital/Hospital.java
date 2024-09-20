package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos= new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    private ValidadorHospital validador = new ValidadorHospital();

    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico){
        this.listaMedicos.add(medico);
    }

    public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorios.add(consultorio);
    }

    public void registrarConsulta(Consulta consulta, int idPaciente){
        //No exista una consulta en la fecha y consultorio deseado
        if (!validador.validarDisponibilidadEnFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getNumeroConsultorio(), this.listaConsultas)){
            System.out.println("Ya existe una consulta registrada para esa fecha.");
            return;
        }

        //validar disponibilidadd medico
        if (!validador.validarDisponibilidadMedico(consulta.getFechaHora(), consulta.getMedico().getId(), this.listaConsultas)){
            System.out.println("El medico no tiene disponibilidad para esa fecha.");
            return;
        }

        this.listaConsultas.add(consulta);
    }


    public void mostrarPaciente(){
        if (listaPacientes.size() == 0){
            System.out.println("No hay pacientes registrados");
        }

        for (Paciente paciente : this.listaPacientes){
            System.out.println(paciente.mostrarDatos());
        }
    }

    public void mostrarMedico(){
        if (listaMedicos.size() == 0){
            System.out.println("No hay medicos registrados");
        }

        for (Medico medico : this.listaMedicos){
            System.out.println(medico.mostrarDatos());
        }
    }

    public void mostrarConsultorio(){
        if (listaConsultorios.size() == 0){
            System.out.println("No hay consultorios registrados");
        }

        for (Consultorio consultorio : this.listaConsultorios){
            System.out.println(consultorio.mostrarDatos());
        }
    }

    public void mostrarConsulta(){
        if (listaConsultas.size() == 0){
            System.out.println("No hay consultas registradas");
        }

        for (Consulta consulta : this.listaConsultas){
            System.out.println(consulta.mostrarDatos());
        }
    }

}