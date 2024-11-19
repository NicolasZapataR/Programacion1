package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ejecuarPrograma();
        

    }


    public  static void ejecuarPrograma(){

        Scanner dato = new Scanner(System.in);

        Empresa empresa = new Empresa("Tu carro Uq");

        Empleado empleado1 = new Empleado(false, "Jorge", "001", "320320320", "armenia-centro", 2300000, "jorge@tucarrouq.com", 5, 3, 8);
        Empleado empleado2 =new Empleado(false, "Maria", "0002", "313313313", "Armenia-centro", 2200000, "maria@tucarrouq.com", 2, 1, 6);
        Empleado admin = new Empleado(true, "Raul", "003", "314314314", "Armenia-norte", 3500000, "raul@tucarrouq.com", 0, 0, 0);
        empresa.empleado.agregarEmpleado(empresa, empleado1);  
        empresa.empleado.agregarEmpleado(empresa, empleado2);
        empresa.empleado.agregarEmpleado(empresa, admin);


        Bus bus1 = new Bus("BHM-412", TipoTransmision.triptonica, "volvo", "venta", 6, 155.9, 4.600, TipoCombustible.diesel, 44, 6, 8000, 48, true, true, true, 2, 1);
        empresa.empleado.registroVehiculosListaVenta(bus1, empresa, empleado2);

        Camion camion1= new Camion("KML-877", TipoTransmision.manual, "kenwort", "venta", 16, 140, 5800, TipoCombustible.diesel, 35000, true, true, true, 2, TipoCamion.camionDosEjes);
        empresa.empleado.registroVehiculosListaVenta(camion1, empresa, empleado1);

        Van van1 = new Van("BDX-566", TipoTransmision.manual, "chevrolet", "alquiler", 5, 120, 2800, TipoCombustible.gasolina, 11 ,4 , 1600, 3, true, false, false);
        empresa.empleado.registroVehiculosListaAlquiler(van1, empresa, empleado2);

        Deportivo deportivo1 = new Deportivo("GFV-198", TipoTransmision.triptonica, "bmw", "venta", 6, 260, 2400, TipoCombustible.gasolina, 4, 3, 250, " 0 a 100km/h de 3,5 seg");
        empresa.empleado.registroVehiculosListaVenta(deportivo1, empresa, empleado2);

        PickUpHibrida pickUpHibrida1= new PickUpHibrida("SQE-150", TipoTransmision.automatica, "honda", "alquiler", 5, 120, 1000, true, false, 5, 5, true, true, 4, true, false, 500);
        empresa.empleado.registroVehiculosListaAlquiler(pickUpHibrida1, empresa, empleado1);

        SedanElectrico sedanElectrico1 = new SedanElectrico("KDN-100", TipoTransmision.automatica, "nissan", "compra", 5, 130, 1000, 250, 4, 5, 5, 800, 4, true, false, false, true, false, false, false);
        empresa.empleado.registroVehiculosListaCompra(sedanElectrico1, empresa, empleado2);


        MotoElectrica motoElectrica1= new MotoElectrica("KUJ-39F", TipoTransmision.automatica, "yamaha", "venta", 6, 80, 100, 100, 7);
        empresa.empleado.registroVehiculosListaVenta(motoElectrica1, empresa, empleado2);

        Cliente cliente1 = new Cliente("nicolas", "1234", "323232", "armenia-sur", 0, 0, 0);
        Cliente cliente2 = new Cliente("johanna", "9854", "315315315", "armenia.sur", 0, 0, 0);



        boolean centinela = true;

        while (centinela) {

            System.out.println("bienvenido a tu carro UQ, selecciona tu rol");
            System.out.println("1. Admin     2.Empleado");
            int rol=dato.nextInt();

            if(rol==1){
                System.out.println("Bienvenido administrado, seleccione la opreacion que desea");
                System.out.println("1. Registrar empleado");
                System.out.println("2. Eliminar empleado");
                System.out.println("3. Buscar empleado");
                System.out.println("4. Actualizar datos del empleado");
                System.out.println("5. ver registro empleado");
                System.out.println("6.Ver registro general");
                int opreacionAdmin=dato.nextInt();

            
                switch (opreacionAdmin) {

                case 1:
                System.out.println("Registro de empleado");

               // System.out.println("ingrese el rol del empleado");
                //Boolean true=dato.nextBoolean();

                System.out.println("ingrese el nombre del empleado");
                String nombre=dato.nextLine();

                System.out.println("ingrese el id del empleado");
                String id=dato.nextLine();

                System.out.println("ingrese el telefono");
                String telefono=dato.nextLine();

                System.out.println("ingrese la direccion");
                String direccion=dato.nextLine();

                System.out.println("ingrese el salario");
                double salario=dato.nextDouble();

                System.out.println("ingrese el correo");
                String correo=dato.nextLine();


                System.out.println("numero alquilado");
                int nAlquileres=dato.nextInt();

                System.out.println("numreo de comprado");
                int nCompras=dato.nextInt();

                System.out.println("numero de vendidos");
                int nVentas=dato.nextInt();

                Empleado nuevoEmpleado = new Empleado(false, nombre, id, telefono, direccion, salario, correo, rol, nCompras, rol);

                empresa.empleado.agregarEmpleadoListaEmpleado(empresa, nuevoEmpleado);;



                

                case 2:
                System.out.println("Eliminar empleado");

                System.out.println("ingrese el id del empleado que desea eliminar");
                String idElimnar=dato.nextLine();

               // empresa.empleado.eliminarEmpleado(empresa, empresa.empleado.getId());
                empresa.eliminarEmpleado(idElimnar);

                

                case 3:

                System.out.println("Buscar empleado");

                System.out.println("ingrese el id del empleado que desea buscar");
                String idBuscar=dato.nextLine();
                
                empresa.empleado.buscarEmpleado(empresa, empresa.empleado);
                empresa.buscarEmpleado(idBuscar);

                   

                case 4:
                

                System.out.println("Actualizar datos del empleado");

                Empleado empleado;

                System.out.println("ingrese el nombre del empleado");
                String nombreActualizar=dato.nextLine();

                System.out.println("ingrese el id del empleado");
                String idActualizar=dato.nextLine();

                System.out.println("ingrese el telefono");
                String telefonoActualizar=dato.nextLine();

                System.out.println("ingrese la direccion");
                String direccionActualizar=dato.nextLine();

                System.out.println("ingrese el salario");
                double salarioActualizar=dato.nextDouble();

                System.out.println("ingrese el correo");
                String correoActualizar=dato.nextLine();


                System.out.println("numero alquilado");
                int nAlquileresActualizar=dato.nextInt();

                System.out.println("numreo de comprado");
                int nComprasActualizar=dato.nextInt();

                System.out.println("numero de vendidos");
                int nVentasActualizar=dato.nextInt();

              //  empresa.empleado.actualizarDatos(empresa, nuevoEmpleado);
                //empresa.actualizarDatos(false, salarioActualizar, correoActualizar, nAlquileres, nCompras, nVentas);

                admin.actualizarDatosEmpleado(empresa, empleado2);
                   

                case 5:

                System.out.println("ver registro empleado");

                System.out.println("ingrese el id del empleado");
                String idRegistroBuscar=dato.nextLine();


                admin.verRegistroEmpleado(empresa, empleado1);

                   


                case 6:
                System.out.println("ver registro general");
                admin.verRegistroGenertal(empresa);

               }
            }

            if (rol==2){

                System.out.println("1. gestion de vehiculos");
                System.out.println("2.gestion clientes");
                System.out.println("3.Servicios");
                int operacionEmpleado=dato.nextInt();

                if(operacionEmpleado==1){
                    System.out.println("GESTION DE VEHICULOS");

                    System.out.println("1.agregar vehiculo venta");
                    System.out.println("2.buscar vehiculo venta");
                    System.out.println("3.eliminar vehiculo venta");

                    System.out.println("4.agregar vehiculo alquiler");
                    System.out.println("5.buscar vehiculo alquiler");
                    System.out.println("6.eliminar vehiculo alquiler");

                    System.out.println("7.agregar vehiculo para comprar");
                    System.out.println("8.buscar vehiculo en lista de comprar");
                    System.out.println("9.eliminar vehiculo de de compras");
                    int operacionGestionVehiculos=dato.nextInt();


                    switch (operacionGestionVehiculos) {

                    case 1:
                    System.out.println("agregar vehiculo venta");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaVentaAgregar=dato.nextLine();

                    //busco que llegue la placa del vehiculo y no el vehiculo

                    empresa.agregarVehiculoCompra(motoElectrica1);;
                    empresa.empleado.registroVehiculosListaVenta(motoElectrica1, empresa, empleado2);


                    case 2: 
                    System.out.println("buscar vehiculo venta");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaVentaBuscar=dato.nextLine();

                    empresa.buscarVehiculoVenta(placaVentaBuscar);
                    empresa.empleado.buscarVehiculoListaVenta(motoElectrica1, empresa, empleado2);


                    case 3:
                    System.out.println("eliminar vehiculo venta");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaVentaElimniar=dato.nextLine();

                    empresa.eliminarVehiculoVenta(placaVentaElimniar);
                    
                    
        

                    case 4:
                    System.out.println("agregar vehiculo alquiler");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaAgregarAlquiler=dato.nextLine();

                    empresa.agregarVehiculoCompra(motoElectrica1);


                    case 5:
                    System.out.println("buscar vehiculo alquiler");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaBuscarAlquiler=dato.nextLine();

                    empresa.buscarVehiculoAlquiler(placaBuscarAlquiler);
                    

                    case 6:
                    System.out.println("eliminar vehiculo alquiler");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaEliminarAlquiler=dato.nextLine();

                    empresa.eliminarVehiculoAlquiler(placaEliminarAlquiler);
                    //no cuadra
                    empresa.empleado.eliminarVehiculoListaAlquiler(motoElectrica1, empresa, empleado2);

                    case 7:
                    System.out.println("agregar vehiculo para comprar");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaAgregarComprar=dato.nextLine();

                    empresa.agregarVehiculoCompra(motoElectrica1);


                    case 8:
                    System.out.println("buscar vehiculo en lista de comprar");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaBuscarComprar=dato.nextLine();

                    empresa.buscarVehiculoCompra(placaBuscarComprar);

                    case 9:
                    System.out.println("eliminar vehiculo de de compras");

                    System.out.println("ingrese la placa del vehiculo");
                    String placaEliminarComprar=dato.nextLine();

                    empresa.eliminarVehiculoCompra(placaEliminarComprar);



                    }
                }
            

                if (operacionEmpleado==2) {
                    System.out.println("GESTION DE clientes");
                    
                    System.out.println("1.buscar cliente");
                    System.out.println("2. eliminar cliente");
                    int operacionGestionClientes=dato.nextInt();

                    switch (operacionGestionClientes) {

                        case 1:
                        System.out.println("buscar cliente");

                        System.out.println("ingrese el id del cliete");
                        String idClienteBuscar=dato.nextLine();

                        empresa.buscarCliente(idClienteBuscar);

                        

                        case 2:
                        System.out.println("eliminar cliente");

                        System.out.println("ingrese el id del cliete");
                        String idClienteEliminar=dato.nextLine();

                        empresa.eliminarCliente(idClienteEliminar);

                        

                    }
    
                    
                }
                if(operacionEmpleado==3){

                    System.out.println("SERVICOS");
                    System.out.println("1.alquilar");
                    System.out.println("2.vender");
                    System.out.println("3.comprar");
                    int operacionServicios=dato.nextInt();

                    switch (operacionServicios) {

                        case 1:
                        System.out.println("alquilar");

                        System.out.println("ingrese los dias");
                        int dias= dato.nextInt();

                        System.out.println("ingrese el valor del alquiler");
                        double valor= dato.nextDouble();

                        empresa.hacerAlquiler(dias, valor);
                        empresa.empleado.alquilar(empresa, empleado2, dias, valor, motoElectrica1, cliente2);


                

                        case 2:
                        System.out.println("vender");

                        empleado1.vender(empresa, empleado1);
                        empresa.hacerVenta();

                        case 3:
                        System.out.println("comprar");

                        empresa.hacerCompra();
                        empleado1.comprar(empresa, empleado2);

                     

                    }

                }               

            }            
                
        }
    }

 }

