package Tareas.Tareas_4;

import java.util.Scanner;

public class Tarea_4_2 {
	public static void main(String[] args) {
		System.out.println("Ingresa la primera nota: ");
		try (Scanner teclado = new Scanner(System.in)) {
		
		int i1 = teclado.nextInt();
		
		System.out.println("Ingresa la segunda nota: ");

		int i2 = teclado.nextInt();
		
		double d1 = (double) (i1 + i2) / 2;
		
		System.out.println("La media es "+d1);
		}
	}
}
