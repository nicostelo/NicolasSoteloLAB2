import java.util.Arrays;

public class Vehiculos extends Automovil {

    public Lugares origen ;
    public Lugares destino ;
    public Choferes Chofer;
   public Pasajeros[] ListaPasajeros;
    public String matricula;
    public int capacidaddepasajeros;

    public Vehiculos(Lugares origen, Lugares destino, Choferes chofer, Pasajeros[] listaPasajeros, String matricula, int capacidaddepasajeros) {
        this.origen = origen;
        this.destino = destino;
        Chofer = chofer;
        ListaPasajeros = listaPasajeros;
        this.matricula = matricula;
        this.capacidaddepasajeros = capacidaddepasajeros;
    }

    public void setDestino(Lugares destino) {
        this.destino = destino;
    }

    public void setChofer(Choferes chofer) {
        Chofer = chofer;
    }

    public void setListaPasajeros(Pasajeros[] listaPasajeros) {
        ListaPasajeros = listaPasajeros;
    }

    @Override
    public void verDatos() {

    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", Chofer=" + Chofer +
                ", ListaPasajeros=" + Arrays.toString(ListaPasajeros) +
                ", matricula='" + matricula + '\'' +
                ", capacidaddepasajeros=" + capacidaddepasajeros +
                '}';
    }
}

