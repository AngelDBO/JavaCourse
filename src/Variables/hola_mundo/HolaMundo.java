package Variables.hola_mundo;

public class HolaMundo {
    public static void main(String[] args) {
        String saluda = "Hola mundo";
        System.out.println(saluda);
        System.out.println(saluda.toUpperCase());
        /*COMENTARIO MULTILINEA*/
        int numero = 10;

        boolean valor = true;
        if (valor) {
            System.out.println("Numero: " + numero);
        }

        String nombre;
        nombre = "Pepe \t";
        System.out.println(nombre);

        char c = '\u0032';
        System.out.println(c);
    }
}