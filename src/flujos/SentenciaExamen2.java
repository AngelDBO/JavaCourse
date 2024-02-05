package flujos;

import javax.swing.*;

public class SentenciaExamen2 {
    public static void main(String[] args) {
        int numAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos a calificar"));

        String[] alumnos = new String[numAlumnos];
        String[] materias = {"Matematicas", "Ingles", "Computacion", "Lenguaje", "Deportes"};
        int[][] notas = new int[numAlumnos][materias.length];


        int opcion = 0;
        for (int i = 0; i < alumnos.length; i++) {
            String nombres = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            alumnos[i] = nombres;
        }

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("REPORTE DE NOTAS\n" +
                    "1. Ingresar notas de cada alumno\n" +
                    "2. Mostrar notas de cada alumno\n" +
                    "3. Mostrar promedios de cada alumno\n" +
                    "4. Salir"));

            switch (opcion) {
                case 1:
                    int nota = 0;
                    for (int i = 0; i < alumnos.length; i++) {
                        for (int j = 0; j < notas[i].length; j++) {
                            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de " + materias[j] + " para el alumno " + alumnos[i]));
                            notas[i][j] = nota;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("========= Notas del estudiante = " + alumnos[i] + " =========");
                        for (int j = 0; j < notas[i].length; j++) {
                            System.out.println("Materia: " + materias[j] + " = " + notas[i][j]);
                        }
                    }
                    break;

                case 3:
                    double promedio = 0;
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("========= Promedio del estudiante = " + alumnos[i] + " =========");
                        for (int j = 0; j < notas[i].length; j++) {
                            promedio += notas[i][j];
                        }
                        System.out.println("promedio / materias.length = " + promedio / materias.length);
                    }
                    break;

            }
        } while (opcion != 4);
    }
}
