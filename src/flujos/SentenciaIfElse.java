package flujos;

public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.8F;
        if (promedio >= 6.6) {
            System.out.println("Promedio mayor a 6.6");
        } else if (promedio == 5.8F) {
            System.out.println("promedio = " + promedio);
        } else {
            System.out.println("Promedio menor a " + promedio);
        }
    }
}
