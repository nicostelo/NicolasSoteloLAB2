import javax.swing.JOptionPane;


public class Trabajo1 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("introduce tu nombre por favor");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad por favor"));
      do{
          if (edad > 18) {
              System.out.println(nombre + " tiene " + edad + " años " + "es Mayor de edad");
          }
          if (edad < 18) {
              System.out.println(nombre + " tiene " + edad + " años " + "es Menor de edad");

          }



        }while(edad==0);



    }
}