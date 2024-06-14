package arreglos;

public class EjemploArregloPrincipioFinal {
    public static void main(String[] args) {
        int[] numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = i+1;
        }

        for (int i = 0; i < numero.length /2; i++) {
            System.out.println("i = " + numero[i]);
            System.out.println("i = " + numero[numero.length - 1 - i]);
        }
    }
}
