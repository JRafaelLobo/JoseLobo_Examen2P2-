package ObjectosDeExamen2P2Lab;

import java.util.ArrayList;

public class Deporte {

    ArrayList<Torneo> torneos = new ArrayList();
    String NombreDelDeporte;

    public Deporte() {
    }

    public Deporte(String NombreDelDeporte) {
        this.NombreDelDeporte = NombreDelDeporte;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public String getNombreDelDeporte() {
        return NombreDelDeporte;
    }

    public void setNombreDelDeporte(String NombreDelDeporte) {
        this.NombreDelDeporte = NombreDelDeporte;
    }

    @Override
    public String toString() {
        return "(Deporte) "+NombreDelDeporte;
    }

}
