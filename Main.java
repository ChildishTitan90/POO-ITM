import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//---------RECTANGULO-----------------//
        /*System.out.println("Ingrese la base de tu rectangulo: ");
        Double base = sc.nextDouble();
        System.out.println("Ingrese la altura de tu rectangulo: ");
        Double altura = sc.nextDouble();


        Rectangulo rectangulo = new Rectangulo(altura, base);

        System.out.println("El area de tu rectangulo es: " + rectangulo.area(altura, base));
        System.out.println("El perimetro de rectangulo es: " + rectangulo.perimetro(altura, base));*/

//-------------EMPLEADO----------------//
        /*Empleado empleado1 = new Empleado();

        System.out.println("Ingrese el sueldo base del empleado: ");
        double sueldoBade = sc.nextDouble();

        System.out.println("Ingrese el bono del empleado: ");
        double bono = sc.nextDouble();

        System.out.println("Ingrese las horas extras del empleado: ");
        double horasExtras = sc.nextDouble();

        if (bono > 0){
            if(horasExtras > 0){
                empleado1.calcularSalario(sueldoBade, bono, horasExtras);
            }else{
                empleado1.calcularSalario(sueldoBade, bono);
            }
        }else{
            if(horasExtras > 0){
                empleado1.calcularSalario(sueldoBade, bono, horasExtras);
            }else{
                empleado1.calcularSalario(sueldoBade);
            }
        }*/

//----------IMPUESTOS-----------//
        /*CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        System.out.println("Escriba el total de sus ingresos: ");
        int ingresos = sc.nextInt();

        System.out.println("Escriba el porcentaje de impuestos: ");
        double porcentaje_impuestos = sc.nextDouble();

        System.out.println("Escriba el total de dividendos: ");
        double dividendos = sc.nextDouble();

        System.out.println("Escriba el total de exencion: ");
        double exencion = sc.nextDouble();


        calculadora.calcularImpuestos(ingresos);
        calculadora.calcularImpuestos(ingresos, porcentaje_impuestos);
        calculadora.calcularImpuestos(dividendos, porcentaje_impuestos, exencion);*/


        sc.close();
    }
}
