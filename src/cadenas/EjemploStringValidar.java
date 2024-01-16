package cadenas;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = "";

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            //curso = "Programando en PHP 8";
            curso = "";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("curso = " + curso.isEmpty());
        System.out.println("curso is blank = " + curso.isBlank());
        System.out.println("esVacio = " + esVacio);

        if (!esVacio) {
            System.out.println("Bienvenido al curso = " + curso);
            System.out.println("Bienvenido al curso = ".concat(curso));
        }
    }
}
