package operadores;

import java.util.Scanner;

public class OperadorLogicoArreglo {
    public static void main(String[] args) {
//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//
//        usernames[0] = "andres";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "12345";

        String[] usernames = {"andres", "admin"};
        String[] passwords = {"12345", "123", "123455"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = sc.nextLine();

        System.out.println("Ingrese la contraseña");
        String p = sc.nextLine();

        boolean isAutorized = false;

        for (int i = 0; i < usernames.length; i++) {
            if (u.equals(usernames[i]) && p.equals(passwords[i])) {
                isAutorized = true;
            }
        }
        if (isAutorized) {
            System.out.println("Bienvenido al sistema " + u.concat(" " + p));
        }
    }
}
