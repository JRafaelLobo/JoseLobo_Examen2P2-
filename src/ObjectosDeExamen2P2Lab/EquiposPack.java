package ObjectosDeExamen2P2Lab;

public class EquiposPack {

    String nombre;

    public EquiposPack() {
        nombre = "(Pack) Equipos";
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
