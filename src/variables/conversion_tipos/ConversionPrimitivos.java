package variables.conversion_tipos;

public class ConversionPrimitivos {
    public static void main(String[] args) {
        int numero = 100000;
        short numeroShort = (short) numero;
        System.out.println("numeroShort = " + numeroShort);
        long longNumer0 = numero;
        System.out.println("longNumero = " + longNumer0);
        char b = (char) numero;
        System.out.println("b = " + b);
        float f = (float) numero;
        System.out.println("f = " + f);
    }
}
