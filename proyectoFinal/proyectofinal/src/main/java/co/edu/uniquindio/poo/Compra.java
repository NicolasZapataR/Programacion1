package co.edu.uniquindio.poo;

public class Compra {

    

    private Vehiculo vehiculo;
    private double valor;
    private Empleado empleado;
    private Cliente cliente;
    

   

    public Compra (Vehiculo vehiculo, double valor, Empleado empleado, Cliente cliente){

        this.vehiculo=vehiculo;
        this.valor= valor;
        this.empleado=empleado;
        this.cliente=cliente;


    }




    



    public Vehiculo getVehiculo() {
        return vehiculo;
    }




    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }




    public double getValor() {
        return valor;
    }




    public void setValor(double valor) {
        this.valor = valor;
    }




    public Empleado getEmpleado() {
        return empleado;
    }




    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }




    public Cliente getCliente() {
        return cliente;
    }




    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    




    
}
