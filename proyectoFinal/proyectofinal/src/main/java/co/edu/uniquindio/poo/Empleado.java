package co.edu.uniquindio.poo;

import java.util.Collection;

public class Empleado extends Persona implements IGestionEmpresa {

    private boolean esAdmin;
    private double salario;
    private String correo;
    
    private int numeroVehiculosAlquilados;
    private int numeroVehiculosComprados;
    private int numeroVehiculosVendidos;

    public Empleado(boolean esAdmin, String nombre, String id, String telefono, String dirreccion, double salario,
            String correo, int numeroVehiculosAlquilados, int numeroVehiculosComprados,
            int numeroVehiculosVendidos) {

        super(nombre, id, telefono, dirreccion);

        this.salario = salario;
        this.correo = correo;
        
        this.numeroVehiculosAlquilados = numeroVehiculosAlquilados;
        this.numeroVehiculosComprados = numeroVehiculosComprados;
        this.numeroVehiculosVendidos = numeroVehiculosVendidos;

    }

    public boolean getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
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


    // Administrador

    @Override
    public void agregarEmpleadoListaEmpleado(Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==true){
            empresa.agregarEmpleadoLista(empleado.getId());
        }
        else{
            System.out.println("El empleado no puede registrar");

        }

    
    }

    @Override
    public void eliminarEmpleado(Empresa empresa, Empleado empleado) {
        
        if(empleado.getEsAdmin()==true){
            empresa.eliminarEmpleado(empleado.getId());;
        }
        else{
            System.out.println("El empleado no puede eliminar");

        }
    }

    @Override
    public void buscarEmpleado(Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==true){
            empresa.buscarEmpleado(empleado.getId());;
        }
        else{
            System.out.println("El empleado no puede buscar");

        }

        
    }

    @Override
    public void actualizarDatosEmpleado(Empresa empresa,Empleado empleado) {

        if(empleado.getEsAdmin()==true){

            empresa.actualizarDatos(esAdmin, salario, correo, numeroVehiculosAlquilados, numeroVehiculosComprados, numeroVehiculosVendidos);

        }
        else{
            System.out.println("el empleado no puede actualizar datos");
        }
        
    }

    @Override
    public void verRegistroEmpleado(Empresa empresa, Empleado empleado) {

        empresa.obtenerNegociosPorEmpleado(empleado);
       
    }

    @Override
    public void verRegistroGenertal(Empresa empresa) {
        
        System.out.print(empresa.getListaRegistroNegocios());
        
    }

   


    //EMPLEADO

    @Override
    public void registroVehiculosListaVenta(Vehiculo vehiculo, Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==false){

            empresa.agregarVehiculoVenta(vehiculo);
        }
        else{
            System.out.println("el administrador no puede agregar vehiculos");
        }
        

        
    }

    @Override
    public void registroVehiculosListaCompra(Vehiculo vehiculo, Empresa empresa, Empleado empleado) {
        
        if (empleado.getEsAdmin()==false){

            empresa.agregarVehiculoCompra(vehiculo);
        }
        else{
            System.out.println("el administrador no puede agregar vehiculos");
        }
            
        
    }

    @Override
    public void registroVehiculosListaAlquiler(Vehiculo vehiculo, Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==false){
            empresa.agregarVehiculoAlquiler(vehiculo);
        }
        else{
            System.out.println("el administrador no puede agregar vehiculos");

        }
        
    }

    @Override
    public void buscarVehiculoListaVenta(Vehiculo vehiculo, Empresa empresa ,Empleado empleado) {

        if(empleado.getEsAdmin()==false){
            empresa.buscarVehiculoVenta(vehiculo.getPlaca());
        }
        else{
            System.out.println("el administrador no puede buscar vehiculos");

        }
       
    }

    @Override
    public void buscarVehiculoListaCompra(Vehiculo vehiculo, Empresa empresa,Empleado empleado) {

        if(empleado.getEsAdmin()==false){
            empresa.buscarVehiculoCompra(vehiculo.getPlaca());
        }
        else{
            System.out.println("el administrador no puede buscar vehiculos");

        }

        

    }

    @Override
    public void buscarVehiculoListaAlquiler(Vehiculo vehiculo, Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==false){
            empresa.buscarVehiculoAlquiler(vehiculo.getPlaca());
        }
        else{
            System.out.println("el administrador no puede buscar vehiculos");

        }

        
    }

    @Override
    public void eliminarVehiculoListaVenta(Vehiculo vehiculo, Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==false){
            empresa.eliminarVehiculoVenta(vehiculo.getPlaca());
        }
        else{
            System.out.println("el administrador no puede buscar vehiculos");

        }

        
    }

    @Override
    public void eliminarVehiculoListaCompra(Vehiculo vehiculo, Empresa empresa , Empleado empleado) {
        
        if(empleado.getEsAdmin()==false){
            empresa.eliminarVehiculoCompra(vehiculo.getPlaca());
        }
        else{
            System.out.println("el administrador no puede buscar vehiculos");

        }
        
    }

    @Override
    public void eliminarVehiculoListaAlquiler(Vehiculo vehiculo, Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==false){
            empresa.eliminarVehiculoAlquiler(vehiculo.getPlaca());
        }
        else{
            System.out.println("el administrador no puede buscar vehiculos");

        }
        
    }

    @Override
    public void registroClientes(Empresa empresa, Empleado empleado, Cliente cliente) {

        if(empleado.getEsAdmin()==false){
            empresa.agregarCliente(cliente.getId());
        }
        else{
            System.out.println("el administrador no puede agregar vehiculos");

        }
        

    }

    @Override
    public void eliminarCliente(Empresa empresa, Empleado empleado, Cliente cliente) {

        if(empleado.getEsAdmin()==false){
            empresa.eliminarCliente(cliente.getId());
        }
        else{
            System.out.println("el administrador no puede agregar vehiculos");

        }
       

    }

    @Override
    public void buscarCliente(Empresa empresa, Empleado empleado, Cliente cliente) {

        if(empleado.getEsAdmin()==false){
            empresa.buscarCliente(cliente.getId());
        }
        else{
            System.out.println("el administrador no puede agregar vehiculos");

        }

    }

    @Override
    public void alquilar(Empresa empresa, Empleado empleado,int dias, double valor, Vehiculo vehiculo, Cliente cliente) {

        if(empleado.getEsAdmin()==false){

            empresa.hacerAlquiler(dias, valor);
        }
        else{
            System.out.println("el administrador no puede alquilar");
        }
        
    }

    @Override
    public void comprar(Empresa empresa, Empleado empleado) {

        if(empleado.getEsAdmin()==false){

            empresa.hacerCompra();
        }
        else{
            System.out.println("el administrador no puede hacer compras");
        }

        
    }

    @Override
    public void vender(Empresa empresa, Empleado empleado) {

        
        if(empleado.getEsAdmin()==false){

            empresa.hacerVenta();
        }
        else{
            System.out.println("el administrador no puede hacer ventas");
        }
        


    }

    

    

   

    

   
    

   

}
