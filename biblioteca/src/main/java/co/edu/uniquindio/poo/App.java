package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ejercutarPrograma();

    }

    public static void ejercutarPrograma() {

        Scanner dato = new Scanner(System.in);

        Biblioteca bibliotecaUQ = new Biblioteca("EUCLIDES JARAMILLO ARANGO");

        Bibliotecario bibliotecario1 = new Bibliotecario("Arturo", "1234", "arturo@uq.com", "312321", 0, "02/03/2024");
        Bibliotecario bibliotecario2 = new Bibliotecario("blanca", "12342", "blanca@uq.com", "350381", 0, "02/03/2024");
        bibliotecaUQ.agregarBibliotecario(bibliotecario1);
        bibliotecaUQ.agregarBibliotecario(bibliotecario2);

        Estudiante estudiante1 = new Estudiante("Nicolas", "12343", "310123", "nico@uq.com", false);
        Estudiante estudiante2 = new Estudiante("Johanna", "12344", "310124", "johana@uq.com", true);
        bibliotecaUQ.agregarEstudiante(estudiante1);
        bibliotecaUQ.agregarEstudiante(estudiante2);

        // Libro onceMinutos = new Libro("once minutos", "001", "Paulo coello",
        // "Planeta", "06/08/2003");
        Libro libro1 = new Libro("once minutos", "001", "Paulo coello", "Planeta", "06/08/2003", 25);
        Libro libro2 = new Libro("los cuatro acuerdos", "002", "Miguel angel ruiz", "Urano", "05/03/1997", 10);
        Libro libro3 = new Libro("Don quijote de la mancha", "003", "Miguel de cervantes saaveerda", "no a plica",  "1605", 22);
        bibliotecaUQ.agregarLibro(libro1);
        bibliotecaUQ.agregarLibro(libro2);
        bibliotecaUQ.agregarLibro(libro3);

        boolean centinela = true;

        while (centinela) {
            System.out.println("Por favor ingrese la operación que desea realizar:");
            System.out.println("1. crear libro");
            System.out.println("2. consultar libro");
            System.out.println("3. consultar informacion del libro");
            System.out.println("4. reemplazar libro");
            System.out.println("5. crear prestamo");
            System.out.println("6. adicionar prestamo");
            System.out.println(" 7.consultar datos  prestamo");
            System.out.println("8.mostrar resultados");
            System.out.println("9. Salir");
            int operacion = dato.nextInt();
            dato.nextLine(); // Consumir el salto de línea

            switch (operacion) {
                case 1:
                    System.out.println("Ingrese el nombre del libro:");
                    String nombre = dato.nextLine();

                    System.out.println("Ingrese el código del libro:");
                    String codigoAgregar = dato.nextLine();
                    dato.nextLine(); // Consumir el salto de línea

                    System.out.println("Ingrese el autor del libro:");
                    String autor = dato.nextLine();

                    System.out.println("Ingrese la editorial del libro:");
                    String editoral = dato.nextLine();

                    System.out.println("ingrese la fecha de publicaionde del libro");
                    String fecha = dato.nextLine();

                    System.out.println("ingrese la cantidad de libros que va a ingesar");
                    int cantidad = dato.nextInt();

                    Libro libroNuevo = new Libro(nombre, codigoAgregar, autor, editoral, fecha, cantidad);
                    bibliotecaUQ.agregarLibro(libroNuevo);

                    System.out.println("El producto fue agregado.");
                    break;

                case 2:

                    System.out.println("ingrese el codigo del libro que desea saber ");
                    String codigoBuscar = dato.nextLine();

                    bibliotecaUQ.buscarLibro(codigoBuscar);

                    break;
                case 3:
                    System.out.println("ingrese el codigo del libro que desea buscar informacion");
                    String codigoBuscarInfo = dato.nextLine();

                case 4:
                    System.out.println("Ingrese el código del libro que desea reemplazar:");
                    int codigoReemplazar = dato.nextInt();
                    dato.nextLine(); // Consumir el salto de línea

                    break;

                case 5:

                    System.out.println("ingrese el codigo del prestamo");
                    String codigoPrestamo = dato.nextLine();

                    System.out.println("Ingrese el valor del prestamo:");
                    double valor = dato.nextDouble();

                    System.out.println("Ingrese los dias del prestamos:");
                    int dias = dato.nextInt();
                    dato.nextLine(); // Consumir el salto de línea

                    System.out.println("Ingrese la fecha del prestamo:");
                    String fechaPrestamo = dato.nextLine();

                    System.out.println("ingrese el código del libro que desea prestar:");
                    String codigoLibro = dato.nextLine();
                    Libro libroPrestamo = bibliotecaUQ.buscarLibro(codigoLibro);

                    System.out.println("ingrese el cantidad de unidades del libro que desea prestar:");
                    int unidades = dato.nextInt();

                    // Buscar el bibliotecario por su código y aseignarlo al prestamo nuevo

                    System.out.println("ingrese el codigo/cedula del bibliotecario que esta asisgnando el prestamo");
                    String codigoBibliotecario=dato.nextLine();
                    Bibliotecario bibliotecarioPrestamo = bibliotecaUQ.buscarBibliotecario(codigoBibliotecario);

                    System.out.println("ingrese el documento del estudiante al que se le esta haciendo el prestamo");
                    String codigoEstudiante = dato.nextLine();
                    Estudiante estudiantePrestamo = bibliotecaUQ.buscarEstudiante(codigoEstudiante);


                    Prestamo prestamoNuevo = new Prestamo(libroPrestamo, valor,dias,fechaPrestamo, codigoPrestamo,bibliotecarioPrestamo,estudiantePrestamo);

                    DetallePrestamo detallePrestamo = new DetallePrestamo(unidades, libroPrestamo);

                    bibliotecaUQ.agregarPrestamo(prestamoNuevo, detallePrestamo);

                    System.out.println("El prestamo fue agregado.");
                    break;

                case 6:
                    System.out.println("Ingrese el código del prestamo al que desea hacerle una adicion:");
                    String codigoAdicon = dato.nextLine();
                    dato.nextLine(); // Consumir el salto de línea

                    break;

                case 7:

                    System.out.println("ingrese el codigo del prestamo que desea consultar");
                    String codigoConsutar = dato.nextLine();

                    Prestamo prestamo = bibliotecaUQ.buscarPrestamo(codigoConsutar);
                    System.out.println(prestamo);
                    break;

                case 8:

                    System.out.println("ingrese el tipo de recibo que desea imprimir");
                    System.out.println(
                            " 1)entregar prestamo 2)estudianteConMasPrestamos  3)totalDineroRecaudado  4)pagoBibliotecarios");
                    int opcion = dato.nextInt();

                    if (opcion == 1) {

                    } else if (opcion == 2) {

                    } else if (opcion == 3) {

                    } else if (opcion == 4) {

                    }

                case 9:
                    centinela = false;
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

    }

}
