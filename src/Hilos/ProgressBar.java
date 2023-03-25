package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class ProgressBar {

    javax.swing.JProgressBar ProgressBar;
    int SegundosInicio, SegundosFinal;
    boolean Vivo = true;
    int torneos;

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
    }
}
