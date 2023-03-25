package ObjectosDeExamen2P2Lab;

import java.io.Serializable;
import java.util.ArrayList;

public class Torneo implements Serializable {

    String Nombre;
    ArrayList<Equipo> equipos = new ArrayList<>();
    ArrayList<Partido> partidos = new ArrayList<>();
    Periodo periodo;

    public Torneo(String Nombre, Periodo periodo) {
        this.Nombre = Nombre;
        this.periodo = periodo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void addEquipo(Equipo E) {
        equipos.add(E);
    }

    public void addPartido(Partido E) {
        partidos.add(E);
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "(Torneo) " + Nombre;
    }

}
