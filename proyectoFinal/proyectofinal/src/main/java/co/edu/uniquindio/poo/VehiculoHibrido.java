package co.edu.uniquindio.poo;

public class VehiculoHibrido  extends Vehiculo{

    private boolean enchufable;
    private boolean ligero;

    public VehiculoHibrido(String placa,  TipoTransmision tipoTransmision, String marca, String estadoVehiculo, int numeroCambios, double velMax, double cilindraje, boolean enchufable, boolean ligero){

        super( placa, tipoTransmision, marca, estadoVehiculo, numeroCambios, velMax, cilindraje);

        this.enchufable=enchufable;
        this.ligero=ligero;

    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isLigero() {
        return ligero;
    }

    public void setLigero(boolean ligero) {
        this.ligero = ligero;
    }

    



    
}
