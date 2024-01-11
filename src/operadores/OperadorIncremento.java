package operadores;

public class OperadorIncremento {
    public static void main(String[] args) {

        //Pre-Incremento
        System.out.println("Pre-Incremento");
        int i = 1;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-Incremento
        System.out.println("Post-Incremento");
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("Pre-Decremento");
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("Post-Decremento");
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }
}
