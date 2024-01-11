package operadores;

import java.util.Scanner;

public class OperadoresTareaOrdenNumero {
    public static void main(String[] args) {
        int numeroMayor;
        int numeroMenor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero_uno = sc.nextInt();

        System.out.println("Ingresa otro numero");
        int numero_dos = sc.nextInt();

        numeroMayor = numero_uno > numero_dos ? numero_uno : numero_dos;
        numeroMenor = numero_dos < numero_uno ? numero_dos : numero_uno;
        System.out.println("numeroMayor = " + numeroMayor);
        System.out.println("numeroMenor = " + numeroMenor);
    }
}
