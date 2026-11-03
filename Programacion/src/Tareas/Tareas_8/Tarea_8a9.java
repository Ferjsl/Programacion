package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8a9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int etiqueta = 0;
            int alturaMaxima = 0;
            int etiquetaMasAlto = 0;
            boolean hayArboles = false;

            System.out.print("Introduce la altura del árbol " + etiqueta + " en cm: ");
            int altura = sc.nextInt();

            while (altura != -1) {
                hayArboles = true;

                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    etiquetaMasAlto = etiqueta;
                }

                etiqueta++;

                System.out.print("Introduce la altura del árbol " + etiqueta + " en cm (-1 para terminar): ");
                altura = sc.nextInt();
            }

            if (hayArboles) {
                System.out.println("El árbol más alto es el número " + etiquetaMasAlto + ".");
                System.out.println("Su altura es de " + alturaMaxima + " cm.");
            } else {
                System.out.println("No se ha introducido ningún árbol.");
            }
        }
    }
}