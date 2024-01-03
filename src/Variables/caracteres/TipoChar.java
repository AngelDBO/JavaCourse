package Variables.caracteres;

public class TipoChar {
    public static void main(String[] args) {
        char letra = '\u0040';
        char decimal = 64;
        System.out.println(letra + "-" + decimal);
        System.out.println(letra == decimal);

        System.out.println("---------------------------------------");
        System.out.println("El char es: " + letra);
        System.out.println("EL char corresponde a : " + Character.BYTES);
        System.out.println("El char corresponde en bite a: " + Character.SIZE);
        System.out.println("El valor char maximo es: " + Character.MAX_VALUE);
        System.out.println("El valor char minimo es: " + Character.MIN_VALUE);
    }
}
