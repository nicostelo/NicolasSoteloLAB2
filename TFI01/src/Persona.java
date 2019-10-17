 public abstract class  Persona {


    String nombre;
    int edad;
     String tipo;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



     public String getTipo() {
         return tipo;
     }


     @Override
     public String toString() {
         return "Persona{" +
                 "nombre='" + nombre + '\'' +
                 ", edad=" + edad +
                 ", tipo='" + tipo + '\'' +
                 '}';
     }
 }



