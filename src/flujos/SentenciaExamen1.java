package flujos;

import java.util.Scanner;

public class SentenciaExamen1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos del array(10)\t");
        int tam = scanner.nextInt();
        if (tam > 10) {
            tam = 10;
        }
        int[] numeros = new int[tam];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el dato número:[" + (i + 1) + "]");
            numeros[i] = scanner.nextInt();
        }

        int numeroMenor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println("numeroMenor = " + numeroMenor);

        if (numeroMenor < 10) {
            System.out.println("El número menor: " + numeroMenor + " es menor que 10!");
        } else {
            System.out.println("el número menor: " + numeroMenor + " es igual o mayor que 10!");
        }
    }
}
