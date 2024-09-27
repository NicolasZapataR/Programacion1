package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {

    private String nombre;
    //private double totalDineroRecaudado;

    public Collection<Estudiante> listaEstudiantes;
    public Collection<Bibliotecario> listaBibliotecarios;
    public Collection<Libro> listaLibros;
    public Collection<Prestamo> listaPrestamos;

    public Biblioteca(String nombre) {

        this.nombre = nombre;

        // this.listaBibliotecarios= new LinkedList<>();
        listaBibliotecarios = new LinkedList<>();
        listaEstudiantes = new LinkedList<>();
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(Collection<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Collection<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(Collection<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public Collection<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Collection<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    /*
     * metodo que permite agregar Estudiante
     * 
     */

    public void agregarEstudiante(Estudiante estudiante) {

        if (!verificarEstudiante(estudiante.getCedula())) {

            listaEstudiantes.add(estudiante);

        } else {

            System.out.println("El  estudinate no puede ser agregado");
        }

    }

    /**
     * metodo para verificar estudiante
     * 
     * @param codigo
     * @return
     */

    public boolean verificarEstudiante(String cedula) {

        boolean centinela = false;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * metodo para eliminar estudiante
     * 
     * @param codigo
     */

    public void eliminarEstudiante(String cedula) {

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                listaEstudiantes.remove(estudiante);
            }
            break;
        }
    }

    /*
     * metodo que permite agregar libro
     * 
     */

    public void agregarLibro(Libro libro) {

        if (!verificarLibro(libro.getCodigo())) {
            listaLibros.add(libro);
        } 
    }

    /**
     * metodo para verificar libro
     * 
     * @param codigo
     * @return
     */

    public boolean verificarLibro(String codigo) {

        boolean centinela = false;

        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)&& libro.getCantidad()>0) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * metodo para eliminar libro
     * 
     * @param codigo
     */

    public void eliminarLibro(String codigo) {

        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                listaLibros.remove(libro);
                break;
            }
        }
    }

     /**
     * Metodo para buscar un libro
     * 
     * @param codigo
     */

     public Libro buscarLibro(String codigo) {
        
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println(libro);;
            }
        }
        return null;
    }

    

    /*
     * metodo que permite agregar bibliotecario
     * 
     */

    public void agregarBibliotecario(Bibliotecario bibliotecario) {

        listaBibliotecarios.add(bibliotecario);

    }

    /*
     * metodo que permite agregar prestamo
     * 
     */

    public void agregarPrestamo(Prestamo prestamo, DetallePrestamo detallePrestamo) {

        if (!verificarPrestamo(prestamo.getCodigo())) {
            prestamo.agregarLibro(detallePrestamo);
            listaPrestamos.add(prestamo);
        }
    }

    /**
     * metodo para verificar prestamo
     * 
     * @param codigo
     * @return
     */

    public boolean verificarPrestamo(String codigo) {

        boolean centinela = false;

        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * metodo para eliminar prestamo
     * 
     * @param codigo
     */

    public void eliminarPrestamo(String codigo) {

        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                listaPrestamos.remove(prestamo);
                System.out.println("El prestamo fue eliminado");
            }
            break;
        }
    }


    /**
     * metodo para buscar un bibliotecario
     * @param codigo
     * @return
     */
    public Bibliotecario buscarBibliotecario(String codigo){

        for(Bibliotecario bibliotecario: listaBibliotecarios){
            if(bibliotecario.getCedula().equals(codigo)){
                return bibliotecario;
            }
        }
        return null;
    }

    /**
     * metodo para buscar un estudiante
     * @param codigo
     * @return
     */
    public Estudiante buscarEstudiante(String codigo){

        for (Estudiante estudiante : listaEstudiantes) {
            if(estudiante.getCedula().equals(codigo)){
                return estudiante;
            }
        }
        return null;
    }




    /**
     * metodo para contarPrestamos
     * @param nombre
     * @return
     */
    public int contarPrestamos(String nombre){

        int contador = 0;

        for(Prestamo prestamo : listaPrestamos){
            contador += prestamo.contarPrestamos(nombre);
        }

        return contador;

    }

    /**
     * Metodo para buscar un prestamo
     * 
     * @param codigo
     */

    public Prestamo buscarPrestamo(String codigo) {

        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                return prestamo;
            }

        }
        return null;
    }

}
