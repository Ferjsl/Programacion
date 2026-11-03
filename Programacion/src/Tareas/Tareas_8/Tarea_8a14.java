package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8a14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Introduce un numero: ");
            int n = sc.nextInt();

            for (int i = n; i >= 1; i--) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                
                System.out.println();
            }
        }
    }
}