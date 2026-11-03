package Tareas.Tareas_3;

import java.util.Scanner;

public class Tarea_3_1 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Primer numero: ");
			
			byte b1 = teclado.nextByte();
			
			System.out.println("Segundo numero: ");
			
			byte b2 = teclado.nextByte();
			
			System.out.println("La suma es: "+(b1+b2));
		}
	}
}
