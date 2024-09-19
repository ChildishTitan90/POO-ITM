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

    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico){
        this.listaMedicos.add(medico);
    }

    public void registrarConsultorio(Consultorio consultorio){
        this.listaConsultorios.add(consultorio);
    }

    public void registrarConsulta(Consulta consulta){
        //No exista una consulta en la fecha y consultorio deseado
        if (!validarDisponibilidadEnFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getNumeroConsultorio())){
            System.out.println("Ya existe una consulta registrada para esa fecha.");
            return;
        }else{

        }



        /*
        1. No exista una consulta en la fecha indicada en el consultorio indicado
        2. Fecha valida
        3. Medico no tenga una consulta en esa fecha en otro consultorio
        4. Paciente no tenga una consulta en esa fecah
        * */
        this.listaConsultas.add(consulta);
    }

    private boolean validarDisponibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio){
        for (Consulta consulta: this.listaConsultas){
            if (consulta.getFechaHora().equals(fechaDeseada)&& numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()){
                return false;
            }
        }
        return true;
    }

}