package Tema3.Matrizes;

import java.util.Random;
import java.util.Scanner;

public class HotelMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] array = new int[12][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }

        System.out.println("Este es el hotel: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int numeroHabitacion;
        int numeroPiso;
        do {
            System.out.println("¿En qué habitación quieres el router? (1-5)");
            numeroHabitacion = sc.nextInt() - 1;
            System.out.println("¿En qué habitación quieres el router? (1-12)");
            numeroPiso = sc.nextInt() - 1;

            if (numeroHabitacion < 0 || numeroHabitacion >= array.length) {
                System.out.println("Número de habitación no válido. Intenta de nuevo.");
            }
            if (numeroPiso < 0 || numeroPiso >= 12) {
                System.out.println("Número de piso no válido. Intenta de nuevo.");
            }
        } while (numeroHabitacion < 0 || numeroHabitacion >= array.length && numeroPiso < 0 || numeroPiso >= 12);

        int potenciaRouter;
        do {
            System.out.println("¿De qué potencia quieres el router? (1-6)");
            potenciaRouter = sc.nextInt();
            if (potenciaRouter < 1 || potenciaRouter > 6) {
                System.out.println("Potencia no válida. Intenta de nuevo.");
            }
        } while (potenciaRouter < 1 || potenciaRouter > 6);

        array[numeroPiso][numeroHabitacion] = potenciaRouter;

        for (int i = 1; i <= potenciaRouter - 1; i++) {
            if (numeroHabitacion>=0&&numeroPiso>=0){

            }
        }

        System.out.print("Esta es la potencia del WiFi: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}