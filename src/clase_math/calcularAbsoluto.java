package clase_math;

import java.rmi.MarshalException;

public class calcularAbsoluto {
    public static void main(String[] args) {
        final int ABS = Math.abs(-45);
        System.out.println("absoluto = " + ABS);

        double max = Math.max(1.4, 23.4);
        System.out.println("max = " + max);

        double min = Math.min(1.4, 23.4);
        System.out.println("min = " + min);

        double rendondeo = Math.ceil(3.5);
        System.out.println("rendondeo = " + rendondeo);

        double flor = Math.floor(3.5);
        System.out.println("flor = " + flor);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(2, 4);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(4);
        System.out.println("raiz = " + raiz);

        double grado = Math.toDegrees(1.57);
        grado = Math.round(grado);
        System.out.println("grado = " + grado + "°");

        double radianes = Math.toRadians(90);
        System.out.println("radianes = " + radianes);

        System.out.println("Sin(90) = " + Math.sin(radianes));
        System.out.println("Cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("Cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Cos(0.00) = " + Math.cos(radianes));
    }
}
