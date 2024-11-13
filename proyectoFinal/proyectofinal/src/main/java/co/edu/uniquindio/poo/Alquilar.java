package co.edu.uniquindio.poo;

public class Alquilar {

    private Vehiculo vehiculo;
    private double valor;
    private int dias;
    private Empleado empleado;
    private Cliente cliente;


    public Alquilar( Vehiculo vehiculo, double valor, int dias,Empleado empleado, Cliente cliente){

        this.vehiculo=vehiculo;
        this.valor=calcularCostoAlquiler();
        this.dias=dias;
        this.empleado=empleado;
        this.cliente=cliente;

    }


    /**
     * Metodo que permite calcular el costo del alquiler
     * @return
     */
    public double calcularCostoAlquiler(){

        double costo;

        costo= (this.valor* this.dias);

        return costo;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
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
