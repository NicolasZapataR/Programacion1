package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
    ejecutarPrograma();

    }

    public static void ejecutarPrograma(){

        EmpleadoHoras empleadoH1 = new EmpleadoHoras("nicolas", "1234", 3, 40000);


        System.out.println("el salario del empleado es");
        System.out.println(empleadoH1.calcularSalario());
    }
}
