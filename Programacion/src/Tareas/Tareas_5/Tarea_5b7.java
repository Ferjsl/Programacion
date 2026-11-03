package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b7 {
	public static void main(String[] args) {
		System.out.println("Ingresa la primera nota: ");
		try (Scanner teclado = new Scanner(System.in)) {
		
		double d1 = teclado.nextDouble();
		
		System.out.println("Ingresa la segunda nota: ");

		double d2 = teclado.nextDouble();
		
		System.out.println("Ingresa la tercera nota: ");
		
		double d3 = teclado.nextDouble();
		
		int i1 = (int) (d1 + d2 + d3) / 3;
		
		if (i1 <0)
			System.out.println("Nota Incorrecta");
		else if (i1 >10)
			System.out.println("Nota Incorrecta");
		else if (i1>=9)
			System.out.println("Sobresaliente");
		else if (i1>=7)
			System.out.println("Notable");
		else if (i1>=6)
			System.out.println("Bien");
		else if (i1>=5)
			System.out.println("Aprobado");
		else if (i1 <5)
			System.out.println("Suspenso");
		
		System.out.println("La media es "+i1);
		}
	}
}