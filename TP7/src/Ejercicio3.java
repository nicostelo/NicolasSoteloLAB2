import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {


        int seguir = 0;

        while (seguir != 1) {

            System.out.println("INGRESE UN NRO: ");
            Scanner entrada = new Scanner(System.in);

            try {
                int nro = entrada.nextInt();
                if(nro%2==0){
                    System.out.println("EL NRO ES PAR");
                }else{
                    System.out.println("EL NRO ES IMPAR ");
                }
                seguir = 1;
                System.out.println("\n FIN DEL PROGRAMA");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("ERROR: ");
            }

            System.out.println("\n-------------------------\n");

        }



    }

}
