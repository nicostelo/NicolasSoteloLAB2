public class Estudiante {
    private String nomb;
    private Facultad facul;
    private int nEstudiante;
    private Double notaMedia;
    private static int ContadorEstudiante=1;

    public Estudiante(String nombre,Double notaMedia){
        this.nomb=nombre;
        this.notaMedia=notaMedia;
        this.nEstudiante=ContadorEstudiante;
        ContadorEstudiante++;

    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public Facultad getFacul() {
        return facul;
    }

    public void setFacul(Facultad facul) {
        this.facul = facul;
    }

    public int getnEstudiante() {
        return nEstudiante;
    }

    public void setnEstudiante(int nEstudiante) {
        this.nEstudiante = nEstudiante;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public static int getContadorEstudiante() {
        return ContadorEstudiante;
    }

    public static void setContadorEstudiante(int contadorEstudiante) {
        ContadorEstudiante = contadorEstudiante;
    }
    public String getInfo(){
        return "El nombre del estudiante es: "+this.nomb+"\nEl numero del estudiante es: "+this.nEstudiante+"\nSu nota media es de: "+this.getNotaMedia();
    }

    public String getNomEstudiante() {
        return nomb;
    }
    public void borrar() {
        this.nomb=null;
        this.setNotaMedia(0);
        this.nEstudiante=0;
    }



}





