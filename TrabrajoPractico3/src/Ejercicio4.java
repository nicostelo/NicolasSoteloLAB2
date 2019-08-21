import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        matriz[0][0] = (int) (Math.random()*100);
        matriz[0][1] = (int) (Math.random()*100);
        matriz[0][2] = (int) (Math.random()*100);

        matriz[1][0] = (int) (Math.random()*100);
        matriz[1][1] = (int) (Math.random()*100);
        matriz[1][2] = (int) (Math.random()*100);

        matriz[2][0] = (int) (Math.random()*100);
        matriz[2][1] = (int) (Math.random()*100);
        matriz[2][2] = (int) (Math.random()*100);


        for(int x=0; x<4; x++) {
            for(int y=0; y<3;y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }

        }
    }
