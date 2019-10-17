public class Empleados extends Persona{
    private int sueldo;

    public Empleados(String nombre, int edad, int sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}

