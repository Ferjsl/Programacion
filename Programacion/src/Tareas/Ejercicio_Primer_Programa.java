package Tareas;

import java.util.Scanner;

public class Ejercicio_Primer_Programa {
	public static void main(String[] args) {

// Tarea 2.1
		int i1 = 5;
		int i2 = 5;
		System.out.println("El producto es: "+(i1*i2));
		
//	Tarea 2.2
		int i3 = 25;
		int i4 = 5;
		System.out.println("El resto es: "+(i3/i4));
		
//	Tarea 2.3
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Primer numero: ");
			
			int n1 = teclado.nextInt();
			
			System.out.println("Segundo numero: ");
			
			int n2 = teclado.nextInt();
			System.out.println("la division es: "+(n1/n2));
		
//	Tarea 2.4
		try (Scanner teclado2 = new Scanner(System.in)) {
			System.out.println("Millas: ");
			
			int n3 = teclado2.nextInt();
			
			int m1 = n3 * 1609;
			
			System.out.println("En metros: "+m1);
			
//	Tarea 2.5
		try (Scanner teclado3 = new Scanner(System.in)) {
			System.out.println("Grados Centigrados: ");
				
			int g1 = teclado3.nextInt();
				
			int f1 = 9 * g1 / 5 + 32;
				
			System.out.println("En fahrenheit: "+f1);
		}
		}
		}
	}
}
