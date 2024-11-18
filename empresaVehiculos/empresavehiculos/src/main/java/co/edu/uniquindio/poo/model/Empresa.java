package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa  {

    private String nombre;
   // public Empleado empleado;
    public Cliente cliente;
    public Admin admin;


    private Collection<Vehiculo> listaVehiculos;
    private Collection<VehiculoElectrico> listaVehiculoElectricos;
    private Collection<VehiculoHibrido> listaVehiculoHibridos;

    private Collection<Vehiculo> listaVehiculosVenta;
    private Collection<Vehiculo> listaVehiculosAlquiler;
    private Collection<Vehiculo> listaVehiculosCompra;

    private Collection<Registro> listaRegistroNegocios;
    private Collection<Registro> listaNegociosEmpleado;

    private Collection<Cliente> listaClientes;
    private Collection<Empleado> listaEmpleados;

    public Empresa(String nombre) {
        this.nombre = nombre;

        listaVehiculos = new LinkedList<>();
        listaVehiculoElectricos = new LinkedList<>();
        listaVehiculoHibridos = new LinkedList<>();

        listaVehiculosAlquiler = new LinkedList<>();
        listaVehiculosVenta = new LinkedList<>();
        listaVehiculosCompra = new LinkedList<>();

        listaRegistroNegocios= new LinkedList<>();
        listaNegociosEmpleado= new LinkedList<>();

        listaClientes = new LinkedList<>();
        listaEmpleados = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + "]";
    }

    // METODOS PARA SERVICOS:


    /**
     * Metodo para verificar alquiler
     * @param codigo
     * @return
     */
    public boolean verificarAlquiler(String codigo) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosAlquiler) {
            if (vehiculo.getPlaca().equals(vehiculo.getPlaca())) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para hacer alquiler
     */
    public void hacerAlquiler(int dias, double valor) {

        for (Vehiculo vehiculo : listaVehiculosAlquiler) {
            if (!verificarAlquiler(vehiculo.getPlaca())) {
                vehiculo.getEstadoVehiculo();
                String estado = "alquilado";
                vehiculo.setEstadoVehiculo(estado);
                valor = (dias * valor);
                System.out.println("el vehiculo ha sido alquilado"+ "el costo es" + valor);

            }
            System.out.println("El vehiculo no esta disponible");
        }

    }

    /**
     * Metodo para verificar compra
     * @param codigo
     * @return
     */

    public boolean verificarCompra(String codigo) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosCompra) {
            if (vehiculo.getPlaca().equals(vehiculo.getPlaca())) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para hacer compra
     */
    public void hacerCompra(){

        for (Vehiculo vehiculo : listaVehiculosCompra) {
            if (!verificarCompra(vehiculo.getPlaca())) {
                vehiculo.getEstadoVehiculo();
                String estado = "Comprado";
                vehiculo.setEstadoVehiculo(estado);
                System.out.println("el vehiculo ha sido comprado");

            }
            System.out.println("El vehiculo no esta disponible");
        }
    }

    /**
     * Metodo para verificar venta
     * @param codigo
     * @return
     */
    public boolean verificarVenta(String codigo) {
        boolean centinela = false;
        for (Vehiculo vehiculo : listaVehiculosVenta) {
            if (vehiculo.getPlaca().equals(vehiculo.getPlaca())) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * MEtodo para hacer venta
     */
    public void hacerVenta(){

        for (Vehiculo vehiculo : listaVehiculosVenta) {
            if (!verificarVenta(vehiculo.getPlaca())) {
                vehiculo.getEstadoVehiculo();
                String estado = "vendido";
                vehiculo.setEstadoVehiculo(estado);
                System.out.println("el vehiculo ha sido vendido");

            }
            System.out.println("El vehiculo no esta disponible");
        }
    }



    // METODOS PARA VEHICULOS:

    /**
     * Metodo para verificar vehiculo
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * Metodo para buscar un vehiculo en la lista de vehiculos que se quieren
     * comprar
     * 
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
     * 
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
     * 
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
     * 
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
     * Metodo para eliminar un vehiculo de la lista de vehiculos que se quieren
     * comprar
     * 
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

    // METODOS PARA EMPLEADO

    /**
     * Metodo para verificar empleado
     * 
     * @param id
     * @return
     */
    public boolean verificarEmpleado(String id) {
        boolean centinela = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId().equals(id)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar empleado
     * 
     * @param id
     */
    public void agregarEmpleado(String id) {
        if (!verificarEmpleado(empleado.getId())) {
            listaEmpleados.add(empleado);
            System.out.println("el" + empleado + "fue agregado");
        }
    }

    /**
     * Metodo para buscar empleado
     * 
     * @param id
     * @return
     */
    public Empleado buscarEmpleado(String id) {

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId().equals(id)) {
                return empleado;
            }

        }
        return null;
    }

    /**
     * Metodo para eliminar empleados
     * 
     * @param id
     */
    public void eliminarEmpleado(String id) {

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId().equals(id)) {
                listaEmpleados.remove(empleado);
            }

        }
    }

    // METODOS PARA CLIENTE

    /**
     * Metodo para verificar cliente
     * 
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

    /**
     * Metodo para agregar cliente
     * 
     * @param id
     */
    public void agregarCliente(String id) {
        if (!verificarCliente(cliente.getId())) {
            listaClientes.add(cliente);
            System.out.println("el" + cliente + "fue agregado");
        }
    }

    /**
     * Metodo para buscar cliente
     * 
     * @param id
     * @return
     */
    public Cliente buscarCliente(String id) {

        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }

        }
        return null;
    }
    
    /**
     * Metodopo para eliminar cliente
     * @param id
     */
    public void eliminarCliente(String id) {

        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                listaClientes.remove(cliente);
            }
            break;
        }
    }

    /**
     * Metodo para registrar un alquiler a la lista de registro
     * @param codigoRegistro
     * @param tipoNegocio
     * @param fecha
     * @param vehiculo
     * @param valor
     * @param cliente
     * @param empleado
     */
    public void registrarAlquiler(String codigoRegistro,String tipoNegocio,String fecha, Vehiculo vehiculo,  double valor, Cliente cliente, Empleado empleado) {

        Registro registro = new Registro( codigoRegistro,tipoNegocio, fecha, vehiculo, valor, cliente, empleado);
        
        listaRegistroNegocios.add(registro);

        System.out.println("Alquiler registrado: " + registro);
    }

    /**
     * Metodo para registrar venta
     * @param codigoRegistro
     * @param tipoNegocio
     * @param fecha
     * @param vehiculo
     * @param valor
     * @param cliente
     * @param empleado
     */
    public void registrarVenta(String codigoRegistro,String tipoNegocio,String fecha, Vehiculo vehiculo,  double valor, Cliente cliente, Empleado empleado) {

        Registro registro = new Registro( codigoRegistro,tipoNegocio, fecha, vehiculo, valor, cliente, empleado);
        
        listaRegistroNegocios.add(registro);

        System.out.println("Venta registrada: " + registro);
    }

    /**
     * Metodo para registrar compra
     * @param codigoRegistro
     * @param tipoNegocio
     * @param fecha
     * @param vehiculo
     * @param valor
     * @param cliente
     * @param empleado
     */
    public void registrarCompra(String codigoRegistro,String tipoNegocio,String fecha, Vehiculo vehiculo,  double valor, Cliente cliente, Empleado empleado) {

        Registro registro = new Registro( codigoRegistro,tipoNegocio, fecha, vehiculo, valor, cliente, empleado);
        
        listaRegistroNegocios.add(registro);

        System.out.println("compra registrada: " + registro);
    }


   /**
    * Metodo para obetener la lista de los negocios hechos por un emplado
    * @param empleado
    */
    public Collection<Registro> obtenerNegociosPorEmpleado(Empleado empleado) {

        listaNegociosEmpleado = new LinkedList<>();

        for (Registro registro : listaRegistroNegocios) {

            if (registro.getEmpleado().equals(empleado)){

                listaNegociosEmpleado.add(registro);
            }
        }
        
        return listaNegociosEmpleado;
       
    }


    /**
     * Metodo para login de administrador
     * @param usuario
     * @param contraseña
     * @return
     */
    public boolean loginAdmin(String usuario, String contraseña) {
        
        String validarUsuario = admin.getId();

        String validarContraseña = admin.getContraseña();

        return usuario.equals(validarUsuario) && contraseña.equals(validarContraseña);

    }


    /**
     * Metodo para login de usuario
     * @param usuario
     * @param contraseña
     * @return
     */
    public boolean loginEmpleado(String usuario, String contraseña) {
        
        String validarUsuario = empleado.getId();

        String validarContraseña = empleado.getContraseña();

        return usuario.equals(validarUsuario) && contraseña.equals(validarContraseña);

    }


    

}
