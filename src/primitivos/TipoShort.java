package primitivos;

public class TipoShort {
    public static void main(String[] args) {
        short numero = 190;
        System.out.println("Numero short: " + numero);
        System.out.println("El short corresponde a: " + Short.BYTES);
        System.out.println("El short corresponde en bites a: " + Short.SIZE);
        System.out.println("El maximo valor del short es:" + Short.MAX_VALUE);
        System.out.println("El minimo valor del short es:" + Short.MIN_VALUE);
    }
}
