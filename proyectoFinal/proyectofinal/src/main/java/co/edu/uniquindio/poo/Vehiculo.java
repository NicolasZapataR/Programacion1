package co.edu.uniquindio.poo;

public class Vehiculo {

    private  String tipoCombustible;
    private String tipoTrasmision;
    private String marca;
    private String estadoVehiculo;
    private int numeroCambios;
    private double velMax;
    private double cilindraje;

    public Vehiculo(String tipoCombustible, String tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje){

        this.tipoCombustible=tipoCombustible;
        this.tipoTrasmision=tipoTransmision;
        this.marca=marca;
        this.estadoVehiculo=estadoVehiculo;
        this.numeroCambios=numeroCambios;
        this.velMax=velMax;
        this.cilindraje=cilindraje;
    }

    
    
}
