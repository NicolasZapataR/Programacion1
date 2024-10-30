package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    
    private String nombre;

    private Collection <Vehiculo> listaVehiculos;
    private Collection <Vehiculo> listaVehiculosEnRenta;
    private Collection <Cliente> listaClientes;
    private Collection <Reserva>listaReservas;

    public Empresa(String nombre){

        this.nombre= nombre;

        listaVehiculosEnRenta = new LinkedList<>();
        listaClientes = new LinkedList<>();
        listaVehiculos = new LinkedList<>();
        listaReservas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Collection<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Collection<Vehiculo> getListaVehiculosEnRenta() {
        return listaVehiculosEnRenta;
    }

    public void setListaVehiculosEnRenta(Collection<Vehiculo> listaVehiculosEnRenta) {
        this.listaVehiculosEnRenta = listaVehiculosEnRenta;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Collection<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Collection<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    /**
     * Metodo para agregar vehiculo a la lista de vehiculos de la empresa
     * @param placa
     * @return
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (!verificarVehiculo(vehiculo.getPlaca())) {
            listaVehiculos.add(vehiculo);
        }
    }

    //METODOS PARA VEHICULOS:

    /**
     * Metodo para verificar vehiculo
     * @param placa
     * @return
     */
    public boolean verificarVehiculo(String placa) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }

     /**
     * Metodo para agregar vehiculo a la lista de vehiculos en renta
     * @param placa
     * @return
     */
    public void agregarVehiculoEnRenta(Vehiculo vehiculo) {
        if (!verificarVehiculoEnRenta(vehiculo.getPlaca())) {
            listaVehiculosEnRenta.add(vehiculo);
        }
    }

    /**
     * Metodo para verificar vehiculo en renta
     * @param placa
     * @return
     */
    public boolean verificarVehiculoEnRenta(String placa) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosEnRenta) {
            if (vehiculo.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }

     /**
     * Metodo para buscar un vehiculo en renta
     * 
     * @param placa
     */

     public Vehiculo buscarVehiculoEnRenta(String placa) {

        for (Vehiculo vehiculo : listaVehiculosEnRenta) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }

        }
        return null;
    }

    /**
     * Metodo para buscar un vehiculo 
     * 
     * @param placa
     */

     public Vehiculo buscarVehiculo(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }

        }
        return null;
    }


    //METODOS PARA RESERVAS:


    /**
     * Metodo para verificar reserva
     * @param codigoReserva
     * @return
     */
    public boolean verificarReserva(String codigoReserva) {
        boolean centinela = false;
        for (Reserva reserva : listaReservas) {
            if (reserva.getCodigoReserva().equals(codigoReserva)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para crear una reserva
     * @param codigoReserva
     * @param cliente
     * @param vehiculo
     * @param dias
     */
    public Reserva crearReserva(String codigoReserva, Cliente cliente, Vehiculo vehiculo, int dias){
        if (!verificarReserva(codigoReserva)) {
            Reserva reserva = new Reserva(codigoReserva, cliente, vehiculo, dias);
            listaReservas.add(reserva);
            return reserva;
        }
        return null;
    }

    //METODOS PARA CLIENTE:
    
    /**
     * Metodo para agregar cliente a la lista de clientes de la empresa
     * @param cliente
     */
    public void agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getId())) {
            listaClientes.add(cliente);
        }
    }


    /**
     * Metodo para verificar clientes
     * @param id
     * @return
     */
    public boolean verificarCliente(String id) {
        boolean centinela = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

   
   

    }









    

