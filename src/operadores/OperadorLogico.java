package operadores;

public class OperadorLogico {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127E-12F;
        double l = 2.124353D;
        boolean m = false;

        boolean b1 = i == j && k > l && j == i;
        System.out.println("b1 = " + b1);

        boolean b2 = (i == j || k > l);
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b4);
    }
}
