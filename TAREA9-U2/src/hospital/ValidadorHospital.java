package hospital;

import consultas.Consulta;
import medicos.Medico;
import pacientes.Paciente;

import java.util.ArrayList;

public class ValidadorHospital {


    public boolean validarDisponibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta: listaConsultas){
            if (consulta.getFechaHora().equals(fechaDeseada)&& numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()){
                return false;
            }
        }
        return true;
    }

    /*public boolean validarExistenciaPaciente(int idPaciente, ArrayList<Consulta> listaConsultas ){
        for (Consulta consulta: listaConsultas){
            if (consulta.getPaciente().getId()==(idPaciente)){
                return true;
            }
        }
        return false;
    }*/

    public boolean validarDisponibilidadMedico(String fechaDeseada, String idMedico, ArrayList<Consulta> listaConsultas ){
        for (Consulta consulta: listaConsultas){
            if (consulta.getFechaHora().equals(fechaDeseada) && consulta.getMedico().getId().equals(idMedico)){
                return false;
            }
        }
        return true;
    }


}
