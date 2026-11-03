package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b12 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			
			System.out.print("Introduce el primer número: ");
			int a = teclado.nextInt();

			System.out.print("Introduce el segundo número: ");
			int b = teclado.nextInt();

		    System.out.print("Introduce el tercer número: ");
		    int c = teclado.nextInt();

		    int mayor = (a > b && a > c) ? a : (b > c) ? b : c;
		    int menor = (a < b && a < c) ? a : (b < c) ? b : c;
		    int medio = a + b + c - mayor - menor;
		    
		        System.out.println("Los numeros ordenados son: "+ menor + " " + medio + " " + mayor);
		}
	}
}
