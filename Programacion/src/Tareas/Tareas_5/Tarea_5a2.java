package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5a2 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero 12: ");
        try (Scanner teclado = new Scanner(System.in)) {

            int numero = teclado.nextInt();

            if (numero == 12) {
                System.out.println("Muy bien");
            } else {
                System.out.println("Ese no es");
            }
        }
    }
}