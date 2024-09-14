# TAREA 6 - UNIDAD 2.

Crea un programa que tenga dos clases: Estudiante y Curso. La clase Estudiante debe contener atributos para el nombre, el ID del estudiante y una lista de cursos. La clase Curso debe tener atributos para el nombre del curso, el código del curso y el nombre del instructor.

## Clase Curso:
### Atributos:

nombreCurso (String): Nombre del curso.

codigoCurso (String): Código del curso.

instructor (String): Nombre del instructor del curso.

### Métodos:

Curso(String nombreCurso, String codigoCurso, String instructor): Constructor que inicializa los atributos de la clase.

void mostrarInfoCurso(): Método que muestra la información del curso, incluyendo el nombre, el código y el instructor.

Métodos getter y setter para cada atributo (opcional).

## Clase Estudiante:
### Atributos:

nombre (String): Nombre del estudiante.

idEstudiante (String): Identificador único del estudiante.

cursos (List<Curso>): Lista de cursos en los que el estudiante está inscrito.

### Métodos:

Estudiante(String nombre, String idEstudiante): Constructor que inicializa los atributos de la clase.

void agregarCurso(Curso curso): Método que agrega un curso a la lista de cursos del estudiante.

void mostrarInformacion(): Método que muestra la información del estudiante, incluyendo el nombre, el ID, y los cursos en los que está inscrito.

Métodos getter y setter para cada atributo (opcional).

## Crear una cantidad específica de estudiantes y cursos.

Crea al menos tres cursos y dos estudiantes.
Asigna algunos cursos a cada estudiante.
Mostrar la información:

Imprime la información de cada estudiante, incluyendo los cursos en los que están inscritos.