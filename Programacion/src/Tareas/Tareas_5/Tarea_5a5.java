package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5a5 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer numero largo: ");
        try (Scanner teclado = new Scanner(System.in)) {

            long l1 = teclado.nextLong();

            System.out.println("ntroduce el segundo numero largo: ");

            long l2 = teclado.nextLong();

            System.out.println("Introduce el tercer numero largo: ");

            long l3 = teclado.nextLong();

            long mayor = l1;

            if (l2 > mayor) {
                mayor = l2;
            }
            if (l3 > mayor) {
                mayor = l3;
            }

            System.out.println("El numero mayor es: " +mayor);
        }
    }
}