package Tareas.Tareas_8;

import java.util.Scanner;

public class Tarea_8a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumaEdades = 0;
        int Alumnos = 0;
        int mayoresEdad = 0;

        System.out.print("Introduce la edad de un alumno: ");
        int edad = sc.nextInt();

        while (edad >= 0) {
            sumaEdades = sumaEdades + edad;
            Alumnos++;

            if (edad >= 18) {
                mayoresEdad++;
            }

            System.out.print("Introduce la edad de otro alumno: ");
            edad = sc.nextInt();
        }

        if (Alumnos > 0) {
            double media = (double) sumaEdades / Alumnos;

            System.out.println("Suma de las edades: " + sumaEdades);
            System.out.println("Numero de alumnos totales: " + Alumnos);
            System.out.println("Media de edad: " + media);
            System.out.println("Alumnos mayores de edad: " + mayoresEdad);
        } else {
            System.out.println("Error");
        }

        sc.close();
    }
}