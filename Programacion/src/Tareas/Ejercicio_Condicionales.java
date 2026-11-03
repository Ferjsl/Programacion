package Tareas;

import java.util.Scanner;

public class Ejercicio_Condicionales {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduzca una nota: ");
			
			float nota = sc.nextFloat();
			
			if (nota <0)
				System.out.println("Nota Incorrecta");
			else if (nota >10)
				System.out.println("Nota Incorrecta");
			else if (nota>=9)
				System.out.println("Sobresaliente");
			else if (nota>=7)
				System.out.println("Notable");
			else if (nota>=6)
				System.out.println("Bien");
			else if (nota>=5)
				System.out.println("Aprobado");
			else if (nota <5)
				System.out.println("Suspenso");
		}
	}
}