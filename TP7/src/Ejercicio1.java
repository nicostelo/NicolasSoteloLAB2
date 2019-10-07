import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int nro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar un número entero:");
        try{
            nro = entrada.nextInt();
            if(nro%2==0){
                System.out.println(nro+" es par");
            }else{
                System.out.println(nro+" es impar");
            }
        }catch (InputMismatchException e){
            System.out.println("ERROR: SÓLO SE ADMITEN NÚMROS!");
        }

    }

}