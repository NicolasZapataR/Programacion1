package co.edu.uniquindio.poo.model;

public class VehiculoCombustion extends Vehiculo {

    private TipoCombustible tipoCombustible;

    

    public VehiculoCombustion(String placa,  TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, TipoCombustible tipoCombustible){

        super(placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje);

        this.tipoCombustible=tipoCombustible;

        

    }



    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }



    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    
    
}
