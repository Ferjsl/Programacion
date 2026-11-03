package Tareas.Tareas_3;

import java.util.Scanner;

public class Tarea_3_2 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Ano de nacimiento: ");
			
			short s1 = teclado.nextShort();
			
			System.out.println("Ano actual: ");
			
			short s2 = teclado.nextShort();
			
			System.out.println("La edad es: "+(s2-s1));
		}
	}
}
