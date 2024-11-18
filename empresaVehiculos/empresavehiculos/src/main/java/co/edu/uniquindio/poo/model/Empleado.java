package co.edu.uniquindio.poo.model;

import java.util.Collection;

public class Empleado extends Persona  implements IGestionEmpresaEmpleado{

    public Empresa empresa;
    public Vehiculo vehiculo;
    public Cliente cliente;
    

    
    private double salario;
    private String correo;
    private String contraseña;
    private int numeroVehiculosAlquilados;
    private int numeroVehiculosComprados;
    private int numeroVehiculosVendidos;

    private Collection <Vehiculo> listaVehiculosVenta;
    private Collection <Vehiculo> listaVehiculosAlquiler;
    private Collection <Vehiculo> listaVehiculosCompra;

    public Empleado (String nombre, String id, String telefono , String dirreccion,double salario, String correo, String contraseña, int numeroVehiculosAlquilados, int numeroVehiculosComprados, int numeroVehiculosVendidos){

        super(nombre, id, telefono, dirreccion);

        this.salario=salario;
        this.correo=correo;
        this.contraseña=contraseña;
        this.numeroVehiculosAlquilados=numeroVehiculosAlquilados;
        this.numeroVehiculosComprados=numeroVehiculosComprados;
        this.numeroVehiculosVendidos= numeroVehiculosVendidos;

    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumeroVehiculosAlquilados() {
        return numeroVehiculosAlquilados;
    }

    public void setNumeroVehiculosAlquilados(int numeroVehiculosAlquilados) {
        this.numeroVehiculosAlquilados = numeroVehiculosAlquilados;
    }

    public int getNumeroVehiculosComprados() {
        return numeroVehiculosComprados;
    }

    public void setNumeroVehiculosComprados(int numeroVehiculosComprados) {
        this.numeroVehiculosComprados = numeroVehiculosComprados;
    }

    public int getNumeroVehiculosVendidos() {
        return numeroVehiculosVendidos;
    }

    public void setNumeroVehiculosVendidos(int numeroVehiculosVendidos) {
        this.numeroVehiculosVendidos = numeroVehiculosVendidos;
    }

    public Collection<Vehiculo> getListaVehiculosVenta() {
        return listaVehiculosVenta;
    }

    public void setListaVehiculosVenta(Collection<Vehiculo> listaVehiculosVenta) {
        this.listaVehiculosVenta = listaVehiculosVenta;
    }

    public Collection<Vehiculo> getListaVehiculosAlquiler() {
        return listaVehiculosAlquiler;
    }

    public void setListaVehiculosAlquiler(Collection<Vehiculo> listaVehiculosAlquiler) {
        this.listaVehiculosAlquiler = listaVehiculosAlquiler;
    }

    public Collection<Vehiculo> getListaVehiculosCompra() {
        return listaVehiculosCompra;
    }

    public void setListaVehiculosCompra(Collection<Vehiculo> listaVehiculosCompra) {
        this.listaVehiculosCompra = listaVehiculosCompra;
    }

    @Override
    public void registroVehiculosVenta() {
        empresa.agregarVehiculoVenta(vehiculo);
       
    }

    @Override
    public void registroVehiculosCompra() {
       
        empresa.agregarVehiculoCompra(vehiculo);
    }

    @Override
    public void registroVehiculosAlquiler() {
       
        empresa.agregarVehiculoAlquiler(vehiculo);
    }

    @Override
    public void registroClientes() {
       
        empresa.agregarCliente(cliente.getId());
    }

    @Override
    public void alquilar(int dias, double valor){


        empresa.hacerAlquiler(dias,valor);

    }
    


    @Override
    public void comprar() {
         
        empresa.hacerCompra();
    }

    @Override
    public void vender() {
        
        empresa.hacerVenta();
    }

    @Override
    public void eliminarCliente() {
        
        empresa.eliminarCliente(cliente.getId());
    }

    @Override
    public void buscarCliente() {
        
        empresa.buscarCliente(cliente.getId());
        
    }

    @Override
    public void registoTransaccion(Empleado empleado) {

       empresa.obtenerNegociosPorEmpleado(empleado);
       
    }


   
    
    

}
