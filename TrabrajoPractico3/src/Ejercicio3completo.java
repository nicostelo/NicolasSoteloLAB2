import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3];





        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Scanner entrada = new Scanner(System.in);
                System.out.print("ingrese nombre :");
                String nombre = entrada.nextLine();
                System.out.print("ingrese dni :");
                String dni = entrada.nextLine();
                System.out.print("ingrese edad :");
                String edad = entrada.nextLine();

                matriz[i][j] = nombre;
                matriz[i][j] = dni;
                matriz[i][j] = edad;

                

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }
}
