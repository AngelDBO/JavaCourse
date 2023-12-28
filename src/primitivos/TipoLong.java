package primitivos;

public class TipoLong {
    public static void main(String[] args) {
        long numero = 9223372036854775807L;
        System.out.println("EL numero long es:" + numero);
        System.out.println("El long corresponde a:" + Long.BYTES);
        System.out.println("El long corresponde en bites a: " + Long.SIZE);
        System.out.println("EL valor maximo de long es: " + Long.MAX_VALUE);
        System.out.println("EL valor mimino de long es: " + Long.MIN_VALUE);
    }
}
