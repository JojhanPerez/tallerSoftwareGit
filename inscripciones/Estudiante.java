import java.util.Set;

public class Estudiante {
    private String cedula;
    private String nombre;
    private Set<String> codigosMaterias;

    public Estudiante(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public boolean adicionarMateria(String codigoMateria) {

        if (codigoMateria != null) {
            this.codigosMaterias.add(codigoMateria);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Cedula: " + this.cedula + " nombre: " + this.nombre ;
    }
}
