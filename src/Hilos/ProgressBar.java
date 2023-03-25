package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import joselobo_examen2p2.Main;

public class ProgressBar extends Thread {

    private javax.swing.JProgressBar ProgressBar;
    private int SegundosInicio, SegundosFinal;
    private boolean Vivo = true;
    private int torneos;
    private Main main;

    public JProgressBar getProgressBar() {
        return ProgressBar;
    }

    public void setProgressBar(JProgressBar ProgressBar) {
        this.ProgressBar = ProgressBar;
    }

    public int getSegundosInicio() {
        return SegundosInicio;
    }

    public void setSegundosInicio(int SegundosInicio) {
        this.SegundosInicio = SegundosInicio;
    }

    public boolean isVivo() {
        return Vivo;
    }

    public void setVivo(boolean Vivo) {
        this.Vivo = Vivo;
    }

    public int getTorneos() {
        return torneos;
    }

    public void setTorneos(int torneos) {
        this.torneos = torneos;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public ProgressBar(JProgressBar ProgressBar, int SegundosInicio, int SegundosFinal) {
        this.ProgressBar = ProgressBar;
        this.SegundosInicio = SegundosInicio * 1000;
        this.SegundosFinal = SegundosFinal * 1000;
    }

    public ProgressBar(JProgressBar ProgressBar, int torneos) {
        this.ProgressBar = ProgressBar;
        this.torneos = torneos;
        this.SegundosFinal = this.torneos * 7 * 1000;
        this.SegundosInicio = 0;
    }

    public void run() {
        ProgressBar.setMaximum(SegundosFinal);
        while (Vivo) {
            while (SegundosInicio < SegundosFinal) {
                ProgressBar.setValue(SegundosInicio);
                SegundosInicio += 100;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }
            if (SegundosFinal >= SegundosInicio) {
                Vivo = false;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        ProgressBar.setValue(0);
        if (main != null) {
            main.subir();
        }
    }
}
