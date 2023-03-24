package ObjectosDeExamen2P2Lab;

public class Periodo {

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
        return NombreDelPeriodo ;
    }

}
