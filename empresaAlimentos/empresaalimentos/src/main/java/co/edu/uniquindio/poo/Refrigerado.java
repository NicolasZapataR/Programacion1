package co.edu.uniquindio.poo;

public class Refrigerado  extends Producto{

    private String codigoAprobacion;
    private double temperatura;
    public Producto producto;

    public Refrigerado(String codigo, String nombre, double precioCompra, String proovedor, String codigoAprobacion, double temperatura){

        super(codigoAprobacion, nombre, precioCompra, proovedor);

        this.codigoAprobacion=codigoAprobacion;
        this.temperatura=temperatura;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double calcularCostoVenta(){

        double costo=0;

        costo= (this.temperatura*500);

        return costo;
    }
}

    

