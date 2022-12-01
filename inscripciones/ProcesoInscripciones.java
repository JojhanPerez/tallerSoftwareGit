import java.util.HashMap;
import java.util.List;

public class ProcesoInscripciones {

    private HashMap<String, Estudiante> estudiantes;
    private LectorArchivo lector;

    public List<String> procesarArchivo(String ruta) throws Exception {
        List<String> datosEstudiantes = lector.leer(ruta);
        for (String dato : datosEstudiantes) {
            procesarLinea(dato);
        }
        return datosEstudiantes;
    }

    private void procesarLinea(String linea) throws Exception {

        String[] lineaSeparada = linea.split(",");

        if (lineaSeparada.length != 4) {
            throw new Exception("No cuenta con los datos requeridos");
        } else {
            Estudiante estudiante = this.buscarEstudiante(lineaSeparada[0]);

            if (estudiante == null) {
                estudiante = new Estudiante(lineaSeparada[0], lineaSeparada[1]);
                estudiantes.put("Estudiante", estudiante);
                estudiante.adicionarMateria(lineaSeparada[2]);
            }
        }

    }

    private Estudiante buscarEstudiante(String cedula) {

        for (Estudiante estudiante : estudiantes.values()) {
            estudiante.getCedula().equals(cedula);
            return estudiante;
        }

        return null;

    }
}
