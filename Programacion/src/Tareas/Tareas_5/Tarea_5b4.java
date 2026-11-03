package Tareas.Tareas_5;

import java.util.Scanner;

public class Tarea_5b4 {
    public static void main(String[] args) {
        System.out.println("Introduce las horas trabajadas esta semana: ");

        try (Scanner teclado = new Scanner(System.in)) {

            double horas = teclado.nextDouble();
            double salario;

            if (horas < 0) {
                System.out.println("Horas incorrectas");
            } else {
          
                if (horas <= 40) {
                    salario = horas * 12;
                } else {
                    salario = 40 * 12 + (horas - 40) * 16;
                }

                System.out.println("El salario semanal es: " +salario + " euros");
            }
        }
    }
}