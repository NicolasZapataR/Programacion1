package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo{

    private int  autonomia;
    private double tiempoCarga;

    public VehiculoElectrico(String placa, TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, int autonomia, double tiempoCarga){

        super(placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje);

        this.autonomia=autonomia;
        this.tiempoCarga=tiempoCarga;

    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public double getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(double tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    



    
}
