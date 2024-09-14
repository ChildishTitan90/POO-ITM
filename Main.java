import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso cursouno = new Curso("Algebra", "A1G3B4", "Oskar");
        Curso cursodos = new Curso("POO", "PG00", "Roque");
        Curso cursotres = new Curso("Calculo", "C41CL0", "Dante");

        /*cursouno.mostrarInfoCurso();
        cursodos.mostrarInfoCurso();
        cursotres.mostrarInfoCurso();*/


        Estudiante estudianteUno = new Estudiante("Juan", "l24120378");
        estudianteUno.agregarCurso(cursodos);
        estudianteUno.agregarCurso(cursotres);

        Estudiante estudianteDos = new Estudiante("Maria", "s23120356");
        estudianteDos.agregarCurso(cursouno);
        estudianteDos.agregarCurso(cursodos);

        Estudiante estudianteTres = new Estudiante("Anastacio", "m22120312");
        estudianteTres.agregarCurso(cursotres);
        estudianteTres.agregarCurso(cursouno);

        estudianteUno.mostrarInformacion();
        estudianteDos.mostrarInformacion();
        estudianteTres.mostrarInformacion();



    }
}
