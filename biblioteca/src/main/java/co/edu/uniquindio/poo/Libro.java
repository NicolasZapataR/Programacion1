package co.edu.uniquindio.poo;

public class Libro {
    
    private String nombre;
    private String codigo;
    private String autor;
    private String editorial;
    private String fecha;
    private int cantidad;

    public Libro(String nombre, String codigo, String autor, String editorial, String fecha, int cantidad){

        this.nombre= nombre;
        this.codigo=codigo;
        this.autor=autor;
        this.editorial=editorial;
        this.fecha=fecha;
        this.cantidad=cantidad;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

   

    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", codigo=" + codigo + ", autor=" + autor + ", editorial=" + editorial
                + ", fecha=" + fecha  + ", cantidad=" +  cantidad + "]";
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * metodo para saber si el libro esta disponible
     * @return
     */

    public boolean estaDisponible(){
        if(cantidad > 0){
            return true;
        }

        return false;
    }


}
