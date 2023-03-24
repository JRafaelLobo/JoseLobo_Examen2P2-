package ObjectosDeExamen2P2Lab;

public class Partido {

    String[] nombres = new String[2];
    int[] puntos = new int[2];

    public Partido() {
    }

    public String[] getNombres() {
        return nombres;
    }

    public String getNombreEquipo1() {
        return nombres[0];
    }

    public String getNombreEquipo2() {
        return nombres[1];
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public void setNombreEquipo1(String nombre) {
        this.nombres[0] = nombre;
    }

    public void setNombreEquipo2(String nombre) {
        this.nombres[1] = nombre;
    }

    public int[] getPuntos() {
        return puntos;
    }

    public int getPuntosEquipo1() {
        return puntos[0];
    }

    public int getPuntosEquipo2() {
        return puntos[1];
    }

    public void setPuntos(int[] puntos) {
        this.puntos = puntos;
    }

    public void setPuntoEquipo1(int puntos) {
        this.puntos[0] = puntos;
    }

    public void setPuntoEquipo2(int puntos) {
        this.puntos[1] = puntos;
    }

    @Override
    public String toString() {
        return "Partidos{" + "nombres=" + nombres[0] + "," + nombres[1] + " puntos=" + puntos[0] + "," + puntos[1] + '}';
    }

}
