package valorReferencia;

public class ArgumentoPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);

        test(i);
    }
    public static void test(int i){
        System.out.println("i = " + i);
        i = 35;
        System.out.println("i = " + i);
    }
}
