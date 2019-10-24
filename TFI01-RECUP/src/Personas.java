public class Personas {
    public int dni;
    public String Nombre;

    public Personas(int dni, String nombre) {
        this.dni = dni;
        Nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "dni=" + dni +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
