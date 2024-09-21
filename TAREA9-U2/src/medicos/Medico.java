package medicos;

import java.util.Random;

public class Medico {
    public String id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private  String telefono;
    private  String rfc;

    public Medico(String id, String nombre, String apellidos, String fechaNacimiento, String telefono, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %s, NOMBRE: %s, APELLIDOS: %s, FECHA NACIMIENTO: %s, TELEFONO: %s, RFC: %s", this.id, this.nombre, this.apellidos, this.fechaNacimiento, this.telefono, this.telefono, this.rfc);
        return datos;
    }
}
