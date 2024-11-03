package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {

    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numeroBolsasAire;
    private boolean sensorAbs;
    private boolean cuatroXcuatro;
    private double capacidadCarga;

    public PickUp(String tipoCombustible, String tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje,int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa,int numeroBolsasAire, boolean sensorAbs, boolean cuatroXcuatro, double capacidadCarga){

        super(tipoCombustible, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje);

        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas= numeroPuertas;
        this.aireAcondicionado=aireAcondicionado;
        this.camaraReversa=camaraReversa;
        this.numeroBolsasAire=numeroBolsasAire;
        this.sensorAbs=sensorAbs;
        this.cuatroXcuatro=cuatroXcuatro;
        this.capacidadCarga=capacidadCarga;

       
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

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isSensorAbs() {
        return sensorAbs;
    }

    public void setSensorAbs(boolean sensorAbs) {
        this.sensorAbs = sensorAbs;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    
    
}
