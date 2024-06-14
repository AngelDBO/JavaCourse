package arreglos;

import java.util.Arrays;

public class OrdenarArreglo {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "fMouse Gamer";
        productos[1] = "aMouse Gamer 144";
        productos[2] = "hMouse Gamer 4";
        productos[3] = "Mouse Gamer 5";
        productos[4] = "nMouse Gamer 76";
        productos[5] = "lMouse Gamer 34";
        productos[6] = "bMouse Gamer 54";

        Arrays.sort(productos);

        for (String producto: productos){
            System.out.println("producto = " + producto);
        }
    }
}
