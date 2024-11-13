package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;

    public Perecedero perecedero;
    public Refrigerado refrigerado;
    public Envasado envasado;

    private Collection<Proveedor> listaProveedores;

    public Empresa(String nombre) {

        this.nombre = nombre;

        listaProveedores = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perecedero getPerecedero() {
        return perecedero;
    }

    public void setPerecedero(Perecedero perecedero) {
        this.perecedero = perecedero;
    }

    public Refrigerado getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(Refrigerado refrigerado) {
        this.refrigerado = refrigerado;
    }

    public Envasado getEnvasado() {
        return envasado;
    }

    public void setEnvasado(Envasado envasado) {
        this.envasado = envasado;
    }

    public Collection<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(Collection<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public double determinarImpuestoPerecedero() {
        double costo = 0;
        costo = (perecedero.calcularCostoVenta() * 1.08);
        return costo;
    }

    public double determinarImpuestoRefrigerado() {
        double costo = 0;
        costo = (refrigerado.calcularCostoVenta() * 1.05);
        return costo;
    }

    public double determinarImpuestoEnvasadp() {

        double costo = 0;

        costo = (envasado.calcularCostoVenta() * 1.10);

        return costo;

    }

}
