package cadenas;

public class EjemploStringExtensiones {
    public static void main(String[] args) {
        String archivo = "animal-qwerty.jpg";
        System.out.println("archivo.lastIndexOf(\".\") = " + archivo.lastIndexOf("."));
        System.out.println("archivo.substring(6) = " + archivo.substring(6));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length() - 4));
        System.out.println("archivo. = " + archivo.substring(archivo.lastIndexOf(".")));
    }
}
