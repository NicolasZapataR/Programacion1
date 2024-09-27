package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {

    //private String nombre;
   // private String cedula;
   // private String telefono;
   // private String correo;
    private double salario;
    
    private String fechaIngreso;
    private Collection <Prestamo> lisPrestamos;

    public Bibliotecario(String nombre,String cedula, String correo, String telefono, double salario, String fechaIngreso){

        super(nombre, cedula, correo, telefono);

        this.salario=salario; 
        this.fechaIngreso=fechaIngreso;
        this.lisPrestamos= new LinkedList<>();

    }

    

    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }



    public String getFechaIngreso() {
        return fechaIngreso;
    }



    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }



    public Collection<Prestamo> getLisPrestamos() {
        return lisPrestamos;
    }



    public void setLisPrestamos(Collection<Prestamo> lisPrestamos) {
        this.lisPrestamos = lisPrestamos;
    }



    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", fechaIngreso=" + fechaIngreso + ", lisPrestamos=" + lisPrestamos
                + "]";
    }



   
}
