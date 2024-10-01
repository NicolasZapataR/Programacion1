package co.edu.uniquindio.poo;

public class DetallePrestamo {
   
   
    private int cantidad;
    private Libro libro;
   
    private double valorDetallePrestamo;
    

    public DetallePrestamo( int cantidad, Libro libro) {


        this.cantidad=cantidad;       
        this.libro = libro; 
        this.valorDetallePrestamo= libro.getValorDiaPrestamo()*cantidad;
        
        
        
       
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
   

    
    public double getValorDetallePrestamo() {
        return valorDetallePrestamo;
    }

    public void setValorDetallePrestamo(double valorDetallePrestamo) {
        this.valorDetallePrestamo = valorDetallePrestamo;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", libro=" + libro
                + ", valorDetallePrestamo=" + valorDetallePrestamo + "]";
    }



    
    
}
