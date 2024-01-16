package cadenas;

public class Inmutables {
    public static void main(String[] args) {
        String curso = "Programación en JAVA";
        String alumno = "Angel Daniel";

        String result = curso.concat(" "+ alumno).toUpperCase();
        System.out.println("curso = " + curso);
        System.out.println("result = " + result);
        System.out.println(curso == result);

        curso.transform(s -> {
            return s + "con" + alumno;
        });

        System.out.println("curso = " + curso);

        String resultado3 = result;
        System.out.println("resultado3 = " + resultado3);

        String resultado4 = result.replace("A", "E");
        System.out.println("resultado4 = " + resultado4);

    }
}
