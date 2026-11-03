package Tareas.Tareas_4;

import java.util.Scanner;

public class Tarea_4_1 {
	public static void main(String[] args) {
		
		short s1 = 32767;
		System.out.println("El limite de valores para short es de "+s1);
		System.out.println("Supera el limite. Ingresa un valor: ");
		
		try (Scanner teclado = new Scanner(System.in)) {
			
		short s2 = teclado.nextShort();
		
		short s3 = (short) (s1 + s2);
			
			System.out.println("short: "+s3);	
		}
	}
}
