import java.util.Arrays;

public class Salas  {
    private int capacidad;
    private String pelicula;
    private String nombre;
    Espectadores ES [];

    public Salas(int capacidad, String pelicula, String nombre, Espectadores[] ES) {
        this.capacidad = capacidad;
        this.pelicula = pelicula;
        this.nombre = nombre;
        this.ES = ES;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setES(Espectadores[] ES) {
        this.ES = ES;
    }

    public Espectadores[] getES() {
        return ES;
    }

    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ES=" + Arrays.toString(ES) +
                '}';
    }
}


