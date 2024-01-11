package operadores;

import java.util.Scanner;

public class OperadorTernarioLogin {
    public static void main(String[] args) {
        String[] usernames = {"andres", "admin"};
        String[] passwords = {"12345", "123", "123455"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = sc.nextLine();

        System.out.println("Ingrese la contraseña");
        String p = sc.nextLine();

        boolean isAutorized = false;

        for (int i = 0; i < usernames.length; i++) {
            //isAutorized = u.equals(usernames[i]) && p.equals(passwords[i]) ? true : false;
            isAutorized = u.equals(usernames[i]) && p.equals(passwords[i]);
        }
        if (isAutorized) {
            System.out.println("Bienvenido al sistema " + u.concat(" " + p));
        }
    }
}
