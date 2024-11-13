package co.edu.uniquindio.poo;

public class DetalleServicio {

    public Compra compra;
    public  Venta venta;
    public Alquilar alquilar;




    private String codigo;
    private String fecha;
    private Vehiculo vehiculo;
    private double valor;
    private Empleado empleado;
    private Cliente cliente;


    public DetalleServicio(String codigo, String fecha, Vehiculo vehiculo, double valor, Empleado empleado, Cliente cliente){

        this.codigo=codigo;
        this.fecha=fecha;
        this.vehiculo=vehiculo;
        this.valor=valor;
        this.empleado=empleado;
        this.cliente=cliente;


    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void generarDetalleAlquiler(){

        System.out.println(this.codigo=codigo);
        System.out.println( this.fecha=fecha);
        System.out.println(this.vehiculo= alquilar.getVehiculo());;
        System.out.println(this.valor=alquilar.getValor());;
        System.out.println(this.empleado=alquilar.getEmpleado());;
        System.out.println(this.cliente=alquilar.getCliente());;


    }

    public void generarDetalleVenta(){

        System.out.println(this.codigo=codigo);
        System.out.println(this.fecha=fecha);
        System.out.println(this.vehiculo=venta.getVehiculo());
        System.out.println(this.valor=venta.getValor());
        System.out.println(this.empleado=venta.getEmpleado());
        System.out.println(this.cliente=venta.getCliente());

    }

    public void generarDetalleCompra(){

        System.out.println(this.codigo=codigo);
        System.out.println(this.fecha=fecha);
        System.out.println(this.vehiculo=compra.getVehiculo());
        System.out.println(this.valor=compra.getValor());
        System.out.println(this.empleado=compra.getEmpleado());
        System.out.println(this.cliente=compra.getCliente());

        
    }

    
    






    
}
