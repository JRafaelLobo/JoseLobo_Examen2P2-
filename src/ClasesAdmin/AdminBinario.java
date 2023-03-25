package ClasesAdmin;

import ObjectosDeExamen2P2Lab.*;
import java.io.*;

public class AdminBinario {

    File archivo;
    Deporte D;

    public AdminBinario(File archivo, Deporte D) {
        this.archivo = archivo;
        this.D = D;
    }

    public AdminBinario(String ruta, Deporte D) {
        this.archivo = new File(ruta);
        this.D = D;
    }

    public AdminBinario(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        try {
            Deporte temp = new Deporte();
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    //datos
                    temp = (Deporte) objeto.readObject();
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                D = temp;
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            //datos
            bw.writeObject(D);
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public Deporte getD() {
        return D;
    }

    public void setD(Deporte D) {
        this.D = D;
    }

}
