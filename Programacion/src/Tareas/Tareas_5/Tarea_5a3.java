package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5a3 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero entero: ");
        try (Scanner teclado = new Scanner(System.in)) {

            int numero = teclado.nextInt();

            if (numero % 2 != 0) {
                System.out.println("El numero es impar");
            } else {
                System.out.println("El numero no es impar");
            }
        }
    }
}