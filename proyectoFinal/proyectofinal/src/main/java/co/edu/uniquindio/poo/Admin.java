package co.edu.uniquindio.poo;

public class Admin  extends Persona{

    private String correo;
    private String contraseña;
    private double salario;

    public Admin( String nombre, String id, String telefono , String dirreccion,String correo, String contraseña, double salario){

        super(nombre, id, telefono, dirreccion);

        this.correo=correo;
        this.contraseña=contraseña;
        this.salario=salario;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    


    
}
