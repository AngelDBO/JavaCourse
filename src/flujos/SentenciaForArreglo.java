package flujos;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[][] datos = {{"Enero", "1"}, {"Febrero", "2"}, {"Marzo", "3"}};
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                System.out.println("datos[i][j] = " + datos[i][j]);
            }
        }
        System.out.println("====================");

        int array[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}