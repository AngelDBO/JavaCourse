package flujos;

import javax.swing.*;

public class SentenciaExamen4 {
    public static void main(String[] args) {
        int numArticulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de articulos a registrar"));
        String[] arrArticulos = new String[numArticulos];

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Articulos\n" +
                    "1. Crear los articulos.\n" +
                    "2. Actualizar un articulo.\n" +
                    "3. Listar los articulos.\n" +
                    "4. Eliminar un articulo.\n" +
                    "5. Salir"));

            switch (opcion) {
                case 1:
                    String articulo = "";
                    for (int i = 0; i < arrArticulos.length; i++) {
                        articulo = JOptionPane.showInputDialog("Ingrese el nombre del articulo");
                        arrArticulos[i] = articulo;
                    }
                    break;
                case 2:
                    String articulos = "";
                    int articuloIndex = 0;
                    String nuevoNombre;
                    for (int i = 0; i < arrArticulos.length; i++) {
                        articulos += +i + " => " + arrArticulos[i] + "\n";
                    }
                    articuloIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el articulos a editar\n================\n" + articulos + "\n================"));
                    nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre para el articulo " + arrArticulos[articuloIndex]);
                    arrArticulos[articuloIndex] = nuevoNombre;
                    break;
                case 3:
                    String lista = "";
                    for (int i = 0; i < arrArticulos.length; i++) {
                        lista += +i + " => " + arrArticulos[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Listado de articulos\n================\n" + lista + "\n================");
                    break;
                case 4:
                    String opciones = "";
                    int Index = 0;
                    for (int i = 0; i < arrArticulos.length; i++) {
                        opciones += +i + " => " + arrArticulos[i] + "\n";
                    }
                    Index = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el articulos a editar\n================\n" + opciones + "\n================"));

                    arrArticulos[Index] = null;
                    break;
            }
        } while (opcion != 5);

    }
}
