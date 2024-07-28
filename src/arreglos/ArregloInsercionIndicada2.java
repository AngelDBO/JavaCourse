package arreglos;

import java.util.Scanner;

public class ArregloInsercionIndicada2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion, ultimo;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Ingrese NUEVI ELEMENTO");
        elemento = scanner.nextInt();

        System.out.println("Posicion donde agregar elemento (0 a 9)");
        posicion = scanner.nextInt();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[posicion] = elemento;

        b[b.length - 1] = ultimo;

        System.out.println("El arreglo");
        for (int i = 0; i < b.length; i++) {
            System.out.println("i = " + b[i]);
        }
    }
}
