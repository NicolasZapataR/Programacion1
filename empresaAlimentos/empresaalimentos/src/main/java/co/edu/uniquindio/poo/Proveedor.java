package co.edu.uniquindio.poo;

public class Proveedor {

    private String nombre;
    private String telefono;
    private String direccion;
    private Producto producto;

    public Proveedor (String nombre, String telefono, String direccion, Producto producto){

        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.producto=producto;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    

    
}
