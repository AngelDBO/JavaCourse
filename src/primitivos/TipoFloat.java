package primitivos;

public class TipoFloat {
    public static void main(String[] args) {
        float numero = 9223372036854775807F;
        System.out.println("EL numero float es:" + numero);
        System.out.println("El float corresponde a:" + Float.BYTES);
        System.out.println("El float corresponde en bites a: " + Float.SIZE);
        System.out.println("EL valor maximo de float es: " + Float.MAX_VALUE);
        System.out.println("EL valor mimino de float es: " + Float.MIN_VALUE);
        System.out.println("EL maximo exponente de float es: " + Float.MAX_EXPONENT);
        System.out.println("EL mimino exponente de float es: " + Float.MIN_EXPONENT);

        float realFLoat = 1.5e-10f; //0.00000000015f;
        System.out.println("Real float: " + realFLoat);
    }
}
