package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros de Fibonacci quieres mostrar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error");
        } else {
            int anterior = 0;
            int siguiente = 1;

            System.out.println("Los " + n + " primeros términos de Fibonacci son:");

            for (int i = 1; i <= n; i++) {
                System.out.print(anterior);

                if (i < n) {
                    System.out.print(", ");
                }

                int nuevo = anterior + siguiente;
                anterior = siguiente;
                siguiente = nuevo;
            }

            System.out.println();
        }

        sc.close();
    }
}