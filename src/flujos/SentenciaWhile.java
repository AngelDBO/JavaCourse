package flujos;

import java.util.Scanner;

public class SentenciaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero meno que 100");
        int numero = scanner.nextInt();

        if (numero > 100) {
            numero = 100;
        }
        int count = 0;
        while (count < numero) {

            System.out.println("Hola: " + (count + 1));
            count++;
        }
    }
}
