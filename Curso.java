public class Curso {
    public String nombreCurso, codigoCurso, instructor;

    public Curso(String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

    public void mostrarInfoCurso(){
        System.out.println("Curso: " + this.nombreCurso + " Co.Curso: " + this.codigoCurso + " Instructor: " + this.instructor);
    }
}

