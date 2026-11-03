package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b2 {
    public static void main(String[] args) {
        System.out.println("Introduce una hora: ");

        try (Scanner teclado = new Scanner(System.in)) {

            int hora = teclado.nextInt();

            if (hora < 0) {
                System.out.println("Hora incorrecta");
            } else if (hora > 24) {
                System.out.println("Hora incorrecta");
            } else if (hora < 6) {
                System.out.println("Buenas noches");
            } else if (hora <= 12) {
                System.out.println("Buenos dias");
            } else if (hora <= 20) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
        }
    }
}