import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Persona> personas = new ArrayList();

    public static List<Persona> leerPersonas() throws FileNotFoundException, IOException, ClassNotFoundException {
        File archivo = new File("datos.dat");
        if (!archivo.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream s = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Persona>) s.readObject();
        }
    }

    public static void agregarPersona(String nombre, int edad){
        for(Persona persona : personas){
            if(persona.getNombre().equals(nombre)){
                System.out.println("PERSONA EXISTENTE, NO SE PUEDE AÑADIR");
                return;
            }
        }
        personas.add(new Persona(nombre, edad));
        System.out.println("PERSONA AGREGADA CORRECTAMENTE");
    }

    public static void mostrarPersonas(){
        if(!personas.isEmpty()){
            for(Persona persona : personas){
                System.out.println("NOMBRE: "+ persona.getNombre() + " EDAD: " + persona.getEdad());
            }
        }
    }

    public static void guardarPersonas() throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.dat", true))) {
           os.writeObject(personas);
        }
    }

    public static boolean editarPersona(String nombreAntiguo, String nuevoNombre, int nuevaEdad){
        for(Persona persona : personas){
            if(persona.getNombre().equals(nombreAntiguo)){
                persona.setNombre(nuevoNombre);
                persona.setEdad(nuevaEdad);
                System.out.println("EDITADO CORRECTAMENTE");
                return true;
            }
        }
        System.out.println("ERROR AL EDITAR PERSONA");
        return false;
    }

    public static boolean eliminarPersona(String nombre){
        Iterator<Persona> iterator = personas.iterator();
        while(iterator.hasNext()){
            Persona persona = iterator.next();
            if(persona.getNombre().equals(nombre)){
                iterator.remove();
                System.out.println("PERSONA ELIMINADO");
                return true;
            }
        }
        System.out.println("ERROR AL ELIMINAR PERSONA");
        return false;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        personas = leerPersonas();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

       while (opcion != 5) {
           System.out.println("BIENVENIDO, INGRESE LA OPCIÓN QUE DESEA");
           System.out.println("1.- MOSTRAR OBJETOS.");
           System.out.println("2.- CREAR OBJETO.");
           System.out.println("3.- EDITAR OBJETO.");
           System.out.println("4.- ELIMINAR OBJETO.");
           System.out.println("5.- SALIR.");
           opcion = sc.nextInt();
           sc.nextLine();

           switch (opcion) {
               case 1:
                   mostrarPersonas();
                   break;
               case 2:
                   System.out.println("INGRESE EL NOMBRE DE LA PERSSONA: ");
                   String nombre = sc.nextLine();
                   System.out.println("INGRESE EL EDAD DE LA PERSONA: ");
                   int edad = sc.nextInt();
                   sc.nextLine();
                   agregarPersona(nombre, edad);
                   break;
               case 3:
                   System.out.println("INGRESE EL NOMBRE DE LA PERSONA A EDITAR: ");
                   String nombreAtiguo = sc.nextLine();
                   System.out.println("INGRESE EL NUEVO NOMBRE DE LA PERSONA: ");
                   String nombreNuevo = sc.nextLine();
                   System.out.println("INGRESE LA NUEVA EDAD DE LA PERSONA: ");
                   int edadNueva = sc.nextInt();
                   editarPersona(nombreAtiguo, nombreNuevo, edadNueva);
                   break;
               case 4:
                   System.out.println("INGRESE EL NOMBRE DE LA PERSONA A ELIMINAR: ");
                   String nombreEliminar = sc.nextLine();
                   eliminarPersona(nombreEliminar);
                   break;
               case 5:
                   guardarPersonas();
                   System.out.println("SALIR.");
                   break;
               default:
                   System.out.println("OPCIÓN NO VALIDA, INTENTA DE NUEVO");
                   break;
           }
       }
    }
}