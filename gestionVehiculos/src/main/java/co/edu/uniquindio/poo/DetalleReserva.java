package co.edu.uniquindio.poo;

public class DetalleReserva {
    
    private Reserva reserva;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double valor;

    public DetalleReserva(Reserva reserva, Cliente cliente, Vehiculo vehiculo ,double valor){

        this.reserva= reserva;
        this.cliente=reserva.getCliente();
        this.vehiculo = vehiculo;
        this.valor= valor;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "DetalleReserva [reserva=" + reserva + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", valor="
                + valor + "]";
    }

    

}

