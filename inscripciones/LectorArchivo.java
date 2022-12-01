import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {
    
    public LectorArchivo() {

    }

    public List<String> leer(String ruta) throws IOException {
        
        List<String> listaDatos = new ArrayList<String>();
        File lectorArchivo = new File(ruta);
        BufferedReader lector = new BufferedReader(new FileReader(lectorArchivo));

        String linea;

        while ((linea = lector.readLine()) != null) {
            listaDatos.add(linea);
        }

        return listaDatos;
    }

}
