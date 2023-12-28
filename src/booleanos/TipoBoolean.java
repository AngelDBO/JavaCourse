package booleanos;

public class TipoBoolean {
    public static void main(String[] args) {
        boolean datoTrue = true;
        boolean datoFalse = false;
        boolean validacionNumero = true;

        System.out.println(datoTrue);
        System.out.println(datoFalse);
        System.out.println("-----------------------");
        double d = 98765.43e-3;
        float f = 1.2345e2f;

        validacionNumero = d < f;
        System.out.println(validacionNumero);
    }
}
