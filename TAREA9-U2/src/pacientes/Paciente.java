package pacientes;

import java.util.Random;

public class Paciente {
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    public String tipoSangre;
    public char sexo;
    private  String telefono;
    private Random random =  new Random();

    public Paciente(String nombre, String apellidos, String fechaNacimiento, String tipoSangre, char sexo, String telefono) {
        this.id = random.nextInt(1,1000);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
        this.telefono = telefono;
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

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Random getRandom() {
        return random;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %d, NOMBRE: %s, APELLIDOS: %s, FECHA NACIMIENTO: %s, TIPO DE SANGRE: %s, SEXO: %s, TELEFONO: %s", this.id, this.nombre, this.apellidos, this.fechaNacimiento, this.tipoSangre, this.sexo, this.telefono, this.tipoSangre, this.sexo, this.telefono);
        return datos;
    }
}
