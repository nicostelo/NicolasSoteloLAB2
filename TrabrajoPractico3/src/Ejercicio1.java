public class Ejercicio1 {
    public static void main(String[] args) {

        int numeros[]= new int[100];
        int contnumerosiguales=0;
        for(int i=0; i<100; i++) {
            numeros[i]=(int)(Math.random()*100);
        }

        for(int  fila:numeros) {

                System.out.print(fila + " ");
            }
        for(int c=0;c<numeros.length;c++)
            for (int d = 1; d < numeros.length; d++) {

                if (numeros[c] == numeros[d]) {
                    contnumerosiguales++;
                }
            }
        if ( contnumerosiguales<0){
            System.out.println("\nSE REPITEN NUMEROS ");
        }else{
            System.out.println("\nNO SE REPITEN NUMEROS ");
        }

        }
    }

