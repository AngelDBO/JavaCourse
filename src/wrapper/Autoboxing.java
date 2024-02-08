package wrapper;

public class Autoboxing {
    public static void main(String[] args) {
        Integer[] numero = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (Integer i : numero) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
        suma = 0;

        for (Integer i : numero) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
