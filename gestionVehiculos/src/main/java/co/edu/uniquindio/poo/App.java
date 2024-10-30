package co.edu.uniquindio.poo;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        ejecutarPrograma();
       
    }

    public static void ejecutarPrograma(){

        Scanner dato = new Scanner(System.in);

        Empresa empresa = new Empresa("Localiza");

        Vehiculo auto1 = new Auto("vki775", "Hyundai", 2009, 2008, 4);
        Vehiculo auto2 = new Auto("gfv198", "Kia", 2022, 2021, 4);
        Vehiculo auto3 = new Auto("kml877", "Chevrolet", 2013, 2012, 4);

        Vehiculo camioneta1 = new Camioneta("kdn-123", "Nissan", 2015, 2015, 1500);
        Vehiculo camioneta2 = new Camioneta("sqe-150", "Mazda", 2018, 2017, 2500);
        Vehiculo camioneta3 = new Camioneta("hdn510", "Honda", 2024, 2024, 3000);

      //  Vehiculo moto = new Moto("ivi-97d", "kymko", 2017, 2016, AUTOMATICA);
       // Vehiculo moto2 = new Moto("kuj-39f", "honda", 2024, 2023, MANUAL);

       empresa.agregarVehiculo(auto1);
       empresa.agregarVehiculo(auto2);
       empresa.agregarVehiculo(auto3);

       empresa.agregarVehiculo(camioneta1);
       empresa.agregarVehiculo(camioneta2);
       empresa.agregarVehiculo(camioneta3);
       

       Cliente cliente1 = new Cliente("Nicolas", "001", "1234", "san Diego");
       Cliente cliente2 = new Cliente("Johanna","002" , "12345", "el cielo");
       Cliente cliente3 = new Cliente("Julian", "003", "123456", "centro");

       empresa.agregarCliente(cliente1);
       empresa.agregarCliente(cliente2);
       empresa.agregarCliente(cliente3);


       
       
       System.out.println("ingrese la cantidad de dias");
       int dias = dato.nextInt();

       Reserva reserva1 = empresa.crearReserva("000", cliente1, camioneta1, dias);
       empresa.agregarVehiculoEnRenta(camioneta1);
       System.out.println("El valor de la reserva es: "+reserva1.calcularCosto());

       System.out.println("ingrese la cantidad de dias");
       int dias1 = dato.nextInt();
       
       Reserva reserva2 = empresa.crearReserva("001", cliente2, auto2, dias1);
       empresa.agregarVehiculoEnRenta(auto2);
       System.out.println("El valor de la reserva es: "+reserva2.calcularCosto());







    


       




       

       




    }


}
