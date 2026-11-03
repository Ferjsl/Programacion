package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8a8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int n = sc.nextInt();
		
		 long f = 1;

	        for (int i = 1; i <= n; i++) {
	            f *= i;
	        }

	        System.out.println("El factorial de " + n + " es: " + f);
	   }
}