package operadores;

import javax.swing.*;
import java.util.Arrays;

public class OperadorTareaNombreMasLargo {
    public static void main(String[] args) {
        String mayorLongitud = "";

        String primer_nombre = JOptionPane.showInputDialog("Ingresa el primer nombre");
        String segundo_nombre = JOptionPane.showInputDialog("Ingresa el segundo nombre");
        String tercer_nombre = JOptionPane.showInputDialog("Ingresa el tercer nombre");

        String[] nombre_uno = {primer_nombre.split(" ")[0], primer_nombre.split(" ")[1]};
        int longitudNombreUno = (nombre_uno[0].length() + nombre_uno[1].length());

        String[] nombre_dos = {segundo_nombre.split(" ")[0], segundo_nombre.split(" ")[1]};
        int longitudNombreDos = (nombre_dos[0].length() + nombre_dos[1].length());

        String[] nombre_tercero = {tercer_nombre.split(" ")[0], tercer_nombre.split(" ")[1]};
        int longitudNombreTercero = (nombre_tercero[0].length() + nombre_tercero[1].length());

        if (longitudNombreUno > longitudNombreDos) {
            mayorLongitud = primer_nombre;
        } else if (longitudNombreDos > longitudNombreTercero) {
            mayorLongitud = segundo_nombre;
        } else {
            mayorLongitud = tercer_nombre;
        }

        System.out.println("mayorLongitud = " + mayorLongitud);
    }
}
