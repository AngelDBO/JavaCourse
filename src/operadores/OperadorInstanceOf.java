package operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String nombre = "Angel";

        Integer num = 3;

        boolean b1 = nombre instanceof String;
        System.out.println("b1 = " + b1);

        boolean b2 = nombre instanceof Object;
        System.out.println("b2 = " + b2);

        boolean b3 = num instanceof Number;
        System.out.println("b3 = " + b3);
    }
}
