package variados;

import java.util.LinkedList;
import java.util.Scanner;

public class IterarLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lk = new LinkedList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la lista");
        int tamList = 0;
        try {
            tamList = teclado.nextInt();
            for (int i = 1; i <= tamList; i++) {
                lk.add(i);
            }
            for (Integer i: lk){
                System.out.println("lk = " + i);
            }
        } catch (Exception e) {
            System.out.println("Debes ingresar un numero....");
            main(args);
            System.exit(0);
        }
    }
}
