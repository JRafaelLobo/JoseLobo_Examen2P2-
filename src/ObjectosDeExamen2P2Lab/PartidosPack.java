package ObjectosDeExamen2P2Lab;

public class PartidosPack {

    String nombre;

    public PartidosPack() {
        nombre = "(Pack) Partidos";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
