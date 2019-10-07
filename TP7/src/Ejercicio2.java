import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        pedirDatos();


    }

    static void pedirDatos() throws FueraDeRango{

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESAR UN NRO ENTRE 0 A 100");
        int numero = entrada.nextInt();

        if (numero < 0 || numero > 100) {
            //colocamos nuestra propia excepción
            FueraDeRango miExcepcion = new FueraDeRango("El nº está fuera de rango");
            throw miExcepcion;
        }else {
            System.out.println("nro ingresado es "+numero);
        }
        entrada.close();
    }

}

class FueraDeRango extends RuntimeException {
    // deben tener dos constructores uno que recibe un parametro y otro sin
    // parametros

    public FueraDeRango() {

    }

    public FueraDeRango(String mensajeError) {
        super(mensajeError);
    }

}