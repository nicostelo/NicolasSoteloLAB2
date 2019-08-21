import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        char[][] matriz = new char[3][3];
        int dato=0;

        for(dato=0;dato<4;dato++) {

            Scanner entrada = new Scanner(System.in);
            System.out.print("ingrese nombre :");
            String nombre = entrada.nextLine();
            System.out.print("ingrese dni :");
            String dni = entrada.nextLine();
            System.out.print("ingrese edad :");
            String edad = entrada.nextLine();

            matriz[0][0] = nombre  ;
            matriz[0][1] = dni;
            matriz[0][2] =  edad;

            matriz[1][0] =  nombre;
            matriz[1][1] =  dni;
            matriz[1][2] =  edad;

            matriz[2][0] =  nombre;
            matriz[2][1] =  dni;
            matriz[2][2] =  edad;
        }


        for(int x=0; x<3; x++) {
            for(int y=0; y<3;y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
    }
}