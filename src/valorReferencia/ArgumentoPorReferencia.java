package valorReferencia;

public class ArgumentoPorReferencia {
    public static void main(String[] args) {
        int[] edad ={12,23,45};
        
        test(edad);
    }

    public static void test(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
