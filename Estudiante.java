import java.util.Set;

public class Estudiante{
    private String cedula;
    private String nombre;
    private Set<String> codigosMaterias;

    public Estudiante(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public boolean adicionarMateria(String codigoMateria){
        return true;
    }

    @Override
    public String toString() {
        // TODO Auto-generat
        return super.toString();
    }
}