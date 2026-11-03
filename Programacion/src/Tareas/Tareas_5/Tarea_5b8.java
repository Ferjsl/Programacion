package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("Introduce el valor de a: ");
            double a = teclado.nextDouble();

            System.out.println("Introduce el valor de b: ");
            double b = teclado.nextDouble();

            System.out.println("Introduce el valor de c: ");
            double c = teclado.nextDouble();

            if (a == 0) {
                System.out.println("No es una ecuacion de segundo grado");
            } else {
                double discriminante = b * b - 4 * a * c;

                if (discriminante < 0) {
                    System.out.println("La ecuacion no tiene soluciones reales");
                } else if (discriminante == 0) {
                    double x = -b / (2 * a);

                    System.out.println("La ecuacion tiene una solucion: " + x);
                } else {
                    double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                    System.out.println("La primera solucion es: " + x1);
                    System.out.println("La segunda solucion es: " + x2);
                }
            }
        }
    }
}