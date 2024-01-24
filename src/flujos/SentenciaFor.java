package flujos;

import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INgresa un numero menor a 100");
        int numero = scanner.nextInt();
        if (numero > 100) {
            numero = 100;
        }

        for (int i = 0; i < numero; i++) {
            System.out.println("i = " + (i + 1));
        }
        System.out.println("========================");


    }
}
