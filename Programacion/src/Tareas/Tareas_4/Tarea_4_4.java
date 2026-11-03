package Tareas.Tareas_4;

import java.util.Scanner;

public class Tarea_4_4 {
	public static void main(String[] args) {
		System.out.println("Ingresa un numero decimal: ");
		try (Scanner teclado = new Scanner(System.in)) {
			
		double d1 = teclado.nextDouble();
		
		int i1 = (int) Math.round(d1);
		
		System.out.println("Redondeado: "+i1);
		}
	}
}
