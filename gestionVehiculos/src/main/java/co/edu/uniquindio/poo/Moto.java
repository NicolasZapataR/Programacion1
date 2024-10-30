package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    
    private TipoCaja caja;

    public Moto(String placa, String marca, int modelo,int añoFabricacion, TipoCaja caja){
        super(placa, marca, modelo, añoFabricacion);

        this.caja = caja;
    }

    public TipoCaja getTipoCaja() {
        return caja;
    }

    public void setTipoCaja(TipoCaja caja) {
        this.caja = caja;
    }

    
    public double calcularCostoRenta(int dias){

        double tarifaBase=60000;
        double valor = 0;

        valor =(dias*tarifaBase );

        if(caja==TipoCaja.AUTOMATICA){
            valor=(dias*tarifaBase) + 10000 ;
        }

        return valor;

    }

    

}
