package Variables.conversion_tipos;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura con espacios");
        String nombreFactura = teclado.nextLine();
        System.out.println("Ingrese el primer precio con decimale(ej. 125,4)");
        double precioUno = teclado.nextDouble();
        System.out.println("Ingrese el segundo precio con decimale(ej. 125,4)");
        double precioDos = teclado.nextDouble();

        double totalBruto = precioUno + precioDos;
        double impuestos = totalBruto / 0.19;
        double total = totalBruto * 1.19;
        System.out.println("La factura producto de " + nombreFactura + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuestos
                + " y el monto después de impuesto es de $" + total);
    }
}
