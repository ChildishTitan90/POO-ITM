package hospital;

import consultas.Consulta;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValidadorHospital {


    public boolean validarDisponibilidadEnFechaConsulta(LocalDateTime fechaDeseada, int numeroConsultorio, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta: listaConsultas){
           /* if (consulta.getFechaHora().equals(fechaDeseada)&& numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()){
                return false;
            }*/
            if(consulta.getFechaHora().isEqual(fechaDeseada) && numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()){
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

    public boolean validarDisponibilidadMedico(LocalDateTime fechaDeseada, String idMedico, ArrayList<Consulta> listaConsultas ){
        for (Consulta consulta: listaConsultas){
            /*if (consulta.getFechaHora().equals(fechaDeseada) && consulta.getMedico().getId().equals(idMedico)){
                return false;
            }*/

            if(consulta.getFechaHora().isEqual(fechaDeseada) && consulta.getMedico().getId().equals(idMedico)){
                return false;
            }
        }
        return true;
    }

    public boolean validarFechaCorrecta(LocalDateTime fechaDeseada){
        LocalDateTime fechaActual = LocalDateTime.now();

        if (fechaDeseada.isBefore(fechaActual)){
            return false;
        }
        return true;
    }

}
