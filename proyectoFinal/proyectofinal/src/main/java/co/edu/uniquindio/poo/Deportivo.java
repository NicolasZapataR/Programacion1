package co.edu.uniquindio.poo;

public class Deportivo extends VehiculoCombustion {

    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private double numeroCaballosDeFuerza;
    private String aceleracion;

    public Deportivo(String placa,  TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, TipoCombustible tipoCombustible, int numeroPasajeros, int numeroPuertas, double numeroCaballosDeFuerza, String aceleracion){

        super(placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje, tipoCombustible);

       

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

    public String getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(String aceleracion) {
        this.aceleracion = aceleracion;
    }

   

    



    
}

