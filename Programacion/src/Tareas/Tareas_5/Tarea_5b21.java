package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b21 {
	public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Cual es tu cargo?");
			System.out.println("1 - Prog. junior");
			System.out.println("2 - Prog. senior");
			System.out.println("3 - Jefe de proyecto");
			
			int cargo = teclado.nextInt();
			
			System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
			
			int dias = teclado.nextInt();
			
			System.out.println("Introduzca su estado civil ");
			System.out.println("1 - Soltero");
			System.out.println("2 - Casado");
			
			int estado = teclado.nextInt();
			int sueldo = 0;
			
			switch (cargo) {
			case 1:
				sueldo = 950;
				
				break;
			case 2:
				sueldo = 1200;
				
				break;
			case 3:
				sueldo = 1600;
				break;
			}
			
			double dietas = dias * 30;

			double irpf = (estado == 1) ? 0.25 : 0.20;

			double sueldoNeto = sueldo + dietas - (sueldo * irpf);

			System.out.println("Sueldo base: " + sueldo + " €");
			System.out.println("Dietas: " + dietas + " €");
			System.out.println("IRPF: " + (irpf * 100) + "%");
			System.out.println("Sueldo neto: " + sueldoNeto + " €");
		}
		}
	}
