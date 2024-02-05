package flujos;

import java.util.Scanner;

public class SentenciaExamen3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero multiplicando");
        double multiplicando = scanner.nextDouble();
        System.out.println("Ingrese el numero mutiplicador");
        double mutiplicador = scanner.nextDouble();

        double acumulado = 0;

        if (multiplicando > 0 && mutiplicador > 0) {
            for (int i = 0; i < mutiplicador; i++) {
                acumulado += multiplicando;
            }
            System.out.println("resultado++ = " + (acumulado));
        }

        if (multiplicando < 0 && mutiplicador < 0) {
            for (int i = 0; i < (-mutiplicador); i++) {
                acumulado += (-multiplicando);
            }
            System.out.println("resultado- - = " + (acumulado));
        }

        if (multiplicando < 0 && mutiplicador > 0) {
            for (int i = 0; i < mutiplicador; i++) {
                acumulado += (-multiplicando);
            }
            System.out.println("resultado-+ = " + (-acumulado));
        }

        if (multiplicando > 0 && mutiplicador < 0) {
            for (int i = 0; i < (-mutiplicador); i++) {
                acumulado += (-multiplicando);
            }
            System.out.println("resultado+- = " + (acumulado));
        }
    }
}
