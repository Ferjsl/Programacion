package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5a6 {
    public static void main(String[] args) {
        final double gravedad = 9.8;

        System.out.println("Ingresa el tiempo: ");
        try (Scanner teclado = new Scanner(System.in)) {

            double tiempo = teclado.nextDouble();

            if (tiempo <= 0) {
                System.out.println("Tiempo incorrecto");
            } else {
                double velocidad = gravedad * tiempo;

                System.out.println("La velocidad es: " + velocidad);
            }
        }
    }
}