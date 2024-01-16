package cadenas;

import java.util.Scanner;

public class TareaManejoDeNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primero nombre de familia:");
        String primerNombre = sc.nextLine();

        System.out.println("Ingrese el segundo nombre de familia:");
        String segundoNombre = sc.nextLine();

        System.out.println("Ingrese el tercer nombre de familia:");
        String tercerNombre = sc.nextLine();

        String primerNombreModificado = primerNombre.substring(1, 2).toUpperCase();
        String segundoNombreModificado = segundoNombre.substring(1, 2).toUpperCase();
        String tercerNombreModificado = tercerNombre.substring(1, 2).toUpperCase();

        String primerNombreFormateado = primerNombreModificado.concat("." + primerNombre.substring(primerNombre.length() - 2));
        String segundoNombreFormateado = segundoNombreModificado.concat("." + segundoNombre.substring(segundoNombre.length() - 2));
        String tercerNombreFormateado = tercerNombreModificado.concat("." + tercerNombre.substring(tercerNombre.length() - 2));
        System.out.println("======= RESULTADO FINAL");
        System.out.println(" String total formateado: " + primerNombreFormateado + "_" + segundoNombreFormateado + "_" + tercerNombreFormateado);
    }
}
