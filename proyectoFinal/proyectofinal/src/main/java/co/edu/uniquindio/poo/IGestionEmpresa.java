package co.edu.uniquindio.poo;

public interface IGestionEmpresa {


    //ADMINISTRADOR
    public void registoEmpleados( Empresa empresa, Empleado empleado);
    public void eliminarEmpleado(Empresa empresa, Empleado empleado);
    public void buscarEmpleado(Empresa empresa, Empleado empleado);
    public void actualizarDatos(Empresa empresa, Empleado empleado);

    public void verRegistroEmpleado(Empresa empresa, Empleado empleado);
    public void verRegistroGenertal(Empresa empresa);
    
    

    //EMPLEADO
    public void registroVehiculosListaVenta(Vehiculo vehiculo, Empresa empresa, Empleado empleado);
    public void registroVehiculosListaCompra(Vehiculo vehiculo, Empresa empresa, Empleado empleado);
    public void registroVehiculosListaAlquiler(Vehiculo vehiculo, Empresa empresa, Empleado empleado);

    public void buscarVehiculoListaVenta(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void buscarVehiculoListaCompra(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void buscarVehiculoListaAlquiler(Vehiculo vehiculo, Empresa empresa,Empleado empleado);

    public void eliminarVehiculoListaVenta(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void eliminarVehiculoListaCompra(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void eliminarVehiculoListaAlquiler(Vehiculo vehiculo, Empresa empresa,Empleado empleado);



    public void registroClientes(Empresa empresa, Empleado empleado, Cliente cliente);
    public void eliminarCliente(Empresa empresa, Empleado empleado, Cliente cliente);
    public void buscarCliente(Empresa empresa, Empleado empleado, Cliente cliente);

    public void alquilar(Empresa empresa, Empleado empleado,int dias, double valor, Vehiculo vehiculo,Cliente cliente);
    public void comprar(Empresa empresa, Empleado empleado);
    public void vender(Empresa empresa, Empleado empleado);

    

    
}
