package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class WifiHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        System.out.print("Este es el array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int numeroHabitacion;
        do {
            System.out.println("¿En qué habitación quieres el router? (0-19)");
            numeroHabitacion = sc.nextInt();
            if (numeroHabitacion < 0 || numeroHabitacion >= array.length) {
                System.out.println("Número de habitación no válido. Intenta de nuevo.");
            }
        } while (numeroHabitacion < 0 || numeroHabitacion >= array.length);

        int potenciaRouter;
        do {
            System.out.println("¿De qué potencia quieres el router? (1-6)");
            potenciaRouter = sc.nextInt();
            if (potenciaRouter < 1 || potenciaRouter > 6) {
                System.out.println("Potencia no válida. Intenta de nuevo.");
            }
        } while (potenciaRouter < 1 || potenciaRouter > 6);

        array[numeroHabitacion] = potenciaRouter;

        for (int i = 1; i <= potenciaRouter - 1; i++) {
            if (numeroHabitacion - i >= 0) {
                array[numeroHabitacion - i] = potenciaRouter - i;
            }
            if (numeroHabitacion + i < array.length) {
                array[numeroHabitacion + i] = potenciaRouter - i;
            }
        }

        System.out.print("Esta es la potencia del WiFi: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
