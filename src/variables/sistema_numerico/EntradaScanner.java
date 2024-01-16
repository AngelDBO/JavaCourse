package variables.sistema_numerico;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = 0;
        try {
            numero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error, debes ingresar un numero, " + e.getMessage());
            main(args);
            System.exit(0);
        }
        System.out.println("El numero ingresado es: " + numero);
    }
}
