public class Choferes extends Personas {
    public Choferes(int dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public String toString() {
        return "Choferes{" +
                "dni=" + dni +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
