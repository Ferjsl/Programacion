package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b6 {
	public static void main(String[] args) {
		System.out.println("Ingresa la primera nota: ");
		try (Scanner teclado = new Scanner(System.in)) {
		
		double d1 = teclado.nextDouble();
		
		System.out.println("Ingresa la segunda nota: ");

		double d2 = teclado.nextDouble();
		
		System.out.println("Ingresa la tercera nota: ");
		
		double d3 = teclado.nextDouble();
		
		int i1 = (int) (d1 + d2 + d3) / 3;
		
		System.out.println("La media es "+i1);
		}
	}
}
