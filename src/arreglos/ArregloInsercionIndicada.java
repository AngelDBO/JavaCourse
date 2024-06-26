package arreglos;

import java.util.Scanner;

public class ArregloInsercionIndicada {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Ingrese NUEVI ELEMENTO");
        elemento = scanner.nextInt();

        System.out.println("Posicion donde agregar elemento (0 a 9)");
        posicion = scanner.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El arreglo");
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + a[i]);
        }
    }
}
