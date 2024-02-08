package wrapper;

import java.lang.reflect.Method;

public class getClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";

        Class srtclass = texto.getClass();

        System.out.println("srtclass.getName() = " + srtclass.getName());
        System.out.println("srtclass.getSimpleName() = " + srtclass.getSimpleName());
        System.out.println("srtclass.getPackageName() = " + srtclass.getPackageName());
        System.out.println("srtclass = " + srtclass);

        for (Method metodo : srtclass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
