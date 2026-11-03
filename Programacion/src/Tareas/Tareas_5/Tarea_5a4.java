package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5a4 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer numero: ");
        try (Scanner teclado = new Scanner(System.in)) {

            int n1 = teclado.nextInt();

            System.out.println("Introduce el segundo numero: ");

            int n2 = teclado.nextInt();

            int pares = 0;

            if (n1 % 2 == 0) {
                pares = pares + 1;
            }

            if (n2 % 2 == 0) {
                pares = pares + 1;
            }

            System.out.println("Hay " + pares + " numeros pares");
        }
    }
}