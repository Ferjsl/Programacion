package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8b1 {
	public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner (System.in)) {
			for (int intento = 1; intento <= 4; intento++) {
				
				System.out.println("Introduce una combinacion de 4 digitos para abrir la caja fuerte");
				int combinacion = teclado.nextInt();
				
				 if (combinacion == 0000) {
					 
					 System.out.println("La caja fuerte se ha abierto satisfactoriamente");
					 break;
				 } else 
					 
					 System.out.println("Incorrecto: ");
			}
		}
	}
}