package usuarios;

import usuarios.utils.Rol;

import java.time.LocalDate;

public class Usuario {
    public String id;

    public String nombre;

    public String apellidos;

    public LocalDate fechaNacimiento;

    public String telefono;

    private String contrasenia;

    public Rol rol;//enum

    public Usuario(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono,String contrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        this.rol = rol;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Rol getRol() {
        return rol;
    }



}
