package usuarios.administrador;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public Double sueldo;
    public String rfc;
    public int aniosTrabajados;

    public Administrador(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contrasenia, Rol rol, Double sueldo, String rfc, int aniosTrabajados) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, rol);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.aniosTrabajados = aniosTrabajados;
    }
}
