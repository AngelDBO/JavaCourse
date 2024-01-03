package Variables.conversion_tipos;

public class ConversionTipos {
    public static void main(String[] args) {
        String numero = "50";
        int numeroReal = Integer.parseInt(numero);
        System.out.println(numeroReal);

        String realString = "7876.86E-3";
        double double_real = Double.parseDouble(realString);
        System.out.println("double_real = " + double_real);

        String dato = "false";
        boolean realBoolean = Boolean.parseBoolean(dato);
        System.out.println("realBoolean = " + realBoolean);

        int numeroString = 100;
        System.out.println("numeroString = " + numeroString);

        String Otronumero = Integer.toString(numeroString);
        System.out.println("Otronumero = " + Otronumero);

        Otronumero = String.valueOf(Otronumero + 10);
        System.out.println("Otronumero = " + Otronumero);

        //Decimal a String
        double otroRealDouble = 1.23456E-2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456E2F);
        System.out.println("otroRealStrString = " + otroRealStr);
    }
}
