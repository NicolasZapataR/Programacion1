package co.edu.uniquindio.poo;

public interface IGestionEmpresa {


    //ADMINISTRADOR
    public void registoEmpleados( Empresa empresa, Empleado empleado);
    public void eliminarEmpleado(Empresa empresa, Empleado empleado);
    public void buscarEmpleado(Empresa empresa, Empleado empleado);
    public void actualizarDatos();

    public void verRegistroCompras();
    public void verRegistroVentas();
    public void verRegistroAlquiler();
    

    //EMPLEADO
    public void registroVehiculosVenta(Vehiculo vehiculo, Empresa empresa, Empleado empleado);
    public void registroVehiculosCompra(Vehiculo vehiculo, Empresa empresa, Empleado empleado);
    public void registroVehiculosAlquiler(Vehiculo vehiculo, Empresa empresa, Empleado empleado);

    public void registroClientes(Empresa empresa, Empleado empleado, Cliente cliente);
    public void eliminarCliente(Empresa empresa, Empleado empleado, Cliente cliente);
    public void buscarCliente(Empresa empresa, Empleado empleado, Cliente cliente);

    public void alquilar(Empresa empresa, Empleado empleado,int dias, double valor, Vehiculo vehiculo,Cliente cliente);
    public void comprar(Empresa empresa, Empleado empleado);
    public void vender(Empresa empresa, Empleado empleado);

    public void registoTransaccion(Empleado empleado);

    
}
