public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    Estudiante Jesus = new Estudiante("Jesus", "Montano", "Montano", "12462029", "29/08/2002", "Paca alta calle 7 Nº53", "60716553", "4495699", "jesusmombus006@gmail.com", "JesMontano2002", "JesusRonaldMontanoBustamante2002@", "2014789003");
    Docente Javier = new Docente("Javier", "Sander", "Quiroga", "80125678", "20/5/1987", "Sacaba Km9", "74583124", "4587906", "sander12gmail.com", "juancho97", "JavierSander1987", "3500");
    Persona persona1 = Jesus;
    Persona persona2 = Javier;
    Usuario usuario1 = Jesus;
    Usuario usuario2 = Javier;

    Estudiante estudiante1 = (Estudiante) persona1;
    Estudiante Estudiante2 = (Estudiante) persona2;


}