package co.edu.uniquindio.poo;

public class CamionetaElectrica  extends VehiculoElectrico{

    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private int numeroBolsasAire;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private boolean sensorAbs;
    private boolean sensorColison;
    private boolean sensorTrafico;
    private boolean sensorAsistenciaCarril;
    private boolean cuatroXcuatro;
    

    public CamionetaElectrica(String placa, TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, int autonomia, double tiempoCarga, int numeroPasajeros, int numeroPuertas, double capacidadMaletero, int numeroBolsasAire, boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, boolean sensorAbs, boolean sensorColison, boolean sensorTrafico, boolean sensorAsistenciaCarril, boolean cuatroXcuatro){

        super(placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje, autonomia, tiempoCarga);
        


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


    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }


    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }


    public boolean isSensorAbs() {
        return sensorAbs;
    }


    public void setSensorAbs(boolean sensorAbs) {
        this.sensorAbs = sensorAbs;
    }


    public boolean isSensorColison() {
        return sensorColison;
    }


    public void setSensorColison(boolean sensorColison) {
        this.sensorColison = sensorColison;
    }


    public boolean isSensorTrafico() {
        return sensorTrafico;
    }


    public void setSensorTrafico(boolean sensorTrafico) {
        this.sensorTrafico = sensorTrafico;
    }


    public boolean isSensorAsistenciaCarril() {
        return sensorAsistenciaCarril;
    }


    public void setSensorAsistenciaCarril(boolean sensorAsistenciaCarril) {
        this.sensorAsistenciaCarril = sensorAsistenciaCarril;
    }


    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }


    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

   

    
}
