package co.edu.uniquindio.poo;

public class Empresa {
    
    private String nombre;

    public Empresa (String nombre){

        this.nombre=nombre;

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
    
}
