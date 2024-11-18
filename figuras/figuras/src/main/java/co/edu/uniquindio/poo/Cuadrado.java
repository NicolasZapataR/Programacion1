package co.edu.uniquindio.poo;

public class Cuadrado  extends Figura implements IPerimetro{

    private double base;
    private double altura;

    public Cuadrado(String nombre, double base, double altura){

        super(nombre);

        this.base=base;
        this.altura=altura;


    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override

    public double calcularArea(){

        double area= (this.base*this.altura);

        return area;
    }

    @Override
    public double calcularPerimetro() {
           
        double perimetro= (this.base+this.base+this.altura+this.altura);

        return perimetro;
    }

    
}
