package Tareas;

import java.util.Scanner;

public class Ejercicio_Vocal {
	public static void main(String[] args) {
		System.out.println("Introduce una letra:");
		
		try (Scanner teclado = new Scanner(System.in)) {
			
			String letra=teclado.next();
			Boolean vocal;
			
			switch(letra) {
				case "a","e","i","o","u":
					vocal=true;
				break;
			
				default:
					vocal=false;
			
			}
			
			System.out.println(vocal?"Es vocal":"No es vocal");

		}
	}
}
