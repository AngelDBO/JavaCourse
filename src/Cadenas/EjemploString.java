package Cadenas;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Hola desde JAVA";
        String curso2 = new String("Hola dESde JAVA");

        boolean esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        boolean esIgualIgnore = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgualIgnore = " + esIgualIgnore);

        boolean esIgual2 = curso == curso2;
        System.out.println("esIgual2 = " + esIgual2);
    }
}
