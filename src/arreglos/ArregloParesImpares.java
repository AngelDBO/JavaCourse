package arreglos;

import java.util.Scanner;

public class ArregloParesImpares {
    public static void main(String[] args) {
        int[] a, impares, pares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("UIngresa 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[i] = " + pares[i]);
        }

        System.out.println("***************************");

        System.out.println("Impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.println("impares[i] = " + impares[i]);
        }
    }
}
