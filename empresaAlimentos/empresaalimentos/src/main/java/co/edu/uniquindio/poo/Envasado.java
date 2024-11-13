package co.edu.uniquindio.poo;

public class Envasado  extends Producto{

    private String fechaVencimiento;
    private double pesoEnvase;
    private Pais pais;

    public Producto producto;

    public Envasado(String codigo, String nombre, double precioCompra, String proovedor, String fechaVencimiento, double pesoEnvase, Pais pais){

        super(codigo, nombre, precioCompra, proovedor);

        this.fechaVencimiento=fechaVencimiento;
        this.pesoEnvase=pesoEnvase;
        this.pais=pais;


    }

    public double calcularCostoVenta(){

        double costo= 0;

        costo= (this.pesoEnvase*300);

        return costo;
        
    }

        
    }

    

    

