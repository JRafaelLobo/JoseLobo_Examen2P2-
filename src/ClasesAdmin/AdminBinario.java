package ClasesAdmin;

import ObjectosDeExamen2P2Lab.*;
import java.io.*;
import java.util.ArrayList;

public class AdminBinario {

    File archivo;
    ArrayList<Deporte> deportes = new ArrayList();

    public void cargarArchivo() {
        try {
            deportes = new ArrayList();
            Deporte temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    //datos

                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        deportes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
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
            for (Deporte t : deportes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
