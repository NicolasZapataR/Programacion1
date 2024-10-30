package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String placa;
    private String marca;
    private int modelo;
    private int añoFabricacion;

    public Vehiculo (String placa, String marca, int modelo, int añoFabricacion){

        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.añoFabricacion=añoFabricacion;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }


    public abstract double calcularCostoRenta(int dias);

    
    
}
