package flujos;

import java.util.Scanner;

public class SentenciaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero menor que 10: \t");
        int numero = scanner.nextInt();
        if (numero > 10) numero = 10;
        int count = 0;

        do {
            System.out.println("numero = " + (count + 1));
            count++;
        } while (count < numero);
    }
}
