package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8b7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduce un numero: ");
			int numero = sc.nextInt();
			int numeroReves = 0;

			while (numero > 0) {
			    int ultimoNum = numero % 10;
			    numeroReves = numeroReves * 10 + ultimoNum;
			    numero = numero / 10;
			}
			
			System.out.println("Numero al reves: "+numeroReves);
		}
    }
}