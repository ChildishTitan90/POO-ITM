import java.util.ArrayList;

public class Estudiante {
    public String nombre, idEstudiante;
    public ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void mostrarInformacion() {
        // d- enteros s-string f- double
        System.out.println("\nEstudiante: " +  this.nombre + " No.Control: " + this.idEstudiante);
        System.out.println("CURSOS ASIGNADOS:");
        for (Curso curso : cursos) {
            curso.mostrarInfoCurso();
        }
    }
}
