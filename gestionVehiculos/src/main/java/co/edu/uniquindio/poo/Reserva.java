package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Reserva{


    private String codigoReserva;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int dias;


    public Reserva( String codigoReserva, Cliente cliente ,Vehiculo vehiculo, int dias){

        this.codigoReserva=codigoReserva;
        this.cliente=cliente;
        this.vehiculo=vehiculo;
        this.dias=dias;
        
    }


    public String getCodigoReserva() {
        return codigoReserva;
    }


    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public int getDias() {
        return dias;
    }


    public void setDias(int dias) {
        this.dias = dias;
    }

  public double calcularCosto(){
    double costo = vehiculo.calcularCostoRenta(dias);
    return costo;
  }

}

    
    
    

