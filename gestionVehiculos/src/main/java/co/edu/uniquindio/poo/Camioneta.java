package co.edu.uniquindio.poo;




public class Camioneta extends Vehiculo {

    private double capacidadCarga;

    public Camioneta(String placa, String marca, int modelo, int añoFabricacion, double capacidadCarga) {
        super(placa, marca, modelo, añoFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoRenta(int dias) {
       
        double tarifaBase = 120000;
        double valor = 0;

        if (capacidadCarga < 1000) {
            valor = (dias * (tarifaBase + tarifaBase * 0.10));
        } else if (capacidadCarga > 1000 && capacidadCarga < 2000) {
            valor = (dias * (tarifaBase + tarifaBase * 0.20));
        } else if (capacidadCarga > 2000 && capacidadCarga < 3000) {
            valor = (dias * (tarifaBase + tarifaBase * 0.30));
        }

        return valor;

    }

}
