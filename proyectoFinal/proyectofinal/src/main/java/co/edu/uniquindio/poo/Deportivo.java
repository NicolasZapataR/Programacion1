package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {

    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private double numeroCaballosDeFuerza;
    private double aceleracion;

    public Deportivo(String tipoCombustible, String tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, int numeroPasajeros, int numeroPuertas, double numeroCaballosDeFuerza, double aceleracion){

        super(tipoCombustible, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje);

        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.numeroBolsasAire=numeroBolsasAire;
        this.numeroCaballosDeFuerza=numeroCaballosDeFuerza;
        this.aceleracion=aceleracion;

    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public double getNumeroCaballosDeFuerza() {
        return numeroCaballosDeFuerza;
    }

    public void setNumeroCaballosDeFuerza(double numeroCaballosDeFuerza) {
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

   

    



    
}

