package co.edu.uniquindio.poo.model;

public class Camion extends VehiculoCombustion {

    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenoAire;
    private boolean sensorAbs;
    private int numeroEjes;
    private TipoCamion tipoCamion;

    public Camion(String placa,  TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, TipoCombustible tipoCombustible, double capacidadCarga, boolean aireAcondicionado,boolean frenoAire, boolean sensorAbs, int numeroEjes, TipoCamion tipoCamion){

        super(placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje, tipoCombustible);

        this.capacidadCarga=capacidadCarga;
        this.aireAcondicionado=aireAcondicionado;
        this.frenoAire=frenoAire;
        this.sensorAbs=sensorAbs;
        this.numeroEjes=numeroEjes;
        this.tipoCamion=tipoCamion;

    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenoAire() {
        return frenoAire;
    }

    public void setFrenoAire(boolean frenoAire) {
        this.frenoAire = frenoAire;
    }

    public boolean isSensorAbs() {
        return sensorAbs;
    }

    public void setSensorAbs(boolean sensorAbs) {
        this.sensorAbs = sensorAbs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    
    
}
