package operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String nombre = "Angel";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nombre");
        String n = sc.nextLine();

        boolean result = n.equals(nombre) ? true : false;

        System.out.println("result = " + result);
    }
}
