public class Origen extends Lugares
{
    public Origen(String direccion, String nombre) {
        super(direccion, nombre);
    }

    @Override
    public String toString() {
        return "Origen{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
