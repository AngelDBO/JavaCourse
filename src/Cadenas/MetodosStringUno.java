package Cadenas;

public class MetodosStringUno {
    public static void main(String[] args) {
        String nombre = "Angeles";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.isBlank() = " + nombre.isBlank());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.substring(1,2) = " + nombre.substring(1, 2));
        System.out.println("nombre.substring(1,2) = " + nombre.substring(2));
        System.out.println("nombre.equals(\"Angel\") = " + nombre.equals("Angel"));
        System.out.println("nombre.equals(\"angel\") = " + nombre.equals("angel"));
        System.out.println("nombre.equalsIgnoreCase(\"AnGEll\") = " + nombre.equalsIgnoreCase("AnGEll"));
        System.out.println("nombre.compareTo(\"Angel\") = " + nombre.compareTo("Angel"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.isEmpty() = " + nombre.isEmpty());
        System.out.println("nombre.transform(c ->{ return nombre.toLowerCase()) = " + nombre.transform(c -> {
            return c.toUpperCase();
        }));
        System.out.println("nombre= " + nombre.transform(String::length));
        System.out.println("nombre.repeat(3) = " + nombre.repeat(3));
        System.out.println("nombre.replace(\"A\", \"E\") = " + nombre.replace("A", "E"));
        System.out.println("nombre.indexOf(\"g\") = " + nombre.indexOf("g"));
        System.out.println("nombre.lastIndexOf(\"n\") = " + nombre.lastIndexOf("e"));
        System.out.println("nombre.lastIndexOf(\"M\") = " + nombre.lastIndexOf("M"));
        System.out.println("nombre.contains(\"t\") = " + nombre.contains("t"));
        System.out.println("nombre.endsWith(\"es\") = " + nombre.endsWith("es"));
        System.out.println("nombre.trim() = " + nombre.trim());
        System.out.println("nombre.concat(\" Daniel\").toUpperCase() = " + nombre.concat(" Daniel").toUpperCase());
    }
}
