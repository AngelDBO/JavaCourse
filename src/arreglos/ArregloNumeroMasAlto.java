package arreglos;

import java.util.Scanner;

public class ArregloNumeroMasAlto {
    public static void main(String[] args) {
        int[] a = new int[10];
        int alto = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > alto){
                alto = a[i];
            }
        }

        System.out.println("alto = " + alto);
    }
}
