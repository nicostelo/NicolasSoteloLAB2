public class Espectadores extends Persona {
    private String fila;
    private String silla;
    private String butaca=silla+fila;
    public Espectadores(String nombre, int edad, String fila, String silla) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getSilla() {
        return silla;
    }

    public void setSilla(String silla) {
        this.silla = silla;
    }

    public String getButaca() {
        return butaca;
    }

    @Override
    public String toString() {
        return "Espectadores{" +
                "fila='" + fila + '\'' +
                ", silla='" + silla + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

