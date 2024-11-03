package co.edu.uniquindio.poo;

public class Cliente  extends Persona{
    
    private int numeroVehiculosAlquilados;
    private int numeroVehiculosComprados;
    private int numeroVehiculosVendidos;

    public Cliente (String nombre, String id, String telefono , String dirreccion, int numeroVehiculosAlquilados, int numeroVehiculosComprados, int numeroVehiculosVendidos){

        super(nombre, id, telefono, dirreccion);

        this.numeroVehiculosAlquilados=numeroVehiculosAlquilados;
        this.numeroVehiculosComprados=numeroVehiculosComprados;
        this.numeroVehiculosVendidos= numeroVehiculosVendidos;


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
