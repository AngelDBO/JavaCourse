package sistema_numerico;

import javax.swing.*;

public class HexadecimalNumerico {
    public static void main(String[] args) {
        /*int octal = 764;
        System.out.println("EL numero hexadecimal de " + octal + " = " + Integer.toHexString(octal));
        int numeroHex = 0X1F4;
        System.out.println("Numero Hex " + numeroHex);
        int octalConsola = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a convertir: "));
        JOptionPane.showMessageDialog(null, "EL numero hexadecimal de " + octalConsola + "  es: " + Integer.toHexString(octalConsola));*/
        // Método con 6 parámetros
        ImageIcon icono = new ImageIcon("https://www.w3schools.com/favicon.ico");
        int resp =JOptionPane.showConfirmDialog(null, "Personalizando cuadro de diálogo",
                "Blog masqueprogramar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icono);

        String mensaje = "";
        switch (resp) {
            case 0:
                mensaje = "Has pulsado Sí";
                break;
            case 1:
                mensaje = "Has pulsado No";
                break;
            case 2:
                mensaje = "Has pulsado Cancelar";
        }
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
