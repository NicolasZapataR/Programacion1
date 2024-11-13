package co.edu.uniquindio.poo;

public class Perecedero  extends Producto{

    private String fechaVencimiento;
    public Producto producto;

    public Perecedero(String codigo, String nombre, double precioCompra, String proovedor, String fechaVencimiento){

        super(codigo, nombre, precioCompra, proovedor);

        this.fechaVencimiento=fechaVencimiento;
        this.producto=producto;


    }

    public double calcularCostoVenta(){

        double costo = 0;

        costo = (producto.getPrecioCompra()+ (producto.getPrecioCompra()*0.35));

        return costo;


    }


}
