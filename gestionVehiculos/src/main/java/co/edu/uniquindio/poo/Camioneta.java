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
    public double calcularCostoRenta() {

        int dias = 0;
        double valor = 120000;
        double pesoCarga = 0;

        if (pesoCarga < 1000) {
            valor = (dias * (valor + valor * 0.10));
        } else if (pesoCarga > 1000 && pesoCarga < 2000) {
            valor = (dias * (valor + valor * 0.20));
        } else if (pesoCarga > 2000 && pesoCarga < 3000) {
            valor = (dias * (valor + valor * 0.30));
        }

        return valor;

    }

}
