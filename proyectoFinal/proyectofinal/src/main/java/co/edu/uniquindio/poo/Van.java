package co.edu.uniquindio.poo;

public class Van extends VehiculoCombustion {

    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private int numeroBolsasAire;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private boolean sensorAbs;

    public Van(String placa,  TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, TipoCombustible tipoCombustible, int numeroPasajeros, int numeroPuertas, double capacidadMaletero, int numeroBolsasAire, boolean aireAcondicionado, boolean camaraReversa, boolean sensorAbs){

        super(placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje, tipoCombustible);
        

        

        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
        this.numeroBolsasAire=numeroBolsasAire;
        this.aireAcondicionado=aireAcondicionado;
        this.camaraReversa=camaraReversa;
        this.sensorAbs=sensorAbs;

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

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isSensorAbs() {
        return sensorAbs;
    }

    public void setSensorAbs(boolean sensorAbs) {
        this.sensorAbs = sensorAbs;
    }

    


    
}
