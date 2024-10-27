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

    public String email;

    public Rol rol;//enum

    public Usuario(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono,String email, String contrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    protected String mostrarInformacion(){
        String nombreCompleto = this.nombre + " " + this.apellidos;
        String datos = String.format("\nID: %s, NOMBRE COMPLETO: %s, FECHA DE NACIMENTO: %s, TELEFONO: %s, EMAL: %s, CONTRAEÑA: %s", this.id, nombreCompleto, this.fechaNacimiento, this.telefono, this.email, this.contrasenia );
        return datos;
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

    public String getEmail() {
        return email;
    }

    public Rol getRol() {
        return rol;
    }



}
