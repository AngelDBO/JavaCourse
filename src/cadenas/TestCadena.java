package cadenas;

public class TestCadena {
    public static void main(String[] args) {
        String cadena = "ANgel-Daniel";
        System.out.println("cadena.toLowerCase() = " + cadena.toLowerCase());
        System.out.println("cadena.toUpperCase() = " + cadena.toUpperCase());
        System.out.println("cadena.length() = " + cadena.length());
        System.out.println("cadena.lastIndexOf(2) = " + cadena.lastIndexOf(2));
        String[] arr = cadena.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arri = " + arr[i].toUpperCase());
        }
        
        String nombre = "Angel";
        String result = "";
        char[] messChar = nombre.toCharArray();
        for (int i = 0; i < messChar.length; i++) {
            System.out.println("messChar = " + messChar[i]);
        }
        System.out.println("------------------------------------------------");
        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " ";
        }
        System.out.println("messChar = " + result);

        System.out.println(nombre == "AngeL");
    }
}
