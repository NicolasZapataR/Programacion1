package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    
    private double salario;
    private String correo;
    private String contraseña;
    private int numeroVehiculosAlquilados;
    private int numeroVehiculosComprados;
    private int numeroVehiculosVendidos;

    public Empleado (String nombre, String id, String telefono , String dirreccion,double salario, String correo, String contraseña, int numeroVehiculosAlquilados, int numeroVehiculosComprados, int numeroVehiculosVendidos){

        super(nombre, id, telefono, dirreccion);

        this.salario=salario;
        this.correo=correo;
        this.contraseña=contraseña;
        this.numeroVehiculosAlquilados=numeroVehiculosAlquilados;
        this.numeroVehiculosComprados=numeroVehiculosComprados;
        this.numeroVehiculosVendidos= numeroVehiculosVendidos;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumeroVehiculosAlquilados() {
        return numeroVehiculosAlquilados;
    }

    public void setNumeroVehiculosAlquilados(int numeroVehiculosAlquilados) {
        this.numeroVehiculosAlquilados = numeroVehiculosAlquilados;
    }

    public int getNumeroVehiculosComprados() {
        return numeroVehiculosComprados;
    }

    public void setNumeroVehiculosComprados(int numeroVehiculosComprados) {
        this.numeroVehiculosComprados = numeroVehiculosComprados;
    }

    public int getNumeroVehiculosVendidos() {
        return numeroVehiculosVendidos;
    }

    public void setNumeroVehiculosVendidos(int numeroVehiculosVendidos) {
        this.numeroVehiculosVendidos = numeroVehiculosVendidos;
    }

    
    


}
