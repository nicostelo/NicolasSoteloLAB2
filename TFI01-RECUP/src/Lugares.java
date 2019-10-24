public class Lugares {
    String direccion;
    String nombre;

    public Lugares(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Lugares{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
