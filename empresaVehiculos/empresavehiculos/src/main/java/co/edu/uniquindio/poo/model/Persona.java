package co.edu.uniquindio.poo.model;

public class Persona {

    private String nombre;
    private String id;
    private String telefono;
    private String direccion;

    public Persona(String nombre, String id, String telefono , String dirreccion){

        this.nombre=nombre;
        this.id=id;
        this.telefono=telefono;
        this.direccion= dirreccion;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    


}
