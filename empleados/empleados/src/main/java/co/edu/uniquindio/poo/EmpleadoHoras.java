package co.edu.uniquindio.poo;

import java.util.Scanner;

public class EmpleadoHoras extends Empleado {

    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoHoras(String nombre, String id, int horasTrabajadas, double salarioPorHora){

        super(nombre,id);

        this.horasTrabajadas=horasTrabajadas;
        this.salarioPorHora=salarioPorHora;

    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario(){


        double salario = (this.horasTrabajadas*this.salarioPorHora);

        return salario;


    }
    
}
