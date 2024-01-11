package operadores;

import java.util.Scanner;

public class OperadorLogicoLogin {
    public static void main(String[] args) {
        String username = "andres";
        String password = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = sc.nextLine();

        System.out.println("Ingrese su conttraseña");
        String p = sc.nextLine();

        boolean isAutorized = false;

        if ( username.equals(u) && password.equals(p)){
            isAutorized = true;
        }else{
            System.out.println("Credenciales incorrecta");
        }

        if (isAutorized)
            System.out.println("Bienvenido " + username);
    }
}
