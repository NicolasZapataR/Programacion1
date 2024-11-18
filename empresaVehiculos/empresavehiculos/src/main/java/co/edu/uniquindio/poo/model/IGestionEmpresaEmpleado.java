package co.edu.uniquindio.poo.model;

public interface IGestionEmpresaEmpleado {

    public void registroVehiculosVenta();
    public void registroVehiculosCompra();
    public void registroVehiculosAlquiler();


    public void registroClientes();
    public void eliminarCliente();
    public void buscarCliente();

    public void alquilar(int dias, double valor);
    public void comprar();
    public void vender();

    public void registoTransaccion(Empleado empleado);



    
}
