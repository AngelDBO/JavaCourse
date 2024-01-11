package operadores;

import java.util.Scanner;

public class OperadorTareaEstadoEstanque {
    public static void main(String[] args) {
        int capacidadEstanque = 70;

        Scanner sc = new Scanner(System.in);
        System.out.println("capacidadEstanque = " + capacidadEstanque);
        System.out.println("Ingrese la cantidad de despacho");
        int despacho = sc.nextInt();

        double resultado = capacidadEstanque - despacho;
        String mensaje = "";
        if (resultado == 70) {
            mensaje = "Estanque lleno";
        }
        if (resultado >= 60 && resultado < 70) {
            mensaje = "Estanque casi lleno";
        }
        if (resultado >= 40 && resultado < 60) {
            mensaje = "Estanque  3/4";
        }
        if (resultado >= 35 && resultado < 40) {
            mensaje = "Medio Estanque ";
        }
        if (resultado >= 20 && resultado < 35) {
            mensaje = "Suficiente";
        }
        if (resultado >= 1 && resultado < 20) {
            mensaje = "Insuficiente";
        }

        System.out.println("La capacidad del tanque es: ".concat(mensaje));
    }
}
