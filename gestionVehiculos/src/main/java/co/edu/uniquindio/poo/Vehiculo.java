package co.edu.uniquindio.poo;

public abstract class vehiculo {

    private String placa;
    private String marca;
    private int modelo;
    private String añoFabricacion;

    public vehiculo (String placa, String marca, int modelo, String añoFabricacion){

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

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }


    public abstract double calcularCostoRenta();
    
    
}
