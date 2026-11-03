package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b3 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero del 1 al 7:");

        try (Scanner teclado = new Scanner(System.in)) {

            int dia = teclado.nextInt();

            if (dia == 1) {
                System.out.println("Lunes");
            } else if (dia == 2) {
                System.out.println("Martes");
            } else if (dia == 3) {
                System.out.println("Miercoles");
            } else if (dia == 4) {
                System.out.println("Jueves");
            } else if (dia == 5) {
                System.out.println("Viernes");
            } else if (dia == 6) {
                System.out.println("Sabado");
            } else if (dia == 7) {
                System.out.println("Domingo");
            } else {
                System.out.println("Dia incorrecto");
            }
        }
    }
}