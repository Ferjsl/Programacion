package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8a5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduce el valor mínimo: ");
			int minimo = sc.nextInt();

			System.out.print("Introduce el valor máximo: ");
			int maximo = sc.nextInt();

			System.out.print("Introduce un valor entre " + minimo + " y " + maximo + ": ");
			int valor = sc.nextInt();

			while (valor < minimo || valor > maximo) {
			    System.out.println("El valor no está dentro del rango.");
			    System.out.print("Introduce otro valor dentro del rango " + minimo + " y " + maximo + ": ");
			    valor = sc.nextInt();
			}

			System.out.println("El valor " + valor + " está dentro del rango.");
		}
    }
}