package Tareas.Tareas_5;
import java.util.Scanner;
public class Tarea_5b17 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Escribe un numero: ");
			int num = teclado.nextInt();
			while (num >= 10) { num /= 10; }
		
			System.out.println("El primero digito es: "+num); 
		}
	}
}