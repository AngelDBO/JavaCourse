package variables.sistema_numerico;

import java.util.Scanner;

public class EntradaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        try {

        }catch (NumberFormatException e){

        }
        int numero = scanner.nextInt();
        System.out.println("EL numero ingresado fue: " + numero);
    }
}
