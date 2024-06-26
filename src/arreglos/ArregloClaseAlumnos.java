package arreglos;

import java.util.Scanner;

public class ArregloClaseAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumMatematica = 0, sumHistoria = 0, sumLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para Matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumMatematica += claseMatematicas[i];
            sumHistoria += claseHistoria[i];
            sumLenguaje += claseLenguaje[i];
        }

        double promMatematica = sumMatematica / claseMatematicas.length;
        double promHistoria = sumHistoria / claseHistoria.length;
        double promLenguaje = sumLenguaje / claseLenguaje.length;
        double promGeneral = sumMatematica + sumHistoria + sumLenguaje;
        System.out.println("sumMatematica = " + promMatematica);
        System.out.println("sumHistoria = " + promHistoria);
        System.out.println("sumLenguaje = " + promLenguaje);
        System.out.println("promGeneral = " + promGeneral);
    }
}
