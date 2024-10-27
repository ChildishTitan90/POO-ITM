package usuarios.administrador;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public Double sueldo;
    public String rfc;
    public int aniosTrabajados;

    public Administrador(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String email, Double sueldo, String rfc, int aniosTrabajados, String contrasenia, Rol rol ) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, email,rol);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.aniosTrabajados = aniosTrabajados;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public String getRfc() {
        return rfc;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %s, NOMBRE: %s, APELLIDOS: %s, FECHA NACIMIENTO: %s, TELEFONO: %s, SUELDO: %.2f, RFC: %s, AÑOS TRABAJADOS: %d",
                this.id, this.nombre, this.apellidos, this.fechaNacimiento, this.telefono, this.sueldo, this.rfc, this.aniosTrabajados);
        return datos;
    }
}
