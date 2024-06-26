package arreglos;

import java.util.Scanner;

public class ArregloDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 7 elementos");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean descendente = false;
        boolean ascendente = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendente = true;
            }

            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true) {
            System.out.println("ASrreglo desordenado");
        }

        if (ascendente == false && descendente == false) {
            System.out.println("ASrreglo = todos son iguales");
        }

        if (ascendente == true && descendente == false) {
            System.out.println("Arreglo = ordenado de forma ascendente");
        }

        if (ascendente == false && descendente == true) {
            System.out.println("Arreglo = ordenado de forma descendente");
        }
    }
}
