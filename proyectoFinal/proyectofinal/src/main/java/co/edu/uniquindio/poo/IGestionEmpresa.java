package co.edu.uniquindio.poo;

public interface IGestionEmpresa {


    //ADMINISTRADOR
    public void agregarEmpleado(Empresa empresa, Empleado empleado);
    public void agregarEmpleadoListaEmpleado( Empresa empresa, Empleado empleado);
    public void eliminarEmpleado(Empresa empresa, Empleado empleado);
    public void buscarEmpleado(Empresa empresa, Empleado empleado);
    public void actualizarDatosEmpleado(Empresa empresa, Empleado empleado);

    public void verRegistroEmpleado(Empresa empresa, Empleado empleado);
    public void verRegistroGenertal(Empresa empresa);
    
    

    //EMPLEADO
    public void registroVehiculosListaVenta(Vehiculo vehiculo, Empresa empresa);
    public void registroVehiculosListaCompra(Vehiculo vehiculo, Empresa empresa);
    public void registroVehiculosListaAlquiler(Vehiculo vehiculo, Empresa empresa);

    public void buscarVehiculoListaVenta(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void buscarVehiculoListaCompra(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void buscarVehiculoListaAlquiler(Vehiculo vehiculo, Empresa empresa,Empleado empleado);

    public void eliminarVehiculoListaVenta(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void eliminarVehiculoListaCompra(Vehiculo vehiculo, Empresa empresa,Empleado empleado);
    public void eliminarVehiculoListaAlquiler(Vehiculo vehiculo, Empresa empresa,Empleado empleado);



    public void registroClientes(Empresa empresa, Cliente cliente);
    public void eliminarCliente(Empresa empresa, Cliente cliente);
    public void buscarCliente(Empresa empresa, Cliente cliente);

    public void alquilar(Empresa empresa,int dias, double valor, Vehiculo vehiculo,Cliente cliente);
    public void comprar(Empresa empresa, Cliente cliente, Vehiculo vehiculo);
    public void vender(Empresa empresa, Cliente cliente, Vehiculo vehiculo);

    

    
}
