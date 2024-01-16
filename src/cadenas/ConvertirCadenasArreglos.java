package cadenas;

public class ConvertirCadenasArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        String result = "";
        char[] arr = trabalenguas.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.println("result = " + result);

        char[] arrDos = trabalenguas.toCharArray();
        for (char i : arrDos) {
            System.out.println("i = " + i);
        }
        System.out.println("======================================");
        String[] arreglo = trabalenguas.split("a");
        for (String s : arreglo) {
            System.out.println("i = " + s);
        }

        String archivo = "alguna.imagen.pdf";
        String[] arrArchivo = archivo.split("\\.");
        System.out.println("arrArchivo.length = " + arrArchivo.length);
        for (String s : arrArchivo) {
            System.out.println("i = " + s);
        }
    }
}
