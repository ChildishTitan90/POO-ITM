public class Empleado {

    public Double sueldoBase, bonificacion, horasExtras;

    public Empleado() {
        this.sueldoBase = 0.0;
        this.bonificacion = 0.0;
        this.horasExtras = 0.0;
    }
    public void calcularSalario(Double sueldoBase) {
        System.out.println("Sueldo: " + sueldoBase);
    }

    public void calcularSalario(Double sueldoBase, Double bonificacion) {
        System.out.println("Sueldo: " + (sueldoBase+bonificacion));
    }

    public void calcularSalario(Double sueldoBase, Double bonificacion, Double horasExtras) {
        System.out.println("Sueldo: " + (sueldoBase+bonificacion+(horasExtras*20)));
    }

}
