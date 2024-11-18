package co.edu.uniquindio.poo;

public class Perecedero  extends Producto{

    private String fechaVencimiento;
    public Producto producto;

    public Perecedero(String codigo, String nombre, double precioCompra, Proveedor proveedor, String fechaVencimiento){

        super(codigo, nombre, precioCompra, proveedor);


        this.fechaVencimiento=fechaVencimiento;
        this.producto=producto;


    }

    public double calcularCostoVenta(){

        double costo = 0;

        costo = (producto.getPrecioCompra()+ (producto.getPrecioCompra()*0.35));

        return costo;


    }


}
