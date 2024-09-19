package consultas;

import medicos.Medico;
import pacientes.Paciente;
import consultorios.Consultorio;

public class Consulta {
    public int id;
    public String fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public int getId() {
        return id;
    }

    public String getFechaHora() {
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
}
