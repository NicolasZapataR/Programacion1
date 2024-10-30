package co.edu.uniquindio.poo;

public class Auto extends Vehiculo {
    
    private int numeroPuertas;

    public Auto(String placa, String marca, int modelo, int añoFabricacion, int numeroPuertas) {
        super(placa, marca, modelo, añoFabricacion);
        
        this.numeroPuertas=numeroPuertas;
    }
    


    public int getNumeroPuertas() {
        return numeroPuertas;
    }





    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
        
    
    @Override
    public double calcularCostoRenta(int dias){

         double tarifaBase= 100000;
         

         double valor=0;

         valor = (tarifaBase*dias);

         return valor;


    }




















}

