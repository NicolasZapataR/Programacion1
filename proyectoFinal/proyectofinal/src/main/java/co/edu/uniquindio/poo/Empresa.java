package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;

    private Collection <Vehiculo> listaVehiculos;
    private Collection <VehiculoElectrico> listaVehiculoElectricos;
    private Collection <VehiculoHibrido> listaVehiculoHibridos;


    private Collection <Vehiculo> listaVehiculosVenta;
    private Collection <Vehiculo> listaVehiculosAlquiler;
    private Collection <Vehiculo> listaVehiculosCompra;

    private Collection <Cliente> listaClientes;
    private Collection <Empleado> listaEmpleados;

    public Empresa (String nombre){

        this.nombre= nombre;

        listaVehiculos= new LinkedList<>();
        listaVehiculoElectricos= new LinkedList<>();
        listaVehiculoHibridos= new LinkedList<>();

        listaVehiculosAlquiler= new LinkedList<>();
        listaVehiculosVenta= new LinkedList<>();
        listaVehiculosCompra= new LinkedList<>();

        listaClientes= new LinkedList<>();
        listaEmpleados= new LinkedList<>();

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
     * Metodo para verificar vehiculo en la lista de vehiculos en alquiler
     * @param placa
     * @return
     */
    public boolean verificarVehiculoAlquiler(String placa) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosAlquiler) {
            if (vehiculo.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }


    /**
     * Metodo para verificar vehiculo en la lista de vehiculos en venta
     * @param placa
     * @return
     */
    public boolean verificarVehiculoVenta(String placa) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosVenta) {
            if (vehiculo.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }


    /**
     * Metodo para verificar vehiculo en la lista de vehiculo que se quieren comprar
     * @param placa
     * @return
     */
    public boolean verificarVehiculoCompra(String placa) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosCompra) {
            if (vehiculo.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }


    /**
     * Metodo para agregar vehiculo a la lista de vehiculos
     * @param vehiculo
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (!verificarVehiculo(vehiculo.getPlaca())) {
            listaVehiculos.add(vehiculo);
            System.out.println("el" + vehiculo + "fue agregado");
        }
    }

    /**
     * Metodo para agregar vehiculo a la lista de vehiculos en alquiler
     * @param vehiculo
     */
    public void agregarVehiculoAlquiler(Vehiculo vehiculo) {
        if (!verificarVehiculoAlquiler(vehiculo.getPlaca())) {
            listaVehiculosAlquiler.add(vehiculo);
            System.out.println("el" + vehiculo + "fue agregado");
        }
    }


    /**
     * Metodo para agregar vehiculo a la lista de vehiculos en venta
     * @param vehiculo
     */
    public void agregarVehiculoVenta(Vehiculo vehiculo) {
        if (!verificarVehiculoVenta(vehiculo.getPlaca())) {
            listaVehiculosVenta.add(vehiculo);
            System.out.println("el" + vehiculo + "fue agregado");
        }
    }

    /**
     * Metodo para agregar vehiculo a la lista de Vehiculos que se quieren comprar
     * @param vehiculo
     */
    public void agregarVehiculoCompra(Vehiculo vehiculo) {
        if (!verificarVehiculoCompra(vehiculo.getPlaca())) {
            listaVehiculosCompra.add(vehiculo);
            System.out.println("el" + vehiculo + "fue agregado");
        }
    }

    /**
     * Metodo para buscar un vehiculo en la lista de vehiculos
     * @param placa
     * @return
     */
    public Vehiculo buscarVehiculo(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }

        }
        return null;
    }

    /**
     * Metodo para buscar un vehiculo en la lista de vehiculos en alquiler
     * @param placa
     * @return
     */
    public Vehiculo buscarVehiculoAlquiler(String placa) {

        for (Vehiculo vehiculo : listaVehiculosAlquiler) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }

        }
        return null;
    }


    /**
     * Metodo para buscar un vehiculo en la lista de vehiculos en venta
     * @param placa
     * @return
     */
    public Vehiculo buscarVehiculoVenta(String placa) {

        for (Vehiculo vehiculo : listaVehiculosVenta) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }

        }
        
        return null;
    }


    /**
     * Metodo para buscar un vehiculo en la lista de vehiculos que se quieren comprar
     * @param placa
     * @return
     */
    public Vehiculo buscarVehiculoCompra(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }

        }
        return null;
    }


    /**
     * Metodo para eliminar un vehiculo de la lista de vehiculos
     * @param placa
     */
    public void eliminarVehiculo(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                listaVehiculos.remove(vehiculo);
            }
            break;
        }
    }

    /**
     * Metodo para eliminar un vehiculo de la lista de vehiculos en alquiler
     * @param placa
     */
    public void eliminarVehiculoAlquiler(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                listaVehiculosAlquiler.remove(vehiculo);
            }
            break;
        }
    }


    /**
     * Metodo para eliminar un vehiculo de la lista de vehiculos en venta
     * @param placa
     */
    public void eliminarVehiculoVenta(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                listaVehiculosVenta.remove(vehiculo);
            }
            break;
        }
    }


    /**
     * Metodo para eliminar un vehiculo de la lista de vehiculos que se quieren comprar
     * @param placa
     */
    public void eliminarVehiculoCompra(String placa) {

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                listaVehiculosCompra.remove(vehiculo);
            }
            break;
        }
    }

    

    

    











    





    


}
