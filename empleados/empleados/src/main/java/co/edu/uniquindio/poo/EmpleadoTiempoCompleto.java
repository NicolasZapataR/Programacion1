package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioMensual){

        super(nombre, id);

        this.salarioMensual=salarioMensual;

    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario(){

        double salario= this.salarioMensual;

        return salario;

        

    }




}
