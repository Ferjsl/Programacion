package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b23 {
	public static void main(String[] args) {
		System.out.println("De que saber quiere la tarta? (chocolate, fresa o manzana)");
		
		try (Scanner teclado = new Scanner(System.in)) {
			
			String sabor = teclado.next();
			
			int precio = 0;
			
			switch(sabor) {
			case "manzana":
				precio = 18;
				System.out.println("Has elegido manzana: "+precio+"€");
			break;
			case "fresa":
				precio = 16;
				System.out.println("Has elegido fresa: "+precio+"€");
			break;
				
			case "chocolate":
				System.out.println("Chocolate negro o blanco?");
				String tipoChocolate = teclado.next().toLowerCase();
				
				if (tipoChocolate.equals("negro"))
					precio = 14;
				
				else if (tipoChocolate.equals("blanco"))
					precio = 15;
				
				System.out.println("Ese chocolate vale: "+precio+"€");
			break;
			default:
				System.out.println("error");	
			}
			System.out.println("¿Quieres nata?");
			String nata = teclado.next().toLowerCase();
			double precioNata = 0;
			
			if (nata.equals("si"))
				precioNata = 2.50;
			else if (nata.equals("no"))
				precioNata = 0;
			
			System.out.println("Por ahora seria: "+(precio + precioNata));
			
			System.out.println("¿Quieres personalizarla con un nombre?");
			String nombre = teclado.next().toLowerCase();
			double precioNombre = 0;
			
			if (nombre.equals("si"))
				precioNombre = 2.75;
			else if (nombre.equals("no"))
				precioNombre = 0;
			
			System.out.println("El precio completo es de: "+(precio + precioNata + precioNombre));
		}
	}
}