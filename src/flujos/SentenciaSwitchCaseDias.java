package flujos;

import javax.swing.*;

public class SentenciaSwitchCaseDias {
    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un mes del siguientes listado: \n" +
                "1: Enero\n" +
                "2: Febrero\n" +
                "3: Marzo\n" +
                "4: Abril"));
        int numeroDias = 0;
        int anio = 2020;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }

        JOptionPane.showMessageDialog(null, "El mes " + mes + " seleccionado tiene: " + numeroDias + " dias.");
    }
}
