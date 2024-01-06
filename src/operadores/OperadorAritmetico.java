package operadores;

import javax.swing.*;
import java.util.Scanner;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int a = 20, b = 6, suma = a + b;
        System.out.println("suma = " + suma);
        System.out.println("(a + b) = " + (a + b));
        System.out.println("============================");
        int resta = a - b;
        System.out.println("resta = " + resta);
        System.out.println("(a - b) = " + (a - b));
        System.out.println("============================");
        int multiplicacion = a * b;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("(a * b) = " + (a * b));
        System.out.println("============================");
        float division = (float) a / b;
        System.out.println("division = " + division);
        System.out.println("(a / b) = " + (a / b));
        System.out.println("============================");
        int resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "EL numero " + numero + " es par");
        } else {
            JOptionPane.showMessageDialog(null, "EL numero " + numero + " no es par");
        }

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=20; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
