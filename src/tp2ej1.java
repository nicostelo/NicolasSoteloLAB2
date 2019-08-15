import java.util.Scanner;
public class tp2ej1{


    public static void main(String[] args) {
            int positivos=0;
            int negativos=0;
            int ceros=0;


            System.out.println("Ingrese los números");


            Scanner dato = new Scanner(System.in);


            int numeros[]= new int[10];

            for(int i=0; i<10; i++) {

                System.out.println("Ingrese el número para la posición:"+i);
                numeros[i]=dato.nextInt();
            }

            for(int valor:numeros) {

                if(valor>0) {
                    positivos++;
                }else {
                    if(valor<0) {
                        negativos++;
                    }else {
                        ceros++;
                    }
                }
            }


            System.out.print("hay " +ceros+ "ceros, "+ positivos+" números positivos y "+negativos+" números negativos");



        }

    }


