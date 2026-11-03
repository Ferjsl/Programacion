package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b5 {
	public static void main(String[] args) {
		System.out.println("Vamos a resolver una ecuacion de primer grado ax + b = 0");
		System.out.println("Introduce el valor de a:");
		try (Scanner teclado = new Scanner(System.in)) {
		
		int a1 = teclado.nextInt();
		
		System.out.println("Introduce el valor de b");
		
		double b1 = teclado.nextDouble();
		
		double resultado = b1 / a1;
		
		System.out.println("Resultado: "+resultado);
		}
	}
}
