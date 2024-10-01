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

        Bibliotecario bibliotecario1 = new Bibliotecario("Arturo", "1234", "arturo@uq.com", "312321", 0, "02/03/2024",4);
        Bibliotecario bibliotecario2 = new Bibliotecario("blanca", "12342", "blanca@uq.com", "350381", 0, "02/03/2024",5);
        bibliotecaUQ.agregarBibliotecario(bibliotecario1);
        bibliotecaUQ.agregarBibliotecario(bibliotecario2);

        Estudiante estudiante1 = new Estudiante("Nicolas", "12343", "310123", "nico@uq.com", false);
        Estudiante estudiante2 = new Estudiante("Johanna", "12344", "310124", "johana@uq.com", true);
        bibliotecaUQ.agregarEstudiante(estudiante1);
        bibliotecaUQ.agregarEstudiante(estudiante2);


        
        Libro libro1 = new Libro("once minutos", "001"," 978-950-123-654-3" ,"Paulo coello", "Planeta", "06/08/2003",3000, 25);
        Libro libro2 = new Libro("los cuatro acuerdos", "002","978-930-568-656-3" ,"Miguel angel ruiz", "Urano", "05/03/1997",5000, 10);
        Libro libro3 = new Libro("Don quijote de la mancha", "003","978-651-593-356-3", "Miguel de cervantes saaveerda", "no a plica",
                "1605",4000, 22);
        bibliotecaUQ.agregarLibro(libro1);
        bibliotecaUQ.agregarLibro(libro2);
        bibliotecaUQ.agregarLibro(libro3);

        boolean centinela = true;

        while (centinela) {
            System.out.println("Por favor ingrese la operación que desea realizar:");
            System.out.println("1. agregar libro");
            System.out.println("2. consultar libro");
            System.out.println("3. consultar informacion del libro");
            System.out.println("4. reemplazar libro");
            System.out.println("5. crear prestamo");
            System.out.println("6.Entregar prestamo");
            System.out.println("7. adicionar prestamo");
            System.out.println(" 8.consultar datos  prestamo");
            System.out.println("9.mostrar resultados");
            System.out.println("10. Salir");
            int operacion = dato.nextInt();
            dato.nextLine(); // Consumir el salto de línea

            switch (operacion) {
                case 1:
                System.out.println("AGREGAR LIBRO");
                    System.out.println("Ingrese el nombre del libro:");
                    String nombre = dato.nextLine();

                    System.out.println("Ingrese el código del libro:");
                    String codigoAgregar = dato.nextLine();
                    dato.nextLine(); // Consumir el salto de línea

                    System.out.println("ingrese el codigo isbn del libro");
                    String codigoIsbn= dato.nextLine();

                    System.out.println("Ingrese el autor del libro:");
                    String autor = dato.nextLine();

                    System.out.println("Ingrese la editorial del libro:");
                    String editoral = dato.nextLine();

                    System.out.println("ingrese la fecha de publicaionde del libro");
                    String fecha = dato.nextLine();

                    System.out.println("ingrese el valor del dia del libro");
                    double valorDiaLibro= dato.nextDouble();

                    System.out.println("ingrese la cantidad de libros que va a ingesar");
                    int cantidad = dato.nextInt();

                    Libro libroNuevo = new Libro(nombre, codigoAgregar,codigoIsbn, autor, editoral, fecha,valorDiaLibro, cantidad);
                    bibliotecaUQ.agregarLibro(libroNuevo);

                    System.out.println("El producto fue agregado.");
                    break;

                case 2:

                System.out.println("CONSULTAR LIBRO");

                    System.out.println("ingrese el codigo del libro que desea saber ");
                    String codigoBuscar = dato.nextLine();

                    Libro libroEncontrado=bibliotecaUQ.buscarLibro(codigoBuscar);

                    System.out.println(libroEncontrado.toString());

                    break;
                case 3:
                System.out.println("INFORMACION DE LIBRO");

                    System.out.println("ingrese el codigo del libro que desea buscar informacion");
                    String codigoBuscarInfo = dato.nextLine();

                case 4:

                System.out.println("REEMPLAZAR LIBRO");

                    System.out.println("ingrese el codigo del libro que desea reemplzar");
                    String codigoBuscarReemplazar = dato.nextLine();

                    bibliotecaUQ.buscarLibro(codigoBuscarReemplazar);

                    System.out.println("Ingrese el nombre del libro:");
                    String nombreReemplazar = dato.nextLine();

                    System.out.println("Ingrese el código del libro:");
                    String codigoReemplazar = dato.nextLine();
                    dato.nextLine(); // Consumir el salto de línea

                    System.out.println("Ingrese el codigo isbn del libro");
                    String codigoIsbnReemplazar=dato.nextLine();

                    System.out.println("Ingrese el autor del libro:");
                    String autorReemplazar = dato.nextLine();

                    System.out.println("Ingrese la editorial del libro:");
                    String editoralReemplazar = dato.nextLine();

                    System.out.println("ingrese la fecha de publicaionde del libro");
                    String fechaReemplazar = dato.nextLine();

                    System.out.println("ingrese el valor del dia del libro");
                    double valorDialibroReemplazar= dato.nextDouble();

                    System.out.println("ingrese la cantidad de libros que va a ingesar");
                    int cantidadReemplazar = dato.nextInt();

                    bibliotecaUQ.remplazarDatosLibro(codigoReemplazar, nombreReemplazar, codigoIsbnReemplazar, autorReemplazar, editoralReemplazar, fechaReemplazar, valorDialibroReemplazar, cantidadReemplazar);

                    break;

                case 5:
                

                System.out.println("CREAR PRESTAMO");

                    System.out.println("ingrese el codigo del prestamo");
                    String codigoPrestamo = dato.nextLine();

                    
                    System.out.println("Ingrese los dias del prestamos:");
                    int dias = dato.nextInt();
                    dato.nextLine(); // Consumir el salto de línea

            
                    
                    System.out.println("ingrese el código del libro que desea prestar:");
                    String codigoLibro = dato.nextLine();
                    Libro libroPrestamo = bibliotecaUQ.buscarLibro(codigoLibro);


                    System.out.println("ingrese el cantidad de unidades del libro que desea prestar:");
                    int cantidadLibros= dato.nextInt();

                

                    System.out.println("ingrese el codigo del bibliotecario que esta asignado el prestamo");
                   // String codigoBibliotecario = dato.nextLine();

                   String codigoBibliotecario = "1234";
                    System.out.println(" el codigo del bibliotecario es  "+codigoBibliotecario);
                   // Bibliotecario bibliotecarioPrestamo = null;
                    Bibliotecario bibliotecarioPrestamo = bibliotecaUQ.buscarBibliotecario(codigoBibliotecario);

                    if (bibliotecarioPrestamo==null) {

                        System.out.println("EL bibliotecario con cedula "+codigoBibliotecario+ " no fue encontrado. Intente de nuevo crear el prestamo");

                    }

                    System.out.println("ingrese el documento del estudiante al que se le esta haciendo el prestamo");
                    String codigoEstudiante = "12343";
                   // String codigoEstudiante = dato.nextLine();
                    Estudiante estudiantePrestamo = bibliotecaUQ.buscarEstudiante(codigoEstudiante);
                    System.out.println("Ya busco al estudiante "+estudiantePrestamo.toString());


                    Prestamo prestamo1 = bibliotecaUQ.crearPrestamo(codigoLibro, estudiantePrestamo, bibliotecarioPrestamo, dias, cantidadLibros);

                     if (prestamo1 != null) {

                        System.out.println("El prestamo fue agregado "+prestamo1.toString());
                     }
                     else{

                        System.out.println("No fue posible agregar el prestamo, intente de nuevo");
                     }
                       
                    break;

                case 6:

                System.out.println("ENTREGAR PRESTAMO");

                   System.out.println("ingrese el codigo del prestamo que va a entregar");
                   String codigoPrestamoEntregar= dato.nextLine();

                   bibliotecaUQ.eliminarPrestamo(codigoPrestamoEntregar);


                case 7:

                System.out.println("ADICIONAR A PRESTAMO");

                    System.out.println("Ingrese el código del prestamo al que desea hacerle una adicion:");
                    String codigoAdicon = dato.nextLine();
                    dato.nextLine(); // Consumir el salto de línea

                    break;

                case 8:
                
                System.out.println("CONSULTAR PRESTAMO");

                    System.out.println("ingrese el codigo del prestamo que desea consultar");
                    String codigoConsutar = dato.nextLine();

                    Prestamo prestamo = bibliotecaUQ.buscarPrestamo(codigoConsutar);
                    System.out.println(prestamo);
                    break;

                case 9:

                System.out.println("MOSTRAR RESULTADOS");

                    System.out.println("ingrese el tipo de recibo que desea imprimir");
                    System.out.println(
                            "  1)estudianteConMasPrestamos  2)totalDineroRecaudado  3)pagoBibliotecarios");
                    int opcion = dato.nextInt();

                    if (opcion == 1) {
                        System.out.println("El estudiante con mas prestamos es");

                    } else if (opcion == 2) {
                        System.out.println("El total de dinero recaudado es");

                    } else if (opcion == 3) {

                

                    }

                case 10:

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
