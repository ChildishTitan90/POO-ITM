package medicos;

public class Medico {
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private  String telefono;
    private  String rfc;

    public Medico(int id, String nombre, String apellidos, String fechaNacimiento, String telefono, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }
}
