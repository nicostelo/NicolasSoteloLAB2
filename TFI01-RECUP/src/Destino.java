public class Destino extends Lugares {

    public Destino(String direccion, String nombre) {
        super(direccion, nombre);
    }

    @Override
    public String toString() {
        return "Destino{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

