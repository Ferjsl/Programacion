package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b1 {
    public static void main(String[] args) {
        System.out.println("Introduce el dia de la semana:");

        try (Scanner teclado = new Scanner(System.in)) {

            String dia = teclado.next();

            if (dia.equalsIgnoreCase("lunes")) {
                System.out.println("A primera hora toca Programacion");
            } else if (dia.equalsIgnoreCase("Martes")) {
                System.out.println("A primera hora toca Base de Datos");
            } else if (dia.equalsIgnoreCase("Miercoles")) {
                System.out.println("A primera hora toca Programacion");
            } else if (dia.equalsIgnoreCase("Jueves")) {
                System.out.println("A primera hora toca Sistemas Informaticos");
            } else if (dia.equalsIgnoreCase("Viernes")) {
                System.out.println("A primera hora toca IPE 1");
            } else if (dia.equalsIgnoreCase("Sabado")) {
                System.out.println("El sabado no hay clase");
            } else if (dia.equalsIgnoreCase("Domingo")) {
                System.out.println("El domingo no hay clase");
            } else {
                System.out.println("Dia incorrecto");
            }
        }
    }
}