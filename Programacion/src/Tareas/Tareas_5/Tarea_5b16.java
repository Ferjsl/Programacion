package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b16 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
		System.out.println("Escribe un numero: ");
		
		int numero = teclado.nextInt();
		
		int ultimaCifra = numero % 10;
		
		if (ultimaCifra < 0)
			ultimaCifra = -ultimaCifra;
		
		System.out.println("La ultima cifra es: "+ultimaCifra);
		}
	}
}
