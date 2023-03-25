package ObjectosDeExamen2P2Lab;

import java.io.Serializable;

public class Periodo implements Serializable{

    String NombreDelPeriodo;

    public Periodo() {
    }

    public Periodo(String NombreDelPeriodo) {
        this.NombreDelPeriodo = NombreDelPeriodo;
    }

    public String getNombreDelPeriodo() {
        return NombreDelPeriodo;
    }

    public void setNombreDelPeriodo(String NombreDelPeriodo) {
        this.NombreDelPeriodo = NombreDelPeriodo;
    }

    @Override
    public String toString() {
        return "(Periodo) " + NombreDelPeriodo;
    }

}
