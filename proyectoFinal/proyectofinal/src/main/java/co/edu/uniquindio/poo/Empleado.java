package co.edu.uniquindio.poo;

import java.util.Collection;

public class Empleado extends Persona implements IGestionEmpresaEmpleado {

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

    @Override
    public void registroVehiculos() {

        empresa.agregarVehiculo(vehiculo);
        empresa.agregarVehiculoAlquiler(vehiculo);
        empresa.agregarVehiculoVenta(vehiculo);
        empresa.agregarVehiculoCompra(vehiculo);

        empresa.buscarVehiculo(vehiculo.getPlaca());
        empresa.buscarVehiculoAlquiler(vehiculo.getPlaca());
        empresa.buscarVehiculoVenta(vehiculo.getPlaca());
        empresa.buscarVehiculoCompra(vehiculo.getPlaca());

        empresa.eliminarVehiculo(vehiculo.getPlaca());
        empresa.eliminarVehiculoAlquiler(vehiculo.getPlaca());
        empresa.eliminarVehiculoVenta(vehiculo.getPlaca());
        empresa.eliminarVehiculoVenta(vehiculo.getPlaca());


        
    }

    @Override
    public void registroClientes() {

        empresa.agregarCliente(cliente.getId());
        empresa.buscarCliente(cliente.getId());
        empresa.eliminarCliente(cliente.getId());
        
        
    }

    @Override
    public void alquilar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alquilar'");
    }

    @Override
    public void vender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vender'");
    }

    @Override
    public void comprar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprar'");
    }
}
