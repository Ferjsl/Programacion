package Tareas.Tareas_3;

import java.util.Scanner;

public class Tarea_3_3 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Primer numero: ");
			
			double d1 = teclado.nextDouble();
			
			System.out.println("Segundo numero: ");
			
			double d2 = teclado.nextDouble();
			
			System.out.println("La division es: "+(d1/d2));
		}
	}
}
