package consultas;

import medicos.Medico;
import pacientes.Paciente;
import consultorios.Consultorio;
import java.time.LocalDateTime;

public class Consulta {
    public String id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public Consulta(String id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %s, FECHA/HORA: %s, ID PACIENTE: %s, PACIENTE: %s, ID MEDICO: %s, MEDICO: %s, PISO CONSULTRIO: %d, CONSULTORIO: %d", this.id, this.fechaHora, this.paciente.getId(), this.paciente.getNombre(), this.medico.getId(), this.medico.getNombre(), this.consultorio.getPiso(), this.consultorio.getNumeroConsultorio());
        return datos;
    }
}
