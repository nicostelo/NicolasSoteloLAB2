public class Acomodadores extends Persona  {
     private String sala=Salas;

    public Acomodadores(String nombre, int edad, String sala) {
        super(nombre, edad);
        this.sala = sala;
    }



    public void setSala(String sala) {
        this.sala = sala;
    }



    public String getTipo() {
        return tipo;
    }
}











