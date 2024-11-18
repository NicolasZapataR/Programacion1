package co.edu.uniquindio.poo.model;

public class Registro {

    private String codigoRegistro;
    private String tipoNegocio;
    private String fecha;
    private Vehiculo vehiculo;
    private double valor;
    private Cliente cliente; 
    private Empleado empleado;

    public Registro( String codigoRegistro, String tipoNegocio, String fecha, Vehiculo vehiculo, double valor, Cliente cliente, Empleado empleado){

        this.codigoRegistro=codigoRegistro;
        this.tipoNegocio=tipoNegocio;
        this.fecha=fecha;
        this.vehiculo=vehiculo;
        this.valor=valor;
        this.cliente=cliente;
        this.empleado=empleado;

    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
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

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }
    


}
