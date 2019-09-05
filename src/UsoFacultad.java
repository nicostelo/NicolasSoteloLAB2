import java.util.Scanner;

//alumno:Nicolas Sotelo


public class UsoFacultad {

    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        char respuesta;
        String estudianteABuscar;
        char terminar;
        double nota;

        System.out.println("nombre de la facultad ");
        String nomFac=dato.next();
        System.out.println("Ingrese la cantidad de estudiantes de la facultad.");
        int cantMax=dato.nextInt();

        Facultad facultad= new Facultad(nomFac,cantMax);

        System.out.println("Se procedera al cargado de estudiantes: ");
        do{
            facultad.agregarEstudiante();
            System.out.println("Desea seguir agregando estudiantes? s/n");
            respuesta=dato.next().charAt(0);
        }while(respuesta!='n' && respuesta!='N');

        do {
            System.out.println("Que operacion desea realizar?\n1_Listar Estudiantes\n2_Buscar Estudiante \n3_Borrar estudiante\n4_Agregar estudiante\n5_Modificar la nota media del estudiante");

            int opcion=dato.nextInt();
            switch (opcion) {
                case 1:
                    facultad.listarEstudiantes();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del estudiante que desea buscar: ");
                    estudianteABuscar=dato.next();
                    facultad.buscarEstudiante(estudianteABuscar);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del estudiante que desea borrar: ");
                    estudianteABuscar=dato.next();
                    facultad.borrarEstudiante(estudianteABuscar);
                    break;
                case 4:
                    facultad.agregarEstudiante();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del estudiante");
                    estudianteABuscar=dato.next();
                    System.out.println("Ingrese la nueva nota media");
                    nota=dato.nextDouble();
                    facultad.modificarNota(estudianteABuscar,nota);

                    break;
                default :
                    System.out.println("La opcion no es valida.");
            }


            System.out.println("Desea realizar otra operacion? s/n");
            terminar=dato.next().charAt(0);
        }while(terminar!='n' && terminar!='N');
    }
}