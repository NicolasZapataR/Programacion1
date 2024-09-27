package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {


    private Libro libroPrestamo;
    private double valor;
    private int dias;
    private String fechaPrestamo;  
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private Collection<DetallePrestamo> detallePrestamos;

    public Prestamo(Libro libroPrestamo,double valor, int dias,  String fechaPrestamo, String codigo, Bibliotecario bibliotecario, Estudiante estudiante){

        this.valor=0;
        this.libroPrestamo=libroPrestamo;
        this.dias=dias;
        this.fechaPrestamo=fechaPrestamo;
        this.codigo=codigo;
        this.bibliotecario = bibliotecario;
        this.estudiante=estudiante;
        this.detallePrestamos = new LinkedList<>();

    }

    
    public double getValor() {
        return valor;
    }


    public Libro getLibroPrestamo() {
        return libroPrestamo;
    }


    public void setLibroPrestamo(Libro libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
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


    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }


    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    

    public  double calcularValorPrestamo(int dias, Libro libro){



        return 0;
    }

    


    /**
     * metodo para agregar libro al prestamo
     * 
     * @param detallePrestamo
     */
    public void agregarLibro(DetallePrestamo detallePrestamo){
        if( detallePrestamo.getLibro().estaDisponible() ){
            detallePrestamos.add( detallePrestamo );
            int nuevaDisponibilidad = detallePrestamo.getLibro().getCantidad() -1;
            detallePrestamo.getLibro().setCantidad(nuevaDisponibilidad);
        }
    }

    /**
     * metodo para saber cuantas veces se presto el libro
     * @param nombre
     * @return
     */

    public int contarPrestamos(String nombre){

        int contador = 0;

        for(DetallePrestamo prestamo : detallePrestamos){
            if(prestamo.getLibro().getNombre().equals(nombre)){
                contador++;
            }
        }

        return contador;

    }





    @Override
    public String toString() {
        return "Prestamo [valor=" + valor + ", dias=" + dias + ", fechaPrestamo=" + fechaPrestamo + ", codigo=" + codigo
                + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario + ", detallePrestamos="
                + detallePrestamos + "]";
    }

    

    

    

}
