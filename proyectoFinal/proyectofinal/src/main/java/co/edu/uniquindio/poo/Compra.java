package co.edu.uniquindio.poo;

public class Compra {

    private String fecha;
    private Vehiculo vehiculo;
    private double valor;
    private Cliente cliente;
    private Empleado empleado;

    public Compra (String fecha, Vehiculo vehiculo,  double valor, Cliente cliente, Empleado empleado){

        this.fecha=fecha;
        this.vehiculo=vehiculo;
        
        this.valor=valor;
        this.cliente=cliente;
        this.empleado=empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    

    
}
