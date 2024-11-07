public class Animal {
    private int edad;
    public static final String raza = "Salchicha";

    public static void ladrar(){
        System.out.println("Ladrar");
    }

    public Animal(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

}
