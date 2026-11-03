package Tareas.Tareas_3;

import java.util.Scanner;

public class Tarea_3_4 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Millas: ");
			
			float f1 = teclado.nextFloat();
			
			float f2 = f1 * 1609;
			
			System.out.println("En metros: "+f2);
		}
	}
}
