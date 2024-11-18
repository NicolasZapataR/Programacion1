package co.edu.uniquindio.poo.model;

public class Vehiculo {

    private String placa;
    
    private TipoTransmision tipoTransmision;
    private String marca;
    private String estadoVehiculo;
    private int numeroCambios;
    private double velMax;
    private double cilindraje;
   

    public Vehiculo(String placa, TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje){

        this.placa=placa;
       
        this.tipoTransmision=tipoTransmision;
        this.marca=marca;
        this.estadoVehiculo=estadoVehiculo;
        this.numeroCambios=numeroCambios;
        this.velMax=velMax;
        this.cilindraje=cilindraje;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


   


    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }


    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }


    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }


    public int getNumeroCambios() {
        return numeroCambios;
    }


    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }


    public double getVelMax() {
        return velMax;
    }


    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }


    public double getCilindraje() {
        return cilindraje;
    }


    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    


}
