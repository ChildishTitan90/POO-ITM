package consultas;

import medicos.Medico;
import pacientes.Paciente;
import consultorios.Consultorio;
import java.time.LocalDateTime;

public class Consulta {
    public int id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public Consulta(int id, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public int getId() {
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
        String datos = String.format("ID: %d, FECHA/HORA: %s, PACIENTE: %s, MEDICO: %s, CONSULTORIO: %s", this.id, this.fechaHora, this.paciente.getNombre(), this.medico.getNombre(), this.consultorio.getNumeroConsultorio());
        return datos;
    }
}
