package co.edu.uniquindio.poo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {

    private String nombre;
    // private double totalDineroRecaudado;

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

    // METODOS PARA ESTUDIANTE:

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

    /**
     * metodo para buscar un estudiante
     * 
     * @param codigo
     * @return
     */
    public Estudiante buscarEstudiante(String codigo) {

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCedula().equals(codigo)) {
                return estudiante;
            }
        }
        return null;
    }

     /**
     * Metodo que permite saber cual estudiante hizo mas prestamos
     * @param 
     * @return
     */
    public void buscarEstudianteMasPrestamos() {

        

        for (Prestamo prestamo : listaPrestamos) {

                if (prestamo.getEstudiante().equals(prestamo)) {

                    

                }
            }
            
     }


    // METODOS PARA LIBRO:

    /*
     * metodo que permite agregar libro
     * 
     */

    public void agregarLibro(Libro libro) {

        if (!verificarLibro(libro.getCodigo())) {
            listaLibros.add(libro);
            System.out.println("El libro ha sido agregado");
        } else {
            System.out.println("El libro no puede ser agregado por que ya existe");
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
            if (libro.getCodigo().equals(codigo) && libro.getCantidad() > 0) {
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
                // System.out.println(libro);
                return libro;
            }
        }
        return null;
    }

    /**
     * metodo que permite remplazar los datos de un libro
     * 
     * @param codigo
     * @param nombre
     * @param autor
     * @param editorial
     * @param fecha
     * @param cantidad
     */
    public Libro remplazarDatosLibro(String codigo, String nombre, String isbn, String autor, String editorial, String fecha, double valorDiaPrestamo, int cantidad) {

        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                libro.setNombre(nombre);
                libro.setCodigo(codigo);
                libro.setIsbn(isbn);
                libro.setAutor(autor);
                libro.setEditorial(editorial);
                libro.setFecha(fecha);
                libro.setValorDiaPrestamo(valorDiaPrestamo);
                libro.setCantidad(cantidad);

                return libro;
            }
        }
        return null;
        
    }

    // METODOS PARA PRESTAMOS:

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
     * metodo para entregar prestamo
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

    

    // METODOS PARA BIBLIOTECARIO

    /**
     * metodo para buscar un bibliotecario
     * 
     * @param codigo
     * @return
     */
    public Bibliotecario buscarBibliotecario(String codigo) {

        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            if (bibliotecario.getCedula().equals(codigo)) {
                return bibliotecario;
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

    /**
     * metodo que permite verificar bibliotecario
     * @param codigo
     * @return
     */
    public Boolean verificarBibliotecario(String codigo) {

        boolean centinela = false;

        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            if (bibliotecario.getCedula().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * metodo que permite calcular el salario del bibliotecario
     * @param bibliotecario
     * @return
     */

    public double calcularSalarioBibliotecario(Bibliotecario bibliotecario) {

        if (!verificarBibliotecario(bibliotecario.getCedula())) {

            double salario = bibliotecario.getSalario();
            int prestamos = buscarCantidadPrestamposPorBibliotecario(bibliotecario.getCedula());
            double valorPrestamos = 0;

            double nuevoSalario = (salario) + (prestamos);

        }

        return 0;
    }

    //metodo para sumar el valor de todos los prestamos que hizo el bibliotecario
   /*public double calcularValorPrestamos(String cedula){

    double sumaPrestamos;

    for (Prestamo prestamo : listaPrestamos) {

        if (prestamo.getValor()) {

            

        }
    }
    return sumaPrestamos;




    return 0;
 }*/

    /**
     * Metodo que permite saber cuantos prestamos hizo cada bibliotecario
     * @param codigoBibliotecario
     * @return
     */
    public int buscarCantidadPrestamposPorBibliotecario(String codigoBibliotecario) {

        int cantidadEncontrados = 0;

        for (Prestamo prestamo : listaPrestamos) {

                if (prestamo.getBibliotecario().getCedula().equals(codigoBibliotecario)) {

                    cantidadEncontrados++;

                }
            }
            return cantidadEncontrados;
     }



    /**
     * Metodo que permite buscar cantidad de prestamos por libro
     * @param codigoLibro
     * @return
     */

    public int buscarCantidadPrestamposPorLibro(String codigoLibro) {

        int cantidadEncontrados = 0;

        for (Prestamo prestamo : listaPrestamos) {

            for (DetallePrestamo detallePrestamo : prestamo.getListaDetallePrestamos()) {
                // Busco el libro que tenga el codigo de libro que nos llega por parametro.
                if (detallePrestamo.getLibro().getCodigo().equals(codigoLibro)) {

                    cantidadEncontrados++;

                }
            }
        }

        return cantidadEncontrados;

    }


    /**
     * Metodo que permite crear un prestamo
     * @param codigoLibro
     * @param estudiante
     * @param bibliotecario
     * @param dias
     */
    public Prestamo crearPrestamo(String codigoLibro, Estudiante estudiante, Bibliotecario bibliotecario, int dias, int cantidad) {

        Libro libro = this.buscarLibro(codigoLibro);

        Prestamo prestamo = null;

        DetallePrestamo detallePrestamo;

        if (libro != null) {

            System.out.println("Encontro el libro "+libro.toString());


            System.out.println("La cantidad del libro es "+libro.getCantidad()+" ");

            // Si encuentro el libro proceso a validar su dispobilidad.

            if (libro.getCantidad() > 0) {

                // El libro esta disponible, entonces paso a dismunuir la cantidad disponible
                // del libro.
                libro.disminuirCantidadPorPrestamo();

                System.out.println("La cantidad luego de reducir la cantidad por el prestamo es "+libro.getCantidad()+" ");

                // Saco la fecha de hoy
               

                // creo el prestamos

                prestamo = new Prestamo( dias, codigoLibro, bibliotecario, estudiante);

                detallePrestamo = new DetallePrestamo( cantidad, libro);

                prestamo.adicionarDetallePrestamo(detallePrestamo);

                prestamo.calcularValorTotalPrestamo();

                // adiciono el prestamo a la lista de prestamos de la Biblioteca
                listaPrestamos.add(prestamo);

            }

        }

        return prestamo;

    }



   /*  public void crearPrestamoVariosLibros (Collection <String>  codigosLibro, Estudiante estudiante, Bibliotecario bibliotecario, int dias, int cantidad){

        
        for( String codigoLibro:codigosLibro ){

            Libro libro = this.buscarLibro(codigoLibro);

            Prestamo prestamo;

            DetallePrestamo detallePrestamo;

            if (libro != null) {

                // Si encuentro el libro proceso a validar su dispobilidad.

                if (libro.getCantidad() > 0) {

                    // El libro esta disponible, entonces paso a dismunuir la cantidad disponible
                    // del libro.
                    libro.disminuirCantidadPorPrestamo();

                    // Saco la fecha de hoy
                    LocalDateTime hoy = LocalDateTime.now();

                    // creo el prestamos

                    prestamo = new Prestamo(0, dias, hoy.toString(), codigoLibro, bibliotecario, estudiante);

                    detallePrestamo = new DetallePrestamo(cantidad, libro);

                    prestamo.adicionarDetallePrestamo(detallePrestamo);

                    // adiciono el prestamo a la lista de prestamos de la Biblioteca
                    listaPrestamos.add(prestamo);

                }

        }

      
    }
}*/

}