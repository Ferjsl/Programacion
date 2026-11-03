package Tareas;

import java.util.Scanner;

public class Ejercicio_ParesImpares {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			int totalImpares = 0;
			int totalPares = 0;

			System.out.print("Introduce un número: ");
			int numero = teclado.nextInt();

			for (int i = 1; i <= numero; i++) {
			    if (i % 2 == 0) {
			        System.out.println(i + " - par");
			        totalPares++;
			    } else {
			        System.out.println(i + " - impar");
			        totalImpares++;
			    }
			}

			System.out.println("Total impares: " + totalImpares);
			System.out.println("Total pares: " + totalPares);
		}
    }
}