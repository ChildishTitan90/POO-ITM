package medicos;

import java.util.Random;

public class Medico {
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private  String telefono;
    private  String rfc;
    private Random random = new Random();

    public Medico(String nombre, String apellidos, String fechaNacimiento, String telefono, String rfc) {
        this.id = random.nextInt(1,10001);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public int getId() {
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
        String datos = String.format("ID: %d, NOMBRE: %s, APELLIDOS: %s, FECHA NACIMIENTO: %s, TELEFONO: %s, RFC: %s", this.id, this.nombre, this.apellidos, this.fechaNacimiento, this.telefono, this.telefono, this.rfc);
        return datos;
    }
}
