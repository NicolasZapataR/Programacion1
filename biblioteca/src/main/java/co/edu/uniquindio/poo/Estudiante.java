package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {


    private boolean estado;
    private Collection <Prestamo> listaPrestamos;
   

    public Estudiante(String nombre, String cedula, String telefono, String correo, boolean estado){
        super(nombre, cedula, correo, telefono);

        this.estado=estado;
        this.listaPrestamos = new LinkedList<>();

    }


    public boolean isEstado() {
        return estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }


    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }


    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", listaPrestamos=" + listaPrestamos + "]";
    }

    

    
    

}
