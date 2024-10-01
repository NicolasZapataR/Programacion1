package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {


    
    private double valor;
    private int dias;
    private String fechaPrestamo;    
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;

    

    private Collection<DetallePrestamo> listaDetallePrestamos = new LinkedList<>(); 

    public Collection<DetallePrestamo> getListaDetallePrestamos() {
    return listaDetallePrestamos;
}


public void setListaDetallePrestamos(Collection<DetallePrestamo> listaDetallePrestamos) {
    this.listaDetallePrestamos = listaDetallePrestamos;
}


    public Prestamo(  int dias,   String codigo, Bibliotecario bibliotecario, Estudiante estudiante){

        
        LocalDateTime hoy = LocalDateTime.now();

        this.fechaPrestamo = hoy.toString();
        this.dias=dias;
    
        this.codigo=codigo;
        this.bibliotecario = bibliotecario;
        this.estudiante=estudiante;
       

    }

    
    public void adicionarDetallePrestamo (DetallePrestamo detallePrestamo){


        listaDetallePrestamos.add(detallePrestamo);


    }
    
    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public int getDias() {
        return dias;
    }


    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }


    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public Estudiante getEstudiante() {
        return estudiante;
    }


    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    
/**
 * metodo para calcular el valor del prestamo
 * @param dias
 * @return
 */
    public  double calcularValorPrestamo(int dias){

        double valorPrestamo = (valor*dias);

        return valor;
    }

    


    /**
     * metodo para agregar libro al prestamo
     * 
     * @param detallePrestamo
     */
    public void agregarLibro(DetallePrestamo detallePrestamo){
        if( detallePrestamo.getLibro().estaDisponible() ){
          //  detallePrestamos.add( detallePrestamo );
            int nuevaDisponibilidad = detallePrestamo.getLibro().getCantidad() -1;
            detallePrestamo.getLibro().setCantidad(nuevaDisponibilidad);
        }
    }

    public void calcularValorTotalPrestamo( ){


        for ( DetallePrestamo detallePrestamo : this.listaDetallePrestamos) {

            this.valor = this.valor + detallePrestamo.getValorDetallePrestamo();

        }

        this.valor = this.valor *this.dias;

        

    }

    

    

    @Override
    public String toString() {
        return "Prestamo [valor=" + valor + ", dias=" + dias + ", fechaPrestamo=" + fechaPrestamo + ", codigo=" + codigo
                + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario + "]";
    }

    

    

    

}
